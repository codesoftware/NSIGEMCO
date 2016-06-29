package co.com.codesoftware.utilities;

import java.net.URL;

import co.com.codesoftware.entity.EntityWS;
import co.com.codesoftware.server.SAFWS;
import co.com.codesoftware.server.SAFWSService;
import co.com.codesoftware.servicio.contabilidad.ContabilidadWS;
import co.com.codesoftware.servicio.contabilidad.ContabilidadWS_Service;
import co.com.codesoftware.servicio.conteos.ConteoWS;
import co.com.codesoftware.servicio.conteos.ConteoWS_Service;
import co.com.codesoftware.server.nsigemco.AdministrationEndPoint;
import co.com.codesoftware.server.nsigemco.AdministrationEndPoint_Service;
import co.com.codesoftware.server.productos.ProductosEndPoint;
import co.com.codesoftware.server.productos.ProductosEndPoint_Service;
import co.com.codesoftware.servicio.facturacion.FacturacionWS;
import co.com.codesoftware.servicio.facturacion.FacturacionWS_Service;
import co.com.codesoftware.servicio.general.GeneralWS;
import co.com.codesoftware.servicio.general.GeneralWS_Service;
import co.com.codesoftware.servicio.importacion.ImportacionWS;
import co.com.codesoftware.servicio.importacion.ImportacionWS_Service;
import co.com.codesoftware.servicio.producto.ProductoWS;
import co.com.codesoftware.servicio.producto.ProductoWS_Service;
import co.com.codesoftware.servicio.usuario.UsuarioWS;
import co.com.codesoftware.servicio.usuario.UsuarioWS_Service;

public interface WSGeneralInterface {
	/**
	 * metodo que valida la conexion y devuelve el objeto tipo port
	 * administracion
	 * 
	 * @return
	 */
	default EntityWS conexionWSAdmin() {
		EntityWS entity = new EntityWS();
		try {
			ConSingletonWS con = ConSingletonWS.getInstance();
			String url = con.consultaUrl().get("Administracion");
			AdministrationEndPoint_Service service = new AdministrationEndPoint_Service(new URL(url));
			AdministrationEndPoint port = service.getAdministrationEndPointPort();
			entity.setPortAdm(port);
			entity.setValidaConexionAdm("OK");
		} catch (Exception e) {
			e.printStackTrace();
			entity.setValidaConexionAdm("ERROR DE CONEXION");
		}
		return entity;
	}

	/**
	 * metodo que valida la conexion y devuelve el objeto tipo port producto
	 * 
	 * @return
	 */
	default EntityWS conexionWSProd() {
		EntityWS entity = new EntityWS();
		try {
			ConSingletonWS con = ConSingletonWS.getInstance();
			String url = con.consultaUrl().get("Productos");
			ProductosEndPoint_Service service = new ProductosEndPoint_Service(new URL(url));
			ProductosEndPoint port = service.getProductosEndPointPort();
			entity.setPortProd(port);
			entity.setValidaConexionProd("OK");
		} catch (Exception e) {
			e.printStackTrace();
			entity.setValidaConexionProd("ERROR DE CONEXION");
		}
		return entity;
	}

	default EntityWS conexionWSNewProd() {
		EntityWS entity = new EntityWS();
		try {
			ConSingletonWS con = ConSingletonWS.getInstance();
			String url = con.consultaUrl().get("ProductosSAFC");
			ProductoWS_Service service = new ProductoWS_Service(new URL(url));
			ProductoWS port = service.getProductoWSPort();
			entity.setPortNewProductos(port);
			entity.setValidaConexionProd("OK");
		} catch (Exception e) {
			e.printStackTrace();
			entity.setValidaConexionCont("ERROR DE CONEXION");
		}
		return entity;
	}

	/**
	 * metodo que valida la conexion y devuelve el objeto tipo port conteo
	 * 
	 * @return
	 */
	default EntityWS conexionWSConteo() {
		EntityWS entity = new EntityWS();
		try {
			ConSingletonWS con = ConSingletonWS.getInstance();
			String url = con.consultaUrl().get("Conteo");
			ConteoWS_Service service = new ConteoWS_Service(new URL(url));
			ConteoWS port = service.getConteoWSPort();
			entity.setPortConteo(port);
			entity.setValidaConexionCont("OK");
		} catch (Exception e) {
			e.printStackTrace();
			entity.setValidaConexionCont("ERROR DE CONEXION");
		}
		return entity;
	}

