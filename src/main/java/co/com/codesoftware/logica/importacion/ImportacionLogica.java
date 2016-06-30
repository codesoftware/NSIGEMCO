package co.com.codesoftware.logica.importacion;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.primefaces.event.FileUploadEvent;

import co.com.codesoftware.entity.ProducImpEntity;
import co.com.codesoftware.servicio.importacion.DetalleGastoEntity;
import co.com.codesoftware.servicio.importacion.GastoImpoEntity;
import co.com.codesoftware.servicio.importacion.ImportacionEntity;
import co.com.codesoftware.servicio.importacion.ProductoImportacionEntity;
import co.com.codesoftware.servicio.importacion.ProveedorInterEntity;
import co.com.codesoftware.utilities.Utilitites;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ImportacionLogica implements WSGeneralInterface {

	private List<ProducImpEntity> prodInexistentes;

	/**
	 * Funcion con la cual inserto un proveedor internacional
	 * 
	 * @param objEntity
	 * @return
	 */
	public String insertarProveedorInt(ProveedorInterEntity objEntity) {
		String rta = "";
		try {
			rta = conexionWSImportacion().getPortImportacion().insertarProveedorInternacional(objEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual consulto todos los proveedores internacionales
	 * 
	 * @return
	 */
	public List<ProveedorInterEntity> consultaProveedorInter() {
		List<ProveedorInterEntity> rta = null;
		try {
			rta = conexionWSImportacion().getPortImportacion().obtenerProveedoresInter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual inserto una importacion
	 * 
	 * @param objEntity
	 * @return
	 */
	public String insertaImportacion(ImportacionEntity objEntity) {
		String rta = "";
		try {
			rta = conexionWSImportacion().getPortImportacion().insertaImportacion(objEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo para consultar importaciones
	 * 
	 * @param fechaInicial
	 * @param fechaFinal
	 * @return
	 */
	public List<ImportacionEntity> consultaImportacion(Date fechaInicial, Date fechaFinal) {
		List<ImportacionEntity> respuesta = null;
		try {
			respuesta = conexionWSImportacion().getPortImportacion().obtenerImportaciones(Utilitites.dateToXMLGC(fechaInicial), Utilitites.dateToXMLGC(fechaFinal));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	/**
	 * Funcion con la cual cargo los productos de la importacion por medio de un
	 * excel
	 * 
	 * @return
	 */
	public String cargaProductosImportacion(FileUploadEvent event, Integer idImpo) {
		String rta = "";
		Row row = null;
		Cell cell = null;
		XSSFWorkbook workbook = null;
		Integer numfilas = 0;
		this.prodInexistentes = null;
		try {
			InputStream file = event.getFile().getInputstream();
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			boolean ejecucion = true;
			while (rowIterator.hasNext() ) {
				row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					cell = null;
					cell = cellIterator.next();
					if (cell.getStringCellValue() == null || "".equalsIgnoreCase(cell.getStringCellValue())) {
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
					} else {
						String codigo = cell.getStringCellValue();
						cell = cellIterator.next();
						String cantidad = "";
						try {
							cantidad = cell.getStringCellValue();
						} catch (IllegalStateException e) {
							// TODO: handle exception
							Double cantidad1 = cell.getNumericCellValue();
							cantidad1 = cantidad1 * 1000;
							cantidad = "" + cantidad1.intValue();
						}
						cell = cellIterator.next();
						String costo = "";
						try {
							costo = cell.getStringCellValue();
						} catch (Exception e) {
							// TODO: handle exception
							Double costo1 = cell.getNumericCellValue();
							costo1 = costo1 / 1000;
							costo = costo1.toString();
						}
						if (numfilas != 0) {
							String valida = insertaProducto(idImpo, codigo, Integer.parseInt(cantidad), new BigDecimal(costo));
							if (!valida.toUpperCase().contains("OK")) {
								if(prodInexistentes == null){
									this.prodInexistentes = new ArrayList<ProducImpEntity>();
								}
								ProducImpEntity aux = new ProducImpEntity();
								aux.setCantidad(Integer.parseInt(cantidad));
								aux.setCodigoExterno(codigo);
								aux.setValor(new BigDecimal(costo));
								this.prodInexistentes.add(aux);
								ejecucion = false;
								break;
							}
						}

						// System.out.println(" codigo: "+codigo+" cantidad: "+cantidad+" costo: "+costo);
					}
				}
				numfilas++;
			}
			// System.out.println("Hay " + numfilas + " filas");
			if (ejecucion) {
				rta = "Ok";
			}else{
				if(prodInexistentes == null){
					rta = "Error en la ejecucion del software"; 
				}else{
					rta = "Error existen productos inexistentes en el sistema por favor revise la lista que se encuentra en la parte inferior ";
				}
				
			}

		} catch (Exception e) {
			e.printStackTrace();
			rta = "Error " + e.toString();
		}
		return rta;
	}

	/**
	 * Funcion con la cual inserto un producto en la importacion
	 * 
	 * @return
	 */
	public String insertaProducto(Integer idImpo, String codExterno, Integer cantidad, BigDecimal precio) {
		String rta = "";
		try {
			rta = conexionWSImportacion().getPortImportacion().insertarProductoImportacion(idImpo, codExterno, cantidad, precio);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual obtengo los productos de una importacion
	 * 
	 * @param idImpo
	 * @return
	 */
	public List<ProductoImportacionEntity> obtieneProductosImportacion(Integer idImpo) {
		List<ProductoImportacionEntity> rta = null;
		try {
			rta = conexionWSImportacion().getPortImportacion().obtenerProductosImportacion(idImpo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual inserta las tazas representativas
	 * 
	 * @param idImpo
	 * @param trm
	 * @param tazaProm
	 * @return
	 */
	public String insertaTazasRepresentativas(Integer idImpo, BigDecimal trm, BigDecimal tazaProm) {
		String rta = "";
		try {
			rta = conexionWSImportacion().getPortImportacion().insertaValorDolaresProd(idImpo, trm, tazaProm);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual inserto un gasto en la importacion
	 * 
	 * @param objEntity
	 * @return
	 */
	public String insertaGastoImportacion(GastoImpoEntity objEntity) {
		String rta = "";
		try {
			rta = conexionWSImportacion().getPortImportacion().insertaGastoImportacion(objEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual inserto un detalle al gasto
	 * @param objEntity
	 * @return
	 */
	public String insertaDetalleGasto(DetalleGastoEntity objEntity){
		String rta ="";
		try {
			rta = conexionWSImportacion().getPortImportacion().insertarDetalleGasto(objEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual obtengo los gastos de la importacion
	 * 
	 * @return
	 */
	public List<GastoImpoEntity> obtenerGastosImportacion(Integer idImpo) {
		List<GastoImpoEntity> rta = null;
		try {
			rta = conexionWSImportacion().getPortImportacion().obtenerGastosImpo(idImpo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual
	 * 
	 * @param idImpo
	 * @return
	 */
	public String eliminarProductosImportacion(Integer idImpo) {
		String rta = "";
		try {
			rta = conexionWSImportacion().getPortImportacion().borrarProductosImportacion(idImpo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	public List<ProducImpEntity> getProdInexistentes() {
		return prodInexistentes;
	}

	public void setProdInexistentes(List<ProducImpEntity> prodInexistentes) {
		this.prodInexistentes = prodInexistentes;
	}	
	/**
	 * Funcion con la cual relaciono productos a una importacion
	 * @param idImpo
	 * @param lista
	 */
	public String enviarListaProductosImportacion(Integer idImpo, List<ProducImpEntity> lista){
		String respuesta = "";
		try {
			boolean ejecucion = true;
			List<ProducImpEntity> auxList = lista;
			this.prodInexistentes = null;
			for(ProducImpEntity item : auxList){
				String valida = insertaProducto(idImpo, item.getCodigoExterno(), item.getCantidad(), item.getValor());
				if (!valida.toUpperCase().contains("OK")) {
					if(prodInexistentes == null){
						this.prodInexistentes = new ArrayList<ProducImpEntity>();
					}
					ProducImpEntity aux = new ProducImpEntity();
					aux.setCantidad(item.getCantidad());
					aux.setCodigoExterno(item.getCodigoExterno());
					aux.setValor(item.getValor());
					this.prodInexistentes.add(aux);
					ejecucion = false;
					break;
				}
				
			}
			if(ejecucion){
				respuesta = "Ok";
			}else{
				respuesta = "Error existen productos inexistentes en el sistema por favor revise la lista que se encuentra en la parte inferior ";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			respuesta = "Error " + e;
		}
		return respuesta;
	}
	/**
	 * Funcion con la cual obtengo la lista de detalles del gasto de una importacion 
	 * @param idGasto
	 * @return
	 */
	public List<DetalleGastoEntity> obtenerDetalleGasto(Integer idGasto){
		List<DetalleGastoEntity> rta = null;
		try {
			rta = conexionWSImportacion().getPortImportacion().obtenerDetalleGasto(idGasto);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return rta;
	}
	
	/**
	 * Funcion con la cual llamo el webservice que ejecuta el proceso de importacion
	 * @param idImpo
	 * @param idTius
	 * @return
	 */
	public String ejecutarProcesoImportacion(Integer idImpo, Integer idTius){
		String rta = "";
		try {
			rta = conexionWSImportacion().getPortImportacion().ejecutaProcesoImportacion(idTius, idImpo);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
}
