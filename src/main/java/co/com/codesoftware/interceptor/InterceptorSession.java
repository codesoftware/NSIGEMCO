package co.com.codesoftware.interceptor;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import co.com.codesoftware.servicio.usuario.UsuarioEntity;



@ManagedBean
@ViewScoped
public class InterceptorSession implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Funcion con la cual verifico si la session existe
	 */
	public void verificarSesion() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			UsuarioEntity entity =  (UsuarioEntity) context.getExternalContext().getSessionMap().get("dataSession");
			if (entity == null) {
				context.getExternalContext().redirect("/NSIGEMCO/login.jsf");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
