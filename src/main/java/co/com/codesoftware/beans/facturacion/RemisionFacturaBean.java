package co.com.codesoftware.beans.facturacion;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.facturacion.RemisionLogica;
import co.com.codesoftware.servicio.general.DetProdRemision;
import co.com.codesoftware.servicio.general.RemisionEntity;
import co.com.codesoftware.servicio.usuario.ClienteEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class RemisionFacturaBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ClienteEntity clienteSelected;
	private List<RemisionEntity> remisiones;
	private Date fechaIni;
	private Date fechaFin;
	// Objetos necesarios para seleccion de una remision
	private RemisionEntity remisionSeleccionada;
	private List<DetProdRemision> detalleRemisionSele;
	private Integer idResolucion;
	// Ruta utilizada para la visualizacion de imagenes
	private String rutaImagen;
	private Integer diasPago;
	private String reteFuente;
	
	

	public RemisionFacturaBean() {
		super();
		this.reteFuente = "N";
		// TODO Auto-generated constructor stub
	}

	/**
	 * Funcion la cual se encarga de realizar la consulta de remisiones
	 */
	public void consultarRemisiones() {
		try {
			RemisionLogica objLogica = new RemisionLogica();
			Integer idCliente = 0;
			if (clienteSelected == null) {
				idCliente = -1;
			} else {
				idCliente = clienteSelected.getId();
			}
			remisiones = objLogica.obtenerRemisionesXFiltros(idCliente, fechaIni, fechaFin);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual el usuario selecciona un cliente
	 * 
	 * @param seleccionado
	 */
	public void seleccionaCliente(ClienteEntity seleccionado) {
		try {
			this.clienteSelected = seleccionado;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual veo el detalle de la remision seleccionada
	 * 
	 * @param remision
	 */
	public void verDetalleRemision(RemisionEntity remision) {
		try {
			this.remisionSeleccionada = remision;
			RemisionLogica objLogica = new RemisionLogica();
			this.detalleRemisionSele = objLogica.obtenerDetalle(remision.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/**
	 * Funcion con realizo el el proceso de facturar
	 */
	public void realizaProcesoFacturacion(){
		if("-1".equalsIgnoreCase(this.reteFuente)){
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("Por favor seleccione si desea hacer retencion en la fuente");
		}else{
			RemisionLogica objLogica = new RemisionLogica();
			String rta = objLogica.llamaProcesoFacturar(this.remisionSeleccionada.getId(), objetoSesion.getId(), this.idResolucion, this.diasPago,this.reteFuente);
			if (rta.toUpperCase().contains("OK")) {
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Remision generada en factura correctamente");
				this.remisiones = null;
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(rta);
			}
			RequestContext requestContext = RequestContext.getCurrentInstance();
			requestContext.execute("PF('dialogoReteFuente').hide()");
			
		}
	}

	/**
	 * Funcion con la cual genero una remision en factura
	 */
	public void generaRemision() {
		try {
			RemisionLogica objLogica = new RemisionLogica();
			if (this.idResolucion == null || this.idResolucion == -1) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por favor seleccione una resolucion de facturacion");
			} else if ("Fa".equalsIgnoreCase(this.remisionSeleccionada.getEstado())) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Esta remision ya se encuentra facturada, operacion invalida.");
			} else if (this.diasPago == null || this.diasPago < 0) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Los dias de pago deven ser mayores a cero");
			}else if("S".equalsIgnoreCase(objLogica.evaluaRetefuente())){
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('dialogoReteFuente').show()");
			} else {
				this.realizaProcesoFacturacion();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual genero el pdf de la remision
	 */
	public void obtenerPdfRemision(RemisionEntity remision) {
		this.remisionSeleccionada = remision;
		RemisionLogica objLogica = new RemisionLogica();
		try {
			if (this.remisionSeleccionada == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por favor seleccione una remision");
			} else {
				String documento = objLogica.generaPdfRemision(this.remisionSeleccionada.getId());
				if (documento != null) {
					String valida = objLogica.materializaImagen(documento, "" + this.remisionSeleccionada.getId());
					if ("Ok".equalsIgnoreCase(valida)) {
						this.setEnumer(ErrorEnum.SUCCESS);
						this.messageBean("Remision Generada correctamente");
						this.rutaImagen = objLogica.getRutaImagen();
					}
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Error al generar el pdf con la remision ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual genero el pdf de la remision
	 */
	public void obtenerPdfFactura(RemisionEntity remision) {
		this.remisionSeleccionada = remision;
		RemisionLogica objLogica = new RemisionLogica();
		try {
			if (this.remisionSeleccionada == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por favor seleccione una remision");
			} else {
				if ("RE".equalsIgnoreCase(remision.getEstado())) {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Esta remision no ha sido facturada");
				} else {
					String documento = objLogica.generaPdfFacturaEspecial(this.remisionSeleccionada.getIdFactura());
					if (documento != null) {
						String valida = objLogica.materializaImagen(documento, "" + this.remisionSeleccionada.getId());
						if ("Ok".equalsIgnoreCase(valida)) {
							this.setEnumer(ErrorEnum.SUCCESS);
							this.messageBean("Factura Generada correctamente");
							this.rutaImagen = objLogica.getRutaImagen();
							RequestContext requestContext = RequestContext.getCurrentInstance();
							requestContext.execute("PF('abrirVisor').show()");
						}
					} else {
						this.setEnumer(ErrorEnum.ERROR);
						this.messageBean("Error al generar el pdf con la factura ");
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual voy a realizar un pago 
	 */
	public String generarPagoFactura(Integer idRemision){
		String ruta ="/ACTION/FACTURACION/pagosRemision.jsf";
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idRemisionPago", idRemision);
		return ruta;
	}

	/**
	 * Funcion con la cual imprimo la factura generica del sistema
	 */
	public void generaFacturaGenerica() {
		RemisionLogica objLogica = new RemisionLogica();
		try {
			String documento = objLogica.generaPdfFacturaGenerica(this.remisionSeleccionada.getIdFactura());
			if (documento != null) {
				String valida = objLogica.materializaImagen(documento, "" + this.remisionSeleccionada.getIdFactura());
				if ("Ok".equalsIgnoreCase(valida)) {
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean("Factura Generada correctamente");
					this.rutaImagen = objLogica.getRutaImagen();
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('detalleRemision').hide()");
					requestContext.execute("PF('facturaGenericaDialog').show()");
				}
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error al generar el pdf con la factura ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");

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

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public ClienteEntity getClienteSelected() {
		return clienteSelected;
	}

	public void setClienteSelected(ClienteEntity clienteSelected) {
		this.clienteSelected = clienteSelected;
	}

	public List<RemisionEntity> getRemisiones() {
		return remisiones;
	}

	public void setRemisiones(List<RemisionEntity> remisiones) {
		this.remisiones = remisiones;
	}

	public Date getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public RemisionEntity getRemisionSeleccionada() {
		return remisionSeleccionada;
	}

	public void setRemisionSeleccionada(RemisionEntity remisionSeleccionada) {
		this.remisionSeleccionada = remisionSeleccionada;
	}

	public List<DetProdRemision> getDetalleRemisionSele() {
		return detalleRemisionSele;
	}

	public void setDetalleRemisionSele(List<DetProdRemision> detalleRemisionSele) {
		this.detalleRemisionSele = detalleRemisionSele;
	}

	public Integer getIdResolucion() {
		return idResolucion;
	}

	public void setIdResolucion(Integer idResolucion) {
		this.idResolucion = idResolucion;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public Integer getDiasPago() {
		return diasPago;
	}

	public void setDiasPago(Integer diasPago) {
		this.diasPago = diasPago;
	}

	public String getReteFuente() {
		return reteFuente;
	}

	public void setReteFuente(String reteFuente) {
		this.reteFuente = reteFuente;
	}

}
