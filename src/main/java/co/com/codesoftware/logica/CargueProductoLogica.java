package co.com.codesoftware.logica;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import co.com.codesoftware.server.nsigemco.ProductoTmpEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class CargueProductoLogica implements WSGeneralInterface {
	InputStream file;
	XSSFWorkbook workbook = null;

	/**
	 * Funcion que lee un archivo excel en memoria, no hay necesidad de
	 * guardarlo
	 * 
	 * @param fileUp
	 * @param event
	 * @return
	 */
	public RespuestaEntity cargaExcel(UploadedFile fileUp, FileUploadEvent event) {
		RespuestaEntity respuesta = new RespuestaEntity();
		String mensaje = "";
		Row row = null;
		Cell cell = null;
		try {
			file = event.getFile().getInputstream();
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			List<ProductoTmpEntity> listaProductos = new ArrayList<ProductoTmpEntity>();
			rowIterator.next();
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				ProductoTmpEntity entidad = new ProductoTmpEntity();
				while (cellIterator.hasNext()) {
					cell = null;
					cell = cellIterator.next();
					if (cell.getStringCellValue() == null || "".equalsIgnoreCase(cell.getStringCellValue())) {
						System.out.println("nulo codigo " + row.getRowNum());
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
					} else {
						entidad.setUbicacion(cell.getStringCellValue());
						cell = cellIterator.next();
						try {
							entidad.setCodigoExterno(String.valueOf("" + cell.getStringCellValue()).trim());
						} catch (IllegalStateException ex) {
							Double celda = cell.getNumericCellValue();
							entidad.setCodigoExterno("" + celda.longValue());
							// Muestro el codigo como quedo
							System.out.println("Obtenido como un campo numerico: " + celda.longValue());
						}
						cell = cellIterator.next();
						entidad.setDescripcion(cell.getStringCellValue());
						cell = cellIterator.next();
						entidad.setCategoria(cell.getStringCellValue());
						cell = cellIterator.next();
						try {
							entidad.setSubcategoria(cell.getStringCellValue());
						} catch (IllegalStateException e) {
							Double celda = cell.getNumericCellValue();
							System.out.println(celda);
							entidad.setSubcategoria("" + celda.longValue());
							// Muestro el codigo como quedo
						}
						cell = cellIterator.next();
						entidad.setTipo(cell.getStringCellValue());
						cell = cellIterator.next();
						Double exis = cell.getNumericCellValue();
						entidad.setExistencias(exis.intValue());
						cell = cellIterator.next();
						try {
							entidad.setCosto(new BigDecimal(cell.getNumericCellValue()));
						} catch (Exception e) {
							String celda = cell.getStringCellValue();
							System.out.println(celda);
							entidad.setCosto(new BigDecimal(celda));
						}
						cell = cellIterator.next();
						entidad.setCodigoBarras("" + cell.getRichStringCellValue().getString());
						entidad.setUsuario(1);
						listaProductos.add(entidad);
						mensaje = validaNuloVacioExcel(entidad);
						if (!"".equalsIgnoreCase(mensaje)) {
							mensaje += row.getRowNum();
							break;
						}
					}
				}
			}
			if ("".equalsIgnoreCase(mensaje)) {
				respuesta = insertaDatos(listaProductos);
			} else {
				respuesta.setCodigoRespuesta(0);
				respuesta.setDescripcionRespuesta("ERROR DE DATOS");
				System.out.println(mensaje);
				respuesta.setMensajeRespuesta(mensaje);
			}

		} catch (Exception e) {
			e.printStackTrace();
			respuesta.setCodigoRespuesta(0);
			respuesta.setDescripcionRespuesta(e.getMessage());
			respuesta.setMensajeRespuesta("error en  Fila" + row.getRowNum());
			System.out.println("error en  Fila" + row.getRowNum());
		}
		return respuesta;

	}

	/**
	 * Metodo que invoca el servicio web e inserta los datos del excel
	 * 
	 * @param lista
	 * @return
	 */
	public RespuestaEntity insertaDatos(List<ProductoTmpEntity> lista) {
		try {
			return conexionWSAdmin().getPortAdm().insertarProductoTemporal(lista);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * Funcion con la cual llamo el webservice de insertar categorias
	 * subcategorias y marcas
	 * 
	 * @return
	 */
	public RespuestaEntity insertaParametros() {
		RespuestaEntity respuesta = new RespuestaEntity();
		try {
			respuesta = conexionWSAdmin().getPortAdm().insertarProductoExcel();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return respuesta;
	}

	/**
	 * Funcion que consulta los productos
	 * 
	 * @return
	 */
	public List<ProductoTmpEntity> consultaProductosTemporal() {
		try {
			return conexionWSAdmin().getPortAdm().consultaProductosTemporal();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Metodo para guardar el archivo en una ruta en particular
	 * 
	 * @param fileName
	 * @param in
	 */
	public void guardarArchivo(String fileName, InputStream in) {
		try {
			OutputStream out = new FileOutputStream(new File("/home/john/" + fileName));

			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = in.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}

			in.close();
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Funcion que verifica si algun campo viene nulo o vacio del excel
	 * 
	 * @param entidad
	 * @return
	 */
	public String validaNuloVacioExcel(ProductoTmpEntity entidad) {
		String respuesta = "";
		try {
			if ("".equalsIgnoreCase(entidad.getCodigoExterno()) || entidad.getCodigoExterno() == null) {
				respuesta = "Error en el campo codigo Externo columna " + 1 + "fila ";
			} else if ("".equalsIgnoreCase(entidad.getUbicacion()) || entidad.getUbicacion() == null) {
				respuesta = "Error en el campo  Ubicación columna " + 2 + "fila ";
			} else if ("".equalsIgnoreCase(entidad.getDescripcion()) || entidad.getDescripcion() == null) {
				respuesta = "Error en el campo  Descripción columna " + 3 + "fila ";
			} else if ("".equalsIgnoreCase(entidad.getSubcategoria()) || entidad.getSubcategoria() == null) {
				respuesta = "Error en el campo  Subategoria columna " + 4 + "fila ";
			} else if ("".equalsIgnoreCase(entidad.getSubcategoria()) || entidad.getSubcategoria() == null) {
				respuesta = "Error en el campo Tipo columna " + 5 + "fila ";
			} else if ("".equalsIgnoreCase(entidad.getTipo()) || entidad.getTipo() == null) {
				respuesta = "Error en el campo codigo Existencias columna " + 6 + "fila ";
			} else if (entidad.getExistencias() == -1 || entidad.getExistencias() == null) {
				respuesta = "Error en el campo costo columna " + 7 + "fila ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	public RespuestaEntity cargaExcelProducto(UploadedFile fileUp, FileUploadEvent event, Integer idTius) {
		RespuestaEntity respuesta = new RespuestaEntity();
		String mensaje = "";
		Row row = null;
		Cell cell = null;
		try {
			file = event.getFile().getInputstream();
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			List<ProductoTmpEntity> listaProductos = new ArrayList<ProductoTmpEntity>();
			rowIterator.next();
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				ProductoTmpEntity entidad = new ProductoTmpEntity();
				while (cellIterator.hasNext()) {
					cell = null;
					cell = cellIterator.next();
					if (cell.getStringCellValue() == null || "".equalsIgnoreCase(cell.getStringCellValue())) {
						System.out.println("nulo codigo " + row.getRowNum());
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
					} else {
						entidad.setUbicacion(cell.getStringCellValue());
						cell = cellIterator.next();
						try {
							entidad.setCodigoExterno(String.valueOf("" + cell.getStringCellValue()).trim());
						} catch (IllegalStateException ex) {
							Double celda = cell.getNumericCellValue();
							entidad.setCodigoExterno("" + celda.longValue());
							// Muestro el codigo como quedo
							System.out.println("Obtenido como un campo numerico: " + celda.longValue());
						}
						cell = cellIterator.next();
						entidad.setDescripcion(cell.getStringCellValue());
						cell = cellIterator.next();
						entidad.setCategoria(cell.getStringCellValue());
						cell = cellIterator.next();
						try {
							entidad.setSubcategoria(cell.getStringCellValue());
						} catch (IllegalStateException e) {
							Double celda = cell.getNumericCellValue();
							System.out.println(celda);
							entidad.setSubcategoria("" + celda.longValue());
							// Muestro el codigo como quedo
						}
						cell = cellIterator.next();
						entidad.setTipo(cell.getStringCellValue());
						entidad.setUsuario(idTius);
						entidad.setExistencias(0);
						listaProductos.add(entidad);
						mensaje = validaNuloVacioExcelSoloP(entidad);
						if (!"".equalsIgnoreCase(mensaje)) {
							mensaje += row.getRowNum();
							break;
						}
					}
				}
			}
			if ("".equalsIgnoreCase(mensaje)) {
				respuesta = insertaDatos(listaProductos);
			} else {
				respuesta.setCodigoRespuesta(0);
				respuesta.setDescripcionRespuesta("ERROR DE DATOS");
				System.out.println(mensaje);
				respuesta.setMensajeRespuesta(mensaje);
			}

		} catch (Exception e) {
			e.printStackTrace();
			respuesta.setCodigoRespuesta(0);
			respuesta.setDescripcionRespuesta(e.getMessage());
			respuesta.setMensajeRespuesta("error en  Fila" + row.getRowNum());
			System.out.println("error en  Fila" + row.getRowNum());
		}
		return respuesta;
	}

	public String validaNuloVacioExcelSoloP(ProductoTmpEntity entidad) {
		String respuesta = "";
		try {
			if ("".equalsIgnoreCase(entidad.getCodigoExterno()) || entidad.getCodigoExterno() == null) {
				respuesta = "Error en el campo codigo Externo columna " + 1 + "fila ";
			} else if ("".equalsIgnoreCase(entidad.getUbicacion()) || entidad.getUbicacion() == null) {
				respuesta = "Error en el campo  Ubicación columna " + 2 + "fila ";
			} else if ("".equalsIgnoreCase(entidad.getDescripcion()) || entidad.getDescripcion() == null) {
				respuesta = "Error en el campo  Descripción columna " + 3 + "fila ";
			} else if ("".equalsIgnoreCase(entidad.getSubcategoria()) || entidad.getSubcategoria() == null) {
				respuesta = "Error en el campo Tipo columna " + 5 + "fila ";
			} else if ("".equalsIgnoreCase(entidad.getTipo()) || entidad.getTipo() == null) {
				respuesta = "Error en el campo codigo Existencias columna " + 6 + "fila ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}
	/**
	 * Funcion con la cual registro los productos en el sistema
	 * @return
	 */
	public String enviaRegistroProductos(){
		String rta = "";
		try {
			RespuestaEntity respuesta = conexionWSAdmin().getPortAdm().registroProductosExcel();
			rta = respuesta.getDescripcionRespuesta();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con el cual cargo el excel de conteos
	 * @param fileUp
	 * @param event
	 * @param idTius
	 * @return
	 */
	public String cargaExcelConteo(UploadedFile fileUp, FileUploadEvent event, Integer idTius, Integer idCont) {
		String respuesta = "";
		String mensaje = "";
		Row row = null;
		Cell cell = null;
		try {
			file = event.getFile().getInputstream();
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			List<ProductoTmpEntity> listaProductos = new ArrayList<ProductoTmpEntity>();
			rowIterator.next();
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				ProductoTmpEntity entidad = new ProductoTmpEntity();
				while (cellIterator.hasNext()) {
					cell = null;
					cell = cellIterator.next();
					if (cell.getStringCellValue() == null || "".equalsIgnoreCase(cell.getStringCellValue())) {
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
						cellIterator.hasNext();
					} else {
						String codigoExterno=""; 
						Integer idConteo, cantidad;
						String codigoBarras="", ubicacion="";
						try {
							codigoExterno = cell.getStringCellValue().trim();
						} catch (IllegalStateException ex) {
							Double celda = cell.getNumericCellValue();
							codigoExterno = ""+celda.longValue();
						}
						cell = cellIterator.next();
						idConteo = idCont;
						try {
							Double aux = cell.getNumericCellValue();
							cantidad = aux.intValue();
						} catch (IllegalStateException e) {
							e.printStackTrace();
							String aux = cell.getStringCellValue().trim();
							cantidad  = Integer.parseInt(aux);
						}
						co.com.codesoftware.servicio.conteos.RespuestaEntity valida = conexionWSConteo().getPortConteo().insertaProductoConteo(codigoExterno, idConteo, cantidad, codigoBarras, ubicacion);
						if (!"".equalsIgnoreCase(mensaje)) {
							mensaje += row.getRowNum();
							break;
						}
					}
				}
			}
			respuesta = "Ok";
		} catch (Exception e) {
			e.printStackTrace();
			respuesta = "Error " + e;
			System.out.println("error en  Fila" + row.getRowNum());
		}
		return respuesta;
	}
	
	/**
	 * Funcion con el cual cargo el excel de conteos
	 * @param fileUp
	 * @param event
	 * @param idTius
	 * @return
	 */
	public ArrayList<co.com.codesoftware.servicio.producto.ProductoAporte> cargaExcelAporte(FileUploadEvent event, Integer idTius, Integer idAporte) {
		String mensaje = "";
		Row row = null;
		Cell cell = null;
		ArrayList<co.com.codesoftware.servicio.producto.ProductoAporte> productos = null;
		try {
			file = event.getFile().getInputstream();
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			rowIterator.next();
			while (rowIterator.hasNext()) {
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
						String codigoExterno=""; 
						Integer cantidad;
						BigDecimal costo;
						try {
							codigoExterno = cell.getStringCellValue().trim();
						} catch (IllegalStateException ex) {
							Double celda = cell.getNumericCellValue();
							codigoExterno = ""+celda.longValue();
						}
						cell = cellIterator.next();
						try {
							Double aux = cell.getNumericCellValue();
							cantidad = aux.intValue();
						} catch (IllegalStateException e) {
							e.printStackTrace();
							String aux = cell.getStringCellValue().trim();
							cantidad  = Integer.parseInt(aux);
						}
						cell = cellIterator.next();
						try {
							costo = new BigDecimal(cell.getNumericCellValue());
						} catch (Exception e) {
							String celda = cell.getStringCellValue();
							System.out.println(celda);
							costo = new BigDecimal(celda);
						}
						if (!"".equalsIgnoreCase(mensaje)) {
							mensaje += row.getRowNum();
							break;
						}
						if(productos == null){
							productos = new ArrayList<co.com.codesoftware.servicio.producto.ProductoAporte>();
						}
						co.com.codesoftware.servicio.producto.ProductoAporte item = new co.com.codesoftware.servicio.producto.ProductoAporte();
						item.setCantidad(cantidad);
						item.setCodExterno(codigoExterno);
						item.setCosto(costo);
						productos.add(item);
						
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error en  Fila" + row.getRowNum());
		}
		return productos;
	}
	/**
	 * Funcion con el cual busco los productos repetidos en el excel proporcionado con el usuario
	 * @return
	 */
	public List<String> buscaRepetidosExcel(){
		List<String> rta = null;
		try {
			rta = conexionWSAdmin().getPortAdm().obtieneRepetidosTemporal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual cruzo los datos del excel y del sistema
	 * @return
	 */
	public List<String> buscaRepetidosExcelSistema(){
		List<String> rta = null;
		try {
			rta = conexionWSAdmin().getPortAdm().obtieneRepetidosSistemaTemporal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

}
