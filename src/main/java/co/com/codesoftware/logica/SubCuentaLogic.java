package co.com.codesoftware.logica;

import java.util.ArrayList;
import java.util.List;

import co.com.codesoftware.server.nsigemco.PucEntity;
import co.com.codesoftware.server.nsigemco.SubCuentaEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class SubCuentaLogic implements WSGeneralInterface{
	
	private String llamado;
	/**
	 * metodo que consulta las subcuentas desde el webservice
	 * @return
	 */
	public List<SubCuentaEntity> consultaSubcuentas(){
		List<SubCuentaEntity> respuesta = null;
		try {
			this.initWebServiceAdm();
			respuesta = conexionWSAdmin().getPortAdm().consultaSubcuentas();
			this.llamado = "OK";
		} catch (Exception e) {
			e.printStackTrace();
			this.llamado = "Error"+e;
		}
		return respuesta;
	}
	/**
	 * funcion que consulta las subcuentas por filtro
	 * @return
	 */
	public List<SubCuentaEntity> consultaSubcuentasFiltro(ArrayList<PucEntity>datos){
		List<SubCuentaEntity> respuesta = null;
		try {
			this.initWebServiceAdm();
			respuesta = conexionWSAdmin().getPortAdm().obtieneSubCuentasFiltros(datos);
			this.llamado = "OK";
		} catch (Exception e) {
			e.printStackTrace();
			this.llamado = "Error"+e;
		}
		return respuesta;
	}
	
	/**
	 * metodo que inicializa el end point del servicio web de administracion
	 * @return
	 */
	public boolean initWebServiceAdm() {
		try {
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
