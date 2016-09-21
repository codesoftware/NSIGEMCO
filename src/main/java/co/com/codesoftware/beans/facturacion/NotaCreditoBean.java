package co.com.codesoftware.beans.facturacion;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.facturacion.FacturaLogica;
import co.com.codesoftware.servicio.facturacion.DetProduFacturaEntity;
import co.com.codesoftware.servicio.facturacion.FacturaEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class NotaCreditoBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private String tipoDocAso;
	private Integer idResolucion;
	private Integer idConsecutivo;
	private String textResolucion;
	private FacturaEntity factura;
	// Datos para editar los productos
	private String codigoExternoAux;
	private BigDecimal precioAux;
	private Integer cantidad;

	@PostConstruct
	public void init() {
		textResolucion = "Ultima Factura emitida con la resolcion No. ?";
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
	}

	/**
	 * Funcion con la cual busco el ultimo numero facturado de la resolucion de
	 * facturacion
	 */
	public void buscaMaxResolucion() {
		try {
			FacturaLogica objLogica = new FacturaLogica();
			Integer aux = objLogica.obtenerMaxConsec(idResolucion);
			if (aux == null) {
				textResolucion = "La resolucion no tiene ninguna factura asociada";
			} else {
				textResolucion = "Ultima Factura emitida con la resolcion No. " + aux;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual busco una factura
	 */
	public void buscarFactura() {
		try {
			FacturaLogica objLogica = new FacturaLogica();
			if (this.idResolucion == null || this.idResolucion == -1) {
				messageBean("Por favor seleccione una resolucion de facturacion", ErrorEnum.ERROR);
			} else if (this.idConsecutivo == null) {
				messageBean("El consecutivo de facturacion no puede ser nulo", ErrorEnum.ERROR);
			} else {
				this.factura = objLogica.buscaFacturaPorConsec(this.idResolucion, this.idConsecutivo);
				if (this.factura == null) {
					messageBean("La consulta con los parametros dados no arrojo ningun resultado", ErrorEnum.ERROR);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual selecciono un producto
	 * @param idProducto
	 */
	public void seleccionaProducto(Integer idProducto){
		try {
			if(this.factura.getDetalleProductos() != null){
				for(DetProduFacturaEntity item : factura.getDetalleProductos()){
					if(item.getId() == idProducto){
						this.codigoExternoAux = item.getProducto().getCodigoExt();
						this.cantidad = item.getCantidad();
						this.precioAux = item.getValorIvaTotal();
					}
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual cambio los valores de la cuenta
	 */
	public void cambioValoresFactura(){
		try{
			System.out.println("Paso por aqui:  " + this.codigoExternoAux + " Precio Auxiliar: " + this.precioAux+ " Cantidad: " + this.cantidad  );
			for(DetProduFacturaEntity item : this.factura.getDetalleProductos()){
				if(this.codigoExternoAux.equalsIgnoreCase(item.getProducto().getCodigoExt())){
					item.setCantidad(this.cantidad);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public String getTipoDocAso() {
		return tipoDocAso;
	}

	public void setTipoDocAso(String tipoDocAso) {
		this.tipoDocAso = tipoDocAso;
	}

	public Integer getIdResolucion() {
		return idResolucion;
	}

	public void setIdResolucion(Integer idResolucion) {
		this.idResolucion = idResolucion;
	}

	public Integer getIdConsecutivo() {
		return idConsecutivo;
	}

	public void setIdConsecutivo(Integer idConsecutivo) {
		this.idConsecutivo = idConsecutivo;
	}

	public String getTextResolucion() {
		return textResolucion;
	}

	public void setTextResolucion(String textResolucion) {
		this.textResolucion = textResolucion;
	}

	public FacturaEntity getFactura() {
		return factura;
	}

	public void setFactura(FacturaEntity factura) {
		this.factura = factura;
	}

	public String getCodigoExternoAux() {
		return codigoExternoAux;
	}

	public void setCodigoExternoAux(String codigoExternoAux) {
		this.codigoExternoAux = codigoExternoAux;
	}

	public BigDecimal getPrecioAux() {
		return precioAux;
	}

	public void setPrecioAux(BigDecimal precioAux) {
		this.precioAux = precioAux;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
