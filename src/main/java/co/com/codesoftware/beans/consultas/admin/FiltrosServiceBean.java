package co.com.codesoftware.beans.consultas.admin;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import co.com.codesoftware.logica.CategoriaLogica;
import co.com.codesoftware.logica.MarcaLogica;
import co.com.codesoftware.logica.ParametrosLogica;
import co.com.codesoftware.logica.ProveedoresLogica;
import co.com.codesoftware.logica.ReferenciaLogica;
import co.com.codesoftware.logica.SedesLogica;
import co.com.codesoftware.logica.SubCuentaLogic;
import co.com.codesoftware.logica.UsuarioLogic;
import co.com.codesoftware.logica.admin.ResolucionFactLogica;
import co.com.codesoftware.logica.admin.UbicacionLogica;
import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.server.nsigemco.MarcaEntity;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.server.nsigemco.PucEntity;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.server.nsigemco.ReteFuenteEntity;
import co.com.codesoftware.server.nsigemco.SubCuentaEntity;
import co.com.codesoftware.servicio.general.CiudadEntity;
import co.com.codesoftware.servicio.general.DepartamentoEntity;
import co.com.codesoftware.servicio.general.ResolucionFactEntity;
import co.com.codesoftware.servicio.general.SedeEntity;
import co.com.codesoftware.servicio.usuario.PerfilEntity;

@ManagedBean(name = "filtrosService", eager = true)
@ApplicationScoped
public class FiltrosServiceBean {

	private List<ProveedoresEntity> listaProveedor;
	private static boolean banderaProv;
	private List<CategoriaEntity> listaCategorias;
	private static boolean banderaCate;
	private List<ReferenciaEntity> listaReferencia;
	private static boolean banderaRefe;
	private List<MarcaEntity> listaMarca;
	private static boolean banderaMarc;
	private List<SedeEntity> listaSede;
	private static boolean banderaSede;
	private List<SubCuentaEntity> listaSubCuenta;
	private static boolean banderaSubCta;
	private List<ReteFuenteEntity> listaReteFuente;
	private static boolean banderaRetefuente;
	private List<ResolucionFactEntity> listaResolucion;
	private static boolean banderaResolucion;
	private List<DepartamentoEntity> listaDepartamento;
	private static boolean banderaDepartamento;
	private List<CiudadEntity> listaCiudad;
	private static boolean banderaCiudad;
	private List<PerfilEntity> listaPerfil;
	private static boolean banderaPerfiles;
	
	ParametrosLogica logicaP = null;

