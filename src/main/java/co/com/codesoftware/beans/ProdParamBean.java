
package co.com.codesoftware.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

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
	private String banderaBoton;

	/**
	 * constructor
	 */
	public ProdParamBean() {
		this.logica = new ProductoParamLogica();
		this.objetoSesion = traeDatosSesion();
		this.producto = new ProductosParamEntity();
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
			if (this.detAuxContable == null) {
				this.detAuxContable = new AuxContableEntity();
			}
			if (this.productoBusqueda == null) {
				this.productoBusqueda = new ProdFacCompraTmpEntity();

			}
			this.producto = this.logica.consultaUnicoProd(id);
			this.detAuxContable.setId(this.producto.getAxiliar().getId());
			this.detAuxContable.setDescripcion(this.producto.getAxiliar().getDescripcion());
			this.detAuxContable.setCodigo(this.producto.getAxiliar().getCodigo());
			this.detAuxContable.setIdSbcu(this.producto.getAxiliar().getIdSbcu());
			this.detAuxContable.setNombre(this.producto.getAxiliar().getNombre());
			this.banderaBoton = "U";
			this.codigoExterno = this.producto.getCodigoExterno();
			busquedaProducto();
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
	 * metodo que selecciona un producto de la lista
	 * 
	 * @param codigoExt
	 */
	public void seleccionaProducto(String codigoExt) {
		this.codigoExterno = codigoExt;
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

	/**
	 * metodo que prepara el formulario para limpiar el panel
	 */
	public void limpiaPanel() {
		this.producto = new ProductosParamEntity();
		this.producto.setDescripcion("");
		this.banderaBoton = "I";
		this.productoBusqueda = new ProdFacCompraTmpEntity();
		this.codigoExterno = "";
		this.codExterno ="";
		this.nombrePrd="";
		this.detAuxContable = new AuxContableEntity();
	}

	/**
	 * metodo que valida los productos
	 * 
	 * @return
	 */
	public boolean validaDatos() {
		if (this.productoBusqueda == null || this.productoBusqueda.getProducto() == null
				|| this.productoBusqueda.getProducto().getId() == null) {
			messageBean("Debe seleccionar algún producto", ErrorEnum.ERROR);
			return false;
		}
		if (this.detAuxContable == null || this.getDetAuxContable().getId() == null) {
			messageBean("Debe seleccionar alguna subcuenta", ErrorEnum.ERROR);
			return false;
		}
		if (this.producto.getDescripcion() == null || this.producto.getDescripcion().equalsIgnoreCase("")) {
			messageBean("Debe escribir la descripcion", ErrorEnum.ERROR);
			return false;
		}
		return true;
	}

	/**
	 * metodo que inserta un producto
	 */
	public void insertaProducto() {
		try {
			if (validaDatos()) {
				co.com.codesoftware.servicio.producto.AuxContableEntity auxiliar = new co.com.codesoftware.servicio.producto.AuxContableEntity();
				auxiliar.setId(this.detAuxContable.getId());
				this.producto.setAxiliar(auxiliar);
				this.producto.setEstado("A");
				this.producto.setIdProducto(this.productoBusqueda.getProducto().getId());
				this.producto.setIdUsuario(this.objetoSesion.getId());
				if (this.logica.insertaProducto(this.producto)) {
					messageBean("Inserto Correctamente", ErrorEnum.SUCCESS);
				} else {
					messageBean("Error al insertar el ", ErrorEnum.ERROR);
				}
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('datosProducto').hide();");
				consultaProductosParametrizados();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que actualiza el producto
	 */
	public void actualizaProducto() {
		try {
			if (validaDatos()) {
				co.com.codesoftware.servicio.producto.AuxContableEntity auxiliar = new co.com.codesoftware.servicio.producto.AuxContableEntity();
				auxiliar.setId(this.detAuxContable.getId());
				this.producto.setAxiliar(auxiliar);
				this.producto.setEstado("A");
				this.producto.setIdProducto(this.productoBusqueda.getProducto().getId());
				this.producto.setIdUsuario(this.objetoSesion.getId());
				if (this.logica.actualizaProducto(this.producto)) {
					messageBean("Actualizo Correctamente", ErrorEnum.SUCCESS);
				} else {
					messageBean("Error al Actualizar el producto ", ErrorEnum.ERROR);
				}
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('datosProducto').hide();");
				consultaProductosParametrizados();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

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

	public String getBanderaBoton() {
		return banderaBoton;
	}

	public void setBanderaBoton(String banderaBoton) {
		this.banderaBoton = banderaBoton;
	}

}
