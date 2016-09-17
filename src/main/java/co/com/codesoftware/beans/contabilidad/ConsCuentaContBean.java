package co.com.codesoftware.beans.contabilidad;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.admin.ContabilidadLogic;
import co.com.codesoftware.servicio.contabilidad.MoviContableEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ConsCuentaContBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private Date fechaInicial;
	private Date fechaFinal;
	private String cuenta;

	private List<MoviContableEntity> listaMovimientos;
	private List<MoviContableEntity> obtenerAsiento;

	private ArrayList<String> cuentasCons;

	private BigDecimal total;
	private BigDecimal debito;
	private BigDecimal credito;
	
	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	@PostConstruct
	public void init() {
		try {
			this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("dataSession");
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
			this.listaMovimientos = objLogic.obtenerMoviContXCuenta(fechaInicial, fechaFinal, cuenta);
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
		//return new DecimalFormat("###,###.##").format(total);
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

}
