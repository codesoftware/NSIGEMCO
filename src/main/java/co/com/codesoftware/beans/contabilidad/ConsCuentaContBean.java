package co.com.codesoftware.beans.contabilidad;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.beans.ProvedorBean;
import co.com.codesoftware.beans.admin.ClienteBean;
import co.com.codesoftware.logica.admin.ContabilidadLogic;
import co.com.codesoftware.servicio.contabilidad.MoviContableEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
/*
 * MO-001 Consulta movimientos contables terceros: se modifica la consulta para
 * que reciba el id del tercero y el tipo jmorenor1986 07/11/2016
 * ----------------
 * --------------------------------------------------------------
 * -------------------------
 */
public class ConsCuentaContBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private Date fechaInicial;
	private Date fechaFinal;
	private String cuenta;
	private String tipoTercero;

	private List<MoviContableEntity> listaMovimientos;
	private List<MoviContableEntity> obtenerAsiento;

	private ArrayList<String> cuentasCons;

	private BigDecimal total;
	private BigDecimal debito;
	private BigDecimal credito;
	// Objetos inyectados
	@ManagedProperty(value = "#{clienteBean}")
	private ClienteBean clienteBean;
	@ManagedProperty(value = "#{provedorBean}")
	private ProvedorBean provedorBean;

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	@PostConstruct
	public void init() {
		try {
			this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual genero la consulta
	 */
	public void generarConsulta() {
		try {

			ContabilidadLogic objLogic = new ContabilidadLogic();
			this.cuentasCons = null;
			// MO-001		
			this.listaMovimientos = objLogic.obtenerMoviContXCuenta(fechaInicial, fechaFinal, cuenta,this.tipoTercero,verificaTercero());
			// MO-001
			if (this.listaMovimientos == null || this.listaMovimientos.size() == 0) {
				this.messageBean("La consulta no arrojo ningun resultado", ErrorEnum.ERROR);
			} else {
				this.cuentasCons = null;
				this.total = new BigDecimal(0);
				this.debito = new BigDecimal(0);
				this.credito = new BigDecimal(0);
				if (this.listaMovimientos != null) {
					for (MoviContableEntity item : this.listaMovimientos) {
						this.armoListaCuenta(item.getSubcuenta().getCodigo());
						if ("DEBITO".equalsIgnoreCase(item.getNaturaleza())) {
							debito = debito.add(item.getValor());
						} else {
							credito = credito.add(item.getValor());
						}

					}
					total = debito.subtract(credito);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual creo una lista para realizar visualizar las cuentas
	 * implicadas
	 * 
	 * @param cuenta
	 */
	public void armoListaCuenta(String cuenta) {
		boolean valida = true;
		try {
			if (this.cuentasCons == null) {
				this.cuentasCons = new ArrayList<>();
			}
			for (String item : this.cuentasCons) {
				if (cuenta.equalsIgnoreCase(item)) {
					valida = false;
					break;
				}
			}
			if (valida) {
				this.cuentasCons.add(cuenta);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion que totaliza
	 * 
	 * @return
	 */
	public String getTotal() {
		this.total = new BigDecimal(0);
		this.debito = new BigDecimal(0);
		this.credito = new BigDecimal(0);
		if (this.listaMovimientos != null) {
			for (MoviContableEntity item : this.listaMovimientos) {
				this.armoListaCuenta(item.getSubcuenta().getCodigo());
				if ("DEBITO".equalsIgnoreCase(item.getNaturaleza())) {
					debito = debito.add(item.getValor());
				} else {
					credito = credito.add(item.getValor());
				}

			}
			total = debito.subtract(credito);
		}
		// return new DecimalFormat("###,###.##").format(total);
		return new DecimalFormat("###,###.##").format(total);
	}

	/**
	 * Funcion que totaliza los creditos
	 * 
	 * @return
	 */
	public String getCreditos() {
		this.total = new BigDecimal(0);
		this.debito = new BigDecimal(0);
		this.credito = new BigDecimal(0);
		if (this.listaMovimientos != null) {
			for (MoviContableEntity item : this.listaMovimientos) {
				this.armoListaCuenta(item.getSubcuenta().getCodigo());
				if ("DEBITO".equalsIgnoreCase(item.getNaturaleza())) {
					debito = debito.add(item.getValor());
				} else {
					credito = credito.add(item.getValor());
				}

			}
		}
		return new DecimalFormat("###,###.##").format(this.credito);
	}

	/**
	 * Funcion que totaliza los debitos
	 * 
	 * @return
	 */
	public String getDebitos() {
		this.total = new BigDecimal(0);
		this.debito = new BigDecimal(0);
		this.credito = new BigDecimal(0);
		if (this.listaMovimientos != null) {
			for (MoviContableEntity item : this.listaMovimientos) {
				this.armoListaCuenta(item.getSubcuenta().getCodigo());
				if ("DEBITO".equalsIgnoreCase(item.getNaturaleza())) {
					debito = debito.add(item.getValor());
				} else {
					credito = credito.add(item.getValor());
				}

			}
		}
		return new DecimalFormat("###,###.##").format(this.debito);
	}

	/**
	 * metodo que verifica el tercero mediante el tipo
	 * 1 = Cliente
	 * 2 = Proveedor
	 * MO-001
	 * @return
	 */
	public Integer verificaTercero() {
		try {
			switch (this.tipoTercero) {
			case "1":
				return this.clienteBean.getCliente().getId();
			case "2":
				return this.provedorBean.getProveedor().getId();

			default:
				return -1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public List<MoviContableEntity> getListaMovimientos() {
		return listaMovimientos;
	}

	public void setListaMovimientos(List<MoviContableEntity> listaMovimientos) {
		this.listaMovimientos = listaMovimientos;
	}

	public List<MoviContableEntity> getObtenerAsiento() {
		return obtenerAsiento;
	}

	public void setObtenerAsiento(List<MoviContableEntity> obtenerAsiento) {
		this.obtenerAsiento = obtenerAsiento;
	}

	public ArrayList<String> getCuentasCons() {
		return cuentasCons;
	}

	public void setCuentasCons(ArrayList<String> cuentasCons) {
		this.cuentasCons = cuentasCons;
	}

	public String getTipoTercero() {
		return tipoTercero;
	}

	public void setTipoTercero(String tipoTercero) {
		this.tipoTercero = tipoTercero;
	}

	public void setClienteBean(ClienteBean clienteBean) {
		this.clienteBean = clienteBean;
	}

	public void setProvedorBean(ProvedorBean provedorBean) {
		this.provedorBean = provedorBean;
	}

}
