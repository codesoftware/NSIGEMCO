package co.com.codesoftware.beans.productos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.ProductosLogica;
import co.com.codesoftware.logica.ReferenciaLogica;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.server.productos.ProductoSimpleEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ActualizaProductoBean implements GeneralBean {
	private UsuarioEntity objetoSesion;
	private ProductoSimpleEntity producto;
	private Map<String, Integer> listaMapSubCate;
	private ErrorEnum enumer;

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
			this.buscaSubCategorias();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Funcion la cual busca subcategorias o referencias basado en una categoria
	 */
	public void buscaSubCategorias() {
		ReferenciaLogica objLogica = new ReferenciaLogica();
		try {
			List<ReferenciaEntity> listRefe = objLogica.obtieneReferenciasXcate(producto.getCategoria());
			this.listaMapSubCate = null;
			if (listRefe != null) {
				for (ReferenciaEntity referencia : listRefe) {
					if (this.listaMapSubCate == null) {
						this.listaMapSubCate = new HashMap<String, Integer>();
					}
					this.listaMapSubCate.put(referencia.getDescripcion(), referencia.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual actualizo el producto
	 */
	public void actualizaProducto() {
		try {
			boolean valida = this.validaDatos();
			if(valida){
				ProductosLogica objLogica = new ProductosLogica();
				String rta = objLogica.actualizaCamposProducto(producto);
				if("Ok".equalsIgnoreCase(rta)){
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean("Producto actualizado correctamente");
				}else{
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Error al actualizar el producto: "+ rta);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual valido los datos que el usuario esta dando
	 * @return
	 */
	public boolean validaDatos(){
		try {
			if("".equalsIgnoreCase(producto.getCodigoExt()) & producto.getCodigoExt() == null){
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("El campo codigo externo no puede ser nulo");
				return false;
			}else if("".equalsIgnoreCase(producto.getDescripcion()) & producto.getDescripcion()== null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("El campo codigo externo no puede ser nulo");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public ProductoSimpleEntity getProducto() {
		return producto;
	}

	public void setProducto(ProductoSimpleEntity producto) {
		this.producto = producto;
	}

	public Map<String, Integer> getListaMapSubCate() {
		return listaMapSubCate;
	}

	public void setListaMapSubCate(Map<String, Integer> listaMapSubCate) {
		this.listaMapSubCate = listaMapSubCate;
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

}
