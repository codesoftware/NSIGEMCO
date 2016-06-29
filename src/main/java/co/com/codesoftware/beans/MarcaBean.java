package co.com.codesoftware.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.logica.MarcaLogica;
import co.com.codesoftware.server.nsigemco.MarcaEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.utilities.ErrorEnum;

@ManagedBean
public class MarcaBean {

	private MarcaEntity marca;
	private ErrorEnum enumer;
/**
 * Metodo que valida la inserción de las marcas
 */
	public void adicionaMarca(){
		MarcaLogica logica = new MarcaLogica();
		RespuestaEntity respuesta =logica.insertaMarca(marca);
		if (respuesta == null) {
			this.setEnumer(ErrorEnum.FATAL);
			this.messageBean("Error de conexion con el WebService");
		} else {
			if (respuesta.getCodigoRespuesta() == 0) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(respuesta.getMensajeRespuesta());
			} else {
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Marca insertada correctamente");
				FiltrosServiceBean.setBanderaMarc(false);
				this.marca = new MarcaEntity();
			}
		}
	}
	
	/**
	 * Metodo generico de envio de mensajes
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

	// constructor
	public MarcaBean() {
		this.marca = new MarcaEntity();
	}

	// accesors y mutators
	public MarcaEntity getMarca() {
		return marca;
	}

	public void setMarca(MarcaEntity marca) {
		this.marca = marca;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

}
