package co.com.codesoftware.beans.admin;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.SedesLogica;
import co.com.codesoftware.servicio.general.SedeEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class SedesBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private List<SedeEntity> sedes;
	private SedeEntity sedeSelected;
	private List<SedeEntity> sedesFiltered;

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("dataSession");
		try {
			SedesLogica objLogica = new SedesLogica();
			sedes = objLogica.buscaSedes();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Funcion con la cual selecciono una sede desde la tabla
	 * 
	 * @param sede
	 */
	public void seleccionaSede(SedeEntity sede) {
		try {
			this.sedeSelected = sede;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual actualizo una sede
	 */
	public void actualizaSede(){
		try {
			SedesLogica objLogica = new SedesLogica();
			String valida = objLogica.actualizaSede(this.sedeSelected);
			if("Ok".equalsIgnoreCase(valida)){
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Sede actualizada correctamente");
				this.init();
			}else{
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(valida);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
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

	public List<SedeEntity> getSedes() {
		return sedes;
	}

	public void setSedes(List<SedeEntity> sedes) {
		this.sedes = sedes;
	}

	public List<SedeEntity> getSedesFiltered() {
		return sedesFiltered;
	}

	public void setSedesFiltered(List<SedeEntity> sedesFiltered) {
		this.sedesFiltered = sedesFiltered;
	}

	public SedeEntity getSedeSelected() {
		return sedeSelected;
	}

	public void setSedeSelected(SedeEntity sedeSelected) {
		this.sedeSelected = sedeSelected;
	}
}