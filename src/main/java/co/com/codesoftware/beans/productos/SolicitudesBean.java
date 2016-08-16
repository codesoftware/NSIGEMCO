package co.com.codesoftware.beans.productos;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;

import co.com.codesoftware.logica.SolicitudesLogica;
import co.com.codesoftware.servicio.producto.ExistenciaXSedeEntity;
import co.com.codesoftware.servicio.producto.RespuestaEntity;
import co.com.codesoftware.servicio.producto.SolicitudEntity;
import co.com.codesoftware.servicio.producto.SolicitudProdEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class SolicitudesBean implements GeneralBean {
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private Date fechaInicial;
	private Date fechaFinal;
	private String estado;
	private List<SolicitudEntity> solicitudes;
	private SolicitudesLogica logica;
	private List<SolicitudProdEntity> productosSolicitud;
	private String estadoSolicitud;
	private String sedeNombreSelec;
	private List<ExistenciaXSedeEntity> listaExistencia;

	@Override
	@PostConstruct
	public void init() {
		logica = new SolicitudesLogica();
		this.estadoSolicitud = "P";
	}

	/**
	 * metodo que consulta las solicitudes por estado
	 */
	public void consultaSolicitudes() {
		try {

			this.solicitudes = logica.consultaSolicitudes(fechaInicial, fechaFinal, estado);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * metodo que consulta el detalle de la solicitud
	 * 
	 * @param idSolicitud
	 * @return
	 */
	public void consultaDetalle(Integer idSolicitud, String nombreSedeOrigen) {
		this.sedeNombreSelec = nombreSedeOrigen;
		try {
			productosSolicitud = logica.consultaProductosEspecificos(idSolicitud);
			RequestContext requestContext = RequestContext.getCurrentInstance();
			this.estadoSolicitud = productosSolicitud.get(0).getSolicitud().getEstado();
			requestContext.execute("PF('wdetalleProductos').show()");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * envia al formulario de detalle de productos de la solicitud
	 * 
	 * @param idSolicitud
	 */
	public String consultaDetalleSolicitud(Integer idSolicitud) {
		String rta = "";
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idSolicitud", idSolicitud);
			rta = "/ACTION/SOLICITUDES/detalleSolicitud.jsf";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo que evalua el cambio de la tabla editable
	 * 
	 * @param event
	 */
	public void onCellEdit(CellEditEvent event) {

	}

	/**
	 * metodo que acutaliza los datos del pedido
	 */
	public void actualizaPedido() {
		RespuestaEntity respuestaActualizacion = logica.actualizaSolicitud(1, this.productosSolicitud);
		if (respuestaActualizacion.getCodigoRespuesta() == 0) {
			this.enumer = enumer.ERROR;
		} else {
			this.enumer = enumer.SUCCESS;
		}
		messageBean(respuestaActualizacion.getDescripcionRespuesta());
	}

	/**
	 * metodo que consulta las existencias por todas las sedes
	 * 
	 * @param idProducto
	 */
	public void consultaExistenciaSedes(Integer idProducto) {
		this.listaExistencia = logica.consultaExistenciasXId(idProducto);
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<SolicitudEntity> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<SolicitudEntity> solicitudes) {
		this.solicitudes = solicitudes;
	}

	public List<SolicitudProdEntity> getProductosSolicitud() {
		return productosSolicitud;
	}

	public void setProductosSolicitud(List<SolicitudProdEntity> productosSolicitud) {
		this.productosSolicitud = productosSolicitud;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public void messageBean(String message) {
		switch (this.enumer) {
		case ERROR:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", message));
			break;
		case FATAL:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "Error de sistema"));
			break;
		case SUCCESS:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Ok!", message));
			break;

		default:
			break;
		}
	}

	public String getSedeNombreSelec() {
		return sedeNombreSelec;
	}

	public void setSedeNombreSelec(String sedeNombreSelec) {
		this.sedeNombreSelec = sedeNombreSelec;
	}

	public List<ExistenciaXSedeEntity> getListaExistencia() {
		return listaExistencia;
	}

	public void setListaExistencia(List<ExistenciaXSedeEntity> listaExistencia) {
		this.listaExistencia = listaExistencia;
	}

}
