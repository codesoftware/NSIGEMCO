
package co.com.codesoftware.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.codesoftware.logica.admin.ContabilidadLogic;
import co.com.codesoftware.logica.facturacion.FacturaCompraTmpLogica;
import co.com.codesoftware.logica.productos.ProductoParamLogica;
import co.com.codesoftware.server.productos.ProductoSimpleEntity;
import co.com.codesoftware.servicio.contabilidad.AuxContableEntity;
import co.com.codesoftware.servicio.facturacion.ProdFacCompraTmpEntity;
import co.com.codesoftware.servicio.producto.ProductosParamEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ProdParamBean implements GeneralBean {

	private List<ProductosParamEntity> listaProductos;
	private List<ProductosParamEntity> listaProductosFiltro;
	private ProductoParamLogica logica;
	private UsuarioEntity objetoSesion;
	private ProductosParamEntity producto;
	private String codigoExterno;
	private List<ProductoSimpleEntity> productosConsulta;
	private List<ProductoSimpleEntity> productosConsultaFiltered;
	private ProdFacCompraTmpEntity productoBusqueda;
	private String nombrePrd;
	private String codExterno;
	private AuxContableEntity detAuxContable;

	/**
	 * constructor
	 */
	public ProdParamBean() {
		this.logica = new ProductoParamLogica();
		this.objetoSesion = traeDatosSesion();
	}

	/**
	 * metodo que consulta todos los productos parametrizados
	 */
	public void consultaProductosParametrizados() {
		try {
			this.listaProductos = this.logica.consultaProdParam();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * metodo que consulta un producto por id
	 * 
	 * @param id
	 */
	public void consultaProductoXId(Integer id) {
		try {
			this.producto = this.logica.consultaUnicoProd(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que consulta los productos
	 */
	public void busquedaAvanzada() {
		try {
			FacturaCompraTmpLogica logicaF = new FacturaCompraTmpLogica();
			if (this.productosConsulta == null || this.productosConsulta.size() == 0) {
				this.productosConsulta = logicaF.consultaProductos();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que consulta un producto por el codigo externo
	 */
	public void busquedaProducto() {
		try {
			FacturaCompraTmpLogica logicaF = new FacturaCompraTmpLogica();
			if (this.codigoExterno != null && !"".equalsIgnoreCase(this.codigoExterno)) {
				this.productoBusqueda = logicaF.consultaProductoXcodigoExt(this.codigoExterno);
				if (this.productoBusqueda.getProducto() == null) {
					this.messageBean("Producto inexistente", ErrorEnum.ERROR);
				} else {
					this.nombrePrd = this.productoBusqueda.getProducto().getDescripcion();
					this.codExterno = this.productoBusqueda.getProducto().getCodigoExt();
				}
			}
		} catch (Exception e) {
			messageBean("Producto inexistente", ErrorEnum.ERROR);
		}

	}

	/**
	 * metodo que consulta el auxiliar contable
	 * 
	 * @param query
	 * @return
	 */
	public List<AuxContableEntity> completaAuxContable(String query) {
		List<AuxContableEntity> rta = null;
		try {
			ContabilidadLogic objLogic = new ContabilidadLogic();
			rta = objLogic.obtenerAuxiliarContXCriterio(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	public void limpiaPanel() {
		this.producto = new ProductosParamEntity();
		this.codigoExterno = "";
	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	public List<ProductosParamEntity> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<ProductosParamEntity> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public List<ProductosParamEntity> getListaProductosFiltro() {
		return listaProductosFiltro;
	}

	public void setListaProductosFiltro(List<ProductosParamEntity> listaProductosFiltro) {
		this.listaProductosFiltro = listaProductosFiltro;
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public ProductosParamEntity getProducto() {
		return producto;
	}

	public void setProducto(ProductosParamEntity producto) {
		this.producto = producto;
	}

	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	public List<ProductoSimpleEntity> getProductosConsulta() {
		return productosConsulta;
	}

	public void setProductosConsulta(List<ProductoSimpleEntity> productosConsulta) {
		this.productosConsulta = productosConsulta;
	}

	public List<ProductoSimpleEntity> getProductosConsultaFiltered() {
		return productosConsultaFiltered;
	}

	public void setProductosConsultaFiltered(List<ProductoSimpleEntity> productosConsultaFiltered) {
		this.productosConsultaFiltered = productosConsultaFiltered;
	}

	public ProdFacCompraTmpEntity getProductoBusqueda() {
		return productoBusqueda;
	}

	public void setProductoBusqueda(ProdFacCompraTmpEntity productoBusqueda) {
		this.productoBusqueda = productoBusqueda;
	}

	public String getNombrePrd() {
		return nombrePrd;
	}

	public void setNombrePrd(String nombrePrd) {
		this.nombrePrd = nombrePrd;
	}

	public String getCodExterno() {
		return codExterno;
	}

	public void setCodExterno(String codExterno) {
		this.codExterno = codExterno;
	}

	public AuxContableEntity getDetAuxContable() {
		return detAuxContable;
	}

	public void setDetAuxContable(AuxContableEntity detAuxContable) {
		this.detAuxContable = detAuxContable;
	}

}
