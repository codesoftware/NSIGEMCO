package co.com.codesoftware.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.model.UploadedFile;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.entity.ProductoFactCompraEntity;
import co.com.codesoftware.entity.ProductoGenerico;
import co.com.codesoftware.entity.RespuestaReteEntity;
import co.com.codesoftware.logica.FacturaCompraLogica;
import co.com.codesoftware.logica.ProductosLogica;
import co.com.codesoftware.logica.ReferenciaLogica;
import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.server.nsigemco.FacturaCompraEntity;
import co.com.codesoftware.server.nsigemco.PagoFacCompraEntity;
import co.com.codesoftware.server.nsigemco.ProductoEntity;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.server.nsigemco.PucEntity;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.server.nsigemco.SubCuentaEntity;
import co.com.codesoftware.server.productos.ProductoSimpleEntity;
import co.com.codesoftware.utilities.ErrorEnum;

@ManagedBean
@ViewScoped
public class FacturaCompraBean implements Serializable {
	private ErrorEnum enumer;
	private static final long serialVersionUID = 1L;
	private ProveedoresEntity proveedor;
	private SubCuentaEntity subcuenta;
	private FacturaCompraEntity facturaCompra;
	private UploadedFile pdfFactura;
	private Integer idRetefuente;
	private PagoFacCompraEntity pagos;
	private Date fechaFactura;
	private Date maxDate;
	private Date fechaRecepcion;
	private List<ProductoFactCompraEntity> listaProductos;
	private String mensajeRespuesta;
	private BigDecimal reteFuente;
	private BigDecimal totalPagar;
	private Integer idSede;
	private ArrayList<PucEntity> datosSub;
	private BigDecimal ajustePeso;
	// Datos para las consultas basica
	private String codConExterno;
	private String codConBarras;
	private String desConsBasica;
	// Datos para la consulta secundaria
	private CategoriaEntity catConsSec;
	private ReferenciaEntity refConsSec;
	private String marConsSec;
	// Lista con los resultados de los productos
	private List<ProductoEntity> resultadoConsulta;
	private List<ProductoEntity> filteredConsulta;
	private List<ProductoFactCompraEntity> filteredConsPrinc;
	private ProductoEntity productoEntity;
	// Lista de productos seleccionados por el usuario para crear la factura
	private List<ProductoGenerico> listaGeneralProd;
	// Lista para la consulta principal
	private List<co.com.codesoftware.server.productos.ProductoEntity> listaPrincProd;
	// Lista de pagos
	private List<PagoFacCompraEntity> listaPagos;
	@ManagedProperty("#{filtrosService}")
	private FiltrosServiceBean filtrosService;
	private Integer numeroCuotas;
	private String idSubcuenta;
	private BigDecimal totalPagos;
	private BigDecimal totalPrecioProd;
	private BigDecimal totalIva;
	private BigDecimal totalSumaIvaPrecio;
	private BigDecimal totalRedondeado;
	private BigDecimal ajusteFactura;
	private List<ProductoSimpleEntity> productosConsulta;
	private List<ProductoSimpleEntity> productosConsultaFiltered;

	private String codigoAuxiliar;

	/**
	 * Constructor de la clase
	 */
	public FacturaCompraBean() {
		this.proveedor = new ProveedoresEntity();
		this.resultadoConsulta = new ArrayList<ProductoEntity>();
		this.facturaCompra = new FacturaCompraEntity();
		FacturaCompraLogica logica = new FacturaCompraLogica();
		pagos = new PagoFacCompraEntity();
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("ocultarPaneles();");
		this.maxDate = new Date();
		if (this.productosConsulta == null) {
			this.productosConsulta = new ArrayList<>();
		}
		this.productosConsulta = logica.consultaProductos();
	}

	public void ajaxCarga() {

	}

