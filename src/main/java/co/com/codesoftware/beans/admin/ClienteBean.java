package co.com.codesoftware.beans.admin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EnumType;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.admin.ClienteLogica;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.servicio.usuario.ClienteEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;
import co.com.codesoftware.utilities.Utilitites;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ClienteEntity> clientes;
	private List<ClienteEntity> clientesFilter;
	private ClienteLogica objLogica;
	private ClienteEntity cliente;
	private String banderaboton;

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
			if (cliente == null) {
				cliente = new ClienteEntity();
			}
			cliente = clienteB;
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.banderaboton = "U";

	}

	/**
	 * metodo que limpia el panel para insertar un cliente
	 */
	public void limpiaPanel() {
		this.banderaboton = "I";
		this.cliente = new ClienteEntity();
	}

	/**
	 * metodo que muestra el digito de verificacion
	 */
	public void muestraDigito() {
		Utilitites ut = new Utilitites();
		this.cliente.setDVerificacion(ut.obtenerSumaPorDigitos(this.cliente.getCedula()));
	}

	/**
	 * metodo que inserta un cliente
	 */
	public void insertaCliente() {
		try {
			if (validaDatos()) {
				Integer rta = objLogica.insertaCliente(this.cliente);
				if (rta != null && rta != 0) {
					messageBean("Inserto correctamente el cliente", ErrorEnum.SUCCESS);
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('datosCliente').hide();");
				} else {
					messageBean("Error al insertar el cliente", ErrorEnum.FATAL);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo con el cual se actualiza el cliente
	 */
	public void actualizaCliente() {
		try {
			if (validaDatos()) {
				boolean rta = objLogica.actualizaCliente(this.cliente);
				if (rta) {
					messageBean("Actualizò correctamente el cliente", ErrorEnum.SUCCESS);
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('datosCliente').hide();");
				} else {
					messageBean("Error al actualizar el cliente", ErrorEnum.FATAL);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que valida obligatoriedad de los datos
	 * 
	 * @return
	 */
	public boolean validaDatos() {
		boolean resultado = true;
		try {
			if (this.cliente.getNombres() == null || "".equalsIgnoreCase(this.cliente.getNombres())) {
				messageBean("El nombre del cliente es obligatorio", ErrorEnum.ERROR);
				return false;
			}
			if (this.cliente.getCedula() == null || "".equalsIgnoreCase(this.cliente.getCedula())) {
				messageBean("El NIT/cedula  del cliente es obligatorio", ErrorEnum.ERROR);
				return false;
			}
			if (this.cliente.getDireccion() == null || "".equalsIgnoreCase(this.cliente.getDireccion())) {
				messageBean("La dirección  del cliente es obligatorio", ErrorEnum.ERROR);
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
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

	public String getBanderaboton() {
		return banderaboton;
	}

	public void setBanderaboton(String banderaboton) {
		this.banderaboton = banderaboton;
	}

}
