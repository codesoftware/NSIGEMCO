package co.com.codesoftware.beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import co.com.codesoftware.logica.ReporteLogica;
import co.com.codesoftware.logica.facturacion.RemisionLogica;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ReportesBean implements GeneralBean {

	private Integer tipoReporte;
	private Date fechaInicial;
	private Date fechaFinal;
	private Integer idSede;
	private Integer formato;
	private DefaultStreamedContent download;
	private String tipo;
	private String rutaDocumento;
	private StreamedContent file;

	/**
	 * metodo que llama a la consulta del servicio web y este le retorna una
	 * ruta para descargar el archivo
	 */
	public void descargarReporte() {
		ReporteLogica reporte = new ReporteLogica();
		try {
			String ruta = reporte.consultaRutaReporte(tipoReporte, fechaInicial, fechaFinal, idSede, formato);
			File file = new File(ruta);
			InputStream input = new FileInputStream(file);
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			setDownload(new DefaultStreamedContent(input, externalContext.getMimeType(file.getName()), file.getName()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Funcion con la cual genero el reporte de compras y ventas en el sistema
	 */
	public void descargarReporteVentasCompras() {
		ReporteLogica reporte = new ReporteLogica();
		String documento = "";
		RequestContext requestContext = RequestContext.getCurrentInstance();
		try {
			if ("pdf".equalsIgnoreCase(this.tipo)) {
				String ruta = "";
				documento = reporte.consultaRutaReporteCompVendidos(fechaInicial,fechaFinal);
				RemisionLogica objLogica = new RemisionLogica();
				String valida = objLogica.materializaImagenCarpeta(documento, "reportes", "ComprasVentas.pdf",
						"relativa");
				if ("Ok".equalsIgnoreCase(valida)) {
					this.messageBean("Reporte Generado correctamente", ErrorEnum.SUCCESS);
					ruta = objLogica.getRutaImagen();
					this.rutaDocumento = ruta;
					requestContext.execute("PF('abrirVisor').show()");
				}
			} else {
				documento = reporte.generarExcelSql(
						"SELECT dska_cod_ext codigo_externo ,dska_desc descripcion_producto, coalesce((select sum(dtpr_cant) from fa_tdtpr where dtpr_dska = dska_dska), 0 ) productos_vendidos, (select coalesce(sum(fcprd_cant),0) from fa_tfacom, fa_tfcprd where upper(facom_estad) = 'F' and fcprd_facom = facom_facom and fcprd_dska = dska_dska) productos_comprados FROM IN_TDSKA order by dska_dska ");
				RemisionLogica objLogica = new RemisionLogica();
				String valida = objLogica.materializaImagenCarpeta(documento, "reportes", "ComprasVentas.xls",
						"relativa");
				if ("Ok".equalsIgnoreCase(valida)) {
					this.rutaDocumento = objLogica.getRutaImagen();
					this.messageBean("Ok", ErrorEnum.SUCCESS);
					InputStream stream = FacesContext.getCurrentInstance().getExternalContext()
							.getResourceAsStream(this.rutaDocumento);
					file = new DefaultStreamedContent(stream, "image/jpg", "ComprasVentas.xls");
				} else {
					this.messageBean("Error al generar el excel: " + valida, ErrorEnum.ERROR);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {

	}

	@Override
	public void init() {

	}

	public Integer getTipoReporte() {
		return tipoReporte;
	}

	public void setTipoReporte(Integer tipoReporte) {
		this.tipoReporte = tipoReporte;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Integer getIdSede() {
		return idSede;
	}

	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public Integer getFormato() {
		return formato;
	}

	public void setFormato(Integer formato) {
		this.formato = formato;
	}

	public DefaultStreamedContent getDownload() {
		return download;
	}

	public void setDownload(DefaultStreamedContent download) {
		this.download = download;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRutaDocumento() {
		return rutaDocumento;
	}

	public void setRutaDocumento(String rutaDocumento) {
		this.rutaDocumento = rutaDocumento;
	}

	public StreamedContent getFile() {
		return file;
	}

	public void setFile(StreamedContent file) {
		this.file = file;
	}

}
