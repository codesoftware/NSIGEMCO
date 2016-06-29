package co.com.codesoftware.beans.importacion;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.importacion.ImportacionLogica;
import co.com.codesoftware.servicio.importacion.ImportacionEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ConsultaImportacionBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date fechaInicial;
	private Date fechaFinal;
	private List<ImportacionEntity> listaImportacion;
	private ImportacionLogica logica;

	/**
	 * metodo que consulta las importaciones
	 */
	public void consultaImportaciones() {
		this.listaImportacion = logica.consultaImportacion(this.fechaInicial, this.fechaFinal);
	}

	/**
	 * Funcion con la cual
	 * 
	 * @param objEntity
	 * @return
	 */
	public String seleccionaImportacion(ImportacionEntity objEntity) {
		String ruta = "/ACTION/IMPORTACION/cargarProductos.jsf";
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("importacionSelected", objEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruta;
	}
	/**
	 * Funcion con la cual envio la importacion a finalizar el proceso
	 * @return
	 */
	public String seleccionaEnvioProc(ImportacionEntity objEntity){
		String ruta = "/ACTION/IMPORTACION/generarProcesoImportacion.jsf";
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("importacionSelected", objEntity);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruta;
	}
	
	/**
	 * Funcion con la cual
	 * 
	 * @param objEntity
	 * @return
	 */
	public String seleccionaImportacionGastos(ImportacionEntity objEntity) {
		String ruta = "/ACTION/IMPORTACION/cargaGastosImportacion.jsf";
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("importacionSelected", objEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruta;
	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		// TODO Auto-generated method stub

	}

	@Override
	@PostConstruct
	public void init() {
		logica = new ImportacionLogica();

	}



	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public List<ImportacionEntity> getListaImportacion() {
		return listaImportacion;
	}

	public void setListaImportacion(List<ImportacionEntity> listaImportacion) {
		this.listaImportacion = listaImportacion;
	}

}
