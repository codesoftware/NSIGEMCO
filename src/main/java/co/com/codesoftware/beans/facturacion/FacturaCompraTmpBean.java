package co.com.codesoftware.beans.facturacion;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.ProveedoresLogica;
import co.com.codesoftware.logica.facturacion.FacturaCompraTmpLogica;
import co.com.codesoftware.server.nsigemco.CiudadEntity;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.server.productos.ProductoSimpleEntity;
import co.com.codesoftware.servicio.facturacion.FacturaCompraTmpEntity;
import co.com.codesoftware.servicio.facturacion.ProdFacCompraTmpEntity;
import co.com.codesoftware.servicio.facturacion.SedeEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;
import co.com.codesoftware.utilities.Utilitites;

/*
 * M-001: se valida los campos obligatorios antes de ver los totales y se hace el autoguardado
 * jmorenor1986
 * 07/11/2016
 * ------------------------------------------------------------------------------------------ 
 */
@ManagedBean
@ViewScoped
public class FacturaCompraTmpBean implements GeneralBean {

	private FacturaCompraTmpEntity facturaCompra;
	private FacturaCompraTmpEntity facturaCompraTmp;
	private FacturaCompraTmpLogica logica;
	private ProveedoresEntity proveedor;
	private ProdFacCompraTmpEntity productoBusqueda;
	private List<ProdFacCompraTmpEntity> listaProductos;
	private List<ProdFacCompraTmpEntity> listaProductosFiltro;
	private List<ProductoSimpleEntity> productosConsulta;
	private List<ProductoSimpleEntity> productosConsultaFiltered;
	private ErrorEnum enumer;
	private Date maxDate;
	private Date fechaFact;
	private Date fechaRec;
	private String fechaGuardado;
	private String codConExterno;
	private Integer idSede;
	private Integer cantidad;
	private BigDecimal porcentajeIva;
	private BigDecimal valorProducto;
	private Integer idFacturaConsulta;
	private UsuarioEntity objetoSesion;
	private String inventareable;
	private Integer cantidadInventariable;

	private List<ProveedoresEntity> listaProveedores;
	private List<ProveedoresEntity> listaProveedoresFiltered;

