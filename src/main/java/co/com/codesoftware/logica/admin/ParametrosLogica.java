package co.com.codesoftware.logica.admin;

import java.util.List;

import co.com.codesoftware.servicio.general.ParametrosEmpresaEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ParametrosLogica implements WSGeneralInterface {
	/**
	 * Funcion con la cual obtengo todos los parametros que tiene la empresa
	 * 
	 * @return
	 */
	public List<ParametrosEmpresaEntity> obtieneParametrosEmpresa() {
		List<ParametrosEmpresaEntity> rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().obtenerParametrosEmpresa();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual actualizo un parametro empresarial
	 * 
	 * @return
	 */
	public String actualizaParametroEmpresarial(String clave, String valor) {
		String rta = "";
		try {
			rta = conexionWSGeneral().getPortGeneral().actualizaParametro(clave, valor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

}
