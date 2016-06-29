package co.com.codesoftware.beans.importacion;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.admin.ContabilidadLogic;
import co.com.codesoftware.logica.importacion.ImportacionLogica;
import co.com.codesoftware.servicio.contabilidad.AuxContableEntity;
import co.com.codesoftware.servicio.importacion.GastoImpoEntity;
import co.com.codesoftware.servicio.importacion.ImportacionEntity;
import co.com.codesoftware.servicio.importacion.ProductoImportacionEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class GenerarProcImportacionBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ImportacionEntity importacion;
	private List<ProductoImportacionEntity> productosImportacion;
	private List<ProductoImportacionEntity> filteredproductosImportacion;
	private List<GastoImpoEntity> listaGastos;
	private AuxContableEntity auxConta;

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		try {
			this.importacion = (ImportacionEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("importacionSelected");
			ImportacionLogica objLogica = new ImportacionLogica();
			this.productosImportacion = objLogica.obtieneProductosImportacion(this.importacion.getId());
			this.listaGastos = objLogica.obtenerGastosImportacion(this.importacion.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	 * Funcion con la cual selecciono un auxiliar contable
	 */
	public void seleccionaAuxContable(Integer idAux){
		try {
			ContabilidadLogic objLogic = new ContabilidadLogic();
			auxConta = objLogic.obtenerAuxiliarContableXId(idAux);
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

	public ImportacionEntity getImportacion() {
		return importacion;
	}

	public void setImportacion(ImportacionEntity importacion) {
		this.importacion = importacion;
	}

	public List<ProductoImportacionEntity> getProductosImportacion() {
		return productosImportacion;
	}

	public void setProductosImportacion(List<ProductoImportacionEntity> productosImportacion) {
		this.productosImportacion = productosImportacion;
	}

	public List<ProductoImportacionEntity> getFilteredproductosImportacion() {
		return filteredproductosImportacion;
	}

	public void setFilteredproductosImportacion(List<ProductoImportacionEntity> filteredproductosImportacion) {
		this.filteredproductosImportacion = filteredproductosImportacion;
	}

	public List<GastoImpoEntity> getListaGastos() {
		return listaGastos;
	}

	public void setListaGastos(List<GastoImpoEntity> listaGastos) {
		this.listaGastos = listaGastos;
	}

	public AuxContableEntity getAuxConta() {
		return auxConta;
	}

	public void setAuxConta(AuxContableEntity auxConta) {
		this.auxConta = auxConta;
	}

}
