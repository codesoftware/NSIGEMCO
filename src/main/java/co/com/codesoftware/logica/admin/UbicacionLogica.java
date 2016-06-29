package co.com.codesoftware.logica.admin;

import java.util.List;

import co.com.codesoftware.servicio.general.CiudadEntity;
import co.com.codesoftware.servicio.general.DepartamentoEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class UbicacionLogica implements WSGeneralInterface {
	/**
	 * Funcion con la cual obtengo la lista de departamentos parametrizados en
	 * el sistema
	 * 
	 * @return
	 */
	public List<DepartamentoEntity> obtieneListaDepartamentos() {
		List<DepartamentoEntity> rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().obtenerDepartamentos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual obtengo la lista de ciudades parametrizadas en el
	 * sistema
	 * 
	 * @return
	 */
	public List<CiudadEntity> obtieneListaCiudades() {
		List<CiudadEntity> rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().obtenerCiudades();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	
	/**
	 * metodo que consulta las ciudades por departamento
	 * @param idDepto
	 * @return
	 */
	
	public List<CiudadEntity> obtieneListaCiudadesXDpto(Integer idDepto) {
		List<CiudadEntity> rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().obtenerCiudadesXDepartamento(idDepto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

}
