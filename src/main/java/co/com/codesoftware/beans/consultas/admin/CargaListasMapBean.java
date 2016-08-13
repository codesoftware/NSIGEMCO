package co.com.codesoftware.beans.consultas.admin;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.server.nsigemco.MarcaEntity;
import co.com.codesoftware.server.nsigemco.ReteFuenteEntity;
import co.com.codesoftware.server.nsigemco.SocioEntity;
import co.com.codesoftware.servicio.general.CiudadEntity;
import co.com.codesoftware.servicio.general.DepartamentoEntity;
import co.com.codesoftware.servicio.general.ResolucionFactEntity;
import co.com.codesoftware.servicio.general.SedeEntity;
import co.com.codesoftware.servicio.usuario.PerfilEntity;

@ManagedBean
@ViewScoped
public class CargaListasMapBean {

	private Map<String, Integer> listaMapCategorias;
	private Map<String, Integer> listaMapMarca;
	private Map<String, Integer> listaReteFuente;
	private Map<String, String> listaTipoPago;
	private Map<String, Integer> listaResolucion;
	private Map<String, Integer> listaMapDepartamentos;
	private Map<String, Integer> listaMapCiudades;
	@ManagedProperty("#{filtrosService}")
	private FiltrosServiceBean filtrosService;
	private Map<String, Integer> listaMapSedes;
	private Map<String, Integer> listaMapPerfiles;
	private Map<String,Integer> listaSocios;

