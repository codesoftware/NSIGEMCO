package co.com.codesoftware.beans.consultas.admin;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.server.nsigemco.MarcaEntity;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.servicio.general.SedeEntity;

@ManagedBean(name = "cargueListasBean")
@ViewScoped
public class CargueListasBean {

	private List<CategoriaEntity> categorias;
	private List<ReferenciaEntity> referencias;
	private List<MarcaEntity> marcas;
	private List<SedeEntity> sedes;

	@ManagedProperty("#{filtrosService}")
	private FiltrosServiceBean filtrosService;

	/**
	 * Constructor en cual cargo la lista de categorias parametrizadas en el
	 * sistema
	 */
	public CargueListasBean() {
		//filtrosService = new FiltrosServiceBean();
		try {
			//categorias = filtrosService.serviceObtieneCategorias();
			//referencias = filtrosService.serviceObtieneReferencia();
			//marcas = filtrosService.serviceObtieneMarca();
			//this.cargaListaSedes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual se carga la lista de sedes
	 */
	public void cargaListaSedes() {
		filtrosService = new FiltrosServiceBean();
		try {
			sedes = filtrosService.serviceObtieneSedes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual se carga la lista de marcas
	 */
	public void cargaListaMarcas() {
		marcas = filtrosService.serviceObtieneMarca();
	}

	/**
	 * Funcion con la cual cargo la lista de categorias
	 */
	public void cargaListaCategoria() {

	}

	public List<CategoriaEntity> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaEntity> categorias) {
		this.categorias = categorias;
	}

	public FiltrosServiceBean getFiltrosService() {
		return filtrosService;
	}

	public void setFiltrosService(FiltrosServiceBean filtrosService) {
		this.filtrosService = filtrosService;
	}

	public List<ReferenciaEntity> getReferencias() {
		return referencias;
	}

	public void setReferencias(List<ReferenciaEntity> referencias) {
		this.referencias = referencias;
	}

	public List<MarcaEntity> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<MarcaEntity> marcas) {
		this.marcas = marcas;
	}

	public List<SedeEntity> getSedes() {
		return sedes;
	}

	public void setSedes(List<SedeEntity> sedes) {
		this.sedes = sedes;
	}
}
