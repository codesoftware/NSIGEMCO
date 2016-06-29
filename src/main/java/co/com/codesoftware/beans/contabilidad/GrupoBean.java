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
import co.com.codesoftware.servicio.contabilidad.GrupoEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class GrupoBean implements Serializable, GeneralBean {

	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ClaseEntity claseSelected;
	private List<GrupoEntity> gruposXClase;


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

	@PostConstruct
	public void init() {
		try {
			this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
			this.claseSelected = (ClaseEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("claseSelected");
			ContabilidadLogic objLogic = new ContabilidadLogic();
			this.gruposXClase = objLogic.obtenerGrupoXClase(this.claseSelected.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion en la cual selecciono una clase
	 * @return
	 */
	public String seleccionaClase(GrupoEntity objEntity){
		String ruta = "/ACTION/CONTABILIDAD/CONSULTAS/consultaCuenta.jsf";
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("grupoSelected", objEntity);
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("claseSelected", this.claseSelected);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruta;
	}

	public ClaseEntity getClaseSelected() {
		return claseSelected;
	}

	public void setClaseSelected(ClaseEntity claseSelected) {
		this.claseSelected = claseSelected;
	}

	public List<GrupoEntity> getGruposXClase() {
		return gruposXClase;
	}

	public void setGruposXClase(List<GrupoEntity> gruposXClase) {
		this.gruposXClase = gruposXClase;
	}

}
