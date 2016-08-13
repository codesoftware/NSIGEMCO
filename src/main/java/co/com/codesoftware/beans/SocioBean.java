package co.com.codesoftware.beans;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.admin.SocioLogica;
import co.com.codesoftware.logica.admin.UbicacionLogica;
import co.com.codesoftware.server.nsigemco.SocioEntity;
import co.com.codesoftware.servicio.general.CiudadEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;
import co.com.codesoftware.utilities.Utilitites;

@ManagedBean
@ViewScoped
public class SocioBean implements GeneralBean {

	private SocioEntity socio;
	private Integer idMuni;
	private Integer idCiu;
	private List<SocioEntity> listaSocios;
	private List<SocioEntity> listaSociosFiltro;
	private SocioLogica logica;
	private Map<String, Integer> listaMapCiudades;
	private String banderaboton;
	private UsuarioEntity objetoSesion;

	public SocioBean() {
		this.socio = new SocioEntity();
		this.logica = new SocioLogica();
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("dataSession");
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

	/**
	 * metodo que consulta un socio
	 * 
	 * @param id
	 */
	public void consultaSocio(Integer id) {
		try {
			this.socio = logica.consultaSocio(id);
			this.idMuni = this.socio.getMunicipio();
			consultaCiudades();
			this.idCiu = this.socio.getCiudad();
			this.banderaboton = "U";
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * metodo que actualiza un socio
	 */
	public void actualizaSocio() {
		try {
			if (validaDatos()) {
				this.socio.setCiudad(idCiu);
				this.socio.setMunicipio(idMuni);
				String mensaje = logica.actualizaSocio(this.socio);
				if (mensaje.startsWith("Error")) {
					messageBean("Error al actualizar socio", ErrorEnum.ERROR);
				} else {
					messageBean("Actualizo socio correctamente", ErrorEnum.SUCCESS);
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('datosSocio').hide();");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que consulta un socio
	 */
	public void insertarSocio() {
		try {
			if (validaDatos()) {
				this.socio.setCiudad(idCiu);
				this.socio.setMunicipio(idMuni);
				this.socio.setEstado("A");
				this.socio.setUsuario(this.objetoSesion.getId());
				String mensaje = logica.insertaSocio(this.socio);
				if (mensaje.startsWith("Error")) {
					messageBean("Error al insertar socio", ErrorEnum.ERROR);
				} else {
					messageBean("Inserto socio correctamente", ErrorEnum.SUCCESS);
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('datosSocio').hide();");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que limpia el panel para insertar un socio
	 */
	public void limpiaPanel() {
		this.banderaboton = "I";
		this.socio = new SocioEntity();
		this.idCiu = -1;
		this.idMuni = -1;
	}

	/**
	 * metodo con el cual se validan los datos del formulario de socios
	 * 
	 * @return
	 */
	public boolean validaDatos() {
		boolean resultado = true;
		try {
			if (this.socio.getNit() == null || "".equalsIgnoreCase(this.socio.getNit())) {
				messageBean("El nit del socio no puede ir vacio", ErrorEnum.ERROR);
				return false;
			}
			if (this.socio.getRazonSocial() == null || "".equalsIgnoreCase(this.socio.getRazonSocial())) {
				messageBean("La razón social del socio no puede ir vacia ", ErrorEnum.ERROR);
				return false;
			}
			if (this.socio.getDireccion() == null || "".equalsIgnoreCase(this.socio.getDireccion())) {
				messageBean("La dirección del socio no puede ir vacia ", ErrorEnum.ERROR);
				return false;
			}
			if (this.getIdMuni() == null || this.getIdMuni() == -1) {
				messageBean("Favor seleccione un muncipio ", ErrorEnum.ERROR);
				return false;
			}
			if (this.getIdCiu() == null || this.getIdCiu() == -1) {
				messageBean("Favor seleccione ciudad ", ErrorEnum.ERROR);
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public void muestraDigito() {
		Utilitites ut = new Utilitites();
		this.socio.setDigitoVer("" + ut.obtenerSumaPorDigitos(this.socio.getNit()));
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

	public String getBanderaboton() {
		return banderaboton;
	}

	public void setBanderaboton(String banderaboton) {
		this.banderaboton = banderaboton;
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	@Override
	public void init() {
		this.banderaboton = "I";

	}

}
