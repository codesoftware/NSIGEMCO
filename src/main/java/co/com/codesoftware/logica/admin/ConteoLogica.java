package co.com.codesoftware.logica.admin;

import java.util.List;

import co.com.codesoftware.servicio.conteos.ConteoEntity;
import co.com.codesoftware.servicio.conteos.ProductoConteoEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ConteoLogica implements WSGeneralInterface {
	/**
	 * Funcion con la cual obtengo los conteos registrados en el sistema por su
	 * estado
	 * 
	 * @param estado
	 * @return
	 */
	public List<ConteoEntity> obtieneListaConteos(String estado) {
		List<ConteoEntity> rta = null;
		try {
			rta = conexionWSConteo().getPortConteo().obtenerConteoEstado(estado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual inserto un conteo en el sistema
	 * 
	 * @return
	 */
	public String insertaConteo(ConteoEntity conteo) {
		String rta = "";
		try {
			rta = conexionWSConteo().getPortConteo().insertaConteo(conteo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual obtengo un conteo por medio de su id
	 * @return
	 */
	public ConteoEntity obtieneConteoXId(Integer idConteo){
		ConteoEntity  conteo = null;
		try {
			conteo = conexionWSConteo().getPortConteo().obtenerConteo(idConteo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conteo;
	}
	/**
	 * Funcion con la cual obtiene los productos de un conteo por medio de su id
	 * @param idConteo
	 * @return
	 */
	public List<ProductoConteoEntity> obtieneProductosConteo(Integer idConteo){
		List<ProductoConteoEntity> rta = null;
		try {
			rta = conexionWSConteo().getPortConteo().obtenerProductosConteo(idConteo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual ejecuto el proceso de cierre de conteo
	 * @param idConteo
	 * @return
	 */
	public String ejecutaProcesoConteo(Integer idConteo){
		String rta = "";
		try {
			rta = conexionWSConteo().getPortConteo().ejecutaCierreConteo(idConteo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

}
