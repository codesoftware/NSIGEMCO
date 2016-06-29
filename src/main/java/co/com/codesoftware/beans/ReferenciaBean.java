package co.com.codesoftware.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.logica.ReferenciaLogica;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.utilities.ErrorEnum;

@ManagedBean
public class ReferenciaBean {

	private ReferenciaEntity referencia;
	private ErrorEnum enumer;

	/**
	 * Metodo que inserta una referencia a la base de datos
	 */
	public void adicionaReferencia() {
		ReferenciaLogica logica = new ReferenciaLogica();
		RespuestaEntity respuesta = logica.insertaReferencia(this.referencia);
		if (respuesta == null) {
			this.setEnumer(ErrorEnum.FATAL);
			this.messageBean("Error de conexion con el WebService");
		} else {
			if (respuesta.getCodigoRespuesta() == 0) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(respuesta.getMensajeRespuesta());
			} else {
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Referencia insertada correctamente");
				FiltrosServiceBean.setBanderaRefe(false);
				this.referencia = new ReferenciaEntity();
			}
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

	// constructor

	public ReferenciaBean() {
		this.referencia = new ReferenciaEntity();
	}

	// accesor y mutators
	public ReferenciaEntity getReferencia() {
		return referencia;
	}

	public void setReferencia(ReferenciaEntity referencia) {
		this.referencia = referencia;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

}
