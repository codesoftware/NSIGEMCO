package co.com.codesoftware.logica.admin;

import java.util.List;

import co.com.codesoftware.servicio.general.DetallePagoRemision;
import co.com.codesoftware.servicio.general.PagoRemisionEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class PagoRemisionLogica implements WSGeneralInterface {
	/**
	 * Funcion con la cual obtiene el pago de la remision
	 * 
	 * @param idRemision
	 * @param idFactura
	 * @return
	 */
	public PagoRemisionEntity obtienePagoRemision(Integer idRemision, Integer idFactura) {
		PagoRemisionEntity rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().obtenerPrincPago(idRemision, idFactura);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual obtiene el detalle de los pagos
	 * @param idPago
	 * @return
	 */
	public List<DetallePagoRemision> obtieneDetallePagos(Integer idPago){
		List<DetallePagoRemision> rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().obtenerDetallePagos(idPago);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
}