	/**
	 * metodo que valida la conexion y devuelve el objeto tipo port safws
	 * principal
	 * 
	 * @return
	 */
	default EntityWS conexionWSPrinSafv() {
		EntityWS entity = new EntityWS();
		try {
			ConSingletonWS con = ConSingletonWS.getInstance();
			String url = con.consultaUrl().get("SafPrinc");
			SAFWSService service = new SAFWSService(new URL(url));
			SAFWS port = service.getSAFWSPort();
			entity.setPortSafPrinc(port);
			entity.setValidaConexionSafPrinc("OK");
		} catch (Exception e) {
			e.printStackTrace();
			entity.setValidaConexionCont("ERROR DE CONEXION");
		}
		return entity;
	}

	/**
	 * metodo que consulta el end point de facturacion
	 * 
	 * @return
	 */
	default EntityWS conexionWSFacturacion() {
		EntityWS entity = new EntityWS();
		try {
			ConSingletonWS con = ConSingletonWS.getInstance();
			String url = con.consultaUrl().get("Facturacion");
			FacturacionWS_Service service = new FacturacionWS_Service(new URL(url));
			FacturacionWS port = service.getFacturacionWSPort();
			entity.setPortFact(port);
			entity.setValidaConexionFacturacion("OK");
		} catch (Exception e) {
			e.printStackTrace();
			entity.setValidaConexionCont("ERROR DE CONEXION");
		}
		return entity;
	}

	/**
	 * metodo que consulta el end point general
	 * 
	 * @return
	 */
	default EntityWS conexionWSGeneral() {
		EntityWS entity = new EntityWS();
		try {
			ConSingletonWS con = ConSingletonWS.getInstance();
			String url = con.consultaUrl().get("General");
			GeneralWS_Service service = new GeneralWS_Service(new URL(url));
			GeneralWS port = service.getGeneralWSPort();
			entity.setPortGeneral(port);
			entity.setValidaConexionGeneral("OK");

		} catch (Exception e) {
			e.printStackTrace();
			entity.setValidaConexionGeneral("ERROR DE CONEXION");
		}
		return entity;
	}

	/**
	 * metodo que consulta el webservice nuevo de usuarios
	 * 
	 * @return
	 */
	default EntityWS conexionWSUsuarios() {
		EntityWS entity = new EntityWS();
		try {
			ConSingletonWS con = ConSingletonWS.getInstance();
			String url = con.consultaUrl().get("Usuario");
			UsuarioWS_Service service = new UsuarioWS_Service(new URL(url));
			UsuarioWS port = service.getUsuarioWSPort();
			entity.setPortUsuarios(port);
			entity.setValidaConexionUsuarios("OK");

		} catch (Exception e) {
			e.printStackTrace();
			entity.setValidaConexionGeneral("ERROR DE CONEXION");
		}
		return entity;
	}
	
	/**
	 * metodo que consulta el webservice de importaciones
	 * 
	 * @return
	 */
	default EntityWS conexionWSImportacion() {
		EntityWS entity = new EntityWS();
		try {
			ConSingletonWS con = ConSingletonWS.getInstance();
			String url = con.consultaUrl().get("Importacion");
			ImportacionWS_Service service = new ImportacionWS_Service(new URL(url));
			ImportacionWS port = service.getImportacionWSPort();
			entity.setPortImportacion(port);
			entity.setValidaConexionUsuarios("OK");

		} catch (Exception e) {
			e.printStackTrace();
			entity.setValidaImportacion("ERROR DE CONEXION");
		}
		return entity;
	}
	
	default EntityWS conexionWSContabilidad() {
		EntityWS entity = new EntityWS();
		try {
			ConSingletonWS con = ConSingletonWS.getInstance();
			String url = con.consultaUrl().get("Contabilidad");
			ContabilidadWS_Service service = new ContabilidadWS_Service(new URL(url));
			ContabilidadWS port = service.getContabilidadWSPort();
			entity.setPortContabilidad(port);
			entity.setValidaContabilidad("OK");
		} catch (Exception e) {
			e.printStackTrace();
			entity.setValidaImportacion("ERROR DE CONEXION");
		}
		return entity;
	}

}
