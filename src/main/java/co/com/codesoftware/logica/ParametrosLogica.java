package co.com.codesoftware.logica;

import java.util.List;

import co.com.codesoftware.server.nsigemco.ReteFuenteEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ParametrosLogica implements WSGeneralInterface{
	
	/**
	 * funcion que consulta las tablas de retencion
	 * @return
	 */
	public List<ReteFuenteEntity> consultaReteXVersion(){
		return conexionWSAdmin().getPortAdm().consultaTablasRetencion(1);
	}

}