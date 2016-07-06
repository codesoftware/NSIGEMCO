package co.com.codesoftware.beans.productos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.ProductosLogica;
import co.com.codesoftware.server.productos.KardexProductoEntity;
import co.com.codesoftware.server.productos.ProductoSimpleEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class PromPonderadoBean implements Serializable, GeneralBean {

	private ErrorEnum enumer;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ProductoSimpleEntity producto;
	private Integer idSede;
	private Date fechaIni;
	private Date fechaFin;
	private List<KardexProductoEntity> listaKardex;
	private List<KardexProductoEntity> listaKardexFiltered;
	// Existencias totales del producto
	private Integer existenciasTotales;
	// Existencias de la sede seleccionada por el usuario
	private Integer existenciasSede;
	private Integer idDska;

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	@PostConstruct
	public void init() {
		try {
			this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("dataSession");
			Integer idDska = (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("idProdSelect");
			ProductosLogica objLogica = new ProductosLogica();
			this.producto = objLogica.consultaProdXId(idDska);
			this.existenciasTotales = objLogica.existenciasProducto(idDska);
			this.idDska = idDska;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual busco el promedio ponderado de un producto
	 */
	public void consultaPromedioPonderadoProducto() {
		try {
			if (fechaFin == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error por favor seleccione una fecha final");
			} else if (fechaIni == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error por favor seleccione una fecha Inicial");
			} else {
				ProductosLogica objLogica = new ProductosLogica();
				this.listaKardex = objLogica.buscaKardexProductoXSede(this.producto.getId(), idSede, fechaIni,
						fechaFin);
				if (this.listaKardex == null || this.listaKardex.size() == 0) {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("La consulta no arrojo ningun resultado");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual busco las existencias de un producto por sede
	 */
	public void consultaExistenciasSede() {
		try {
			ProductosLogica objLogica = new ProductosLogica();
			this.existenciasSede = objLogica.existenciaProductoXSede(this.idDska, this.idSede);
			System.out.println("Esta es la sede seleccionada: " + this.idSede);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo generico para mostrar mensajes de error o advertencia
	 * 
	 * @param message
	 */

	public void messageBean(String message) {
		switch (this.enumer) {
		case ERROR:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", message));
			break;
		case FATAL:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "Error de sistema"));
			break;
		case SUCCESS:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Ok!", message));
			break;

		default:
			break;
		}
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public ProductoSimpleEntity getProducto() {
		return producto;
	}

	public void setProducto(ProductoSimpleEntity producto) {
		this.producto = producto;
	}

	public Integer getIdSede() {
		return idSede;
	}

	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public List<KardexProductoEntity> getListaKardex() {
		return listaKardex;
	}

	public void setListaKardex(List<KardexProductoEntity> listaKardex) {
		this.listaKardex = listaKardex;
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

	public Integer getExistenciasTotales() {
		return existenciasTotales;
	}

	public void setExistenciasTotales(Integer existenciasTotales) {
		this.existenciasTotales = existenciasTotales;
	}

	public Integer getExistenciasSede() {
		return existenciasSede;
	}

	public void setExistenciasSede(Integer existenciasSede) {
		this.existenciasSede = existenciasSede;
	}

	public Integer getIdDska() {
		return idDska;
	}

	public void setIdDska(Integer idDska) {
		this.idDska = idDska;
	}

	public List<KardexProductoEntity> getListaKardexFiltered() {
		return listaKardexFiltered;
	}

	public void setListaKardexFiltered(List<KardexProductoEntity> listaKardexFiltered) {
		this.listaKardexFiltered = listaKardexFiltered;
	}

}
