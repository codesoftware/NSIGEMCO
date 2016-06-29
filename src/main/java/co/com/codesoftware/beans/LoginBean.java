package co.com.codesoftware.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import co.com.codesoftware.logica.UsuarioLogic;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;

@ManagedBean
@ViewScoped
public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String usuario;
	private String clave;
	private ErrorEnum enumer;
	private String contraPrinci;
	private String contraSecund;
	private boolean bandera;
	private UsuarioEntity objetoUsuario;

	@PostConstruct
	public void init() {
		bandera = true;
		try {
			this.usuario = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("usuarioCambioContra");
			this.objetoUsuario = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("dataSession");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Funcion con la cual me logeo en la aplicacion unicamente con el usuario
	 * 
	 * @return
	 */
	public String loginUsuario() {
		String redireccion = "";
		try {
			if ("".equalsIgnoreCase(this.usuario) || this.usuario == null) {
				redireccion = "login.jsf";
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Error!", "Error de login automatico usuario invalido o no tienes acceso de ingreso"));
			} else {
				UsuarioLogic logic = new UsuarioLogic();
				UsuarioEntity objEntity = logic.buscaInfoUsuario(this.usuario);
				// Guardo el objeto del usuario en session
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("dataSession", objEntity);
				redireccion = "ACTION/home.jsf";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return redireccion;
	}

	/**
	 * Funcion con la cual se realiza el login de usuario
	 * 
	 * @return
	 */
	public String login() {
		String redireccion = "";
		List rta = null;
		try {
			UsuarioLogic logic = new UsuarioLogic();
			rta = logic.loginUsuario(usuario, clave);
			if ("Ok".equalsIgnoreCase(logic.getValida())) {
				if ("Ok".equalsIgnoreCase(logic.getValida())) {
					String acceso = "" + rta.get(0);
					String mensaje = "" + rta.get(1);
					if ("Ok".equalsIgnoreCase(acceso)) {
						UsuarioEntity objEntity = logic.buscaInfoUsuario(this.usuario);
						// Guardo el objeto del usuario en session
						FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("dataSession",
								objEntity);
						redireccion = "ACTION/home?faces-redirect=false";
					} else if ("UPD".equalsIgnoreCase(acceso)) {
						FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
								.put("usuarioCambioContra", usuario);
						redireccion = "ACTION/USUARIO/cambioContraObliga?faces-redirect=falsef";
					} else {
						this.setEnumer(ErrorEnum.ERROR);
						this.messageBean("Error de credenciales");
					}
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("" + rta.get(0));
				}

			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(
						"Error de conexion con el servidor de WebServices por favor contacte al administrador");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return redireccion;
	}

	/**
	 * Funcion con la cual obligo a cambiar la contraseña
	 */
	public String cambioContraOblig() {
		String rta = "/login?faces-redirect=false";
		try {
			if (contraPrinci.length() == 0) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error la contraseña no puede ser nula");
			} else if (!contraPrinci.equalsIgnoreCase(contraSecund)) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Las contraseñas no coinciden");
			} else {
				UsuarioLogic objLogic = new UsuarioLogic();
				boolean valida = objLogic.cambioContrasena(usuario, contraPrinci);
				if (valida) {
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean(
							"Cambio de contraseña realizado correctamente ingrese con desde ahora con su nueva contraseña");
					bandera = false;
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Error al cambiar la contraseña, Revise la conexion con los WebServices");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

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

	public String getContraPrinci() {
		return contraPrinci;
	}

	public void setContraPrinci(String contraPrinci) {
		this.contraPrinci = contraPrinci;
	}

	public String getContraSecund() {
		return contraSecund;
	}

	public void setContraSecund(String contraSecund) {
		this.contraSecund = contraSecund;
	}

	public boolean isBandera() {
		return bandera;
	}

	public void setBandera(boolean bandera) {
		this.bandera = bandera;
	}

	/**
	 * Funcion con la cual se cierra sesion
	 * 
	 * @return
	 */
	public String cerrarSesion() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "login?faces-redirect=false";
	}

	/**
	 * Funcion la cual realiza la logica para el reenvio a Sigemco
	 * 
	 * @return
	 */
	public String cambioSigemco() {
		String reenvio = "SIGEMCO";
		try {
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			FacesContext.getCurrentInstance().getExternalContext().redirect("/SIGEMCO/inicio.jsp?user="
					+ this.objetoUsuario.getUsuario() + "&pass=" + this.objetoUsuario.getPassword());
			System.out.println("Paso por aqui");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return reenvio;
	}

	public UsuarioEntity getObjetoUsuario() {
		return objetoUsuario;
	}

	public void setObjetoUsuario(UsuarioEntity objetoUsuario) {
		this.objetoUsuario = objetoUsuario;
	}
	/**
	 * Funcion la cual inicializa el logo de la empresa dependiendo la
	 * aplicacion en la que se encuentre
	 */
	public void iniciaLogoAplicacion() {
		try {
			ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
			String realPath=(String) servletContext.getRealPath("/resources/images/logo.png");	
			UsuarioLogic logic = new UsuarioLogic();
			logic.copiaLogoServer(realPath); 
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}

}