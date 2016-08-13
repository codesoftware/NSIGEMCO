package co.com.codesoftware.rest.logica.administracion;

import java.util.ArrayList;
import java.util.List;

import co.com.codesoftware.server.nsigemco.SocioEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class SocioLogica implements WSGeneralInterface{
	
	/**
	 * metodo que consulta una lista de socios
	 * @return
	 */
	public List<SocioEntity> consultaSocios(){
		List<SocioEntity> respuesta = new ArrayList<>();
		try {
			respuesta = conexionWSAdmin().getPortAdm().obtenerSocios();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}
	
	/**
	 * metodo que consulta un socio en particular
	 * @param id
	 * @return
	 */
	public SocioEntity consultaSocio(Integer id){
			return conexionWSAdmin().getPortAdm().obtenerSocio(id);
	}
	
	/**
	 * metodo que actualiza un socio 
	 * @param entidad
	 * @return
	 */
	public String actualizaSocio(SocioEntity entidad){
		return conexionWSAdmin().getPortAdm().actualizaSocio(entidad);
	}
	
	/**
	 * metodo que inserta un socio
	 * @param entidad
	 * @return
	 */
	public String insertaSocio(SocioEntity entidad){
		return conexionWSAdmin().getPortAdm().insertaSocio(entidad);
	}
}
