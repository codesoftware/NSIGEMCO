package co.com.codesoftware.beans.contabilidad;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.admin.ContabilidadLogic;
import co.com.codesoftware.servicio.contabilidad.AuxContableEntity;
import co.com.codesoftware.servicio.contabilidad.ClaseEntity;
import co.com.codesoftware.servicio.contabilidad.CuentaEntity;
import co.com.codesoftware.servicio.contabilidad.GrupoEntity;
import co.com.codesoftware.servicio.contabilidad.SubCuentaEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class AuxContableBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ClaseEntity claseSelected;
	private GrupoEntity grupoSelected;
	private CuentaEntity cuentaSelected;
	private SubCuentaEntity subcuentaSelected;
	private List<AuxContableEntity> listaAuxiliar;
	// Campos para insertar un auxiliar contable
	private String nombre;
	private String codigo;
	private String descripcion;

	@PostConstruct
	public void init() {
		try {
			this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
			this.claseSelected = (ClaseEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("claseSelected");
			this.grupoSelected = (GrupoEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("grupoSelected");
			this.cuentaSelected = (CuentaEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cuentaSelected");
			this.subcuentaSelected = (SubCuentaEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("subcuentaSelected");
			ContabilidadLogic objLogic = new ContabilidadLogic();
			this.listaAuxiliar = objLogic.obtenerAuxiliarContXSubCuenta(this.subcuentaSelected.getId());
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
	 * Funcion con la cual inserto un auxiliar contable en el sistema
	 */
	public void insertarAuxiliar() {
		try {
			AuxContableEntity aux = new AuxContableEntity();
			aux.setCodigo(codigo);
			aux.setDescripcion(descripcion);
			aux.setNombre(nombre);
			aux.setIdSbcu(this.subcuentaSelected.getId());
			ContabilidadLogic objLogic = new ContabilidadLogic();
			String mensaje = objLogic.insertarAuxiliar(aux);
			if (mensaje.toUpperCase().contains("OK")) {
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('dialogInsAux').hide();");
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean(mensaje);
				this.listaAuxiliar = null;
				this.listaAuxiliar = objLogic.obtenerAuxiliarContXSubCuenta(this.subcuentaSelected.getId());
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(mensaje);
			}
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

	public SubCuentaEntity getSubcuentaSelected() {
		return subcuentaSelected;
	}

	public void setSubcuentaSelected(SubCuentaEntity subcuentaSelected) {
		this.subcuentaSelected = subcuentaSelected;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<AuxContableEntity> getListaAuxiliar() {
		return listaAuxiliar;
	}

	public void setListaAuxiliar(List<AuxContableEntity> listaAuxiliar) {
		this.listaAuxiliar = listaAuxiliar;
	}

}
