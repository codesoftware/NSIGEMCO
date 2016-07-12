package co.com.codesoftware.beans.admin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.codesoftware.logica.admin.ClienteLogica;
import co.com.codesoftware.servicio.usuario.ClienteEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable,GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ClienteEntity> clientes;
	private List<ClienteEntity> clientesFilter;
	private ClienteLogica objLogica;
	private ClienteEntity cliente;

	public ClienteBean() {
		objLogica = new ClienteLogica();
		cliente = new ClienteEntity();
	}

	/**
	 * Funcion encargada de Buscar los cliente del sistema
	 */
	public void buscaClientes() {
		try {
			if (clientes == null) {
				clientes = new ArrayList<>();
			}
			clientes = objLogica.buscaClientesApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que consulta un cliente en especifico
	 */
	public void consultaCliente(ClienteEntity clienteB) {
		try {
			if(cliente==null){
				cliente = new ClienteEntity();
			}
			cliente = clienteB;
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

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

}
