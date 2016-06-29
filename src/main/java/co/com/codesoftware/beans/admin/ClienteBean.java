package co.com.codesoftware.beans.admin;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.codesoftware.logica.admin.ClienteLogica;
import co.com.codesoftware.servicio.usuario.ClienteEntity;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ClienteEntity> clientes;
	private List<ClienteEntity> clientesFilter;

	/**
	 * Funcion encargada de Buscar los cliente del sistema
	 */
	public void buscaClientes() {
		try {
			ClienteLogica objLogica = new ClienteLogica();
			clientes = objLogica.buscaClientesApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<ClienteEntity> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteEntity> clientes) {
		this.clientes = clientes;
	}

	public List<ClienteEntity> getClientesFilter() {
		return clientesFilter;
	}

	public void setClientesFilter(List<ClienteEntity> clientesFilter) {
		this.clientesFilter = clientesFilter;
	}

}