	/**
	 * Funcion con la cual se carga la lista de categorias de la aplicacion
	 */
	public void cargaListaCategorias() {
		try {
			List<CategoriaEntity> listCate = filtrosService.serviceObtieneCategorias();
			if (listCate != null) {
				for (CategoriaEntity categoria : listCate) {
					if (this.listaMapCategorias == null) {
						this.listaMapCategorias = new HashMap<>();
					}
					this.listaMapCategorias.put(categoria.getDescripcion(), categoria.getId());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * funcion que carga la lista de la retefuente
	 * 
	 */
	public void cargaListaReteFuente() {
		try {
			List<ReteFuenteEntity> listaRete = filtrosService.buscaReteVersion();
			if (listaRete != null) {
				for (ReteFuenteEntity item : listaRete) {
					if (this.listaReteFuente == null) {
						this.listaReteFuente = new HashMap<>();
					}
					this.listaReteFuente.put(item.getConcepto(), item.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion encargada de cargar las listas de resoluciones
	 */
	public void cargaListaResolucion() {
		try {
			List<ResolucionFactEntity> resolucion = filtrosService.serviceObtieneResolucion();
			if (resolucion != null) {
				for (ResolucionFactEntity item : resolucion) {
					if (this.listaResolucion == null) {
						this.listaResolucion = new HashMap<>();
					}
					this.listaResolucion.put(item.getComentario(), item.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual carga las marcas
	 */
	public void cargaListaMarcas() {
		try {
			List<MarcaEntity> listaMarcas = filtrosService.serviceObtieneMarca();
			if (listaMarcas != null) {
				for (MarcaEntity marca : listaMarcas) {
					if (listaMapMarca == null) {
						this.listaMapMarca = new LinkedHashMap<>();
					}
					this.listaMapMarca.put(marca.getDescripcion(), marca.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual carga las marcas
	 */
	public void cargaListaDepartamento() {
		try {
			List<DepartamentoEntity> listaDepa = filtrosService.serviceObtieneDepartamento();
			if (listaDepa != null) {
				for (DepartamentoEntity depa : listaDepa) {
					if (this.listaMapDepartamentos == null) {
						this.listaMapDepartamentos = new LinkedHashMap<String, Integer>();
					}
					this.listaMapDepartamentos.put(depa.getNombre(), depa.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que carga los tipos de pago
	 */
	public void cargaTipoPago() {
		try {
			this.listaTipoPago = new HashMap<String, String>();
			listaTipoPago.put("Tarjeta", "Tarjeta");
			listaTipoPago.put("Efectivo", "Efectivo");
			listaTipoPago.put("Cheque", "Cheque");
			listaTipoPago.put("Credito", "Credito");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual se cargan las sedes
	 */
	public void cargaListaSedes() {
		try {
			List<SedeEntity> sedes = filtrosService.serviceObtieneSedes();
			if (sedes != null) {
				for (SedeEntity sede : sedes) {
					if (listaMapSedes == null) {
						this.listaMapSedes = new HashMap<>();
					}
					this.listaMapSedes.put(sede.getName(), sede.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual se cargan las sedes
	 */
	public void cargaListaCiudades() {
		try {
			List<CiudadEntity> ciudades = filtrosService.serviceObtieneCiudades();
			if (ciudades != null) {
				for (CiudadEntity ciudad : ciudades) {
					if (listaMapCiudades == null) {
						this.listaMapCiudades = new LinkedHashMap<String, Integer>();
					}
					this.listaMapCiudades.put(ciudad.getNombre(), ciudad.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * metodo que carga los socios que estan en el sistem
	 */
	public void cargaListaSocios(){
		List<SocioEntity> socios = filtrosService.serviceObtieneSocios();
		if(socios!=null){
			for(SocioEntity socio:socios){
				if(listaSocios == null){
					this.listaSocios = new LinkedHashMap<String,Integer>();
				}
				this.listaSocios.put(socio.getRazonSocial(), socio.getId());
			}
		}
	}
	
	/**
	 * Funcion con la cual se cargan los perfiles
	 */
	public void cargaListaPerfiles() {
		try {
			List<PerfilEntity> perfiles = filtrosService.serviceObtienePerfiles();
			if (perfiles != null) {
				for (PerfilEntity perfil : perfiles) {
					if (listaMapPerfiles == null) {
						this.listaMapPerfiles = new HashMap<>();
					}
					this.listaMapPerfiles.put(perfil.getNombre().toUpperCase(), perfil.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public FiltrosServiceBean getFiltrosService() {
		return filtrosService;
	}

	public void setFiltrosService(FiltrosServiceBean filtrosService) {
		this.filtrosService = filtrosService;
	}

	public Map<String, Integer> getListaMapCategorias() {
		return listaMapCategorias;
	}

	public void setListaMapCategorias(Map<String, Integer> listaMapCategorias) {
		this.listaMapCategorias = listaMapCategorias;
	}

	public Map<String, Integer> getListaMapMarca() {
		return listaMapMarca;
	}

	public void setListaMapMarca(Map<String, Integer> listaMapMarca) {
		this.listaMapMarca = listaMapMarca;
	}

	public Map<String, Integer> getListaMapSedes() {
		return listaMapSedes;
	}

	public void setListaMapSedes(Map<String, Integer> listaMapSedes) {
		this.listaMapSedes = listaMapSedes;
	}

	public Map<String, Integer> getListaReteFuente() {
		return listaReteFuente;
	}

	public void setListaReteFuente(Map<String, Integer> listaReteFuente) {
		this.listaReteFuente = listaReteFuente;
	}

	public Map<String, String> getListaTipoPago() {
		return listaTipoPago;
	}

	public void setListaTipoPago(Map<String, String> listaTipoPago) {
		this.listaTipoPago = listaTipoPago;
	}

	public Map<String, Integer> getListaResolucion() {
		return listaResolucion;
	}

	public void setListaResolucion(Map<String, Integer> listaResolucion) {
		this.listaResolucion = listaResolucion;
	}

	public Map<String, Integer> getListaMapDepartamentos() {
		return listaMapDepartamentos;
	}

	public void setListaMapDepartamentos(Map<String, Integer> listaMapDepartamentos) {
		this.listaMapDepartamentos = listaMapDepartamentos;
	}

	public Map<String, Integer> getListaMapCiudades() {
		return listaMapCiudades;
	}

	public void setListaMapCiudades(Map<String, Integer> listaMapCiudades) {
		this.listaMapCiudades = listaMapCiudades;
	}

	public Map<String, Integer> getListaMapPerfiles() {
		return listaMapPerfiles;
	}

	public void setListaMapPerfiles(Map<String, Integer> listaMapPerfiles) {
		this.listaMapPerfiles = listaMapPerfiles;
	}

	public Map<String, Integer> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(Map<String, Integer> listaSocios) {
		this.listaSocios = listaSocios;
	}
	
	

}