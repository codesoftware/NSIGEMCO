package co.com.codesoftware.logica;

import java.util.List;

import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ReferenciaLogica implements WSGeneralInterface {
	/**
	 * Funcion con la cual busco y obtengo todas las referencias parametriadas
	 * en el sistema
	 * 
	 * @return
	 */
	public List<ReferenciaEntity> buscaReferenciasEntity() {
		List<ReferenciaEntity> listaReferencia = null;
		try {
			listaReferencia = conexionWSAdmin().getPortAdm().obtieneReferencias();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaReferencia;
	}

	/**
	 * Funcion en la cual se invoca el webservice de inserción de referencia
	 * 
	 * @param refe
	 * @return
	 */
	public RespuestaEntity insertaReferencia(ReferenciaEntity refe) {
		try {
			return conexionWSAdmin().getPortAdm().insertaReferencia(refe);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Funcion con la cual actualizo una referencia
	 * 
	 * @param referencia
	 * @return
	 */
	public boolean asociaCategoriaConSubCat(ReferenciaEntity referencia) {
		boolean rta = false;
		try {
			RespuestaEntity respuesta = conexionWSAdmin().getPortAdm().actualizaReferencia(referencia);
			if (respuesta.getCodigoRespuesta() == 1) {
				rta = true;
			} else {
				rta = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			rta = false;
		}
		return rta;
	}

	/**
	 * Funcion con la cual obtengo todas las referenias que tiene asociada una
	 * categoria
	 * 
	 * @param idCate
	 * @return
	 */
	public List<ReferenciaEntity> obtieneReferenciasXcate(Integer idCate) {
		List<ReferenciaEntity> rta = null;
		try {
			rta = conexionWSAdmin().getPortAdm().obtieneReferenciasXIdCate(idCate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

}
