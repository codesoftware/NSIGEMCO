package co.com.codesoftware.logica.productos;

import java.util.List;

import co.com.codesoftware.server.nsigemco.AporteSocioEntity;
import co.com.codesoftware.server.nsigemco.ProductoAporte;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class AportesSocioLogica implements WSGeneralInterface {

	/**
	 * metodo que consulta los aportes del socio
	 * 
	 * @return
	 */
	public List<AporteSocioEntity> consultaAportes() {
		return conexionWSAdmin().getPortAdm().obtenerAportes();
	}

	/**
	 * metodo que consulta un aporte por el id
	 * 
	 * @param id
	 * @return
	 */
	public AporteSocioEntity consultaAporte(Integer id) {
		return conexionWSAdmin().getPortAdm().obtenerAporte(id);
	}

	/**
	 * metodo que actualiza un aporte
	 * 
	 * @param entidad
	 * @return
	 */
	public String actualizaAporte(AporteSocioEntity entidad) {
		return conexionWSAdmin().getPortAdm().actualizarAportes(entidad);
	}

	/**
	 * metodo que inserta un aporte
	 * @param entidad
	 * @return
	 */
	public String insertaAporte(AporteSocioEntity entidad) {
		return conexionWSAdmin().getPortAdm().insertaAporte(entidad);
	}
	/**
	 * Funcion con la cual consulto los productos que tiene un aporte
	 * @param idAporte
	 * @return
	 */
	public List<ProductoAporte> consultaProdAporte(Integer idAporte){
		List<ProductoAporte> rta = null;
		try {
			rta = conexionWSAdmin().getPortAdm().obtenerPoductosAporte(idAporte);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual borro los productos de un aporte
	 * @param idAporte
	 * @return
	 */
	public String borrarProdAporte(Integer idAporte){
		String rta = "";
		try {
			rta = conexionWSNewProd().getPortNewProductos().eliminaProdAporte(idAporte);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual se envia al proceso de generacion de aportes
	 * @param idAporte
	 * @return
	 */
	public String generaProcesoAporte(Integer idAporte, Integer idAuxCont, Integer idTius){
		String rta = "";
		try {
			rta = conexionWSNewProd().getPortNewProductos().generaProcesoAporte(idAporte, idAuxCont, idTius);
		} catch (Exception e) {
			e.printStackTrace();
			rta = "Error "+ e;
		}
		return rta;
	}

}
