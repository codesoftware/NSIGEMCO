package co.com.codesoftware.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import co.com.codesoftware.logica.CargueProductoLogica;
import co.com.codesoftware.server.nsigemco.ProductoTmpEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.utilities.ErrorEnum;

@ManagedBean
@ViewScoped
public class CargueProductoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private UploadedFile file;
	private ErrorEnum enumer;
	private List<ProductoTmpEntity> listaProductos;

	// metodos del programador

	/**
	 * metodo que verifica si el excel cargo correctamente
	 */
	public void validaCargueExcel(FileUploadEvent event) {
		RespuestaEntity respuesta = new RespuestaEntity();
			try {
				CargueProductoLogica logica = new CargueProductoLogica();
				//logica.guardarArchivo(event.getFile().getFileName(), event.getFile().getInputstream());
				
				respuesta =logica.cargaExcel(file, event);
				listaProductos= logica.consultaProductosTemporal();
				this.setEnumer(ErrorEnum.WARNING);
				this.messageBean(respuesta.getMensajeRespuesta());
				
				
			} catch (Exception e) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error al cargar el archivo "+ event.getFile().getFileName());
				e.printStackTrace();
			}
		
	}
	/**
	 * Metodo que inserta la parametrizacion del excel
	 */
	public void insertaParametrizacion(){
		CargueProductoLogica logica = new CargueProductoLogica();
		try {
			RespuestaEntity entity = logica.insertaParametros();
			if(entity.getCodigoRespuesta()== 0 ){
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("CARGUE REALIZADO CORRECTAMENTE");
				this.listaProductos = new ArrayList<>();
			}else{
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(entity.getDescripcionRespuesta());				
			}
			
		} catch (Exception e) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean(e.getMessage());
			e.printStackTrace();
		}
	}

		

	/**
	 * Metodo generico para mostrar mensajes de error o advertencia
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

	// accesor y mutators
	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}



	public List<ProductoTmpEntity> getListaProductos() {
		return listaProductos;
	}



	public void setListaProductos(List<ProductoTmpEntity> listaProductos) {
		this.listaProductos = listaProductos;
	}

}
