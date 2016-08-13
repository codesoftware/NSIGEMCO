package co.com.codesoftware.utilities;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import co.com.codesoftware.servicio.usuario.UsuarioEntity;

public interface GeneralBean {
	public void setObjetoSesion(UsuarioEntity objetoSesion);
	public void init();
	public default void messageBean(String message,ErrorEnum enumer){
		switch (enumer) {
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
	/**
	 * metodo que trae los datos de sesion del usuario
	 * @return
	 */
	public default UsuarioEntity traeDatosSesion(){
		return (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("dataSession");
	}

}
