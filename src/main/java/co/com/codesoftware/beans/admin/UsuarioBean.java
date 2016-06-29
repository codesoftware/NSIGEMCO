package co.com.codesoftware.beans.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.UsuarioLogic;
import co.com.codesoftware.servicio.usuario.PerfilEntity;
import co.com.codesoftware.servicio.usuario.PersonaEntity;
import co.com.codesoftware.servicio.usuario.SedeEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private List<UsuarioEntity> listaUsuarios;
	private UsuarioEntity usuarioSelected;
	private Date fechaInicial;
	
	public UsuarioBean() {
		super();
		// TODO Auto-generated constructor stub
		fechaInicial = new Date();
		Long anios = new Long("31556900000")*18;
		long ahora = fechaInicial.getTime();
		this.fechaInicial = new Date(ahora-anios);
	}

	@PostConstruct
	public void init() {
		try {
			this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
			UsuarioLogic objLogic = new UsuarioLogic();
			this.listaUsuarios = objLogic.obtenerUsuarios();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual se consulta un usuario para actualizarlo
	 * 
	 * @param id
	 */
	public void consultaActualiza(String usuario) {
		try {
			UsuarioLogic objLogic = new UsuarioLogic();
			this.usuarioSelected = objLogic.buscaInfoUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual actualizo un usuario en el sistema
	 */
	public void actualizarUsuario(){
		try {
			UsuarioLogic objLogic = new UsuarioLogic();
			String valida = objLogic.actualizaUsuario(this.usuarioSelected);
			if(valida.toUpperCase().contains("OK")){
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Usuario actualizado Correctamente");
				this.init();
			}else{
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error al actualizar el usuario: " + valida);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual inserto un usuario
	 */
	public void insertaUsuario(){
		try {
			UsuarioLogic objLogica = new UsuarioLogic();
			String valida = objLogica.insertaUsuarios(this.usuarioSelected);
			if(valida.toUpperCase().contains("OK")){
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Usuario insertado Correctamente");
				this.init();
			}else{
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error al insertar el usuario: " + valida);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual reinicio el objeto usuario seleccionado para realizar la insercion
	 */
	public void limpiaUsuarioSeleccionado(){
		this.usuarioSelected = new UsuarioEntity();
		this.usuarioSelected.setPersona(new PersonaEntity());
		this.usuarioSelected.setSede(new SedeEntity());
		this.usuarioSelected.setPerfil(new PerfilEntity());
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

	public List<UsuarioEntity> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<UsuarioEntity> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public UsuarioEntity getUsuarioSelected() {
		return usuarioSelected;
	}

	public void setUsuarioSelected(UsuarioEntity usuarioSelected) {
		this.usuarioSelected = usuarioSelected;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	
	

}
