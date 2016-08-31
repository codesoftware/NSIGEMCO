package co.com.codesoftware.logica.facturacion;

import java.math.BigDecimal;

import co.com.codesoftware.servicio.facturacion.FacturaEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class FacturaLogica implements WSGeneralInterface {
	/**
	 * Funcion con la cual busco una factura por su id
	 * 
	 * @param idFactura
	 * @return
	 */
	public FacturaEntity buscaFacturaXId(Integer idFactura) {
		FacturaEntity rta = null;
		try {
			rta = conexionWSFacturacion().getPortFact().obtenerFacturaXId(idFactura);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	public BigDecimal obtenerValorFacturasMes(Integer valor) {
		BigDecimal valorFa = null;
		try {
			valorFa = conexionWSGeneral().getPortGeneral().obtenerValorVentasMes(valor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valorFa;
	}

	/**
	 * F
	 * 
	 * @param idResolucion
	 * @return
	 */
	public Integer obtenerMaxConsec(Integer idResolucion) {
		Integer rta = null;
		try {
			rta = conexionWSFacturacion().getPortFact().consultaMaxFacturacion(idResolucion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;

	}

	/**
	 * Funcion con la cual busco una factura por medio de su resolucion y el
	 * consecutivo de facturacion
	 * 
	 * @param idResolucion
	 * @param idConsec
	 * @return
	 */
	public FacturaEntity buscaFacturaPorConsec(Integer idResolucion, Integer idConsec) {
		FacturaEntity fact = null;
		try {
			fact = conexionWSFacturacion().getPortFact().obtenerFacturaXConsec(idResolucion, idConsec);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fact;
	}

}
