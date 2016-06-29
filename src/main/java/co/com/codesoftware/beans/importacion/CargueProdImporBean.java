package co.com.codesoftware.beans.importacion;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;

import co.com.codesoftware.entity.ProducImpEntity;
import co.com.codesoftware.logica.importacion.ImportacionLogica;
import co.com.codesoftware.servicio.importacion.ImportacionEntity;
import co.com.codesoftware.servicio.importacion.ProductoImportacionEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class CargueProdImporBean implements Serializable, GeneralBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ImportacionEntity importacion;
	private List<ProductoImportacionEntity> productosImportacion;
	private List<ProductoImportacionEntity> filteredproductosImportacion;
	private String codExterno;
	private Integer cantidad;
	private BigDecimal valorDolar;
	// Valores utilizados para convertir los valores de dolares a pesos
	private BigDecimal trm;
	private BigDecimal tazaPromedio;
	// Lista de productos adicionn
	private List<ProducImpEntity> listaInexistentes;
	// Atribuos para la creacion del producto

	/**
	 * Funcion con la cual cargo el excel de productos
	 */
	public void cargarExcelProductos(FileUploadEvent file) {
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			String valida = objLogica.cargaProductosImportacion(file, importacion.getId());
			if (valida.toUpperCase().contains("OK")) {
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Productos cargados correctamente");
			} else {
				this.listaInexistentes = objLogica.getProdInexistentes();
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(valida);
			}
			this.productosImportacion = objLogica.obtieneProductosImportacion(this.importacion.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual vuelvo y llamo al webService que obtiene los
	 * productos de la importacion
	 */
	public void reiniciarLista() {
		try {
			RequestContext requestContext = RequestContext.getCurrentInstance();
			requestContext.execute("PF('tablaImpoProd').clearFilters()");
			ImportacionLogica objLogica = new ImportacionLogica();
			this.productosImportacion = null;
			this.productosImportacion = objLogica.obtieneProductosImportacion(this.importacion.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual borro todos los productos de la importacion en la
	 * base de datos
	 */
	public void eliminarProductos() {
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			String valida = objLogica.eliminarProductosImportacion(this.importacion.getId());
			RequestContext requestContext = RequestContext.getCurrentInstance();
			requestContext.execute("PF('tablaImpoProd').clearFilters()");
			this.productosImportacion = null;
			this.productosImportacion = objLogica.obtieneProductosImportacion(this.importacion.getId());
			this.setEnumer(ErrorEnum.SUCCESS);
			this.messageBean(valida);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual adiciono un producto a la lista
	 */
	public void adicionaProducto() {
		try {
			if (this.codExterno == null || "".equalsIgnoreCase(this.codExterno)) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por Favor digite el codigo externo del producto");
			} else if (this.cantidad == null || this.cantidad == 0) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por Favor digite la cantidad del producto");
			} else if (this.valorDolar == null || this.valorDolar.compareTo(new BigDecimal(0)) == 0) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por Favor digite el valor en dolares");
			} else {
				ImportacionLogica objLogica = new ImportacionLogica();
				String valida = objLogica.insertaProducto(this.importacion.getId(), codExterno, cantidad, valorDolar);
				if (valida.toUpperCase().contains("OK")) {
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('tablaImpoProd').clearFilters()");
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean("Productos cargados correctamente");
					this.productosImportacion = objLogica.obtieneProductosImportacion(this.importacion.getId());
					ProductoImportacionEntity aux = null;
					Iterator<ProductoImportacionEntity> iterator = this.productosImportacion.iterator();
					while (iterator.hasNext()) {
						ProductoImportacionEntity item = iterator.next();
						if (item.getProducto().getCodigoExt().equalsIgnoreCase(this.codExterno)) {
							aux = item;
							iterator.remove();
						}
					}
					if (aux != null) {
						this.productosImportacion.add(0, aux);
					}
					this.codExterno = "";
					this.cantidad = null;
					this.valorDolar = null;
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean(valida);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual seleccion un producto para editarlo
	 * 
	 * @param prod
	 */
	public void seleccionaProd(ProductoImportacionEntity prod) {
		try {
			this.codExterno = prod.getProducto().getCodigoExt();
			this.cantidad = prod.getCantidad();
			this.valorDolar = prod.getVlrDolar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual inserta las tazas representativas a los productos
	 */
	public void adicionaTazasDolar() {
		ImportacionLogica objLogica = new ImportacionLogica();
		try {
			String valida = objLogica.insertaTazasRepresentativas(this.importacion.getId(), this.trm, this.tazaPromedio);
			if (valida.toUpperCase().contains("OK")) {
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Tazas insertadas correctamente");
				this.productosImportacion = objLogica.obtieneProductosImportacion(this.importacion.getId());
				this.importacion.setTrm(this.trm);
				this.importacion.setTazaPromedio(this.tazaPromedio);
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(valida);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		try {
			this.importacion = (ImportacionEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("importacionSelected");
			ImportacionLogica objLogica = new ImportacionLogica();
			this.productosImportacion = objLogica.obtieneProductosImportacion(this.importacion.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


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
	/**
	 * Funcion con la cual corro el proceso de la importacion con los inexistentes
	 */
	public void correrProcesoInsexistente(){
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			String valida = objLogica.enviarListaProductosImportacion(this.importacion.getId(),this.listaInexistentes );
			if (valida.toUpperCase().contains("OK")) {
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Productos cargados correctamente");
			} else {
				this.listaInexistentes = objLogica.getProdInexistentes();
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(valida);
			}
			this.productosImportacion = objLogica.obtieneProductosImportacion(this.importacion.getId());
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

	public String getCodExterno() {
		return codExterno;
	}

	public void setCodExterno(String codExterno) {
		this.codExterno = codExterno;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getValorDolar() {
		return valorDolar;
	}

	public void setValorDolar(BigDecimal valorDolar) {
		this.valorDolar = valorDolar;
	}

	public BigDecimal getTrm() {
		return trm;
	}

	public void setTrm(BigDecimal trm) {
		this.trm = trm;
	}

	public BigDecimal getTazaPromedio() {
		return tazaPromedio;
	}

	public void setTazaPromedio(BigDecimal tazaPromedio) {
		this.tazaPromedio = tazaPromedio;
	}

	public List<ProducImpEntity> getListaInexistentes() {
		return listaInexistentes;
	}

	public void setListaInexistentes(List<ProducImpEntity> listaInexistentes) {
		this.listaInexistentes = listaInexistentes;
	}
}
