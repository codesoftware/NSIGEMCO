package co.com.codesoftware.beans.facturacion;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.facturacion.FacturaCompraTmpLogica;
import co.com.codesoftware.servicio.facturacion.FacturaCompraTmpEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ConsultaFacComTmpBean implements GeneralBean {
	private List<FacturaCompraTmpEntity> listaFacturas;
	private List<FacturaCompraTmpEntity> listaFacturasFiltro;
	private FacturaCompraTmpLogica logica;
	private Date fechaInicial;
	private Date fechaFinal;
	private Integer idSede;
	private String estado;
	private Date maxDate;

	@Override
	@PostConstruct
	public void init() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		this.maxDate = calendar.getTime();
		this.logica = new FacturaCompraTmpLogica();

	}

	/**
	 * metodo neceario para los calendar
	 */
	public void ajaxCarga() {

	}
	
	/**
	 * metodo que selecciona una factura de compra en borrador
	 * @param idFactura
	 */
	public String seleccionaFactura(Integer idFactura){
		String ruta = "/ACTION/FACTURACION/facturaCompraTmp.jsf";
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("facturaCompra", idFactura);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruta;
		
	}

	/**
	 * metodo que consulta las facturas por criterio
	 */
	public void consultaFacturasCriterio() {
		if (this.idSede == null || this.idSede == 0) {
			messageBean("Debe seleccionar por lo menos la sede",ErrorEnum.ERROR);
		}else{
			this.listaFacturas = logica.consultaFacturasXCriterio(estado, idSede, fechaInicial, fechaFinal);
			if(this.listaFacturas == null || this.listaFacturas.size() == 0){
				messageBean("La consulta no arroja ningun resultado", ErrorEnum.ERROR);
			}
		}
	}

	public List<FacturaCompraTmpEntity> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(List<FacturaCompraTmpEntity> listaFacturas) {
		this.listaFacturas = listaFacturas;
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

	public Integer getIdSede() {
		return idSede;
	}

	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		// TODO Auto-generated method stub

	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

	public List<FacturaCompraTmpEntity> getListaFacturasFiltro() {
		return listaFacturasFiltro;
	}

	public void setListaFacturasFiltro(List<FacturaCompraTmpEntity> listaFacturasFiltro) {
		this.listaFacturasFiltro = listaFacturasFiltro;
	}

}
