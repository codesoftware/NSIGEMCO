package co.com.codesoftware.logica.productos;

import java.util.ArrayList;
import java.util.List;

import co.com.codesoftware.servicio.producto.ExistenciaXSedeEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ConsultaProductosLogica implements WSGeneralInterface {

	/**
	 * metodo que consulta los productos por sede
	 * 
	 * @param idSede
	 * @return
	 */
	public List<ExistenciaXSedeEntity> consultaProdXSede(Integer idSede) {
		List<ExistenciaXSedeEntity> lista = new ArrayList<>();
		try {
			lista = conexionWSNewProd().getPortNewProductos().obtenerCantidadesTotalesXSede(idSede);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;

	}
}
