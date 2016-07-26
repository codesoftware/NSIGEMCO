package co.com.codesoftware.beans.contabilidad;

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
public class ConsTipoDocumentoBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private Date fechaInicial;
	private Date fechaFinal;
	private String tipoDocumento;

	private List<MoviContableEntity> listaMovimientos;
	private List<MoviContableEntity> obtenerAsiento;

	/**
	 * Funcion con la cual obtengo los movimientos contables
	 */
	public void obtenerMovimientosContables() {
		try {
			ContabilidadLogic objLogic = new ContabilidadLogic();
			this.listaMovimientos = objLogic.obtenerMovimientosContable(fechaInicial, fechaFinal, tipoDocumento);
			if (this.listaMovimientos == null || this.listaMovimientos.size() == 0) {
				messageBean("La consulta no arrojo ningun resultado", ErrorEnum.ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual consulto un asiento contable
	 */
	public void consultarAsientoContable(Integer idTrans) {
		try {
			ContabilidadLogic objLogic = new ContabilidadLogic();
			this.obtenerAsiento = objLogic.obtenerAsientoContable(idTrans);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostConstruct
	public void init() {
		try {
			this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
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

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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
