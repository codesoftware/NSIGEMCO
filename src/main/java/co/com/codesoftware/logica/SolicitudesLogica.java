package co.com.codesoftware.logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.com.codesoftware.servicio.producto.ExistenciaXSedeEntity;
import co.com.codesoftware.servicio.producto.RespuestaEntity;
import co.com.codesoftware.servicio.producto.SolicitudEntity;
import co.com.codesoftware.servicio.producto.SolicitudProdEntity;
import co.com.codesoftware.utilities.Utilitites;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class SolicitudesLogica implements WSGeneralInterface {
	
	/**
	 * metodo que consulta las solicitudes mediante un filtro de fechas
	 * @param fechaInicial
	 * @param fechaFinal
	 * @param estado
	 * @return
	 */
	public List<SolicitudEntity> consultaSolicitudes(Date fechaInicial,Date fechaFinal, String estado){
		 List<SolicitudEntity> respuesta = new ArrayList<>();
		 try {
			respuesta = conexionWSNewProd().getPortNewProductos().obtenerSolicitudesFiltros(Utilitites.dateToXMLGC(fechaInicial), Utilitites.dateToXMLGC(fechaFinal), 0, 0, estado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return respuesta;
	}
	
	/**
	 * metodo que consulta los productos de la solicitud especificos
	 * @param idSoliciud
	 * @return
	 */
	public List<SolicitudProdEntity> consultaProductosEspecificos(Integer idSoliciud){
		List<SolicitudProdEntity> rta = new ArrayList<>();
		try {
			rta = conexionWSNewProd().getPortNewProductos().obtenerProductosXSolicitud(idSoliciud);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	
	/**
	 * metodo que consulta las existencias de un producto por la sede
	 * @param idSede
	 * @return
	 */
	public ExistenciaXSedeEntity consultaExistenciasSede(Integer idSede,Integer idProducto){
		ExistenciaXSedeEntity respuesta = new ExistenciaXSedeEntity();
		try {
			respuesta = conexionWSNewProd().getPortNewProductos().obtenerCantidadesXSede(idSede, idProducto);
			if(respuesta==null){
				respuesta = new ExistenciaXSedeEntity();
				respuesta.setExistencias(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			respuesta = new ExistenciaXSedeEntity();
			respuesta.setExistencias(0);
		}
		return respuesta;
	}
	
	/**
	 * funcion que llama al servicio web de actualizacion de la solicitud
	 * @param idUsuario
	 * @param productos
	 * @return
	 */
	public RespuestaEntity actualizaSolicitud(Integer idUsuario,List<SolicitudProdEntity> productos){
		RespuestaEntity respuesta = new RespuestaEntity();
		try {
			respuesta = conexionWSNewProd().getPortNewProductos().actualizaSolicitud(idUsuario, productos);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return respuesta;
	}
	/**
	 * metodo que consulta las cantidades totales por producto
	 * @param idProducto
	 * @return
	 */
	public List<ExistenciaXSedeEntity> consultaExistenciasXId(Integer idProducto){
		 List<ExistenciaXSedeEntity> lista = new ArrayList<ExistenciaXSedeEntity>();
		 try {
			lista =conexionWSNewProd().getPortNewProductos().obtenerCantidadesXProducto(idProducto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return lista;
	}

}
