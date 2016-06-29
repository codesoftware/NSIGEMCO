package co.com.codesoftware.logica;

import java.util.List;

import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class CategoriaLogica implements WSGeneralInterface{
	
	/**
	 * Metodo que consulta el webservice de categorias
	 * @return
	 */
	public List<CategoriaEntity> consultaCategorias(){
		List<CategoriaEntity> rta = null;
		try {
			rta = conexionWSAdmin().getPortAdm().obtieneCategorias();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			
		}
		return rta;
	}
	

}
