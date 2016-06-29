package co.com.codesoftware.beans.contabilidad;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.admin.ContabilidadLogic;
import co.com.codesoftware.servicio.contabilidad.ClaseEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ClaseBean implements Serializable, GeneralBean {

	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private List<ClaseEntity> listaClase;

	@PostConstruct
	public void init() {
		try {
			this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
			ContabilidadLogic objLogic = new ContabilidadLogic();
			this.listaClase = objLogic.obtenerClases();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con el cual obtengo la clase seleccionada
	 */
	public String seleccionaClase(ClaseEntity objEntity){
		String ruta = "/ACTION/CONTABILIDAD/CONSULTAS/consultaGrupo.jsf";
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("claseSelected", objEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruta;
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public List<ClaseEntity> getListaClase() {
		return listaClase;
	}

	public void setListaClase(List<ClaseEntity> listaClase) {
		this.listaClase = listaClase;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

}
