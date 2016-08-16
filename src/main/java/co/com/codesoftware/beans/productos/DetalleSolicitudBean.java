package co.com.codesoftware.beans.productos;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

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
public class DetalleSolicitudBean implements GeneralBean {

	private Integer idSolicitud;
	private SolicitudEntity solicitud;
	private List<SolicitudProdEntity> listaProductos;
	private List<SolicitudProdEntity> listaProductosFiltro;
	private SolicitudesLogica logica;
	private Integer idSede;
	private String codigoExterno;
	private Integer cantidad;
	private SolicitudProdEntity producto;
	private List<ExistenciaXSedeEntity> listaExistencia;
	private Integer idSedeMostrar;

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

	/**
	 * metodo que agrega un producto a la lista
	 */
	public void agregaProducto() {
		try {
			Integer bandera = 0;
			this.producto = this.logica.consultaProducto(this.codigoExterno, this.cantidad, this.idSede,
					this.solicitud);
			if (this.producto.getProducto() == null || this.producto.getProducto().getId() == null) {
				messageBean("Error producto inexistente", ErrorEnum.ERROR);
			} else {
				for (SolicitudProdEntity item : listaProductos) {
					if (item.getProducto().getCodigoExt()
							.equalsIgnoreCase(this.producto.getProducto().getCodigoExt())) {
						if (item.getCantidadSolicitada() != null || item.getCantidadSolicitada() != 0) {

						} else {
							item.setCantidadSolicitada(this.cantidad);
						}
						item.setCantidadEnvidada(this.cantidad);
						bandera = 1;
						break;
					}
				}
				if (bandera == 1) {
					messageBean("Producto modificado", ErrorEnum.SUCCESS);
					this.codigoExterno = "";
					this.cantidad = 0;
				} else {
					this.listaProductos.add(0, this.producto);
					messageBean("Producto Agregado", ErrorEnum.SUCCESS);
					this.codigoExterno = "";
					this.cantidad = 0;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo con el cual se puede actualizar un producto
	 */
	public void actualizarProducto(SolicitudProdEntity prod) {
		this.codigoExterno = prod.getProducto().getCodigoExt();
	}

	/**
	 * metodo que elimina un producto de la solicitud
	 * 
	 * @param prod
	 */
	public void eliminaProducto(SolicitudProdEntity prod) {
		for (int i = 0; i < listaProductos.size(); i++) {
			if (listaProductos.get(i).getProducto().getCodigoExt()
					.equalsIgnoreCase(prod.getProducto().getCodigoExt())) {
				listaProductos.remove(i);
				break;
			}
		}
	}

	/**
	 * metodo que consulta las existencias por sede y consulta la sede de la
	 * cual le van a enviar los productos
	 * 
	 * @param prod
	 */
	public void consultaExistenciaSedes(SolicitudProdEntity prod) {
		this.listaExistencia = logica.consultaExistenciasXId(prod.getProducto().getId());
		this.idSedeMostrar = prod.getSedeProducto().getId();

	}

	/**
	 * metodo que actualiza la solicitud
	 */
	public String actualizaPedido() {
		String rta = "";
		if(solicitud.getComentarioEntrega()==null || solicitud.getComentario().equalsIgnoreCase("")){
			messageBean("El campo comentario es obligatorio", ErrorEnum.ERROR);
		}else{
		RespuestaEntity respuestaActualizacion = logica.actualizaSolicitud(1, this.listaProductos);
		if (respuestaActualizacion.getCodigoRespuesta() == 0) {
			messageBean(respuestaActualizacion.getDescripcionRespuesta(), ErrorEnum.ERROR);
		} else {
			messageBean(respuestaActualizacion.getDescripcionRespuesta(), ErrorEnum.SUCCESS);
			rta = "/ACTION/SOLICITUDES/consultaSolicitudes.jsf";
		}
	}return rta;
	}
	
	/**
	 * metodo que valida si hay algun producto sin cantidades o la lista esta vacia
	 * @return
	 */
	public boolean validaLista(){
		if(listaProductos.size()==0){
			messageBean("Debe ingresar por lo menos un producto", ErrorEnum.ERROR);
			return false;
		}
		for(SolicitudProdEntity item:listaProductos){
			if(item.getCantidadEnvidada()==null || item.getCantidadEnvidada()<1){
				messageBean("El producto con código "+item.getProducto().getCodigoExt()+" no tiene cantidades", ErrorEnum.ERROR);
				break;				
			}
			return false;
		}
		return true;
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

	public SolicitudProdEntity getProducto() {
		return producto;
	}

	public void setProducto(SolicitudProdEntity producto) {
		this.producto = producto;
	}

	public List<ExistenciaXSedeEntity> getListaExistencia() {
		return listaExistencia;
	}

	public void setListaExistencia(List<ExistenciaXSedeEntity> listaExistencia) {
		this.listaExistencia = listaExistencia;
	}

	public Integer getIdSedeMostrar() {
		return idSedeMostrar;
	}

	public void setIdSedeMostrar(Integer idSedeMostrar) {
		this.idSedeMostrar = idSedeMostrar;
	}

}
