package co.com.codesoftware.beans.admin;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import co.com.codesoftware.logica.admin.ResolucionFactLogica;
import co.com.codesoftware.servicio.general.ResolucionFactEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ResolucionFactBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private List<ResolucionFactEntity> listaResoluciones;
	private ResolucionFactEntity resolucion;
	
	
	public ResolucionFactBean() {
		super();
		this.resolucion = new ResolucionFactEntity();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Funcion en la cual inserto una resolucion de facturacion
	 */
	public void insertaResolucionFact() {
		try {
			ResolucionFactLogica objLogica = new ResolucionFactLogica();
			String rta = objLogica.insertaResolucionFact(this.resolucion);
			if("Ok".equalsIgnoreCase(rta)){
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Resolucion Insertada correctamente");
				this.resolucion = new ResolucionFactEntity();
				this.init();
			}else{
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(rta);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		try {
			ResolucionFactLogica objLogica = new ResolucionFactLogica();
			this.listaResoluciones = objLogica.obtenerResolucionesFact();
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
	 * Funcion con la cual actualizo una fila de la tabla
	 */
	public void actualizaFila(RowEditEvent event){
		ResolucionFactEntity aux = (ResolucionFactEntity) event.getObject();
		try {
			ResolucionFactLogica objLogica = new ResolucionFactLogica();
			String valida = objLogica.actualizarResolucionFacturacion(aux);
			this.listaResoluciones = null;
			this.listaResoluciones = objLogica.obtenerResolucionesFact();
			if("OK".equalsIgnoreCase(valida)){
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Resolucion Actualizada correctamente");
			}else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error al actualizar la resolucion: " + valida);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cancelaActualizacionFila(){
		System.out.println("Paso por aqui111");
	}
	
	public void editarCelda(){
		System.out.println("Esto ees una prueba de editar");
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

	public List<ResolucionFactEntity> getListaResoluciones() {
		return listaResoluciones;
	}

	public void setListaResoluciones(List<ResolucionFactEntity> listaResoluciones) {
		this.listaResoluciones = listaResoluciones;
	}

	public ResolucionFactEntity getResolucion() {
		return resolucion;
	}

	public void setResolucion(ResolucionFactEntity resolucion) {
		this.resolucion = resolucion;
	}
	
	

}
