package co.com.codesoftware.logica;

import java.util.List;

import co.com.codesoftware.servicio.general.SedeEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class SedesLogica implements WSGeneralInterface {
	/**
	 * Funcion con la cual obtengo todas las sedes parametrizadas en el sistema
	 * 
	 * @return
	 */
	public List<SedeEntity> buscaSedes() {
		List<SedeEntity> rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().obtenerSedes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual actualizo la informacion de las sedes
	 * @return
	 */
	public String actualizaSede(SedeEntity sede){
		String rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().actualizarSede(sede);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

}
