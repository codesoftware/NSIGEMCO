package co.com.codesoftware.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.logica.ReferenciaLogica;
import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.utilities.ErrorEnum;

@ManagedBean
@ViewScoped
public class AsocCateSubCate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CategoriaEntity categoria;
	private List<CategoriaEntity> lsCategoria;
	private ReferenciaEntity referencia;
	private List<ReferenciaEntity> lsRerencia;
	private FiltrosServiceBean filtrosServiceAsc;
	private ErrorEnum enumer;

	/**
	 * Funcion con la cual obtengo la lista de dependencias
	 * 
	 * @param query
	 * @return
	 */
	public List<CategoriaEntity> obtieneListaCategoria(String query) {
		List<CategoriaEntity> categorias = null;
		List<CategoriaEntity> rta = null;
		try {
			if (filtrosServiceAsc == null) {
				filtrosServiceAsc = new FiltrosServiceBean();
			}
			categorias = filtrosServiceAsc.serviceObtieneCategorias();
			if (categorias != null) {
				for (CategoriaEntity item : categorias) {
					if ((item.getDescripcion().toUpperCase()).contains(query.toUpperCase())) {
						if (rta == null) {
							rta = new ArrayList<CategoriaEntity>();
						}
						rta.add(item);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual obtengo la lista de referencias de acuerdo una
	 * coincidencia dada por un usuario
	 * 
	 * @param query
	 * @return
	 */
	public List<ReferenciaEntity> obtieneListaReferencia(String query) {
		List<ReferenciaEntity> rta = null;
		List<ReferenciaEntity> referencias = null;
		try {
			if (filtrosServiceAsc == null) {
				filtrosServiceAsc = new FiltrosServiceBean();
			}
			referencias = filtrosServiceAsc.serviceObtieneReferencia();
			if (referencias != null) {
				for (ReferenciaEntity item : referencias) {
					if ((item.getNombre().toUpperCase()).contains(query.toUpperCase())) {
						if (rta == null) {
							rta = new ArrayList<ReferenciaEntity>();
						}
						rta.add(item);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual asocio una categoria con una subcategoria
	 */
	public void asociaCatConSubCat() {
		boolean bandera = true;
		try {
			if (categoria == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por favor seleccione una categoria no puede ser nula");
				bandera = false;
			}
			if(referencia == null){
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por favor seleccione una Subcategoria no puede ser nula");
				bandera = false;
			}			
			if(bandera){
				this.referencia.setCategoriaId(categoria.getId());
				ReferenciaLogica objLogica = new ReferenciaLogica();
				boolean valida = objLogica.asociaCategoriaConSubCat(this.referencia);
				if(valida){
					FiltrosServiceBean.setBanderaRefe(false);
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean("Categoria asociada correctamente");
					this.categoria = null;
					this.referencia = null;
				}else{
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Error al asociar la categoria");
				}
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
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", message));
			break;
		case FATAL:
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "Error de sistema"));
			break;
		case SUCCESS:
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Ok!", message));
			break;

		default:
			break;
		}
	}

	public CategoriaEntity getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}

	public List<CategoriaEntity> getLsCategoria() {
		return lsCategoria;
	}

	public void setLsCategoria(List<CategoriaEntity> lsCategoria) {
		this.lsCategoria = lsCategoria;
	}

	public ReferenciaEntity getReferencia() {
		return referencia;
	}

	public void setReferencia(ReferenciaEntity referencia) {
		this.referencia = referencia;
	}

	public List<ReferenciaEntity> getLsRerencia() {
		return lsRerencia;
	}

	public void setLsRerencia(List<ReferenciaEntity> lsRerencia) {
		this.lsRerencia = lsRerencia;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

}
