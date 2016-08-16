package co.com.codesoftware.beans.productos;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.SolicitudesLogica;
import co.com.codesoftware.servicio.producto.SolicitudEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class DetalleSolicitudBean implements GeneralBean {

	private Integer idSolicitud;
	private SolicitudEntity solicitud;
	private List<SolicitudEntity> listaProductos;
	private List<SolicitudEntity> listaProductosFiltro;
	private SolicitudesLogica logica;

	/**
	 * constructor donde inicializa lo necesario
	 */
	public DetalleSolicitudBean() {
		this.logica = new SolicitudesLogica();
		this.idSolicitud = (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("idSolicitud");
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idSolicitud", null);

	}

	/**
	 * metodo que consulta una solicitud por ID
	 */
	public void consultaSolicitudXId() {

	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	public SolicitudEntity getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(SolicitudEntity solicitud) {
		this.solicitud = solicitud;
	}

	public List<SolicitudEntity> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<SolicitudEntity> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public List<SolicitudEntity> getListaProductosFiltro() {
		return listaProductosFiltro;
	}

	public void setListaProductosFiltro(List<SolicitudEntity> listaProductosFiltro) {
		this.listaProductosFiltro = listaProductosFiltro;
	}

}
