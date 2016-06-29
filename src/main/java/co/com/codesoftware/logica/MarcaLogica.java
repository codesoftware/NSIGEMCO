package co.com.codesoftware.logica;

import java.util.List;

import co.com.codesoftware.server.nsigemco.MarcaEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class MarcaLogica implements WSGeneralInterface {
	/**
	 * Metodo que consulta el webservice de marcas
	 * 
	 * @return
	 */
	public List<MarcaEntity> consultaMarcas() {
		List<MarcaEntity> rta = null;
		try {
			rta = conexionWSAdmin().getPortAdm().obtieneMarcas();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return rta;
	}
	
	/**
	 * Metodo que consulta el webservice de marcas
	 * 
	 * @return
	 */
	public List<MarcaEntity> consultaMarcasXCategoria(Integer idCate) {
		List<MarcaEntity> rta = null;
		try {
			rta = conexionWSAdmin().getPortAdm().obtieneMarcasXCate(idCate);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return rta;
	}
	
	/**
	 * Funcion que consulta el metodo de insercion de marcas
	 * @param marca
	 * @return
	 */
	public RespuestaEntity insertaMarca(MarcaEntity marca){
	try {
		return conexionWSAdmin().getPortAdm().insertaMarca(marca);
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}	
	}
}
