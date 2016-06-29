package co.com.codesoftware.beans.importacion;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.importacion.ImportacionLogica;
import co.com.codesoftware.servicio.importacion.ImportacionEntity;
import co.com.codesoftware.servicio.importacion.ProveedorInterEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ProveedorInternBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ProveedorInterEntity proveedor;
	private List<ProveedorInterEntity> listaProveedores;
	private ImportacionEntity importacion;

	/**
	 * Funcion con la cual inserta un proveedor
	 */
	public void insertarProveedor() {
		ImportacionLogica objLogica = new ImportacionLogica();
		String valida = objLogica.insertarProveedorInt(proveedor);
		if (valida.toUpperCase().contains("OK")) {
			this.setEnumer(ErrorEnum.SUCCESS);
			this.messageBean("Proveedor creado correctamente");
			RequestContext requestContext = RequestContext.getCurrentInstance();
			requestContext.execute("PF('dialogInsertProv').hide()");
		} else {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("Error al insertar el proveedor " + valida);
		}
	}

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		ImportacionLogica objLogica = new ImportacionLogica();
		this.listaProveedores = objLogica.consultaProveedorInter();
		this.proveedor = new ProveedorInterEntity();
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
	 * Funcion con la cual consulto todos los proveedores internacionales del
	 * sistema
	 */
	public void consultaGeneralProveedor() {
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			this.listaProveedores = objLogica.consultaProveedorInter();
		} catch (Exception e) {
			e.printStackTrace();
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

	public ProveedorInterEntity getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorInterEntity proveedor) {
		this.proveedor = proveedor;
	}

	public List<ProveedorInterEntity> getListaProveedores() {
		return listaProveedores;
	}

	public void setListaProveedores(List<ProveedorInterEntity> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}

	public ImportacionEntity getImportacion() {
		return importacion;
	}

	public void setImportacion(ImportacionEntity importacion) {
		this.importacion = importacion;
	}

}
