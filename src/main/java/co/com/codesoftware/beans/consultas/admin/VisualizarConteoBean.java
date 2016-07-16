package co.com.codesoftware.beans.consultas.admin;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;

import co.com.codesoftware.logica.CargueProductoLogica;
import co.com.codesoftware.logica.admin.ConteoLogica;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.servicio.conteos.ConteoEntity;
import co.com.codesoftware.servicio.conteos.ProductoConteoEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class VisualizarConteoBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private ConteoEntity conteoEntity;
	private List<ProductoConteoEntity> listaConteo;

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		Integer idConteo = (int) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("idConteo");
		try {
			ConteoLogica conteoLogica = new ConteoLogica();
			this.conteoEntity = conteoLogica.obtieneConteoXId(idConteo);
			this.listaConteo = conteoLogica.obtieneProductosConteo(idConteo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual ejecuto el cierre de un conteo
	 */
	public void enviarEjecucionCierre(){
		try {
			ConteoLogica objLogica = new ConteoLogica();
			String rta = objLogica.ejecutaProcesoConteo(this.conteoEntity.getId());
			messageBean("Mensaje: " + rta, ErrorEnum.SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cargueExcelConteo(FileUploadEvent event) {
		String respuesta = "";
		try {
			CargueProductoLogica logica = new CargueProductoLogica();
			respuesta = logica.cargaExcelConteo(null, event, this.objetoSesion.getId(), this.conteoEntity.getId());
			//listaProductos = logica.consultaProductosTemporal();
			//this.setEnumer(ErrorEnum.WARNING);
			//this.messageBean(respuesta.getMensajeRespuesta());
		} catch (Exception e) {
			this.messageBean("Error al cargar el archivo " + event.getFile().getFileName(),ErrorEnum.ERROR);
			e.printStackTrace();
		}

	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public ConteoEntity getConteoEntity() {
		return conteoEntity;
	}

	public void setConteoEntity(ConteoEntity conteoEntity) {
		this.conteoEntity = conteoEntity;
	}

	public List<ProductoConteoEntity> getListaConteo() {
		return listaConteo;
	}

	public void setListaConteo(List<ProductoConteoEntity> listaConteo) {
		this.listaConteo = listaConteo;
	}

}