	/**
	 * Funcion en la cual inicializo la carga
	 */
	@PostConstruct
	public void init() {
		try {
			banderaProv = false;
			banderaCate = false;
			banderaRefe = false;
			banderaMarc = false;
			banderaSede = false;
			banderaSubCta = false;
			banderaRetefuente = false;
			logicaP = new ParametrosLogica();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual obtengo los proveedores del sistema
	 * 
	 * @return
	 */
	public List<ProveedoresEntity> serviceObtieneProveedores() {
		try {
			// if (!banderaProv || listaProveedor == null ||
			// listaProveedor.isEmpty()) {
			ProveedoresLogica logicaProvedores = new ProveedoresLogica();
			listaProveedor = logicaProvedores.consutaProveedores();
			banderaProv = true;
			// }

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listaProveedor;
	}

	/**
	 * funcion con la cual consulto las subcuentas del sistema
	 * 
	 * @return
	 */
	public List<SubCuentaEntity> serviceConsultaSubCuenta() {
		try {
			// if(!banderaSubCta || listaSubCuenta ==null ||
			// listaSubCuenta.isEmpty()){
			SubCuentaLogic logicaSubcuenta = new SubCuentaLogic();
			listaSubCuenta = logicaSubcuenta.consultaSubcuentas();
			banderaSubCta = true;
			// }
		} catch (Exception e) {

		}
		return this.listaSubCuenta;
	}

	/**
	 * funcion que consulta las subcuentas con los filtros establecidos
	 * 
	 * @return
	 */
	public List<SubCuentaEntity> serviceConsultaSubCuentaFiltros(ArrayList<PucEntity> datos) {
		try {
			// if(!banderaSubCta || listaSubCuenta ==null ||
			// listaSubCuenta.isEmpty()){
			SubCuentaLogic logicaSubcuenta = new SubCuentaLogic();
			listaSubCuenta = logicaSubcuenta.consultaSubcuentasFiltro(datos);
			banderaSubCta = true;
			// }
		} catch (Exception e) {

		}
		return this.listaSubCuenta;
	}

	/**
	 * Funcion en la cual obtengo las marcas del sistema
	 * 
	 * @return
	 */
	public List<MarcaEntity> serviceObtieneMarca() {
		try {
			// if (!banderaMarc || listaMarca == null || listaMarca.isEmpty()) {
			MarcaLogica logica = new MarcaLogica();
			this.listaMarca = logica.consultaMarcas();
			banderaMarc = true;
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listaMarca;
	}

	/**
	 * Funcion con la cual busco un porveedor de acuerdo a su id
	 * 
	 * @param id
	 * @return
	 */
	public ProveedoresEntity buscaProveedorXId(Integer id) {
		ProveedoresEntity prov = null;
		// if (listaProveedor == null || listaProveedor.size() == 0) {
		this.serviceObtieneProveedores();
		// }
		for (ProveedoresEntity item : listaProveedor) {
			if (item.getId() == id) {
				prov = item;
			}
		}
		return prov;
	}

	/**
	 * Funcion la cual obtengo las categorias del sistema
	 * 
	 * @return
	 */

	public List<CategoriaEntity> serviceObtieneCategorias() {
		try {
			// if (!banderaCate || listaCategorias == null ||
			// listaCategorias.isEmpty()) {
			CategoriaLogica logicaCategorias = new CategoriaLogica();
			listaCategorias = logicaCategorias.consultaCategorias();
			banderaCate = true;
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listaCategorias;
	}
	
	

	/**
	 * Funcion con la cual busco un categoria basandose en su id
	 * 
	 * @param id
	 * @return
	 */
	public CategoriaEntity buscaCategoriaXId(Integer id) {
		CategoriaEntity categoria = null;
		try {
			// if (listaCategorias == null || listaCategorias.size() == 0) {
			this.serviceObtieneCategorias();
			// }
			for (CategoriaEntity item : listaCategorias) {
				if (item.getId() == id) {
					categoria = item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categoria;
	}

	/**
	 * Funcion con la cual busco una sede basandose en su id
	 * 
	 * @param id
	 * @return
	 */
	public SedeEntity buscaSedeXId(Integer id) {
		SedeEntity sede = null;
		try {
			// if (listaSede == null || listaSede.size() == 0) {
			this.serviceObtieneSedes();
			// }
			for (SedeEntity item : listaSede) {
				if (item.getId() == id) {
					sede = item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sede;
	}

	/**
	 * funcion que consulta las subcuentas por id
	 * 
	 * @param id
	 * @return
	 */
	public SubCuentaEntity buscaSubCtaXId(Integer id) {
		SubCuentaEntity respuesta = null;
		try {
			// if(listaSubCuenta == null || listaSubCuenta.size()==0){
			this.serviceConsultaSubCuenta();
			// }
			for (SubCuentaEntity item : listaSubCuenta) {
				if (item.getId() == id) {
					respuesta = item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	/**
	 * Funcion con la cual obtengo la lista de referencias parametrizadas en el
	 * sistema
	 * 
	 * @return
	 */
	public List<ReferenciaEntity> serviceObtieneReferencia() {
		try {
			if (!banderaRefe || listaReferencia == null || listaReferencia.isEmpty()) {
				ReferenciaLogica logicaReferencia = new ReferenciaLogica();
				listaReferencia = logicaReferencia.buscaReferenciasEntity();
				banderaRefe = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listaReferencia;
	}

	public List<SedeEntity> serviceObtieneSedes() {
		try {
			// if (!banderaSede || listaSede == null || listaSede.isEmpty()) {
			SedesLogica logicaSede = new SedesLogica();
			listaSede = logicaSede.buscaSedes();
			banderaSede = true;
			// }

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listaSede;
	}
	/**
	 * Funcion con la cual obtengo los perfiles parametrizados
	 * @return
	 */
	public List<PerfilEntity> serviceObtienePerfiles(){
		try {
			UsuarioLogic objLogica = new UsuarioLogic();
			this.listaPerfil = objLogica.obtenerPerfiles();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listaPerfil;
	}

	/**
	 * Funcion con la cual busca una referencia dentro de una lista de
	 * referencia basandose en su id
	 * 
	 * @param id
	 * @return
	 */
	public ReferenciaEntity buscaReferenciaXId(Integer id) {
		ReferenciaEntity rta = null;
		try {
			if (listaReferencia == null) {
				this.serviceObtieneReferencia();
			}
			for (ReferenciaEntity item : listaReferencia) {
				if (("" + item.getId()).equalsIgnoreCase(id + "")) {
					rta = item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual busca una marca dentro de una lista de marcas
	 * basandose en su id
	 * 
	 * @param id
	 * @return
	 */
	public MarcaEntity buscaMarcaXId(Integer id) {
		MarcaEntity rta = null;
		try {
			if (listaMarca == null) {
				this.serviceObtieneMarca();
			}
			for (MarcaEntity item : listaMarca) {
				if (id == item.getId()) {
					rta = item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * funcion que consulta los parametros de la rete fuente por version
	 * 
	 * @return
	 */
	public List<ReteFuenteEntity> buscaReteVersion() {

		try {
			if (!banderaRetefuente || listaReteFuente == null || listaReteFuente.isEmpty()) {
				listaReteFuente = logicaP.consultaReteXVersion();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaReteFuente;
	}

	/**
	 * Funcion con la cual obtengo la lista de referencias parametrizadas en el
	 * sistema
	 * 
	 * @return
	 */
	public List<ResolucionFactEntity> serviceObtieneResolucion() {
		try {
			// if (!banderaRefe || listaResolucion == null ||
			// listaResolucion.isEmpty()) {
			ResolucionFactLogica objLogica = new ResolucionFactLogica();
			this.listaResolucion = objLogica.obtenerResolucionesFact();
			banderaResolucion = true;
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listaResolucion;
	}
	
	/**
	 * Funcion con la cual obtengo la lista departamentos parametrizados en el sistema
	 * sistema
	 * 
	 * @return
	 */
	public List<DepartamentoEntity> serviceObtieneDepartamento() {
		try {
			// if (!banderaRefe || listaResolucion == null ||
			// listaResolucion.isEmpty()) {
			UbicacionLogica objLogica = new UbicacionLogica();
			this.listaDepartamento = objLogica.obtieneListaDepartamentos();
			banderaDepartamento = true;
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listaDepartamento;
	}
	
	/**
	 * Funcion con la cual obtengo la lista de ciudades parametrizados en el sistema
	 * sistema
	 * 
	 * @return
	 */
	public List<CiudadEntity> serviceObtieneCiudades() {
		try {
			// if (!banderaRefe || listaResolucion == null ||
			// listaResolucion.isEmpty()) {
			UbicacionLogica objLogica = new UbicacionLogica();
			this.listaCiudad = objLogica.obtieneListaCiudades();
			banderaCiudad = true;
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listaCiudad;
	}

	public List<ProveedoresEntity> getListaProveedor() {
		return listaProveedor;
	}

	public void setListaProveedor(List<ProveedoresEntity> listaProveedor) {
		this.listaProveedor = listaProveedor;
	}

	public static boolean isBanderaProv() {
		return banderaProv;
	}

	public static void setBanderaProv(boolean banderaProv) {
		FiltrosServiceBean.banderaProv = banderaProv;
	}

	public static boolean isBanderaCate() {
		return banderaCate;
	}

	public static void setBanderaCate(boolean banderaCate) {
		FiltrosServiceBean.banderaCate = banderaCate;
	}

	public List<CategoriaEntity> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(List<CategoriaEntity> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public List<ReferenciaEntity> getListaReferencia() {
		return listaReferencia;
	}

	public void setListaReferencia(List<ReferenciaEntity> listaReferencia) {
		this.listaReferencia = listaReferencia;
	}

	public static boolean isBanderaRefe() {
		return banderaRefe;
	}

	public static void setBanderaRefe(boolean banderaRefe) {
		FiltrosServiceBean.banderaRefe = banderaRefe;
	}

	public static boolean isBanderaMarc() {
		return banderaMarc;
	}

	public static void setBanderaMarc(boolean banderaMarc) {
		FiltrosServiceBean.banderaMarc = banderaMarc;
	}

	public List<MarcaEntity> getListaMarca() {
		return listaMarca;
	}

	public void setListaMarca(List<MarcaEntity> listaMarca) {
		this.listaMarca = listaMarca;
	}

	public List<SedeEntity> getListaSede() {
		return listaSede;
	}

	public void setListaSede(List<SedeEntity> listaSede) {
		this.listaSede = listaSede;
	}

	public List<SubCuentaEntity> getListaSubCuenta() {
		return listaSubCuenta;
	}

	public void setListaSubCuenta(List<SubCuentaEntity> listaSubCuenta) {
		this.listaSubCuenta = listaSubCuenta;
	}

	public List<ReteFuenteEntity> getListaReteFuente() {
		return listaReteFuente;
	}

	public void setListaReteFuente(List<ReteFuenteEntity> listaReteFuente) {
		this.listaReteFuente = listaReteFuente;
	}

	public List<ResolucionFactEntity> getListaResolucion() {
		return listaResolucion;
	}

	public void setListaResolucion(List<ResolucionFactEntity> listaResolucion) {
		this.listaResolucion = listaResolucion;
	}

	public static boolean isBanderaDepartamento() {
		return banderaDepartamento;
	}

	public static void setBanderaDepartamento(boolean banderaDepartamento) {
		FiltrosServiceBean.banderaDepartamento = banderaDepartamento;
	}
	
	

}
