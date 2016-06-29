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

}