package co.com.codesoftware.beans.importacion;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.importacion.ImportacionLogica;
import co.com.codesoftware.servicio.importacion.ImportacionEntity;
import co.com.codesoftware.servicio.importacion.ProveedorInterEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class AdminImportacionBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ImportacionEntity importacion;
	private ProveedorInterEntity proveedorSelect;

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		this.importacion = new ImportacionEntity();
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
	/**
	 * Funcion con la cual selecciono el proveedor de la importacion
	 */
	public void seleccionaProveedor(ProveedorInterEntity objEntity){
		try {
			this.proveedorSelect = objEntity;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual inserto una importacion en el sistema
	 */
	public void insertarImportacion(){
		if(this.proveedorSelect == null){
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("El proveedor no puede ser nulo");
		}else if("".equalsIgnoreCase(this.importacion.getNombre())){
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("El nombre no puede ser nulo");
		}else if(this.importacion.getFechaLleg() == null){
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("La fecha no puede ser nula");
		}else{
			ImportacionLogica objLogica = new ImportacionLogica();
			importacion.setIdProv(this.proveedorSelect.getId());
			importacion.setIdtius(this.objetoSesion.getId());
			String valida = objLogica.insertaImportacion(importacion);
			if(valida.toUpperCase().contains("OK")){
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Importacion realizada Correctamente");
				this.proveedorSelect = new ProveedorInterEntity();
				this.importacion = new ImportacionEntity();
			}else{
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error al ingresar la importacion: "+ valida);
			}
		}
	}
	
	public void insertImportacion(){
		System.out.println("Paso por aqui");
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

	public ImportacionEntity getImportacion() {
		return importacion;
	}

	public void setImportacion(ImportacionEntity importacion) {
		this.importacion = importacion;
	}

	public ProveedorInterEntity getProveedorSelect() {
		return proveedorSelect;
	}

	public void setProveedorSelect(ProveedorInterEntity proveedorSelect) {
		this.proveedorSelect = proveedorSelect;
	}

}
