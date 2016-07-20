package co.com.codesoftware.beans.productos;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.MarcaLogica;
import co.com.codesoftware.logica.ProductosLogica;
import co.com.codesoftware.logica.ReferenciaLogica;
import co.com.codesoftware.server.nsigemco.MarcaEntity;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.server.productos.PorcentajePrecioEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class PrecioMasivoBean implements GeneralBean, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ErrorEnum enumer;
	private UsuarioEntity objetoSesion;
	private Map<String, Integer> listaMapSubCate;
	private Map<String, Integer> listaMapMarca;
	private Integer idSede;
	private Integer idCate;
	private Integer idRefe;
	private Integer idMarca;
	private Integer porcBase;
	private Integer porcUni;
	private Integer porcDec;
	private Integer porcMil;

	private List<PorcentajePrecioEntity> listaPorc;

	/**
	 * Funcion la cual busca subcategorias o referencias basado en una categoria
	 */
	public void buscaSubCategorias() {
		RequestContext.getCurrentInstance().execute("$('#formCnfirma').hide();");
		ReferenciaLogica objLogica = new ReferenciaLogica();
		try {
			// Logica para el mapa de subcategorias
			List<ReferenciaEntity> listRefe = objLogica.obtieneReferenciasXcate(idCate);
			this.listaMapSubCate = null;
			if (listRefe != null) {
				for (ReferenciaEntity referencia : listRefe) {
					if (this.listaMapSubCate == null) {
						this.listaMapSubCate = new LinkedHashMap<>();
					}
					this.listaMapSubCate.put(referencia.getDescripcion(), referencia.getId());
				}
			}
			// Logica para el mapa de marcas
			MarcaLogica objLogM = new MarcaLogica();
			List<MarcaEntity> listaMarcas = objLogM.consultaMarcasXCategoria(idCate);
			if (listaMarcas != null) {
				listaMapMarca = null;
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
	 * Funcion con la cual busco el historico de precios
	 */
	public void buscaHistoricoParametros() {
		try {
			if (idCate == -1) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por favor seleccione una categoria");
			} else if (idSede == -1) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por favor seleccione una sede");
			} else {
				ProductosLogica objLogica = new ProductosLogica();
				this.listaPorc = objLogica.consultaGeneralPorc("A", idSede, idCate,idRefe,idMarca);
				if(this.listaPorc == null || this.listaPorc.size() == 0){
					this.messageBean("Error al obtener lista de precios parametrizados o la consulta no arrojo ningun resultado", ErrorEnum.ERROR);
					RequestContext.getCurrentInstance().execute("$('#formCnfirma').hide();");
				}else{
					this.messageBean("Ok", ErrorEnum.SUCCESS);
					RequestContext.getCurrentInstance().execute("$('#formCnfirma').show();");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual se realiza la parametrizacion de los porcentajes para
	 * las parametrizacion de precios
	 */
	public void enviaParametrizacion() {
		ProductosLogica objLogica = new ProductosLogica();
		try {
			if (idSede == -1) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por Favor seleccione una sede");
			} else {
				String rta = objLogica.parametrizaPorcPrecios(idCate, idRefe, idMarca, idSede, porcUni, porcDec,
						porcMil, porcBase, objetoSesion.getId());
				if ("Ok".equalsIgnoreCase(rta)) {
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean("Parametros Insertados Correctamente ");
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Error al insertar los parametros " + rta);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual envio los parametros para ejecutar el cambio de
	 * precios masivos
	 */
	public void ejecutaProcesoPrecios() {
		ProductosLogica objLogica = new ProductosLogica();
		try {
			String rta = objLogica.ejecutaCambioPrecioMasivo(idCate, idRefe, idMarca, idSede, objetoSesion.getId());
			if(rta.contains("Ok")){
				String numero = rta.split("-")[1];
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Parametros actualizados correctamente... El numero de productos al cual le cambio el precio es: " + numero);
			}else{
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(rta);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo generico para mostrar mensajes de error o advertencia
	 * 
	 * @param message
	 */

	public void messageBean(String message) {
		switch (this.enumer) {
		case ERROR:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", message));
			break;
		case FATAL:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "Error de sistema"));
			break;
		case SUCCESS:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Ok!", message));
			break;

		default:
			break;
		}
	}

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
			RequestContext.getCurrentInstance().execute("$('#formCnfirma').hide();");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Map<String, Integer> getListaMapSubCate() {
		return listaMapSubCate;
	}

	public void setListaMapSubCate(Map<String, Integer> listaMapSubCate) {
		this.listaMapSubCate = listaMapSubCate;
	}

	public Integer getIdCate() {
		return idCate;
	}

	public void setIdCate(Integer idCate) {
		this.idCate = idCate;
	}

	public Integer getIdRefe() {
		return idRefe;
	}

	public void setIdRefe(Integer idRefe) {
		this.idRefe = idRefe;
	}

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public Integer getPorcBase() {
		return porcBase;
	}

	public void setPorcBase(Integer porcBase) {
		this.porcBase = porcBase;
	}

	public Integer getPorcUni() {
		return porcUni;
	}

	public void setPorcUni(Integer porcUni) {
		this.porcUni = porcUni;
	}

	public Integer getPorcDec() {
		return porcDec;
	}

	public void setPorcDec(Integer porcDec) {
		this.porcDec = porcDec;
	}

	public Integer getPorcMil() {
		return porcMil;
	}

	public void setPorcMil(Integer porcMil) {
		this.porcMil = porcMil;
	}

	public Integer getIdSede() {
		return idSede;
	}

	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public Map<String, Integer> getListaMapMarca() {
		return listaMapMarca;
	}

	public void setListaMapMarca(Map<String, Integer> listaMapMarca) {
		this.listaMapMarca = listaMapMarca;
	}

	public List<PorcentajePrecioEntity> getListaPorc() {
		return listaPorc;
	}

	public void setListaPorc(List<PorcentajePrecioEntity> listaPorc) {
		this.listaPorc = listaPorc;
	}

}
