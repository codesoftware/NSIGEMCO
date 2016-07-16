package co.com.codesoftware.logica;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import co.com.codesoftware.entity.ProductoFactCompraEntity;
import co.com.codesoftware.entity.RespuestaReteEntity;
import co.com.codesoftware.server.nsigemco.FacturaCompraEntity;
import co.com.codesoftware.server.nsigemco.PagoFacCompraEntity;
import co.com.codesoftware.server.nsigemco.ProductoEntity;
import co.com.codesoftware.server.nsigemco.ProductoFacCompraEntity;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.server.nsigemco.SedeEntity;
import co.com.codesoftware.server.productos.FacturaCompraGeneralEntity;
import co.com.codesoftware.server.productos.FacturaCompraTotalEntity;
import co.com.codesoftware.server.productos.ImagenesFacCompraEntity;
import co.com.codesoftware.server.productos.ProductoSimpleEntity;
import co.com.codesoftware.servicio.facturacion.MoviContableEntity;
import co.com.codesoftware.servicio.general.ParametrosEmpresaEntity;
import co.com.codesoftware.utilities.Utilitites;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class FacturaCompraLogica implements WSGeneralInterface {
	InputStream file;
	private BigDecimal valorAjuste;

	public String validaCargaPrecio(List<PagoFacCompraEntity> listaPago, BigDecimal valorFactura, BigDecimal valorIva,
			BigDecimal pago) {
		String respuesta = "OK";
		try {
			System.out.println("iva" + valorIva + " total" + valorFactura);
			// verifica que el valor de la factura este correcto
			if (valorFactura == null || valorFactura == new BigDecimal(0) || valorIva == null
					|| valorIva == new BigDecimal(0)) {
				respuesta = "ERROR, VALOR DE LA FACTURA NO VÁLIDO";
			} else {
				BigDecimal resSubtotal = new BigDecimal(0);
				// Suma los valores de los pagos para comprar si supera el valor
				// de la factura
				for (PagoFacCompraEntity item : listaPago) {
					resSubtotal = resSubtotal.add(item.getValor());
				}
				int comparate = resSubtotal.add(pago).compareTo(valorFactura.add(valorIva));
				if (comparate == 1) {
					respuesta = "ERROR, LOS PAGOS SUPERAN EL VALOR DE LA FACTURA";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return respuesta;

	}

	/**
	 * funcion que verifica si los datos del panel 1 son correctos
	 * 
	 * @param factura
	 * @param fecha1
	 * @param fecha2
	 * @param proveedor
	 * @return
	 */
	public String validaDatosPanel1(FacturaCompraEntity factura, Date fecha1, Date fecha2, ProveedoresEntity proveedor,
			Integer idSede) {
		String rta = "OK";
		try {
			if (fecha2 == null || fecha1 == null) {
				rta = "ERROR, FECHAS NO VALIDAS";
			} else if (factura.getNumeroFactura().isEmpty() || factura.getNumeroFactura() == "") {
				rta = "ERROR, NUMERO DE FACTURA NO VALIDO";
			} else if (proveedor == null || proveedor.getId() == null || proveedor.getId() == 0) {
				rta = "ERROR, DEBE INGRESAR UN PROVEEDOR	";
			} else if (idSede == null || idSede == -1 || idSede == 0) {
				rta = "ERROR, DEBE INGRESAR UNA SEDE";
			}
		} catch (Exception e) {
			e.printStackTrace();
			rta = "ERROR, NO HA INGRESADO NINGUN DATO DE LA FACTURA";
		}
		return rta;
	}

	/**
	 * funcion que valida los pagos
	 * 
	 * @param lista
	 * @param factura
	 * @return
	 */
	public String validaPagos(List<PagoFacCompraEntity> lista, FacturaCompraEntity factura) {
		String rta = "OK";
		try {
			BigDecimal pagos = new BigDecimal(0);
			for (PagoFacCompraEntity item : lista) {
				pagos = pagos.add(item.getValor());
			}
			if (factura.getValorFacura().add(factura.getValorIva()).compareTo(pagos) != -1) {
				rta = "ERROR, LOS PAGOS SUPERAN EL VALOR DE LA FACTURA. "
						+ factura.getValorFacura().add(factura.getValorIva()) + " VALOR PAGOS: " + pagos;
			}
		} catch (Exception e) {
			e.printStackTrace();
			rta = "ERROR, NO HA INGRESADO NINGUN PAGO";
		}
		return rta;
	}

	/**
	 * metodo que consulta el valor parametrizdo del ajuste al peso
	 * 
	 * @return
	 */
	public BigDecimal consultaValorAjuste() {
		BigDecimal rta = new BigDecimal("0");
		try {
			List<ParametrosEmpresaEntity> lista = conexionWSGeneral().getPortGeneral().obtenerParametrosEmpresa();
			for (ParametrosEmpresaEntity item : lista) {
				if ("VALORAJUSTEPESO".equalsIgnoreCase(item.getClave())) {
					rta = new BigDecimal(item.getValor());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	public String validaPagosReteFuente(List<PagoFacCompraEntity> lista, FacturaCompraEntity factura,
			BigDecimal retefuente) {
		String rta = "OK";
		try {
			BigDecimal pagos = new BigDecimal(0);
			for (PagoFacCompraEntity item : lista) {
				pagos = pagos.add(item.getValor());
			}

			BigDecimal ajuste = consultaValorAjuste();
			BigDecimal valorFact = new BigDecimal("0");
			if ((factura.getValorFacura().add(factura.getValorIva().subtract(retefuente))).compareTo(pagos) != 0) {
				valorFact = factura.getValorFacura().add(factura.getValorIva().subtract(retefuente)).subtract(pagos);
				System.out.println("ajuste" + valorFact);
				if ((valorFact).compareTo(ajuste) == -1 && (valorFact).compareTo(ajuste.negate()) == 1) {
					valorAjuste= valorFact;
					System.out.println("XxxX"+this.valorAjuste);
				} else {
					rta = "ERROR, LOS PAGOS NO COINCIDEN. LA FACTURA DEBE PAGAR RETEFUENTE  " + retefuente
							+ " . VALOR A PAGAR"
							+ factura.getValorFacura().add(factura.getValorIva().subtract(retefuente))
							+ " VALOR PAGOS: " + pagos;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			rta = "ERROR, NO HA INGRESADO NINGUN PAGO";
		}
		return rta;
	}

	/**
	 * funcion que consulta los datos de los productos y verifica si cumplr con
	 * las caracteristicas
	 * 
	 * @param lista
	 * @param factura
	 * @return
	 */
	public String validaProductos(List<ProductoFactCompraEntity> lista, FacturaCompraEntity factura) {
		String rta = "OK";
		try {
			BigDecimal costos = new BigDecimal(0);
			for (ProductoFactCompraEntity item : lista) {
				costos = costos.add(item.getValorTotal());
			}
			if (factura.getValorFacura().add(factura.getValorIva()).compareTo(costos) != 0) {
				rta = "ERROR, LOS COSTOS DE LOS PRODUCTOS NO COINCIDEN. VALOR FACTURA: "
						+ factura.getValorFacura().add(factura.getValorIva()) + " VALOR COSTOS: " + costos;
			}
		} catch (Exception e) {
			rta = "ERROR NO A INGRESADO NINGUN PRODUCTO";
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo que consulta si se debe hacer retefuente o no
	 * 
	 * @param factura
	 * @param proveedor
	 * @return
	 */
	public RespuestaReteEntity consultaRetefuente(FacturaCompraEntity factura, ProveedoresEntity proveedor) {
		RespuestaReteEntity rta = new RespuestaReteEntity();
		System.out.println(proveedor.getRetenciones().getBaseUvt());
		try {
			if ("S".equalsIgnoreCase(proveedor.getGranContribuyente())) {
				rta.setMensaje("EL PROVEEDOR " + proveedor.getNombre()
						+ " NO SE LE HACE RETEFUENTE YA QUE ES GRAN CONTRIBUYENTE");
				rta.setRespuesta(new BigDecimal(0));
			} else {
				if ((factura.getValorFacura().add(factura.getValorIva()))
						.compareTo(proveedor.getRetenciones().getBasePesos()) != 1) {
					rta.setMensaje("EL PROVEEDOR " + proveedor.getNombre()
							+ " NO SE LE HACE RETEFUENTE YA QUE EL VALOR DE LA FACTURA NO SUPERA LA BASE "
							+ proveedor.getRetenciones().getBasePesos());
					rta.setRespuesta(new BigDecimal(0));
				} else {
					BigDecimal rete = ((factura.getValorFacura().multiply(proveedor.getRetenciones().getTarifa()))
							.divide(new BigDecimal(100)));
					rta.setMensaje("SE DEBE REALIZAR UNA RETENCIÓN EN LA FUENTE DE " + rete + " AL PROVEEDOR "
							+ proveedor.getNombre());
					rta.setRespuesta(rete);
				}
			}
		} catch (Exception e) {
			rta.setMensaje("ERROR CONSULTANDO PROVEEDOR");
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo que inserta los datos de factura de compra
	 * 
	 * @param fechaFactura
	 * @param fechaRecepcion
	 * @param factura
	 * @param pagos
	 * @param productos
	 * @return
	 */
	public RespuestaEntity insertaFacturaCompra(Date fechaFactura, Date fechaRecepcion, FacturaCompraEntity factura,
			List<PagoFacCompraEntity> pagos, List<ProductoFactCompraEntity> productos, ProveedoresEntity proovedor,
			Integer idSede, Integer usuario,String ajustePeso) {
		System.out.println("ajuste"+ajustePeso);
		RespuestaEntity rta = new RespuestaEntity();
		try {
			SedeEntity sede = new SedeEntity();
			sede.setId(idSede);

			Utilitites ut = new Utilitites();
			factura.setFechaCreacion(ut.dateToXMLGC(new Date()));
			factura.setFechaFacCompra(ut.dateToXMLGC(fechaFactura));
			factura.setFechaRecepcion(ut.dateToXMLGC(fechaRecepcion));
			factura.setProveedor(proovedor);
			factura.setUsuario(usuario);
			// PENDIENTE
			factura.setSede(sede);
			factura.setAjusteFactura(ajustePeso);
			List<ProductoFacCompraEntity> ListaProductos = seteaLista(productos);
			rta = conexionWSAdmin().getPortAdm().insertaFacturaCompra(factura, pagos, ListaProductos);
		} catch (Exception e) {
			rta.setCodigoRespuesta(0);
			rta.setDescripcionRespuesta(e.getLocalizedMessage());
			rta.setMensajeRespuesta(e.getMessage());
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo que convierte la lista de la vista a la que necesita el servicio
	 * web
	 * 
	 * @param listaOld
	 * @return
	 */
	public List<ProductoFacCompraEntity> seteaLista(List<ProductoFactCompraEntity> listaOld) {
		List<ProductoFacCompraEntity> respuesta = new ArrayList<>();

		try {
			Utilitites ut = new Utilitites();
			for (ProductoFactCompraEntity item : listaOld) {
				ProductoEntity prod = new ProductoEntity();
				ProductoFacCompraEntity objNew = new ProductoFacCompraEntity();
				objNew.setCantidad(item.getCantidad());
				objNew.setEstado("A");
				objNew.setFecha(ut.dateToXMLGC(new Date()));
				prod.setId(item.getId());
				objNew.setProducto(prod);
				objNew.setIva(item.getIva());
				objNew.setPorcentajeIva(item.getPorcentajeIva());
				objNew.setSubtotal(item.getSubtotal());
				objNew.setTotal(item.getValorTotal());
				respuesta.add(objNew);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	/**
	 * metodo que consulta los datos básicos de una factura
	 * 
	 * @param idFactura
	 * @return
	 */
	public FacturaCompraGeneralEntity consultaDatosFactura(Integer idFactura) {
		FacturaCompraGeneralEntity respuesta = new FacturaCompraGeneralEntity();
		try {
			respuesta = conexionWSProd().getPortProd().consultaFacturaTotal(idFactura);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	/**
	 * funcion que consulta las facturas por filtros
	 * 
	 * @return
	 */
	public List<FacturaCompraTotalEntity> consultaFacturaFiltros(Integer idProveedor, Date fechaInicial,
			Date fechaFinal, String estado, String imagen,String digitaliza) {
		List<FacturaCompraTotalEntity> respuesta = null;
		try {
			if (idProveedor == null)
				idProveedor = 0;
			Utilitites ut = new Utilitites();
			XMLGregorianCalendar fechaI = ut.dateToXMLGC(fechaInicial);
			XMLGregorianCalendar fechaF = ut.dateToXMLGC(fechaFinal);
			respuesta = conexionWSProd().getPortProd().consultaFacturaCompraFiltros(idProveedor, fechaI, fechaF, estado,imagen,digitaliza);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	/**
	 * funcion que adjunta los archivos a la factura
	 * 
	 * @param event
	 * @param idFactura
	 * @param ubicacion
	 * @return
	 */

	public co.com.codesoftware.server.productos.RespuestaEntity adjuntaArchivoFactura(FileUploadEvent event,
			Integer idFactura, String ubicacion, Integer idTipoDocumento) {
		co.com.codesoftware.server.productos.RespuestaEntity respuesta = new co.com.codesoftware.server.productos.RespuestaEntity();
		UploadedFile file = event.getFile();
		UsuarioLogic logica = new UsuarioLogic();
		String ruta = logica.obtieneParametroContext();
		try {
			if (idTipoDocumento == 1) {
				ruta += "facturasCompra/f_";
			} else if (idTipoDocumento == 2) {
				ruta += "comprobantesFactura/c_";
			} else {
				ruta += "otro/o_";
			}
			SimpleDateFormat sdf = new SimpleDateFormat("dd_M_yyyy_HH_MM_SS");
			String date = sdf.format(new Date());
			FileOutputStream fos = new FileOutputStream(new File(ruta + date + "_" + idFactura + ".pdf"));
			InputStream is = file.getInputstream();
			int BUFFER_SIZE = 8192;
			byte[] buffer = new byte[BUFFER_SIZE];
			int a;
			while (true) {
				a = is.read(buffer);
				if (a < 0)
					break;
				fos.write(buffer, 0, a);
				fos.flush();
			}
			fos.close();
			is.close();
			String rutaCompleta = ruta + date + "_" + idFactura + ".pdf";
			String nombreDocumento = date + "_" + idFactura + ".pdf";
			respuesta = insertaImagenBD(rutaCompleta, nombreDocumento, idFactura, ubicacion);
		} catch (Exception e) {
			e.printStackTrace();
			respuesta.setCodigoRespuesta(0);
			respuesta.setDescripcionRespuesta(e.getLocalizedMessage());
			respuesta.setMensajeRespuesta(e.toString());
		}
		return respuesta;
	}

	/**
	 * metodo que llama el servicio web de productos para insertar los registros
	 * de las imagenes
	 * 
	 * @param entidad
	 * @return
	 */
	public co.com.codesoftware.server.productos.RespuestaEntity insertaImagenBD(String ruta, String nombre,
			Integer idFactura, String ubicacion) {
		co.com.codesoftware.server.productos.RespuestaEntity respuesta = new co.com.codesoftware.server.productos.RespuestaEntity();
		try {
			ImagenesFacCompraEntity entidad = new ImagenesFacCompraEntity();
			Utilitites ud = new Utilitites();
			co.com.codesoftware.server.productos.FacturaCompraEntity fac = new co.com.codesoftware.server.productos.FacturaCompraEntity();
			fac.setId(idFactura);
			entidad.setEstado("A");
			entidad.setFacturaCompra(fac);
			entidad.setFecha(ud.dateToXMLGC(new Date()));
			entidad.setNombreImagen(nombre);
			entidad.setRutaImagen(ruta);
			entidad.setUbicacion(ubicacion);
			respuesta = conexionWSProd().getPortProd().insertaImagenesFacturaCompra(entidad);
		} catch (Exception e) {
			e.printStackTrace();
			respuesta.setCodigoRespuesta(0);
			respuesta.setDescripcionRespuesta(e.getLocalizedMessage());
			respuesta.setMensajeRespuesta(e.toString());
		}
		return respuesta;
	}

	/**
	 * metodo que consulta los movimientos contables por estado y id de factura
	 * 
	 * @param idFactura
	 * @param estado
	 * @return
	 */
	public List<MoviContableEntity> consultaMovContable(Integer idFactura, String estado) {
		List<MoviContableEntity> rta = null;
		try {

			rta = conexionWSFacturacion().getPortFact().obtenerMovimientoContableXFac(idFactura, estado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	
	/**
	 * metodo que consulta el listado de productos
	 * @return
	 */
	public List<ProductoSimpleEntity> consultaProductos(){
		List<ProductoSimpleEntity>  respuesta = null;
		try {
			ProductosLogica objLogica = new ProductosLogica();
			respuesta  = objLogica.consultaProdSimple();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	public BigDecimal getValorAjuste() {
		return valorAjuste;
	}

	public void setValorAjuste(BigDecimal valorAjuste) {
		this.valorAjuste = valorAjuste;
	}

}
