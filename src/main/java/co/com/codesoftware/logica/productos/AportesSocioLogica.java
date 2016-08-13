package co.com.codesoftware.logica.productos;

import java.util.List;

import co.com.codesoftware.server.nsigemco.AporteSocioEntity;
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

}
