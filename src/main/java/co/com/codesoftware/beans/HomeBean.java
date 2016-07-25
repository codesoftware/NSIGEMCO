package co.com.codesoftware.beans;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;

import co.com.codesoftware.logica.facturacion.FacturaLogica;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.GeneralBean;
import co.com.codesoftware.utilities.Utilitites;

@ManagedBean
@ViewScoped
public class HomeBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private BigDecimal dosMeses;
	private BigDecimal unMeses;
	private BigDecimal actual;

	private BarChartModel barModel;

	private void createBarModel() {
		try {
			this.barModel = initBarModel();
			barModel.setTitle("Ventas Ultimos Meses");
			barModel.setLegendPosition("Meses");

			Axis xAxis = barModel.getAxis(AxisType.X);
			xAxis.setLabel("Meses");

			Axis yAxis = barModel.getAxis(AxisType.Y);
			yAxis.setLabel("Dinero");
			yAxis.setMin(0);
			BigDecimal aux = this.actual.add(this.unMeses);
			aux = aux.add(this.dosMeses);
			aux = aux.divide(new BigDecimal(3),2,RoundingMode.HALF_UP);
			aux = aux.add(new BigDecimal(10000000));
			aux = aux.add(this.dosMeses);
			yAxis.setMax(aux);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Funcion con la cual se inicializa la barra
	 */
	private BarChartModel initBarModel() {
		BarChartModel modelo = new BarChartModel();
		FacturaLogica objLogica = new FacturaLogica();
		try {
			ChartSeries ventas = new ChartSeries();
			ventas.setLabel("Ventas");
			Date date = new Date();
			int mes = date.getMonth() + 1;
			String meString = Utilitites.convierteNumMes(mes);
			this.actual = objLogica.obtenerValorFacturasMes(0);
			if(this.actual == null){
				this.actual = new BigDecimal(0);
			}
			ventas.set(meString, actual);
			meString = Utilitites.convierteNumMes(mes - 1);
			this.unMeses = objLogica.obtenerValorFacturasMes(1);
			if(this.unMeses == null){
				this.unMeses = new BigDecimal(0);
			}
			ventas.set(meString, unMeses);
			this.dosMeses = objLogica.obtenerValorFacturasMes(2);
			if(this.dosMeses== null){
				this.dosMeses = new BigDecimal(0);
			}
			meString = Utilitites.convierteNumMes(mes - 2);
			ventas.set(meString, dosMeses);
			modelo.addSeries(ventas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelo;
	}

	@PostConstruct
	public void init() {
		this.createBarModel();
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public BigDecimal getDosMeses() {
		return dosMeses;
	}

	public void setDosMeses(BigDecimal dosMeses) {
		this.dosMeses = dosMeses;
	}

	public BigDecimal getUnMeses() {
		return unMeses;
	}

	public void setUnMeses(BigDecimal unMeses) {
		this.unMeses = unMeses;
	}

	public BigDecimal getActual() {
		return actual;
	}

	public void setActual(BigDecimal actual) {
		this.actual = actual;
	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	public void setBarModel(BarChartModel barModel) {
		this.barModel = barModel;
	}

}
