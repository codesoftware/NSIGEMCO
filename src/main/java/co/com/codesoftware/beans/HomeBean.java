package co.com.codesoftware.beans;

import java.math.BigDecimal;

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

@ManagedBean
@ViewScoped
public class HomeBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private PieChartModel pieModel;
	private BigDecimal dosMeses;
	private BigDecimal unMeses;
	private BigDecimal actual;

	private void createPieModel() {
		pieModel = new PieChartModel();
		FacturaLogica objLogica = new FacturaLogica();
		this.dosMeses = objLogica.obtenerValorFacturasMes(2);
		pieModel.set("Dos Meses Atras", this.dosMeses);
		this.unMeses = objLogica.obtenerValorFacturasMes(1);
		pieModel.set("Mes Anterior", this.unMeses);
		this.actual = objLogica.obtenerValorFacturasMes(0);
		pieModel.set("Mes Actual", this.actual);

		pieModel.setTitle("Ventas 3 Meses");
		pieModel.setLegendPosition("e");
		pieModel.setFill(false);
		pieModel.setShowDataLabels(true);
		pieModel.setDiameter(150);
	}

	@PostConstruct
	public void init() {
		this.createPieModel();
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public PieChartModel getPieModel() {
		return pieModel;
	}

	public void setPieModel(PieChartModel pieModel) {
		this.pieModel = pieModel;
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

}
