package co.com.codesoftware.logica;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;

public class WsLogica {

	/**
	 * metodo que consulta las url parametrizadas en el context del tomcat
	 * 
	 * @return
	 */
	public Map<String, String> consultaURLWebServices() {
		Map<String, String> rta = new HashMap<String, String>();
		try {
			Context initCtx = new InitialContext();
			String endPointAdministracion = (String) initCtx.lookup("java:comp/env/endPointAdministracion");
			String endPointProductos = (String) initCtx.lookup("java:comp/env/endPointProductos");
			String endPointProductosSAFC = (String) initCtx.lookup("java:comp/env/endPointProducto");
			String endPointProducto = (String) initCtx.lookup("java:comp/env/endPointProducto");
			String endPointConteo = (String) initCtx.lookup("java:comp/env/endPointConteo");
			String endPointFacturacion = (String) initCtx.lookup("java:comp/env/endPointFacturacion");
			String endPointGeneral = (String) initCtx.lookup("java:comp/env/endPointGeneral");
			String endPointUsuario = (String) initCtx.lookup("java:comp/env/endPointUsuario");
			String endPointImportacion = (String) initCtx.lookup("java:comp/env/endPointImportacion");
			String endPointContabilidad = (String) initCtx.lookup("java:comp/env/endPointContabilidad");
			rta.put("ProductosSAFC", endPointProductosSAFC);
			rta.put("Administracion", endPointAdministracion);
			rta.put("Productos", endPointProductos);
			rta.put("Conteo", endPointConteo);
			rta.put("Facturacion", endPointFacturacion);
			rta.put("Producto", endPointProducto);
			rta.put("General", endPointGeneral);
			rta.put("Usuario", endPointUsuario);
			rta.put("Importacion", endPointImportacion);
			rta.put("Contabilidad", endPointContabilidad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

}
