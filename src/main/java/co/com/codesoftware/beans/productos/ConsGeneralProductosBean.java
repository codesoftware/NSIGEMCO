package co.com.codesoftware.beans.productos;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.ProductosLogica;
import co.com.codesoftware.server.productos.ProductoSimpleEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ConsGeneralProductosBean implements GeneralBean {

	private ErrorEnum enumer;
	private List<ProductoSimpleEntity> listaProductos;
	private List<ProductoSimpleEntity> filteredProductos;
	private UsuarioEntity objetoSesion;
	// Objeto seleccionado
	private ProductoSimpleEntity objSeleccionado;

	public void consultaProductos() {
		ProductosLogica objLogica = new ProductosLogica();
		try {
			listaProductos = objLogica.consultaProdSimple();
			if ("Error".equalsIgnoreCase(objLogica.getMensaje())) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error " + objLogica.getTraza());
			}

			if (listaProductos == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("La consulta de productos no genero ningun resultado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion en la cual se selecciona el objeto en el cual se realizara la
	 * accion
	 * 
	 * @param obj
	 */
	public void seleccionaProducto(ProductoSimpleEntity obj) {
		try {
			this.objSeleccionado = obj;
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idProdSelect", obj.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<ProductoSimpleEntity> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<ProductoSimpleEntity> listaProductos) {
		this.listaProductos = listaProductos;
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

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public List<ProductoSimpleEntity> getFilteredProductos() {
		return filteredProductos;
	}

	public void setFilteredProductos(List<ProductoSimpleEntity> filteredProductos) {
		this.filteredProductos = filteredProductos;
	}

	@PostConstruct
	public void init() {
		this.consultaProductos();
	}

	public ProductoSimpleEntity getObjSeleccionado() {
		return objSeleccionado;
	}

	public void setObjSeleccionado(ProductoSimpleEntity objSeleccionado) {
		this.objSeleccionado = objSeleccionado;
	}

}
