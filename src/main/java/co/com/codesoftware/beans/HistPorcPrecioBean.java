package co.com.codesoftware.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.ProductosLogica;
import co.com.codesoftware.server.productos.PorcentajePrecioEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class HistPorcPrecioBean implements Serializable, GeneralBean {

	private static final long serialVersionUID = 1L;
	private ErrorEnum enumer;
	private UsuarioEntity objetoSesion;
	private List<PorcentajePrecioEntity> listaPorc;
	private List<PorcentajePrecioEntity> listaPorcFiltered;

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

	@PostConstruct
	public void init() {
		try {
			this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("dataSession");
			ProductosLogica objLogica = new ProductosLogica();
			this.listaPorc = objLogica.consultaGeneralPorc("A");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<PorcentajePrecioEntity> getListaPorc() {
		return listaPorc;
	}

	public void setListaPorc(List<PorcentajePrecioEntity> listaPorc) {
		this.listaPorc = listaPorc;
	}

	public List<PorcentajePrecioEntity> getListaPorcFiltered() {
		return listaPorcFiltered;
	}

	public void setListaPorcFiltered(List<PorcentajePrecioEntity> listaPorcFiltered) {
		this.listaPorcFiltered = listaPorcFiltered;
	}

}
