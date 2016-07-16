package co.com.codesoftware.beans.admin;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.SedesLogica;
import co.com.codesoftware.logica.admin.ConteoLogica;
import co.com.codesoftware.servicio.conteos.ConteoEntity;
import co.com.codesoftware.servicio.general.SedeEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ConteosBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private List<ConteoEntity> listaConteo;
	private List<ConteoEntity> listaConteoFiltered;
	private ConteoEntity conteoEntity;
	private SedeEntity sedeSelected;

	public ConteosBean() {
		super();
		this.conteoEntity = new ConteoEntity();

	}

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		try {
			ConteoLogica objLogica = new ConteoLogica();
			this.listaConteo = objLogica.obtieneListaConteos("-1");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Funcion con la cual realizo la insercion de un conteo
	 */
	public void insertarConteo() {
		try {
			ConteoLogica objLogica = new ConteoLogica();
			this.conteoEntity.setTius(this.objetoSesion.getId());
			String valida = objLogica.insertaConteo(this.conteoEntity);
			if ("Ok".equalsIgnoreCase(valida)) {
				this.messageBean("Conteo Insertado correctamente", ErrorEnum.SUCCESS);
				this.listaConteo = objLogica.obtieneListaConteos("-1");
			} else {
				this.messageBean("Error al insertar el conteo", ErrorEnum.ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual busca una sede
	 * 
	 * @param idSede
	 */
	public void buscaSede(Integer idSede) {
		try {
			SedesLogica objLogica = new SedesLogica();
			this.sedeSelected = objLogica.obtenerSedeXId(idSede);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String seleccionaConteo(Integer idConteo){
		String rta = "/ACTION/ADMIN/visualizarConteo.jsf";
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idConteo", idConteo);
		return rta;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public List<ConteoEntity> getListaConteo() {
		return listaConteo;
	}

	public void setListaConteo(List<ConteoEntity> listaConteo) {
		this.listaConteo = listaConteo;
	}

	public List<ConteoEntity> getListaConteoFiltered() {
		return listaConteoFiltered;
	}

	public void setListaConteoFiltered(List<ConteoEntity> listaConteoFiltered) {
		this.listaConteoFiltered = listaConteoFiltered;
	}

	public ConteoEntity getConteoEntity() {
		return conteoEntity;
	}

	public void setConteoEntity(ConteoEntity conteoEntity) {
		this.conteoEntity = conteoEntity;
	}

	public SedeEntity getSedeSelected() {
		return sedeSelected;
	}

	public void setSedeSelected(SedeEntity sedeSelected) {
		this.sedeSelected = sedeSelected;
	}

}
