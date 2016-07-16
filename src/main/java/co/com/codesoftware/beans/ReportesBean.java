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
	public void descargarReporteVentasCompras(){
		ReporteLogica reporte = new ReporteLogica();
		try {
			String ruta = "";
			String documento = reporte.consultaRutaReporteCompVendidos();
			RemisionLogica objLogica = new RemisionLogica();
			String valida = objLogica.materializaImagen(documento, "aaa" );
			if ("Ok".equalsIgnoreCase(valida)) {
				this.messageBean("Reporte Generado correctamente",ErrorEnum.SUCCESS);
				ruta = objLogica.getRutaImagen();
				
				File file = new File(ruta);
				InputStream input = new FileInputStream(file);
				ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
				setDownload(new DefaultStreamedContent(input, externalContext.getMimeType(file.getName()), file.getName()));
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
}
