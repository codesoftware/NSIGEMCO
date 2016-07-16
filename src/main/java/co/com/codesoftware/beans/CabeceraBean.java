package co.com.codesoftware.beans;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.servicio.usuario.UsuarioEntity;

@ManagedBean
@ViewScoped
public class CabeceraBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity usuarioSesion;
	private Date ultimoIngreso;

	public CabeceraBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		FacesContext context = FacesContext.getCurrentInstance();
		UsuarioEntity entity = (UsuarioEntity) context.getExternalContext().getSessionMap().get("dataSession");
		if (entity != null) {
			this.usuarioSesion = entity;
			this.ultimoIngreso = usuarioSesion.getUltimoIngresa().toGregorianCalendar().getTime();
		}
	}

	public UsuarioEntity getUsuarioSesion() {
		return usuarioSesion;
	}

	public void setUsuarioSesion(UsuarioEntity usuarioSesion) {
		this.usuarioSesion = usuarioSesion;
	}

	public Date getUltimoIngreso() {
		return ultimoIngreso;
	}

	public void setUltimoIngreso(Date ultimoIngreso) {
		this.ultimoIngreso = ultimoIngreso;
	}

}
