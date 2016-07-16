package co.com.codesoftware.logica.admin;

import java.util.List;

import co.com.codesoftware.servicio.general.ResolucionFactEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ResolucionFactLogica implements WSGeneralInterface {
	/**
	 * Funcion con la cual obtiene resoluciones de facturacion
	 * @return
	 */
	public List<ResolucionFactEntity> obtenerResolucionesFact(){
		List<ResolucionFactEntity> rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().obtenerResolucionesFact();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual se inserta una resolucion de facturacion
	 * @param resolucion
	 * @return
	 */
	public String insertaResolucionFact(ResolucionFactEntity resolucion){
		String rta = "";
		try {
			rta = conexionWSGeneral().getPortGeneral().insertarResolucion(resolucion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual actualizo una resolucion de facturacion
	 * @return
	 */
	public String actualizarResolucionFacturacion(ResolucionFactEntity objEntity){
		String rta = "";
		try {
			rta = conexionWSGeneral().getPortGeneral().actualizaResolucion(objEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

}
