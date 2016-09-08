package co.com.codesoftware.beans.contabilidad;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
			this.listaMovimientos = objLogic.obtenerMoviContXCuenta(fechaInicial, fechaFinal, cuenta);
			if (this.listaMovimientos == null) {
				this.messageBean("La consulta no arrojo ningun resultado", ErrorEnum.ERROR);
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
		BigDecimal total = new BigDecimal(0);
		BigDecimal debito = new BigDecimal(0);
		BigDecimal credito = new BigDecimal(0);
		if (this.listaMovimientos != null) {
			for (MoviContableEntity item : this.listaMovimientos) {
				if("DEBITO".equalsIgnoreCase(item.getNaturaleza())){
					debito = debito.add(item.getValor());
				}else{
					credito = credito.add(item.getValor());
				}
				
			}
			total = debito.subtract(credito);
		}
		return new DecimalFormat("###,###.##").format(total);
	}
	/**
	 * Funcion que totaliza los creditos
	 * 
	 * @return
	 */
	public String getCreditos() {
		BigDecimal total = new BigDecimal(0);
		BigDecimal creditos = new BigDecimal(0);
		if (this.listaMovimientos != null) {
			for (MoviContableEntity item : this.listaMovimientos) {
				if("CREDITO".equalsIgnoreCase(item.getNaturaleza())){
					creditos = creditos.add(item.getValor());
				}
				
			}
			total = creditos;
		}
		return new DecimalFormat("###,###.##").format(total);
	}
	
	/**
	 * Funcion que totaliza los debitos
	 * 
	 * @return
	 */
	public String getDebitos() {
		BigDecimal total = new BigDecimal(0);
		BigDecimal debito = new BigDecimal(0);
		if (this.listaMovimientos != null) {
			for (MoviContableEntity item : this.listaMovimientos) {
				if("DEBITO".equalsIgnoreCase(item.getNaturaleza())){
					debito = debito.add(item.getValor());
				}else{
				}
				
			}
			total = debito;
		}
		return new DecimalFormat("###,###.##").format(total);
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

}
