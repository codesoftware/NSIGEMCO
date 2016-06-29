package co.com.codesoftware.beans.contabilidad;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.admin.ContabilidadLogic;
import co.com.codesoftware.servicio.contabilidad.ClaseEntity;
import co.com.codesoftware.servicio.contabilidad.CuentaEntity;
import co.com.codesoftware.servicio.contabilidad.GrupoEntity;
import co.com.codesoftware.servicio.contabilidad.SubCuentaEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class SubCuentaBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ClaseEntity claseSelected;
	private GrupoEntity grupoSelected;
	private CuentaEntity cuentaSelected;
	private List<SubCuentaEntity> listaSubCuenta;

	@PostConstruct
	public void init() {
		try {
			this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
			this.claseSelected =  (ClaseEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("claseSelected");
			this.grupoSelected = (GrupoEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("grupoSelected");
			this.cuentaSelected = (CuentaEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cuentaSelected");
			ContabilidadLogic objLogica = new ContabilidadLogic();
			this.listaSubCuenta = objLogica.obtenerSubCuentaXCuenta(this.cuentaSelected.getId());
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
	 * Funcion en la cual selecciono una Subcuenta
	 * @return
	 */
	public String seleccionaSubCuenta(SubCuentaEntity objEntity){
		String ruta = "/ACTION/CONTABILIDAD/CONSULTAS/consultaAuxContable.jsf";
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("grupoSelected", this.grupoSelected);
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("claseSelected", this.claseSelected);
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("cuentaSelected", this.cuentaSelected);
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("subcuentaSelected", objEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruta;
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

	public ClaseEntity getClaseSelected() {
		return claseSelected;
	}

	public void setClaseSelected(ClaseEntity claseSelected) {
		this.claseSelected = claseSelected;
	}

	public GrupoEntity getGrupoSelected() {
		return grupoSelected;
	}

	public void setGrupoSelected(GrupoEntity grupoSelected) {
		this.grupoSelected = grupoSelected;
	}

	public CuentaEntity getCuentaSelected() {
		return cuentaSelected;
	}

	public void setCuentaSelected(CuentaEntity cuentaSelected) {
		this.cuentaSelected = cuentaSelected;
	}

	public List<SubCuentaEntity> getListaSubCuenta() {
		return listaSubCuenta;
	}

	public void setListaSubCuenta(List<SubCuentaEntity> listaSubCuenta) {
		this.listaSubCuenta = listaSubCuenta;
	}

}
