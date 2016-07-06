package co.com.codesoftware.beans.importacion;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.admin.ContabilidadLogic;
import co.com.codesoftware.logica.importacion.ImportacionLogica;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.servicio.contabilidad.AuxContableEntity;
import co.com.codesoftware.servicio.contabilidad.MoviContableEntity;
import co.com.codesoftware.servicio.importacion.GastoImpoEntity;
import co.com.codesoftware.servicio.importacion.ImportacionEntity;
import co.com.codesoftware.servicio.importacion.ProductoImportacionEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class GenerarProcImportacionBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ImportacionEntity importacion;
	private List<ProductoImportacionEntity> productosImportacion;
	private List<ProductoImportacionEntity> filteredproductosImportacion;
	private List<GastoImpoEntity> listaGastos;
	private AuxContableEntity auxConta;
	private ProveedoresEntity proveedor;
	private List<MoviContableEntity> listaMovi;

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("dataSession");
		try {
			this.importacion = (ImportacionEntity) FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap().get("importacionSelected");
			buscaImportacionXId(this.importacion.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * FUncion con la cual se busca una importacion por su Id
	 */
	public void buscaImportacionXId(Integer idImpo) {
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			this.importacion = objLogica.obtenerImportacionXId(idImpo);
			this.productosImportacion = objLogica.obtieneProductosImportacion(this.importacion.getId());
			this.listaGastos = objLogica.obtenerGastosImportacion(this.importacion.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual selecciono un auxiliar contable
	 */
	public void seleccionaAuxContable(Integer idAux) {
		try {
			ContabilidadLogic objLogic = new ContabilidadLogic();
			auxConta = objLogic.obtenerAuxiliarContableXId(idAux);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion desde la cual se genera la importacion con la cual se realizara
	 * la importacion en el sistema
	 */
	public void generaImportacion() {
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			String valida = objLogica.ejecutarProcesoImportacion(this.importacion.getId(), this.objetoSesion.getId());
			if (valida.toUpperCase().contains("OK")) {
				messageBean("Importacion realizada Correctamente", ErrorEnum.SUCCESS);
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('dialogConfirmacion').hide()");
				this.buscaImportacionXId(this.importacion.getId());
			} else {
				messageBean(valida, ErrorEnum.ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual selecciono y envio a un producto a revisar su kardex
	 * @param idDska
	 */
	public String seleccionaProdInventario(Integer idDska){
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idProdSelect", idDska);
			return "/ACTION/PRODUCTOS/promedioPonderado";
		} catch (Exception e) {
			e.printStackTrace();
			return null; 
		}
	}

	/**
	 * Funcion con la cual busco el asiento contable que genero el movimiento de
	 * inventario
	 */
	public void buscarAsientoProductos() {
		try {
			ContabilidadLogic objLogic = new ContabilidadLogic();
			this.listaMovi = objLogic.obtenerAsientoContable(this.importacion.getIdTranCont());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Funcion con la cual busco el asiento contable que genero el movimiento de
	 * inventario
	 */
	public void buscarAsientoGastos(Integer idTrans) {
		try {
			ContabilidadLogic objLogic = new ContabilidadLogic();
			this.listaMovi = objLogic.obtenerAsientoContable(idTrans);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public ImportacionEntity getImportacion() {
		return importacion;
	}

	public void setImportacion(ImportacionEntity importacion) {
		this.importacion = importacion;
	}

	public List<ProductoImportacionEntity> getProductosImportacion() {
		return productosImportacion;
	}

	public void setProductosImportacion(List<ProductoImportacionEntity> productosImportacion) {
		this.productosImportacion = productosImportacion;
	}

	public List<ProductoImportacionEntity> getFilteredproductosImportacion() {
		return filteredproductosImportacion;
	}

	public void setFilteredproductosImportacion(List<ProductoImportacionEntity> filteredproductosImportacion) {
		this.filteredproductosImportacion = filteredproductosImportacion;
	}

	public List<GastoImpoEntity> getListaGastos() {
		return listaGastos;
	}

	public void setListaGastos(List<GastoImpoEntity> listaGastos) {
		this.listaGastos = listaGastos;
	}

	public AuxContableEntity getAuxConta() {
		return auxConta;
	}

	public void setAuxConta(AuxContableEntity auxConta) {
		this.auxConta = auxConta;
	}

	public ProveedoresEntity getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedoresEntity proveedor) {
		this.proveedor = proveedor;
	}

	public List<MoviContableEntity> getListaMovi() {
		return listaMovi;
	}

	public void setListaMovi(List<MoviContableEntity> listaMovi) {
		this.listaMovi = listaMovi;
	}

}
