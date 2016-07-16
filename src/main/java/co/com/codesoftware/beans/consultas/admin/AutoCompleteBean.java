package co.com.codesoftware.beans.consultas.admin;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.server.nsigemco.MarcaEntity;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.server.nsigemco.SubCuentaEntity;
import co.com.codesoftware.servicio.general.SedeEntity;
import co.com.codesoftware.utilities.ErrorEnum;

/**
 * Clase en la cual se realizaran los autocompletes de las paginas que tienen
 * que ver con administracion
 * 
 * @author ACER
 *
 */
@ManagedBean
public class AutoCompleteBean {

	private ErrorEnum enumer;

	@ManagedProperty("#{filtrosService}")
	private FiltrosServiceBean filtrosService;

	/**
	 * Constructor de la clase la bandera en false quiere decir que no ha
	 * llamado ninguna vez a la consulta de proveedores
	 */
	public AutoCompleteBean() {
		super();
	}

	/**
	 * Funcion con la cual por medio de un indicio el sistema filtra los
	 * proveedores que tengan ese inidicio
	 * 
	 * @param query
	 * @return
	 */
	public List<ProveedoresEntity> completeText(String query) {
		List<ProveedoresEntity> provFiltrados = new ArrayList<ProveedoresEntity>();
		List<ProveedoresEntity> proveedores = null;
		// Ingreso aqui cuando nunca ha llamado al WebService de Busqueda de
		// proveedores
		proveedores = filtrosService.serviceObtieneProveedores();
		if (proveedores != null) {
			for (ProveedoresEntity item : proveedores) {
				if (provFiltrados == null) {
					proveedores = new ArrayList<ProveedoresEntity>();
				}
				if (item.getNombre().toUpperCase().contains(query.toUpperCase())) {
					provFiltrados.add(item);
				}
			}
		} else {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("No existe ningun Proveedor en la base de datos por favor ingrese por lo menos uno");
		}
		return provFiltrados;
	}
/**
 * metodo que consulta todas las subcuentas sin filtro	
 * @param query
 * @return
 */
	public List<SubCuentaEntity> completaSubCuenta(String query){
		List<SubCuentaEntity> subcFiltrados = new ArrayList<SubCuentaEntity>();
		List<SubCuentaEntity> subcuentas = null;
		//Se realiza el llamado del servicio web de busqueda de subcuentas
		subcuentas = filtrosService.serviceConsultaSubCuenta();
		if(subcuentas!=null){
			for(SubCuentaEntity item:subcuentas){
				if(subcFiltrados==null){
					subcuentas = new ArrayList<SubCuentaEntity>();
				}
				if(item.getNombre().toUpperCase().contains(query.toUpperCase())){
					subcFiltrados.add(item);
				}
			}
		}else{
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("No existe ninguna subcuenta registrada en la base de datos.");
		}
		
		return subcFiltrados;
	}
	
	
	/**
	 * Metodo que compara el string ingresado con alguna referencia que
	 * se encuentre en la base de datos
	 * @param query
	 * @return
	 */
	
	public List<ReferenciaEntity> completarReferencia(String query){
		List<ReferenciaEntity> refeFiltrado = new ArrayList<ReferenciaEntity>();
		List<ReferenciaEntity> referencias = null;
		referencias = filtrosService.serviceObtieneReferencia();
		if(referencias!=null){
			for(ReferenciaEntity item:referencias){
				if(refeFiltrado ==null){
					refeFiltrado = new ArrayList<ReferenciaEntity>();
				}
				if(item.getNombre().toUpperCase().contains(query.toUpperCase())){
					refeFiltrado.add(item);
				}
			}
		}else {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("No existe ninguna subcategoria en la base de datos por favor ingrese por lo menos uno");
		}
		return refeFiltrado;
	}
	
	/**
	 * Metodo que compara el string ingresado con alguna marca que
	 * se encuentre en la base de datos
	 * @param query
	 * @return
	 */
	public List<MarcaEntity> completarMarca(String query){
		List<MarcaEntity> marcaFiltrado = new ArrayList<MarcaEntity>();
		List<MarcaEntity> marcas = null;
		marcas = filtrosService.serviceObtieneMarca();
		if(marcas!=null){
			for(MarcaEntity item:marcas){
				if(marcaFiltrado ==null){
					marcaFiltrado = new ArrayList<MarcaEntity>();
				}
				if(item.getNombre().toUpperCase().contains(query.toUpperCase())){
					marcaFiltrado.add(item);
				}
			}
		}else {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("No existe ninguna marca en la base de datos por favor ingrese por lo menos uno");
		}
		return marcaFiltrado;
	}
	
	/**
	 * Metodo que compara el string ingresado con alguna sede que
	 * se encuentre en la base de datos
	 * @param query
	 * @return
	 */
	public List<SedeEntity> completarSede(String query){
		List<SedeEntity> sedeFiltrado = new ArrayList<SedeEntity>();
		List<SedeEntity> sedes = null;
		sedes = filtrosService.serviceObtieneSedes();
		if(sedes!=null){
			for(SedeEntity item:sedes){
				if(sedeFiltrado ==null){
					sedeFiltrado = new ArrayList<SedeEntity>();
				}
				if(item.getName().toUpperCase().contains(query.toUpperCase())){
					sedeFiltrado.add(item);
				}
			}
		}else {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("No existe ninguna marca en la base de datos por favor ingrese por lo menos uno");
		}
		return sedeFiltrado;
	}
	
	/**
	 * Funcion con la cual por medio de un indicio el sistema filtra los
	 * categorias que tengan ese inidicio
	 * 
	 * @param query
	 * @return
	 */
	public List<CategoriaEntity> completeTextCategoria(String query) {
		List<CategoriaEntity> catFiltrados = new ArrayList<CategoriaEntity>();
		List<CategoriaEntity> categorias = null;
		// Ingreso aqui cuando nunca ha llamado al WebService de Busqueda de
		// categorias
		categorias = filtrosService.serviceObtieneCategorias();
		if (categorias != null) {
			for (CategoriaEntity item : categorias) {
				if (catFiltrados == null) {
					categorias = new ArrayList<CategoriaEntity>();
				}
				if (item.getDescripcion().toUpperCase().contains(query.toUpperCase())) {
					catFiltrados.add(item);
				}
			}
		} else {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("No existe ninguna Categoria en la base de datos por favor ingrese por lo menos uno");
		}
		return catFiltrados;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public FiltrosServiceBean getFiltrosService() {
		return filtrosService;
	}

	public void setFiltrosService(FiltrosServiceBean filtrosService) {
		this.filtrosService = filtrosService;
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

}