	@PostConstruct
	public void init() {
		this.proveedor = new ProveedoresEntity();
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		this.maxDate = new Date();
		facturaCompra = new FacturaCompraTmpEntity();
		facturaCompraTmp = new FacturaCompraTmpEntity();
		this.logica = new FacturaCompraTmpLogica();
		this.idFacturaConsulta = (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("facturaCompra");
		if (this.idFacturaConsulta != null && this.idFacturaConsulta != 0) {
			this.facturaCompra = logica.consultaFacturaID(this.idFacturaConsulta);
			seteaProveedor(this.facturaCompra.getProveedor());
			this.fechaFact = this.facturaCompra.getFechaFacCompra().toGregorianCalendar().getTime();
			this.fechaRec = this.facturaCompra.getFechaRecepcion().toGregorianCalendar().getTime();
			this.idSede = this.facturaCompra.getSede().getId();
			this.listaProductos = logica.consultaProductosFacturaId(this.facturaCompra.getId());
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("facturaCompra", null);
		}

	}

	/**
	 * Funcion con la cual busco los productos que se encuentran en el sistema
	 */
	public void busquedaAvanzada() {
		try {
			if (this.productosConsulta == null || this.productosConsulta.size() == 0) {
				this.productosConsulta = logica.consultaProductos();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * funcion que ejecuta el guardado del borrador de la factura de compra
	 */
	public void autoGuardado() {
		if (this.proveedor == null) {
			this.messageBean("El proveedor no puede ser nulo", ErrorEnum.ERROR);
		} else if (this.idSede == -1) {
			this.messageBean("Por Favor Seleccione una sede", ErrorEnum.ERROR);
		} else {
			seteaObjeto();
			if (this.facturaCompra.getId() == null || this.facturaCompra.getId() == 0) {
				insertaFacturaTmp();
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Factura insertada Correctamente", ErrorEnum.SUCCESS);
			} else {
				actualizaFacturaTmp();
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Factura actualizada Correctamente", ErrorEnum.SUCCESS);
			}
			this.fechaGuardado = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
			this.setEnumer(ErrorEnum.SUCCESS);
		}
	}

	/**
	 * funcion que inserta la factura temporal
	 */
	public void insertaFacturaTmp() {
		if (proveedor != null) {
			co.com.codesoftware.servicio.facturacion.ProveedoresEntity proveedorTemp = new co.com.codesoftware.servicio.facturacion.ProveedoresEntity();
			proveedorTemp.setId(proveedor.getId());
			this.facturaCompra.setValorRetencion(proveedor.getPorcRetencion());
			this.facturaCompra.setProveedor(proveedorTemp);
			this.facturaCompra.setPlazo(proveedor.getDcredito());
		}
		Integer idFactura = logica.insertaFactura(this.facturaCompra);
		this.facturaCompra.setId(idFactura);
		insertaProductos();

	}

	/**
	 * metodo que inserta los productos de la factura de compra
	 */
	public void insertaProductos() {
		if (listaProductos != null && listaProductos.size() != 0) {
			if (this.facturaCompra.getId() != 0 && this.facturaCompra.getId() != null) {
				this.listaProductos = logica.insertaProductosFactCompra(this.listaProductos, this.facturaCompra.getId());
			}
		}
	}

	/**
	 * metodo que actualiza la factura temporal
	 */
	public void actualizaFacturaTmp() {
		if (proveedor != null) {
			co.com.codesoftware.servicio.facturacion.ProveedoresEntity proveedorTemp = new co.com.codesoftware.servicio.facturacion.ProveedoresEntity();
			proveedorTemp.setId(proveedor.getId());
			this.facturaCompra.setProveedor(proveedorTemp);
			this.facturaCompra.setPlazo(proveedor.getDcredito());
			this.facturaCompra.setValorRetencion(proveedor.getPorcRetencion());
		}
		this.facturaCompra = logica.actualizaFactura(this.facturaCompra);
		insertaProductos();
	}

	/**
	 * funcion que muestra el mensaje de proveedor
	 */
	public void seleccionaProveedor(ProveedoresEntity objEntity) {
		proveedor = objEntity;
		this.messageBean("Proveedor " + proveedor.getNombre() + " adicionado correctamente.", ErrorEnum.SUCCESS);
	}

	/**
	 * funcion que setea los objetos
	 */
	public void seteaObjeto() {
		if (this.fechaFact != null) {
			this.facturaCompra.setFechaFacCompra(Utilitites.dateToXMLGC(fechaFact));
		}
		if (this.fechaRec != null) {
			this.facturaCompra.setFechaRecepcion(Utilitites.dateToXMLGC(fechaFact));
		}
		if (this.idSede != null) {
			SedeEntity sede = new SedeEntity();
			sede.setId(this.idSede);
			this.facturaCompra.setSede(sede);
		}
		if (proveedor.getDcredito() != null) {
			this.facturaCompra.setPlazo(proveedor.getDcredito());
		}
		if (proveedor.getPorcRetencion() != null) {
			this.facturaCompra.setPorcRetencion(proveedor.getPorcRetencion());
		}
		if (this.objetoSesion != null) {
			this.facturaCompra.setUsuario(objetoSesion.getId());
		}

	}

	/**
	 * metodo que busca el producto por codigo externo
	 */
	public void busquedaProducto() {
		try {
			if (this.codConExterno != null && !"".equalsIgnoreCase(this.codConExterno)) {
				this.productoBusqueda = logica.consultaProductoXcodigoExt(this.codConExterno);
				if (this.productoBusqueda.getProducto() == null) {
					this.messageBean("Producto inexistente", ErrorEnum.ERROR);
				}
			}
		} catch (Exception e) {
			messageBean("Producto inexistente", ErrorEnum.ERROR);
		}

	}

	/**
	 * metodo que adiciona un producto a la lista
	 */
	public void adicionaProductoLista() {
		String mensajeInventareable = "";
		try {
			boolean validacion = true;
			if (this.codConExterno == null || "".equalsIgnoreCase(this.codConExterno)) {
				this.messageBean("El codigo externo no puede ser nulo", ErrorEnum.ERROR);
				validacion = false;
			} else if (this.cantidad == null || this.cantidad == 0) {
				this.messageBean("La cantidad no es valida", ErrorEnum.ERROR);
				validacion = false;
			}
			if (this.productoBusqueda.getProducto() != null && validacion) {
				if (this.listaProductos == null) {
					this.listaProductos = new ArrayList<>();
				}
				if ("N".equalsIgnoreCase(this.inventareable)) {
					mensajeInventareable = logica.validaProductoInventareable(this.productoBusqueda.getProducto().getId());
					this.productoBusqueda.setCantidadInventariable(this.cantidadInventariable);
					this.productoBusqueda.setInventariable("N");

				} else {
					this.productoBusqueda.setCantidadInventariable(0);
					this.productoBusqueda.setInventariable("S");
					this.cantidadInventariable = 0;
				}
				if (mensajeInventareable.startsWith("Error")) {
					messageBean(mensajeInventareable, ErrorEnum.ERROR);
				} else if (this.cantidadInventariable > this.cantidad) {
					messageBean("Error, la cantidad no inventareable no puede superar la cantidad total del producto", ErrorEnum.ERROR);
				} else {
					this.listaProductos = logica.adicionaProductoLista(this.listaProductos, this.productoBusqueda, cantidad, porcentajeIva, valorProducto, this.cantidadInventariable);
					this.cantidad = 0;
					this.porcentajeIva = new BigDecimal("0");
					this.valorProducto = new BigDecimal("0");
					this.codConExterno = "";
					this.inventareable = "S";
					this.cantidadInventariable = 0;
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("ocultaPanel();");

				}
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				messageBean("Producto inexistente", ErrorEnum.ERROR);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que selecciona un producto
	 * 
	 * @param producto
	 */
	public void seleccionaProducto(ProductoSimpleEntity producto) {
		this.codConExterno = producto.getCodigoExt();
	}

	/**
	 * metodo que borra un item de la lista de productos
	 */
	public void borraItem(Integer id) {
		for (int i = 0; i < this.listaProductos.size(); i++) {
			if (listaProductos.get(i).getProducto().getId() == id) {
				listaProductos.remove(i);
				break;
			}
		}
	}

	/**
	 * ajax necesario para los calendar
	 */
	public void ajaxCarga() {
	}

	/**
	 * Mmetodo que setea el proveedor de una entidad a otra
	 * 
	 * @param objeto
	 */
	public void seteaProveedor(co.com.codesoftware.servicio.facturacion.ProveedoresEntity objeto) {
		try {
			this.proveedor = new ProveedoresEntity();
			CiudadEntity entidadCiudad = new CiudadEntity();
			entidadCiudad.setCodigo(objeto.getCiudad().getCodigo());
			entidadCiudad.setDepartamento(objeto.getCiudad().getDepartamento());
			entidadCiudad.setDescripcion(objeto.getCiudad().getDescripcion());
			entidadCiudad.setId(objeto.getCiudad().getId());
			entidadCiudad.setNombre(objeto.getCiudad().getNombre());
			if (this.proveedor == null) {
				this.proveedor = new ProveedoresEntity();
			}
			this.proveedor.setCiudad(entidadCiudad);
			this.proveedor.setDcredito(this.facturaCompra.getPlazo());
			this.proveedor.setPorcRetencion(this.facturaCompra.getProveedor().getPorcRetencion());
			this.proveedor.setNit(this.facturaCompra.getProveedor().getNit());
			this.proveedor.setDverificacion(this.facturaCompra.getProveedor().getDverificacion());
			this.proveedor.setNombre(this.facturaCompra.getProveedor().getNombre());
			this.proveedor.setId(this.facturaCompra.getProveedor().getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * metodo que llama al procedimiento almacenado de factura de compra
	 */
	public String terminaTransaccion() {
		String rta = "";
		if (validaDatos()) {
			String mensaje = logica.ejecutaProcedimientoFactCompra(this.facturaCompra.getId());
			if (mensaje.startsWith("Error")) {
				messageBean(mensaje, ErrorEnum.ERROR);
			} else {
				messageBean(mensaje, ErrorEnum.SUCCESS);
				rta = "/ACTION/PRODUCTOS/consultaFacturaCompras?faces-redirect=false";
			}
		}
		return rta;

	}

	/**
	 * metodo que actualiza los datos de pago y luego los consulta
	 */
	public void consultaPagos() {
		// M-001
		if (validaDatos()) {
			String mensaje = logica.ejecutaProcedimientoVerTotal(this.facturaCompra.getId());
			if (mensaje.startsWith("Error")) {
				messageBean(mensaje, ErrorEnum.ERROR);
			} else {
				this.facturaCompraTmp = logica.consultaFacturaID(this.facturaCompra.getId());
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('datosPago').show();");
			}
		}
		// M-001
	}

	/**
	 * metodo que valida obligatoriedad de los datos
	 * 
	 * @return
	 */
	public boolean validaDatos() {
		autoGuardado();
		if (this.fechaFact == null) {
			messageBean("Fecha de factura no puede ir vacio", ErrorEnum.ERROR);
			return false;

		}
		if (this.fechaRec == null) {
			messageBean("Fecha de recepción no puede ir vacio", ErrorEnum.ERROR);
			return false;
		}
		if (this.proveedor.getDcredito() == null || this.proveedor.getDcredito() == 0) {
			messageBean("Plazo no puede ir vacio ni puede ser 0 ", ErrorEnum.ERROR);
			return false;
		}
		if (this.proveedor.getPorcRetencion() == null) {
			messageBean("Porcentaje retención no puede ir nulo ", ErrorEnum.ERROR);
			return false;
		}
		if (this.listaProductos == null || this.listaProductos.size() < 1) {
			messageBean("debe añadir por lo menos un producto ", ErrorEnum.ERROR);
			return false;
		}
		if (this.facturaCompra.getNumeroFactura() == null || "".equalsIgnoreCase(this.facturaCompra.getNumeroFactura())) {
			messageBean("debe ingresar el número de factura ", ErrorEnum.ERROR);
			return false;
		}
		if (this.facturaCompra.getValorFacura() == null || this.facturaCompra.getValorFacura() == new BigDecimal(0)) {
			messageBean("debe ingresar el valor de factura ", ErrorEnum.ERROR);
			return false;
		}
		if (this.facturaCompra.getSede() == null) {
			messageBean("debe ingresar la sede ", ErrorEnum.ERROR);
			return false;
		}
		return true;
	}

	/**
	 * Funcion con la cual obtengo la lista de proveedores
	 */
	public void consultaProveedores() {
		try {
			ProveedoresLogica objLogica = new ProveedoresLogica();
			this.listaProveedores = objLogica.buscaProveedores();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cambiaCombo(AjaxBehaviorEvent event) {
		this.cantidadInventariable = 0;
	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {

	}

	public FacturaCompraTmpEntity getFacturaCompra() {
		return facturaCompra;
	}

	public void setFacturaCompra(FacturaCompraTmpEntity facturaCompra) {
		this.facturaCompra = facturaCompra;
	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

	public String getFechaGuardado() {
		return fechaGuardado;
	}

	public void setFechaGuardado(String fechaGuardado) {
		this.fechaGuardado = fechaGuardado;
	}

	public Integer getIdSede() {
		return idSede;
	}

	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public Date getFechaFact() {
		return fechaFact;
	}

	public void setFechaFact(Date fechaFact) {
		this.fechaFact = fechaFact;
	}

	public Date getFechaRec() {
		return fechaRec;
	}

	public void setFechaRec(Date fechaRec) {
		this.fechaRec = fechaRec;
	}

	public ProveedoresEntity getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedoresEntity proveedor) {
		this.proveedor = proveedor;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public String getCodConExterno() {
		return codConExterno;
	}

	public void setCodConExterno(String codConExterno) {
		this.codConExterno = codConExterno;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPorcentajeIva() {
		return porcentajeIva;
	}

	public void setPorcentajeIva(BigDecimal porcentajeIva) {
		this.porcentajeIva = porcentajeIva;
	}

	public BigDecimal getValorProducto() {
		return valorProducto;
	}

	public void setValorProducto(BigDecimal valorProducto) {
		this.valorProducto = valorProducto;
	}

	public ProdFacCompraTmpEntity getProductoBusqueda() {
		return productoBusqueda;
	}

	public void setProductoBusqueda(ProdFacCompraTmpEntity productoBusqueda) {
		this.productoBusqueda = productoBusqueda;
	}

	public List<ProdFacCompraTmpEntity> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<ProdFacCompraTmpEntity> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public List<ProdFacCompraTmpEntity> getListaProductosFiltro() {
		return listaProductosFiltro;
	}

	public void setListaProductosFiltro(List<ProdFacCompraTmpEntity> listaProductosFiltro) {
		this.listaProductosFiltro = listaProductosFiltro;
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

	public FacturaCompraTmpEntity getFacturaCompraTmp() {
		return facturaCompraTmp;
	}

	public void setFacturaCompraTmp(FacturaCompraTmpEntity facturaCompraTmp) {
		this.facturaCompraTmp = facturaCompraTmp;
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public List<ProveedoresEntity> getListaProveedores() {
		return listaProveedores;
	}

	public void setListaProveedores(List<ProveedoresEntity> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}

	public List<ProveedoresEntity> getListaProveedoresFiltered() {
		return listaProveedoresFiltered;
	}

	public void setListaProveedoresFiltered(List<ProveedoresEntity> listaProveedoresFiltered) {
		this.listaProveedoresFiltered = listaProveedoresFiltered;
	}

	public String getInventareable() {
		return inventareable;
	}

	public void setInventareable(String inventareable) {
		this.inventareable = inventareable;
	}

	public Integer getCantidadInventariable() {
		return cantidadInventariable;
	}

	public void setCantidadInventariable(Integer cantidadInventariable) {
		this.cantidadInventariable = cantidadInventariable;
	}

}
