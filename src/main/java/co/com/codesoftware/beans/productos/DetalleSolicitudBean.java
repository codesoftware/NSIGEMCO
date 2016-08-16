package co.com.codesoftware.beans.productos;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.SolicitudesLogica;
import co.com.codesoftware.servicio.producto.SolicitudEntity;
import co.com.codesoftware.servicio.producto.SolicitudProdEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class DetalleSolicitudBean implements GeneralBean {

	private Integer idSolicitud;
	private SolicitudEntity solicitud;
	private List<SolicitudProdEntity> listaProductos;
	private List<SolicitudProdEntity> listaProductosFiltro;
	private SolicitudesLogica logica;
	private Integer idSede;
	private String codigoExterno;
	private Integer cantidad;

	/**
	 * constructor donde inicializa lo necesario
	 */
	public DetalleSolicitudBean() {
		this.logica = new SolicitudesLogica();
		this.solicitud = new SolicitudEntity();
		this.idSolicitud = (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("idSolicitud");
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idSolicitud", null);
		this.solicitud = logica.consultaSolicitudXId(this.idSolicitud);
		this.listaProductos = logica.consultaProductosEspecificos(this.idSolicitud);
	}

	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
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

	public List<SolicitudProdEntity> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<SolicitudProdEntity> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public List<SolicitudProdEntity> getListaProductosFiltro() {
		return listaProductosFiltro;
	}

	public void setListaProductosFiltro(List<SolicitudProdEntity> listaProductosFiltro) {
		this.listaProductosFiltro = listaProductosFiltro;
	}

	public Integer getIdSede() {
		return idSede;
	}

	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
