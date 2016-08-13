package co.com.codesoftware.beans;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.codesoftware.logica.admin.UbicacionLogica;
import co.com.codesoftware.rest.logica.administracion.SocioLogica;
import co.com.codesoftware.server.nsigemco.SocioEntity;
import co.com.codesoftware.servicio.general.CiudadEntity;

@ManagedBean
@ViewScoped
public class SocioBean {

	private SocioEntity socio;
	private Integer idMuni;
	private Integer idCiu;
	private List<SocioEntity> listaSocios;
	private List<SocioEntity> listaSociosFiltro;
	private SocioLogica logica;
	private Map<String, Integer> listaMapCiudades;

	public SocioBean() {
		this.socio = new SocioEntity();
		this.logica = new SocioLogica();
	}

	/**
	 * metodo que consulta los socios
	 */
	public void consultaSocios() {
		if (listaSocios == null) {
			listaSocios = new ArrayList<>();
		}
		this.listaSocios = logica.consultaSocios();
	}

	/**
	 * metodo que consulta las ciudades por su departamento
	 */
	public void consultaCiudades() {
		this.listaMapCiudades = new LinkedHashMap<>();
		if (this.idMuni != null) {
			UbicacionLogica logica = new UbicacionLogica();
			List<CiudadEntity> ciudades = logica.obtieneListaCiudadesXDpto(this.idMuni);
			if (ciudades != null) {
				for (CiudadEntity ciudad : ciudades) {
					this.listaMapCiudades.put(ciudad.getNombre(), ciudad.getId());
				}
			}
		}
	}

	public SocioEntity getSocio() {
		return socio;
	}

	public void setSocio(SocioEntity socio) {
		this.socio = socio;
	}

	public Integer getIdMuni() {
		return idMuni;
	}

	public void setIdMuni(Integer idMuni) {
		this.idMuni = idMuni;
	}

	public Integer getIdCiu() {
		return idCiu;
	}

	public void setIdCiu(Integer idCiu) {
		this.idCiu = idCiu;
	}

	public List<SocioEntity> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<SocioEntity> listaSocios) {
		this.listaSocios = listaSocios;
	}

	public List<SocioEntity> getListaSociosFiltro() {
		return listaSociosFiltro;
	}

	public void setListaSociosFiltro(List<SocioEntity> listaSociosFiltro) {
		this.listaSociosFiltro = listaSociosFiltro;
	}

	public Map<String, Integer> getListaMapCiudades() {
		return listaMapCiudades;
	}

	public void setListaMapCiudades(Map<String, Integer> listaMapCiudades) {
		this.listaMapCiudades = listaMapCiudades;
	}

}
