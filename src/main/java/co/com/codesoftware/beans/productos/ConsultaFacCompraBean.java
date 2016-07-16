package co.com.codesoftware.beans.productos;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;

import co.com.codesoftware.logica.CodificaBase64;
import co.com.codesoftware.logica.FacturaCompraLogica;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.server.productos.FacturaCompraEntity;
import co.com.codesoftware.server.productos.FacturaCompraGeneralEntity;
import co.com.codesoftware.server.productos.FacturaCompraTotalEntity;
import co.com.codesoftware.server.productos.ImagenesFacCompraEntity;
import co.com.codesoftware.server.productos.PagoFacCompraEntity;
import co.com.codesoftware.server.productos.ProductoFacCompraEntity;
import co.com.codesoftware.server.productos.RespuestaEntity;
import co.com.codesoftware.servicio.facturacion.MoviContableEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ConsultaFacCompraBean implements GeneralBean {
	private ProveedoresEntity proveedor;
	private FacturaCompraLogica logica;
	private List<FacturaCompraTotalEntity> listaFacturas;
	private List<FacturaCompraTotalEntity> listaFacturasFiltro;
	private Date fechaInicial;
	private Date fechaFinal;
	private Date fechaMax;
	private String estado;
	private String imagen;
	private String digitalizado;
	private Integer idFactura;
	private String ubicacion;
	private Integer idTipoImagen;
	private ErrorEnum enumer;
	private FacturaCompraEntity factura;
	private List<ImagenesFacCompraEntity> imagenes;
	private List<PagoFacCompraEntity> pagos;
	private List<ProductoFacCompraEntity> productos;
	private DefaultStreamedContent download;
	private String rutaImagen;
	private List<MoviContableEntity> listaMovimientos;

	/**
	 * constructor
	 */
	public ConsultaFacCompraBean() {
		this.proveedor = new ProveedoresEntity();
		this.logica = new FacturaCompraLogica();
		this.fechaMax = new Date();
	}

	/**
	 * metodo quee consulta las facturas
	 */
	public void consultaFacturas() {
		try {
			if (this.proveedor == null)
				this.proveedor = new ProveedoresEntity();
			if (this.proveedor.getId() == null)
				this.proveedor.setId(-1);
		} catch (Exception e) {
			this.proveedor.setId(-1);
		}

		this.listaFacturas = this.logica.consultaFacturaFiltros(this.proveedor.getId(), this.fechaInicial, this.fechaFinal, this.estado, this.imagen,this.digitalizado);
	}

	/**
	 * metodo que guarda el archivo en el servidor
	 * 
	 * @param event
	 */
	public void validaCargueArchivos(FileUploadEvent event) {
		String mensaje = "";
		try {
			if (this.ubicacion == null || "".equalsIgnoreCase(this.ubicacion)) {
				mensaje = "ERROR, DEBE INDICAR UBICACIÓN";
				this.setEnumer(ErrorEnum.ERROR);
			} else if (this.idTipoImagen == null || this.idTipoImagen == 0) {
				mensaje = "ERROR, DEBE INDICAR EL TIPO DE DOCUMENTO";
				this.setEnumer(ErrorEnum.ERROR);

			} else {
				RespuestaEntity res = logica.adjuntaArchivoFactura(event, this.idFactura, this.ubicacion, this.idTipoImagen);
				if (res.getCodigoRespuesta() == 0) {
					this.setEnumer(ErrorEnum.ERROR);
					mensaje = "ERROR AL CARGAR LA IMAGEN:" + res.getMensajeRespuesta();
				} else {
					this.setEnumer(ErrorEnum.SUCCESS);
					mensaje = "CARGO DOCUMENTO CORRECTAMENTE";
					consultaFacturaEspecifica();
					RequestContext context = RequestContext.getCurrentInstance();
					context.execute("PF('dialogCargaPDF').hide();");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			this.setEnumer(ErrorEnum.ERROR);
			mensaje = e.toString();
		}

		this.messageBean(mensaje);
	}

	/**
	 * metodo que setea el id de la factura para cambiar de JSF
	 * 
	 * @param idFactura
	 */
	public String seteaIdFactura(Integer idFacturaSel) {
		System.out.println("ENTRO");
		String rta = "";
		try {
			if (this.factura == null) {
				this.factura = new FacturaCompraEntity();
			}
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idFactCom", idFacturaSel);
			rta = "detalleFactCompra?faces-redirect=false";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * funcion para cambiar el combo
	 * 
	 * @param event
	 */
	public void cambiaCombo(AjaxBehaviorEvent event) {
		System.out.println(this.idTipoImagen);
		System.out.println(this.ubicacion);
	}

	/**
	 * funcion que llama al servicio web de consulta de factura
	 * 
	 * @param idFactura
	 */
	public void consultaFacturaEspecifica() {
		try {
			Integer id = (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("idFactCom");
			if (id != null) {
				FacturaCompraLogica logica = new FacturaCompraLogica();
				FacturaCompraGeneralEntity result = logica.consultaDatosFactura(id);
				this.factura = result.getFactura();
				this.imagenes = result.getImagenes();
				this.pagos = result.getPagos();
				this.productos = result.getProductos();
				this.idFactura = id;
				this.listaMovimientos = logica.consultaMovContable(id, "fctc");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * funcion que permite descargar un archivo
	 * 
	 * @param date
	 * @throws Exception
	 */
	public void prepDownload(String date) {
		try {
			File file = new File(date);
			InputStream input = new FileInputStream(file);
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			setDownload(new DefaultStreamedContent(input, externalContext.getMimeType(file.getName()), file.getName()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * metodo para abrir el pdf on line
	 * 
	 * @param date
	 */
	public void openPDF(String date) {
		try {
			CodificaBase64 cod = new CodificaBase64();
			ExternalContext tmpEC;
			tmpEC = FacesContext.getCurrentInstance().getExternalContext();
			String realPath = tmpEC.getRealPath("/resources/images/facturas/");
			realPath += "FC_" + this.factura.getId() + ".pdf";
			this.rutaImagen = cod.copiaArchivoInterno(date, realPath);
			this.rutaImagen = "/resources/images/facturas/FC_" + this.factura.getId() + ".pdf";
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	@PostConstruct
	public void init() {
		consultaFacturaEspecifica();

	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {

	}

	public void messageBean(String message) {
		switch (this.enumer) {
		case ERROR:
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", message));
			break;
		case FATAL:
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "Error de sistema"));
			break;
		case SUCCESS:
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Ok!", message));
			break;

		default:
			break;
		}

	}

	// accessors y mutator
	public ProveedoresEntity getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedoresEntity proveedor) {
		this.proveedor = proveedor;
	}

	public FacturaCompraLogica getLogica() {
		return logica;
	}

	public void setLogica(FacturaCompraLogica logica) {
		this.logica = logica;
	}

	public List<FacturaCompraTotalEntity> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(List<FacturaCompraTotalEntity> listaFacturas) {
		this.listaFacturas = listaFacturas;
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

	public Date getFechaMax() {
		return fechaMax;
	}

	public void setFechaMax(Date fechaMax) {
		this.fechaMax = fechaMax;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Integer getIdTipoImagen() {
		return idTipoImagen;
	}

	public void setIdTipoImagen(Integer idTipoImagen) {
		this.idTipoImagen = idTipoImagen;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public FacturaCompraEntity getFactura() {
		return factura;
	}

	public void setFactura(FacturaCompraEntity factura) {
		this.factura = factura;
	}

	public List<ImagenesFacCompraEntity> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<ImagenesFacCompraEntity> imagenes) {
		this.imagenes = imagenes;
	}

	public List<PagoFacCompraEntity> getPagos() {
		return pagos;
	}

	public void setPagos(List<PagoFacCompraEntity> pagos) {
		this.pagos = pagos;
	}

	public List<ProductoFacCompraEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoFacCompraEntity> productos) {
		this.productos = productos;
	}

	public DefaultStreamedContent getDownload() {
		return download;
	}

	public void setDownload(DefaultStreamedContent download) {
		this.download = download;
	}

	public List<FacturaCompraTotalEntity> getListaFacturasFiltro() {
		return listaFacturasFiltro;
	}

	public void setListaFacturasFiltro(List<FacturaCompraTotalEntity> listaFacturasFiltro) {
		this.listaFacturasFiltro = listaFacturasFiltro;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public List<MoviContableEntity> getListaMovimientos() {
		return listaMovimientos;
	}

	public void setListaMovimientos(List<MoviContableEntity> listaMovimientos) {
		this.listaMovimientos = listaMovimientos;
	}

	public String getDigitalizado() {
		return digitalizado;
	}

	public void setDigitalizado(String digitalizado) {
		this.digitalizado = digitalizado;
	}

}