	/**
	 * metodo que realiza la validacion final
	 */
	public void adicionaFactura() {
		try {
			sumaValoresProducto();
			this.facturaCompra.setValorFacura(this.totalPrecioProd);
			this.facturaCompra.setValorIva(this.totalIva);
			FacturaCompraLogica logica = new FacturaCompraLogica();
			String rta = logica.validaDatosPanel1(this.facturaCompra, this.fechaFactura, this.fechaRecepcion,
					this.proveedor, this.idSede);
			RespuestaReteEntity respuestaRete = new RespuestaReteEntity();
			respuestaRete = logica.consultaRetefuente(this.facturaCompra, this.proveedor);

			if ("OK".equalsIgnoreCase(rta)) {
				rta = logica.validaPagosReteFuente(this.listaPagos, this.facturaCompra, respuestaRete.getRespuesta());
				if ("OK".equalsIgnoreCase(rta)) {
					this.ajustePeso = logica.consultaValorAjuste();
					this.ajusteFactura = logica.getValorAjuste();
					// rta = logica.validaPagos(this.listaPagos,
					// this.facturaCompra);
					if ("OK".equalsIgnoreCase(rta)) {
						rta = logica.validaProductos(this.listaProductos, this.facturaCompra);
						if ("OK".equalsIgnoreCase(rta)) {
							this.mensajeRespuesta = respuestaRete.getMensaje();
							this.facturaCompra.setValorRetencion(respuestaRete.getRespuesta());
							this.reteFuente = respuestaRete.getRespuesta();
							this.setTotalPagar((this.facturaCompra.getValorFacura().subtract(this.reteFuente)
									.add(this.facturaCompra.getValorIva())));
							RequestContext context = RequestContext.getCurrentInstance();
							context.execute("PF('consultaRete').show();");
						} else {
							this.setEnumer(ErrorEnum.ERROR);
							this.messageBean(rta);
						}
					} else {
						this.setEnumer(ErrorEnum.ERROR);
						this.messageBean(rta);
					}
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean(rta);
				}

			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(rta);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * metodo el cual envia al xhtml de consulta de facturas de compra o si
	 * ocurre algún error lo informa
	 * 
	 * @return
	 */
	public String ingresaFacturaFinal() {
		String paginacion = "";
		try {

			RequestContext context = RequestContext.getCurrentInstance();
			context.execute("PF('consultaRete').hide();");
			FacturaCompraLogica logica = new FacturaCompraLogica();
			String ajustePeso = "N";

			if (new BigDecimal(0) != this.ajusteFactura && this.ajusteFactura != null) {
				ajustePeso = "S";
			}

			RespuestaEntity respuesta = logica.insertaFacturaCompra(fechaFactura, fechaRecepcion, this.facturaCompra,
					this.listaPagos, this.listaProductos, this.proveedor, this.idSede, 1, ajustePeso);
			if (respuesta.getCodigoRespuesta() == 1) {
				context.execute("PF('statusDialog').hide();");
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("INSERTO FACTURA CORRECTAMENTE");
				paginacion = "consultaFacturaCompras?faces-redirect=false";

			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(respuesta.getMensajeRespuesta());
				context.execute("PF('statusDialog').hide();");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return paginacion;
	}

	public ProveedoresEntity getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedoresEntity proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * funcion en la cual se indica cual subcuenta fue seleccionada
	 */
	public void consultaSubCuenta() {
		this.setEnumer(ErrorEnum.SUCCESS);
		this.messageBean("Subcuenta " + subcuenta.getDescripcion() + " Seleccionada");
	}

	/**
	 * Funcion con la cual indico que se selecciono un proveedor
	 */
	public void seleccionaProveedor() {
		this.setEnumer(ErrorEnum.SUCCESS);
		this.messageBean("Proveedor " + proveedor.getNombre() + " adicionado correctamente.");
	}

	/**
	 * funcion que adiciona un pago y realiza la validacion de subcuentas ya
	 * existentes
	 */
	public void adicionaPago() {
		// String rta = validaDatosPago();
		if (validaDatosPag()) {
			boolean bandera = false;
			if (this.listaPagos == null) {
				this.listaPagos = new ArrayList<>();
			}
			if (this.listaPagos.size() > 0) {
				for (PagoFacCompraEntity item : this.listaPagos) {
					if (item.getIdSubcuenta().getId() == subcuenta.getId()) {
						bandera = true;
						BigDecimal valor = item.getValor();
						item.setValor(valor.add(this.pagos.getValor()));
						item.setIdSubcuenta(this.subcuenta);

					}
				}
			}
			if (!bandera) {
				pagos.setId(this.listaPagos.size() + 1);
				pagos.setIdSubcuenta(subcuenta);
				this.listaPagos.add(this.pagos);
			}

			this.pagos = new PagoFacCompraEntity();
			this.subcuenta = new SubCuentaEntity();
			sumaPagos();
		}

	}

	/**
	 * funcion que calcula el total en tiempo real de los pagos
	 */
	public void sumaPagos() {
		if (this.pagos != null) {
			this.totalPagos = new BigDecimal("0");
			for (PagoFacCompraEntity item : this.listaPagos) {
				this.totalPagos = this.totalPagos.add(item.getValor());
			}
		} else {
			this.totalPagos = new BigDecimal("0");
		}
	}

	/**
	 * funcion que suma los valores de la factura
	 */
	public void sumaValoresProducto() {
		if (listaProductos != null) {
			this.totalIva = new BigDecimal(0);
			this.totalPrecioProd = new BigDecimal(0);
			this.totalSumaIvaPrecio = new BigDecimal(0);
			for (ProductoFactCompraEntity item : listaProductos) {
				if (item.getIva() == null) {
					item.setIva(new BigDecimal(0));
				}
				this.totalIva = this.totalIva
						.add((item.getSubtotal().multiply(item.getPorcentajeIva().divide(new BigDecimal(100))))
								.multiply(new BigDecimal(item.getCantidad())));
				this.totalPrecioProd = this.totalPrecioProd
						.add(item.getSubtotal().multiply(new BigDecimal(item.getCantidad())));
			}
			this.totalSumaIvaPrecio = this.totalIva.add(this.totalPrecioProd);
			this.totalRedondeado = this.totalSumaIvaPrecio.setScale(0, RoundingMode.UP);
		} else {
			this.totalIva = new BigDecimal(0);
			this.totalPrecioProd = new BigDecimal(0);
			this.totalSumaIvaPrecio = new BigDecimal(0);
		}
	}

	/**
	 * funcion que elimina el pago
	 * 
	 * @param idPago
	 */
	public void eliminaPago(Integer idPago) {
		List<PagoFacCompraEntity> listaAux = null;
		listaAux = this.listaPagos;
		try {
			if (listaAux.size() == 1) {
				listaAux.clear();
			} else {
				for (int i = 0; i < this.listaPagos.size(); i++) {
					if (listaPagos.get(i).getIdSubcuenta().getId() == idPago) {
						listaAux.remove(i);
					}
				}
			}
			this.listaPagos = listaAux;
		} catch (Exception e) {
			e.printStackTrace();
		}
		sumaPagos();

	}

	/**
	 * metodo ajax para la sede
	 * 
	 * @param event
	 */
	public void muestraSede(AjaxBehaviorEvent event) {
	}

	public void muestraPanel(AjaxBehaviorEvent event) {
		this.datosSub = new ArrayList<>();
		PucEntity puc = new PucEntity();
		RequestContext context = RequestContext.getCurrentInstance();
		if ("Tarjeta".equalsIgnoreCase(this.pagos.getTipoPago())
				|| "Cheque".equalsIgnoreCase(this.pagos.getTipoPago())) {
			puc.setClave("cuenta");
			List<Integer> val = new ArrayList<Integer>();
			val.add(2);
			puc.setValor(val);
			context.execute("ocultar('S','H');");
		} else if ("Credito".equalsIgnoreCase(this.pagos.getTipoPago())) {
			puc.setClave("cuenta");
			List<Integer> val = new ArrayList<Integer>();
			val.add(125);
			puc.setValor(val);
			context.execute("ocultar('H','S');");
		} else {
			context.execute("ocultar('H','H');");
			puc.setClave("cuenta");
			List<Integer> val = new ArrayList<Integer>();
			val.add(1);
			puc.setValor(val);
		}
		this.datosSub.add(puc);

	}

	/**
	 * funcion que valida si los datos de los pagos no vienen vacios o nulos
	 * 
	 * @return
	 */
	public boolean validaDatosPag() {
		boolean rta = false;
		try {
			if (this.pagos == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Debe ingresar un pago");
			} else if (this.pagos.getValor() == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Debe ingresar algún valor del pago");
			} else if (this.pagos.getTipoPago() == null || "".equalsIgnoreCase((this.pagos.getTipoPago()))) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Debe seleccionar un tipo de pago");
			} else if (this.subcuenta == null || this.subcuenta.getCodigo() == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Debe seleccionar una subcuenta");
			} else {
				rta = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
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

	/**
	 * Funcion con la cual busco los productos de acuerdo a las coincidencias
	 * dadas por el usuario
	 */
	public void consultaSecProductos() {
		try {
			ProductosLogica objLogica = new ProductosLogica();
			if (catConsSec == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("La categoria es obligatoria por favor ingrese una categoria");
			} else {
				if (refConsSec == null) {
					refConsSec = new ReferenciaEntity();
				}
				resultadoConsulta = null;
				resultadoConsulta = objLogica.buscaProductosXCatSubMarc(catConsSec.getId(), refConsSec.getDescripcion(),
						marConsSec);
				if (resultadoConsulta == null || resultadoConsulta.size() == 0) {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("La consulta no arrojo ningun resultado");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual se realiza la busqueda de productos de la consulta
	 * proincipal ya sea por codigos o por nombre
	 */
	public void busquedaPincipalProductos() {
		try {
			ProductosLogica objLogica = new ProductosLogica();
			if (listaProductos == null)
				listaProductos = new ArrayList<>();
			boolean existe = false;

			ProductoFactCompraEntity obj = new ProductoFactCompraEntity();
			co.com.codesoftware.server.productos.ProductoEntity objeto = new co.com.codesoftware.server.productos.ProductoEntity();
			objeto = objLogica.buscaProductosXCodONombre(codConBarras, codConExterno, "");
			for (int i = 0; i < this.listaProductos.size(); i++) {
				if (this.listaProductos.get(i).getId().longValue() == objeto.getId().longValue()) {
					existe = true;
				}
			}
			if (!existe) {
				obj.setCantidad(0);
				obj.setCodigoExterno(objeto.getCodigoExt());
				obj.setId(objeto.getId());
				obj.setIva(new BigDecimal(0));
				obj.setNombre(objeto.getDescripcion());
				obj.setSubtotal(new BigDecimal(0));
				obj.setValorTotal(new BigDecimal(0));
				obj.setPorcentajeIva(new BigDecimal(0));
				listaProductos.add(0, obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Funcion la cual funciona en el momento de que un usuarioi selecciona un
	 * item de la tabla
	 * 
	 * @param event
	 */
	public void eliminaProducto(Integer idProducto) {
		for (int i = 0; i < this.listaProductos.size(); i++) {
			if (this.listaProductos.get(i).getId() == idProducto) {
				this.listaProductos.remove(i);
			}
		}
	}

	/**
	 * Funcion en la cual adiciono un producto generico a la lista de objetos
	 */
	public void adicionoProductoListaGeneral(co.com.codesoftware.server.productos.ProductoEntity objEntity) {
		try {
			boolean banderaExiste = false;
			if (listaGeneralProd == null) {
				listaGeneralProd = new ArrayList<ProductoGenerico>();
			}
			for (ProductoGenerico item : listaGeneralProd) {
				if (item.getId() == objEntity.getId()) {
					item.setCantidad(item.getCantidad() + 1);
					banderaExiste = true;
				}
			}
			if (!banderaExiste) {
				ProductoGenerico aux = new ProductoGenerico();
				aux.setId(objEntity.getId());
				aux.setCantidad(1);
				aux.setCodigo(objEntity.getCodigo());
				aux.setIva(0);
				aux.setNombre(objEntity.getNombre());
				aux.setValorIva(new BigDecimal(0));
				listaGeneralProd.add(aux);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual obtengo las referencias asociadas basado en la
	 * categoria que selecciono previamente
	 * 
	 * @return
	 */
	public List<ReferenciaEntity> completaReferenciaXCat(String query) {
		List<ReferenciaEntity> rta = null;
		List<ReferenciaEntity> respuesta = null;
		try {
			ReferenciaLogica logica = new ReferenciaLogica();
			if (catConsSec != null) {
				rta = logica.obtieneReferenciasXcate(catConsSec.getId());
				if (query != null && query.length() != 0) {
					if (query.length() != 1) {
						for (ReferenciaEntity item : rta) {
							if ((item.getNombre().toUpperCase()).contains(query.toUpperCase())) {
								if (respuesta == null) {
									respuesta = new ArrayList<ReferenciaEntity>();
								}
								respuesta.add(item);
							}
						}
					}
				}
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por Favor seleccione una categoria antes de seleccionar una subcategoria");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	/**
	 * Funcion con la cual confirmo que selecciono una categoria en la consulta
	 * secundaria
	 */
	public void seleccionoCategoriaConsultaSec() {
		try {
			// System.out.println("Este es el id de la categoria: " +
			// objEntity.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual reseteo todos los objetos de la consulta secundaria
	 */
	public void reseteaConsulta() {
		try {
			resultadoConsulta = null;
			catConsSec = new CategoriaEntity();
			refConsSec = new ReferenciaEntity();
			;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * funcion que muestra los cambios realizados el la tabla
	 * 
	 * @param event
	 */
	public void editaCelda(CellEditEvent event) {
		String col = event.getColumn().getHeaderText();
		Integer row = event.getRowIndex();
		this.listaProductos.get(row).setIva((this.listaProductos.get(row).getPorcentajeIva()
				.multiply(this.listaProductos.get(row).getSubtotal()).divide(new BigDecimal(100))));
		this.listaProductos.get(row)
				.setValorTotal((this.listaProductos.get(row).getIva().add(this.listaProductos.get(row).getSubtotal())
						.multiply(new BigDecimal(listaProductos.get(row).getCantidad()))));
		RequestContext context = RequestContext.getCurrentInstance();
		// context.execute("ejecutaActualizacion();");
		if ("% IVA".equalsIgnoreCase(col)) {
			context.execute("rc();");
		}

	}

	/**
	 * metodo que consulta las subcuentas por filtros establecidos
	 * 
	 * @param query
	 * @return
	 */

	public List<SubCuentaEntity> completaSubCuentaFiltros(String query) {

		List<SubCuentaEntity> subcFiltrados = new ArrayList<SubCuentaEntity>();
		List<SubCuentaEntity> subcuentas = null;
		if (pagos.getTipoPago() != null) {
			// Se realiza el llamado del servicio web de busqueda de subcuentas
			subcuentas = filtrosService.serviceConsultaSubCuentaFiltros(this.datosSub);
			if (subcuentas != null) {
				for (SubCuentaEntity item : subcuentas) {
					if (subcFiltrados == null) {
						subcuentas = new ArrayList<SubCuentaEntity>();
					}
					if (item.getNombre().toUpperCase().contains(query.toUpperCase())) {
						subcFiltrados.add(item);
					}
				}
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("No existe ninguna subcuenta registrada en la base de datos.");
			}
		} else {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("Primero debe seleccionar el tipo de pago.");
		}

		return subcFiltrados;
	}

	public void consultaTotales() {
		sumaValoresProducto();
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('conPagos').show();");
	}

	public void ajaxOnBlurTabla() {

	}

	public void seleccionaProducto(ProductoSimpleEntity producto) {
		this.codigoAuxiliar = producto.getCodigoExt();
	}

	public void actualizaTotales() {
		BigDecimal totalPago = new BigDecimal("0");
		BigDecimal ivaUnidad = new BigDecimal("0");
		BigDecimal total = new BigDecimal("0");
		for (int i = 0; i < this.listaProductos.size(); i++) {
			ivaUnidad = listaProductos.get(i).getSubtotal()
					.multiply((listaProductos.get(i).getPorcentajeIva().divide(new BigDecimal(100))));
			System.out.println(ivaUnidad);
			total = (listaProductos.get(i).getSubtotal().add(ivaUnidad))
					.multiply(new BigDecimal(listaProductos.get(i).getCantidad()));
			System.out.println(total);
			this.listaProductos.get(i).setIva(ivaUnidad);
			this.listaProductos.get(i).setValorTotal(total);

			totalPago = totalPago.add(total);
		}
		this.totalSumaIvaPrecio = totalPago;
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

	public String getCodConBarras() {
		return codConBarras;
	}

	public void setCodConBarras(String codConBarras) {
		this.codConBarras = codConBarras;
	}

	public String getDesConsBasica() {
		return desConsBasica;
	}

	public void setDesConsBasica(String desConsBasica) {
		this.desConsBasica = desConsBasica;
	}

	public CategoriaEntity getCatConsSec() {
		return catConsSec;
	}

	public void setCatConsSec(CategoriaEntity catConsSec) {
		this.catConsSec = catConsSec;
	}

	public ReferenciaEntity getRefConsSec() {
		return refConsSec;
	}

	public void setRefConsSec(ReferenciaEntity refConsSec) {
		this.refConsSec = refConsSec;
	}

	public String getMarConsSec() {
		return marConsSec;
	}

	public void setMarConsSec(String marConsSec) {
		this.marConsSec = marConsSec;
	}

	public List<ProductoEntity> getResultadoConsulta() {
		return resultadoConsulta;
	}

	public void setResultadoConsulta(List<ProductoEntity> resultadoConsulta) {
		this.resultadoConsulta = resultadoConsulta;
	}

	public List<ProductoEntity> getFilteredConsulta() {
		return filteredConsulta;
	}

	public void setFilteredConsulta(List<ProductoEntity> filteredConsulta) {
		this.filteredConsulta = filteredConsulta;
	}

	public ProductoEntity getProductoEntity() {
		return productoEntity;
	}

	public void setProductoEntity(ProductoEntity productoEntity) {
		this.productoEntity = productoEntity;
	}

	public List<ProductoGenerico> getListaGeneralProd() {
		return listaGeneralProd;
	}

	public void setListaGeneralProd(List<ProductoGenerico> listaGeneralProd) {
		this.listaGeneralProd = listaGeneralProd;
	}

	public List<co.com.codesoftware.server.productos.ProductoEntity> getListaPrincProd() {
		return listaPrincProd;
	}

	public void setListaPrincProd(List<co.com.codesoftware.server.productos.ProductoEntity> listaPrincProd) {
		this.listaPrincProd = listaPrincProd;
	}

	// John

	public SubCuentaEntity getSubcuenta() {
		return subcuenta;
	}

	public List<ProductoFactCompraEntity> getFilteredConsPrinc() {
		return filteredConsPrinc;
	}

	public void setFilteredConsPrinc(List<ProductoFactCompraEntity> filteredConsPrinc) {
		this.filteredConsPrinc = filteredConsPrinc;
	}

	public void setSubcuenta(SubCuentaEntity subcuenta) {
		this.subcuenta = subcuenta;
	}

	public FacturaCompraEntity getFacturaCompra() {
		return facturaCompra;
	}

	public void setFacturaCompra(FacturaCompraEntity facturaCompra) {
		this.facturaCompra = facturaCompra;
	}

	public UploadedFile getPdfFactura() {
		return pdfFactura;
	}

	public void setPdfFactura(UploadedFile pdfFactura) {
		this.pdfFactura = pdfFactura;
	}

	public Integer getIdRetefuente() {
		return idRetefuente;
	}

	public void setIdRetefuente(Integer idRetefuente) {
		this.idRetefuente = idRetefuente;
	}

	public PagoFacCompraEntity getPagos() {
		return pagos;
	}

	public void setPagos(PagoFacCompraEntity pagos) {
		this.pagos = pagos;
	}

	public List<PagoFacCompraEntity> getListaPagos() {
		return listaPagos;
	}

	public void setListaPagos(List<PagoFacCompraEntity> listaPagos) {
		this.listaPagos = listaPagos;
	}

	public List<ProductoFactCompraEntity> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<ProductoFactCompraEntity> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}

	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}

	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}

	public BigDecimal getReteFuente() {
		return reteFuente;
	}

	public void setReteFuente(BigDecimal reteFuente) {
		this.reteFuente = reteFuente;
	}

	public BigDecimal getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(BigDecimal totalPagar) {
		this.totalPagar = totalPagar;
	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

	public Integer getIdSede() {
		return idSede;
	}

	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public FiltrosServiceBean getFiltrosService() {
		return filtrosService;
	}

	public void setFiltrosService(FiltrosServiceBean filtrosService) {
		this.filtrosService = filtrosService;
	}

	public ArrayList<PucEntity> getDatosSub() {
		return datosSub;
	}

	public void setDatosSub(ArrayList<PucEntity> datosSub) {
		this.datosSub = datosSub;
	}

	public Integer getNumeroCuotas() {
		return numeroCuotas;
	}

	public void setNumeroCuotas(Integer numeroCuotas) {
		this.numeroCuotas = numeroCuotas;
	}

	public String getIdSubcuenta() {
		return idSubcuenta;
	}

	public void setIdSubcuenta(String idSubcuenta) {
		this.idSubcuenta = idSubcuenta;
	}

	public BigDecimal getTotalPagos() {
		return totalPagos;
	}

	public void setTotalPagos(BigDecimal totalPagos) {
		this.totalPagos = totalPagos;
	}

	public BigDecimal getTotalPrecioProd() {
		return totalPrecioProd;
	}

	public void setTotalPrecioProd(BigDecimal totalPrecioProd) {
		this.totalPrecioProd = totalPrecioProd;
	}

	public BigDecimal getTotalIva() {
		return totalIva;
	}

	public void setTotalIva(BigDecimal totalIva) {
		this.totalIva = totalIva;
	}

	public BigDecimal getTotalSumaIvaPrecio() {
		return totalSumaIvaPrecio;
	}

	public void setTotalSumaIvaPrecio(BigDecimal totalSumaIvaPrecio) {
		this.totalSumaIvaPrecio = totalSumaIvaPrecio;
	}

	public BigDecimal getTotalRedondeado() {
		return totalRedondeado;
	}

	public void setTotalRedondeado(BigDecimal totalRedondeado) {
		this.totalRedondeado = totalRedondeado;
	}

	public BigDecimal getAjustePeso() {
		return ajustePeso;
	}

	public void setAjustePeso(BigDecimal ajustePeso) {
		this.ajustePeso = ajustePeso;
	}

	public BigDecimal getAjusteFactura() {
		return ajusteFactura;
	}

	public void setAjusteFactura(BigDecimal ajusteFactura) {
		this.ajusteFactura = ajusteFactura;
	}

	public List<ProductoSimpleEntity> getProductosConsulta() {
		return productosConsulta;
	}

	public void setProductosConsulta(List<ProductoSimpleEntity> productosConsulta) {
		this.productosConsulta = productosConsulta;
	}

	public String getCodigoAuxiliar() {
		return codigoAuxiliar;
	}

	public void setCodigoAuxiliar(String codigoAuxiliar) {
		this.codigoAuxiliar = codigoAuxiliar;
	}

	public List<ProductoSimpleEntity> getProductosConsultaFiltered() {
		return productosConsultaFiltered;
	}

	public void setProductosConsultaFiltered(List<ProductoSimpleEntity> productosConsultaFiltered) {
		this.productosConsultaFiltered = productosConsultaFiltered;
	}

}
