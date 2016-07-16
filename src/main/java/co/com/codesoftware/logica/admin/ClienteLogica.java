package co.com.codesoftware.logica.admin;

import java.util.List;

import co.com.codesoftware.servicio.usuario.ClienteEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ClienteLogica implements WSGeneralInterface {
	
	/**
	 * Funcion con la cual busco los clientes que se encuentran en el sistema
	 * @return
	 */
	public List<ClienteEntity> buscaClientesApp(){
		List<ClienteEntity> rta = null;
		try {
			rta = conexionWSUsuarios().getPortUsuarios().obtenerClientes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * funcion que consulta el cliente por ID
	 * @param idCliente
	 * @return
	 */
	public ClienteEntity consultaCliente(String cedula){
		ClienteEntity rta = null;
		try {
			rta = conexionWSUsuarios().getPortUsuarios().obtenerClienteXCedula(cedula);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * metodo que inserta un cliene
	 * @return
	 */
	public Integer insertaCliente(ClienteEntity cliente){
		Integer rta = null;
		try {
			rta = conexionWSUsuarios().getPortUsuarios().insertaCliente(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	
	/**
	 * 
	 * @param cliente
	 * @return
	 */
	public boolean actualizaCliente(ClienteEntity cliente){
		boolean respuesta = false;
		try {
			respuesta = conexionWSUsuarios().getPortUsuarios().updateCliente(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

}
