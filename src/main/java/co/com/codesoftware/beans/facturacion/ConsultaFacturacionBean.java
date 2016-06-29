package co.com.codesoftware.beans.facturacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;

import co.com.codesoftware.logica.ConsultaFacturasLogic;
import co.com.codesoftware.logica.ReporteLogica;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.servicio.facturacion.FacturaEntity;
import co.com.codesoftware.servicio.facturacion.HistorialFacturaEntity;
import co.com.codesoftware.servicio.facturacion.ImagenFacturaEntity;
import co.com.codesoftware.servicio.facturacion.MoviContableEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ConsultaFacturacionBean implements Serializable, GeneralBean {

	private static final long serialVersionUID = 1L;
	private Date fechaInicial;
	private Date fechaFinal;
	private Integer idSede;
	private ConsultaFacturasLogic logica;
	private List<FacturaEntity> listaFacturas;
	private List<FacturaEntity> listaFacturasFiltradas;
	private FacturaEntity facturaEspecifico;
	private String bandera = "Error";
	private String idFacturaAbrir;
	private String solicitudCanc;
	private String solicitudAprobacion;
	private String solicitudContabilizar;
	private String rechazo;
	private String estadoNuevo;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private List<HistorialFacturaEntity> listaHistorial;
	private DefaultStreamedContent download;
	private List<MoviContableEntity> listaMFact;
	private List<MoviContableEntity> listaMndef;
	private List<ImagenFacturaEntity> listaImagenes;

	/**
	 * metodo que consulta las facturas de acuerdo a los filtros
	 */
	public void consultaFacturas() {
		try {
			if(this.idSede != -1){
				if (this.listaFacturas == null) {
					this.listaFacturas = new ArrayList<FacturaEntity>();
				}
				this.listaFacturas = logica.consultaFacturasFechaSede(idSede, fechaInicial, fechaFinal);
				if(listaFacturas == null || listaFacturas.size() == 0){
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("La consulta no arrojo ningun resultado");
				}
			}else{
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por favor seleccione una sede");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * metodo que envia al otro jsf y consulta la factura por id
	 * 
	 * @param id
	 * @return
	 */
	public String consultaEspecifico(Integer id) {
		String rta = "";
		try {
			if (this.facturaEspecifico == null) {
				this.facturaEspecifico = new FacturaEntity();
			}
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idFact", id);
			rta = "facturaDetalle?faces-redirect=false";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo que actualiza la consulta y vuelve consulta la factura especifica
	 * 
	 * @return
	 */
	public void actualizaConsultaFactura(String estado) {
		String rta = "";
		boolean datos = false;
		try {
			if ("A".equalsIgnoreCase(estado)) {
				this.solicitudCanc = this.solicitudAprobacion;
				datos = validaCamposVacios(this.solicitudAprobacion);
			} else if ("R".equalsIgnoreCase(estado)) {
				this.solicitudCanc = this.solicitudContabilizar;
				datos = validaCamposVacios(this.solicitudContabilizar);
			} else {
				datos = validaCamposVacios(this.solicitudCanc);
			}

			if (this.facturaEspecifico == null) {
				this.facturaEspecifico = new FacturaEntity();
			}
			if (datos) {
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idFact", this.facturaEspecifico.getId());
				rta = logica.procesoCancelaFactura(estado, facturaEspecifico.getId(), this.objetoSesion.getId(), this.solicitudCanc);
				if ("OK".equalsIgnoreCase(rta)) {
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean("Accion realizada correctamente.");
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Error:" + rta);
				}

			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error: La descripción no puede ir vacia");
			}
			consultaFacturaEspecifica();

		} catch (Exception e) {
			e.printStackTrace();
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("Error:" + e.getMessage());
		}
	}

	/**
	 * metodo que devuelve un estado a su estado anterior de la factura
	 */
	public void rechazaSolicitud() {
		String rta = "";
		this.estadoNuevo = "P";

		try {
			if (validaCamposVacios(this.rechazo)) {
				rta = logica.procesoCancelaFactura(this.estadoNuevo, facturaEspecifico.getId(), this.objetoSesion.getId(), this.rechazo);
				if ("OK".equalsIgnoreCase(rta)) {
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean("Accion realizada correctamente.");
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Error:" + rta);
				}
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("La descripción no puede ir vacia");
			}
			consultaFacturaEspecifica();

		} catch (Exception e) {
			e.printStackTrace();
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("Error:" + e.getMessage());
		}
	}

	/**
	 * metodo que genera el pdf
	 */
	public void generaFacturacion() {
		try {
			String rta = logica.generarPdfXIdFact(facturaEspecifico.getId());
			if ("Ok".equalsIgnoreCase(rta)) {
				idFacturaAbrir = "" + facturaEspecifico.getId();
				bandera = "Ok";
			} else {
				bandera = "Error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que consulta la factura especifica
	 */
	public void consultaFacturaEspecifica() {
		try {
			this.solicitudCanc = "";
			this.solicitudAprobacion = "";
			this.rechazo = "";
			this.solicitudContabilizar = "";
			Integer id = (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("idFact");
			if (id != null) {
				this.facturaEspecifico = logica.consultaFacturaEspecifica(id);
				RequestContext context = RequestContext.getCurrentInstance();
				context.execute("muestraBotones('" + this.facturaEspecifico.getEstado() + "');");
				this.listaHistorial = logica.consultaHistorialFactura(id);
				muestraNotasDebito();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que llama a la consulta del servicio web y este le retorna una
	 * ruta para descargar el archivo
	 */
	public void descargarReporte() {
		ReporteLogica reporte = new ReporteLogica();
		try {
			String ruta = reporte.consultaReporteNotaCredito(this.facturaEspecifico.getId(), "NOTA_CREDITO", "pdf");
			File file = new File(ruta);
			InputStream input = new FileInputStream(file);
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			setDownload(new DefaultStreamedContent(input, externalContext.getMimeType(file.getName()), file.getName()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * metodo que guarda en el servidor la nota credito
	 * 
	 * @param event
	 */
	public void cargaNotaCredito(FileUploadEvent event) {
		RespuestaEntity res = new RespuestaEntity();
		try {
			res = logica.guardaImagen(event, "N_C", this.facturaEspecifico.getId(), this.objetoSesion.getId());
			this.setEnumer(ErrorEnum.SUCCESS);
			consultaFacturaEspecifica();
			consultaImagenesFactura();
		} catch (Exception e) {
			res.setCodigoRespuesta(0);
			res.setDescripcionRespuesta("ERROR AL CARGAR LA IMAGEN");
			this.setEnumer(ErrorEnum.ERROR);
		}
		messageBean(res.getDescripcionRespuesta());

	}

	/**
	 * metodo que muestra las notas debito de la factura
	 */
	public void muestraNotasDebito() {
		try {
			listaMFact = logica.consultaMovContable(this.facturaEspecifico.getId(), "fact");
			listaMndef = logica.consultaMovContable(this.facturaEspecifico.getId(), "notcr");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que sirve para descargar un archivo
	 * 
	 * @param date
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
	 * metodo que consulta las imagenes asociadas a la factura
	 */
	public void consultaImagenesFactura() {
		if (this.facturaEspecifico != null) {
			this.listaImagenes = logica.consultaImagenesId(this.facturaEspecifico.getId());
		}
	}

	/**
	 * metodo que valida los campos vacios
	 * 
	 * @param campo
	 * @return
	 */
	public boolean validaCamposVacios(String campo) {
		if (campo == null || "".equalsIgnoreCase(campo)) {
			return false;
		} else {
			return true;
		}
	}

	@PostConstruct
	public void init() {
		logica = new ConsultaFacturasLogic();
		consultaFacturaEspecifica();
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		consultaImagenesFactura();

	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
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

	// accesors y mutators
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

	public List<FacturaEntity> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(List<FacturaEntity> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	public List<FacturaEntity> getListaFacturasFiltradas() {
		return listaFacturasFiltradas;
	}

	public void setListaFacturasFiltradas(List<FacturaEntity> listaFacturasFiltradas) {
		this.listaFacturasFiltradas = listaFacturasFiltradas;
	}

	public String getBandera() {
		return bandera;
	}

	public void setBandera(String bandera) {
		this.bandera = bandera;
	}

	public String getIdFacturaAbrir() {
		return idFacturaAbrir;
	}

	public void setIdFacturaAbrir(String idFacturaAbrir) {
		this.idFacturaAbrir = idFacturaAbrir;
	}

	/**
	 * limpiar mensaje
	 */
	public void resetMessage() {
		RequestContext.getCurrentInstance().reset("form:mensajes");
	}

	public String getSolicitudCanc() {
		return solicitudCanc;
	}

	public void setSolicitudCanc(String solicitudCanc) {
		this.solicitudCanc = solicitudCanc;
	}

	public String getEstadoNuevo() {
		return estadoNuevo;
	}

	public void setEstadoNuevo(String estadoNuevo) {
		this.estadoNuevo = estadoNuevo;
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public List<HistorialFacturaEntity> getListaHistorial() {
		return listaHistorial;
	}

	public void setListaHistorial(List<HistorialFacturaEntity> listaHistorial) {
		this.listaHistorial = listaHistorial;
	}

	public String getSolicitudAprobacion() {
		return solicitudAprobacion;
	}

	public void setSolicitudAprobacion(String solicitudAprobacion) {
		this.solicitudAprobacion = solicitudAprobacion;
	}

	public String getRechazo() {
		return rechazo;
	}

	public void setRechazo(String rechazo) {
		this.rechazo = rechazo;
	}

	public String getSolicitudContabilizar() {
		return solicitudContabilizar;
	}

	public void setSolicitudContabilizar(String solicitudContabilizar) {
		this.solicitudContabilizar = solicitudContabilizar;
	}

	public DefaultStreamedContent getDownload() {
		return download;
	}

	public void setDownload(DefaultStreamedContent download) {
		this.download = download;
	}

	public List<MoviContableEntity> getListaMFact() {
		return listaMFact;
	}

	public void setListaMFact(List<MoviContableEntity> listaMFact) {
		this.listaMFact = listaMFact;
	}

	public List<MoviContableEntity> getListaMndef() {
		return listaMndef;
	}

	public void setListaMndef(List<MoviContableEntity> listaMndef) {
		this.listaMndef = listaMndef;
	}

	public List<ImagenFacturaEntity> getListaImagenes() {
		return listaImagenes;
	}

	public void setListaImagenes(List<ImagenFacturaEntity> listaImagenes) {
		this.listaImagenes = listaImagenes;
	}

	public FacturaEntity getFacturaEspecifico() {
		return facturaEspecifico;
	}

	public void setFacturaEspecifico(FacturaEntity facturaEspecifico) {
		this.facturaEspecifico = facturaEspecifico;
	}

}
