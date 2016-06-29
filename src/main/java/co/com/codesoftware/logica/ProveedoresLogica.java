package co.com.codesoftware.logica;

import java.util.List;

import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ProveedoresLogica implements WSGeneralInterface {
	
	private String llamado;

	/**
	 * metodo que consulta el servicio web de proveedores
	 * 
	 * @return
	 */
	public List<ProveedoresEntity> consutaProveedores() {
		return conexionWSAdmin().getPortAdm().obtieneProveedores();
	}

	/**
	 * Funcion con la cual se realizara la insercion de un proveedor
	 * 
	 * @param prov
	 * @return
	 */
	public RespuestaEntity insertarProveedor(ProveedoresEntity prov) {
		RespuestaEntity rta = null;
		try {
			this.initWebServiceAdm();
			if (prov.getDireccion() == null) {
				prov.setDireccion("No proporciono datos");
			}
			rta = conexionWSAdmin().getPortAdm().insertaProveedor(prov);
			this.llamado = "Ok";
		} catch (Exception e) {
			e.printStackTrace();
			this.llamado = "Error " + e;
			return null;
		}
		return rta;

	}
	
	/**
	 * metodo que se usa para actualizar un proveedor
	 * @param prov
	 * @return
	 */
	public RespuestaEntity actualizaProveedor(ProveedoresEntity prov){
		RespuestaEntity rta = null;
		try {
			this.initWebServiceAdm();
			if (prov.getDireccion() == null) {
				prov.setDireccion("No proporciono datos");
			}
			rta = conexionWSAdmin().getPortAdm().actualizarProveedor(prov);
			this.llamado = "Ok";
		} catch (Exception e) {
			e.printStackTrace();
			this.llamado = "Error " + e;
			return null;
		}
		return rta;
		
	}

	/**
	 * Funcion con la cual busca todos los proveedores que se encuentran en la
	 * base de datos
	 * 
	 * @return
	 */
	public List<ProveedoresEntity> buscaProveedores() {
		List<ProveedoresEntity> rta = null;
		try {
			rta = conexionWSAdmin().getPortAdm().obtieneProveedores();
			this.llamado = "Ok";
		} catch (Exception e) {
			e.printStackTrace();
			this.llamado = "Error " + e;
			return null;
		}
		return rta;
	}

	/**
	 * Funcion con la cual se inicializan los objetos con los cuales se llaman
	 * los webservices de administracion
	 * 
	 * @return
	 */
	public boolean initWebServiceAdm() {
		try {
			//this.service = new AdministrationEndPoint_Service();
			//this.port = service.getAdministrationEndPointPort();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String getLlamado() {
		return llamado;
	}

	public void setLlamado(String llamado) {
		this.llamado = llamado;
	}

}
