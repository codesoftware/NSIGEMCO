package co.com.codesoftware.beans.admin;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.UsuarioLogic;
import co.com.codesoftware.servicio.usuario.PerfilEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class PerfilesBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private List<PerfilEntity> listaPerifiles;

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("dataSession");
		try {
			UsuarioLogic objLogic = new UsuarioLogic();
			listaPerifiles = objLogic.obtenerPerfiles();
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

	public List<PerfilEntity> getListaPerifiles() {
		return listaPerifiles;
	}

	public void setListaPerifiles(List<PerfilEntity> listaPerifiles) {
		this.listaPerifiles = listaPerifiles;
	}

}
