package co.com.codesoftware.beans.facturacion;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.admin.PagoRemisionLogica;
import co.com.codesoftware.logica.facturacion.FacturaLogica;
import co.com.codesoftware.logica.facturacion.RemisionLogica;
import co.com.codesoftware.servicio.facturacion.FacturaEntity;
import co.com.codesoftware.servicio.general.DetallePagoRemision;
import co.com.codesoftware.servicio.general.PagoRemisionEntity;
import co.com.codesoftware.servicio.general.RelFacRemiGenEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class PagosRemisionBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private String tipoDocumento;
	private Integer idDocumento;
	private Integer idRemision;
	private Integer idFactura;
	private FacturaEntity factura;
	private String rutaImagen;
	// Dato el cual desea cancelar
	private BigDecimal totalPago;
	private boolean validaPagTot;
	private PagoRemisionEntity pagoRemision;
	private List<DetallePagoRemision> detallePagos;

	/**
	 * Funcion con la cual registro un abono a la deuda
	 */
	public void registraPagoDeuda() {
		try {
			if (this.totalPago.compareTo(new BigDecimal("0")) != 1) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("El abono al pago debe ser mayor a cero",ErrorEnum.ERROR);
			} else {
				RemisionLogica objLogica = new RemisionLogica();
				String aux = "";
				if (validaPagTot) {
					aux = "S";
				} else {
					aux = "N";
				}
				String rta = objLogica.realizaAbonoRemision(objetoSesion.getId(), this.idFactura, totalPago, "E", aux);
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('dialogRegPag').hide();");
				if (rta.toUpperCase().contains("OK")) {
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean("El pago fue realizado correctamente",ErrorEnum.SUCCESS);
					FacturaLogica objLogicaFact = new FacturaLogica();
					this.factura = objLogicaFact.buscaFacturaXId(this.idFactura);
					requestContext.execute("document.getElementById('divInformacion').style.display = ''");
					PagoRemisionLogica objLogicaPr = new PagoRemisionLogica();
					this.pagoRemision = objLogicaPr.obtienePagoRemision(this.idRemision, this.idFactura);
					if(this.pagoRemision != null){
						this.detallePagos = objLogicaPr.obtieneDetallePagos(this.pagoRemision.getId());
					}
				} else {
					this.messageBean(rta,ErrorEnum.ERROR);
					requestContext.execute("document.getElementById('divInformacion').style.display = ''");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual registro el pago total de la deuda
	 */
	public void registroPagoTotal() {
		if (validaPagTot) {
			this.totalPago = this.factura.getValorCobrar();
		} else {
			this.totalPago = new BigDecimal("0");
		}
	}

	/**
	 * Funcion con la cual busco un documento
	 */
	public void buscarDocumento() {
		try {
			RequestContext requestContext = RequestContext.getCurrentInstance();
			if (idDocumento == null || idDocumento == 0) {
				this.messageBean("Por favor ingrese un numero de documento",ErrorEnum.ERROR);
			} else {
				RemisionLogica objLogica = new RemisionLogica();
				RelFacRemiGenEntity valida = objLogica.buscaIdentificadoresXId(this.tipoDocumento, this.idDocumento);
				if (valida != null) {
					if ("Ok".equalsIgnoreCase(valida.getMensaje())) {
						if ("RE".equalsIgnoreCase(valida.getEstado())) {
							this.setEnumer(ErrorEnum.ERROR);
							this.messageBean("La remision a la cual le intenta hacer un pago no ha sido facturada. Por favor facturela para luego realizar los pagos de la misma ",ErrorEnum.ERROR);
							requestContext.execute("document.getElementById('formBusqueda:btnRemision').style.display = 'none'");
							requestContext.execute("document.getElementById('formBusqueda:btnFactura').style.display = 'none'");
							requestContext.execute("document.getElementById('formBusqueda:btnConfirma').style.display = 'none'");
						} else if ("FA".equalsIgnoreCase(valida.getEstado())) {
							this.idFactura = valida.getIdFactura();
							this.idRemision = valida.getIdRemision();
							requestContext.execute("document.getElementById('formBusqueda:btnRemision').style.display = ''");
							requestContext.execute("document.getElementById('formBusqueda:btnFactura').style.display = ''");
							requestContext.execute("document.getElementById('formBusqueda:btnConfirma').style.display = ''");
						} else {
							this.messageBean("Estado desconocido por favor contacte al administrador",ErrorEnum.ERROR);
						}
					} else {
						this.messageBean(valida.getMensaje(),ErrorEnum.ERROR);
						requestContext.execute("document.getElementById('formBusqueda:btnRemision').style.display = 'none'");
						requestContext.execute("document.getElementById('formBusqueda:btnFactura').style.display = 'none'");
						requestContext.execute("document.getElementById('formBusqueda:btnConfirma').style.display = 'none'");
					}
				} else {	
					this.messageBean("Error al obtener la informacion",ErrorEnum.ERROR);
					requestContext.execute("document.getElementById('formBusqueda:btnRemision').style.display = 'none'");
					requestContext.execute("document.getElementById('formBusqueda:btnFactura').style.display = 'none'");
					requestContext.execute("document.getElementById('formBusqueda:btnConfirma').style.display = 'none'");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual genero el pdf de la remision
	 */
	public void obtenerPdfRemision() {
		RemisionLogica objLogica = new RemisionLogica();
		try {
			if (this.idRemision == null || this.idRemision == 0) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por favor seleccione una remision",ErrorEnum.SUCCESS);
			} else {
				String documento = objLogica.generaPdfRemision(this.idRemision);
				if (documento != null) {
					String valida = objLogica.materializaImagen(documento, "" + this.idRemision);
					if ("Ok".equalsIgnoreCase(valida)) {
						this.messageBean("Remision Generada correctamente",ErrorEnum.SUCCESS);
						this.rutaImagen = objLogica.getRutaImagen();
						RequestContext requestContext = RequestContext.getCurrentInstance();
						requestContext.execute("PF('dialogVisRem').show()");
					}
				} else {
					this.messageBean("Error al generar el pdf con la remision ",ErrorEnum.ERROR);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion en la cual busca la informacion de la factura y de la remision
	 */
	public void confirmaPagoRemision() {
		RequestContext requestContext = RequestContext.getCurrentInstance();
		requestContext.execute("document.getElementById('formBusquedaPopUp:btnBuscaRemi').style.display = 'none'");
		try {
			FacturaLogica objLogica = new FacturaLogica();
			this.factura = objLogica.buscaFacturaXId(this.idFactura);
			PagoRemisionLogica objLogicaPr = new PagoRemisionLogica();
			this.pagoRemision = objLogicaPr.obtienePagoRemision(this.idRemision, this.idFactura);
			if(this.pagoRemision != null){
				this.detallePagos = objLogicaPr.obtieneDetallePagos(this.pagoRemision.getId());
			}
			requestContext.execute("document.getElementById('divInformacion').style.display = ''");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");

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

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getIdRemision() {
		return idRemision;
	}

	public void setIdRemision(Integer idRemision) {
		this.idRemision = idRemision;
	}

	public FacturaEntity getFactura() {
		return factura;
	}

	public void setFactura(FacturaEntity factura) {
		this.factura = factura;
	}

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public BigDecimal getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(BigDecimal totalPago) {
		this.totalPago = totalPago;
	}

	public boolean isValidaPagTot() {
		return validaPagTot;
	}

	public void setValidaPagTot(boolean validaPagTot) {
		this.validaPagTot = validaPagTot;
	}

	public PagoRemisionEntity getPagoRemision() {
		return pagoRemision;
	}

	public void setPagoRemision(PagoRemisionEntity pagoRemision) {
		this.pagoRemision = pagoRemision;
	}

	public List<DetallePagoRemision> getDetallePagos() {
		return detallePagos;
	}

	public void setDetallePagos(List<DetallePagoRemision> detallePagos) {
		this.detallePagos = detallePagos;
	}
	
}
