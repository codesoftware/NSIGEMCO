package co.com.codesoftware.logica;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.server.nsigemco.MarcaEntity;
import co.com.codesoftware.server.nsigemco.ProductoEntity;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.server.productos.KardexProductoEntity;
import co.com.codesoftware.server.productos.PorcentajePrecioEntity;
import co.com.codesoftware.server.productos.PrecioProdSimpleEntity;
import co.com.codesoftware.server.productos.ProductoSimpleEntity;
import co.com.codesoftware.server.productos.ProductosEndPoint;
import co.com.codesoftware.server.productos.ProductosEndPoint_Service;
import co.com.codesoftware.servicio.producto.ExistenciaXSedeEntity;
import co.com.codesoftware.servicio.producto.PromPonderaEntity;
import co.com.codesoftware.utilities.InvocaWebServiceInterface;
import co.com.codesoftware.utilities.Utilitites;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ProductosLogica implements WSGeneralInterface {

	private String mensaje;
	private String traza;

	/**
	 * Funcion con la cual obtengo todos los productos de acuerdo a la categoria
	 * y unos criterios dados por el usuario
	 * 
	 * @param idCategoria
	 * @param subCat
	 * @param marca
	 * @return
	 */
	public List<ProductoEntity> buscaProductosXCatSubMarc(Integer idCategoria, String subCat, String marca) {
		List<ProductoEntity> productos = null;
		try {
			if (subCat == null) {
				subCat = "";
			}

			if (marca == null) {
				marca = "";
			}
			productos = conexionWSAdmin().getPortAdm().obtieneProductosCategoria(idCategoria, subCat, marca);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productos;
	}

	/**
	 * Funcion con la cual obtengo todos los productos con que tengan alguna
	 * coincidencia con el codigo externo el codigo de la aplicacion o su nombre
	 * 
	 * @param codigoExt
	 * @param codigoApp
	 * @param nombre
	 * @return
	 */
	public co.com.codesoftware.server.productos.ProductoEntity buscaProductosXCodONombre(String codigoBarras,
			String codigoExte, String descripcion) {
		co.com.codesoftware.server.productos.ProductoEntity rta = null;
		try {
			rta = conexionWSProd().getPortProd().buscaProductoFiltros(codigoBarras, codigoExte);

		} catch (Exception e) {
			e.printStackTrace();
			rta = null;
		}
		return rta;
	}

	/**
	 * Funcon que inserta un producto e invoca el servicio web
	 * 
	 * @param marca
	 * @param nombreProducto
	 * @param referencia
	 * @param categoria
	 * @return
	 */
	public RespuestaEntity insertaProducto(MarcaEntity marca, String nombreProducto, ReferenciaEntity referencia,
			CategoriaEntity categoria, String codigoExterno, String ubicacion,String codigoBarras) {
		ProductoEntity prod = new ProductoEntity();
		RespuestaEntity respuesta = new RespuestaEntity();
		try {
			prod.setCategoria(categoria);
			prod.setDescripcion(nombreProducto);
			prod.setMarca(marca);
			prod.setNombre(nombreProducto);
			prod.setReferencia(referencia);
			prod.setCodigoExt(codigoExterno);
			prod.setUbicacion(ubicacion);
			prod.setCodigoBarras(codigoBarras);
			respuesta = conexionWSAdmin().getPortAdm().insertaRegistroProducto(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;

	}

	/**
	 * Funcion con la cual llamo el procedimiento para cambiarle el precio a un
	 * producto
	 * 
	 * @param user
	 * @param sede
	 * @param dska
	 * @param precio
	 * @return
	 */
	public RespuestaEntity cambiaPrecioproducto(Integer user, Integer sede, Integer dska, BigDecimal precio,
			BigDecimal precioUni, BigDecimal precioDec, BigDecimal precioMil, String estatic) {
		RespuestaEntity rta = null;
		try {
			rta = conexionWSAdmin().getPortAdm().cambioPrecioProducto(user, sede, dska, precio, precioUni, precioDec,
					precioMil, estatic);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual obtengo todos los productos de acuerdo a su codigo
	 * externo
	 * 
	 * @param idCategoria
	 * @return
	 */
	public List<ProductoEntity> buscaProductosXCodigoExterno(String codigoExterno) {
		List<ProductoEntity> productos = null;
		try {
			productos = conexionWSAdmin().getPortAdm().consultaProductoCodigoExterno(codigoExterno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productos;
	}

	/**
	 * Funcion con la cual obtengo una consulta simple de productos
	 * 
	 * @return
	 */
	public List<ProductoSimpleEntity> consultaProdSimple() {
		List<ProductoSimpleEntity> rta = null;
		try {
			rta = conexionWSProd().getPortProd().consultaProductos();
			this.mensaje = "Ok";
		} catch (Exception e) {
			e.printStackTrace();
			this.mensaje = "Error";
			this.traza = "Error " + e;
		}
		return rta;
	}

	/**
	 * Funcion con el cual busco los datos simples de un producto teniendo como
	 * base su id
	 * 
	 * @param idDska
	 * @return
	 */
	public ProductoSimpleEntity consultaProdXId(Integer idDska) {
		ProductoSimpleEntity rta = null;
		try {
			rta = conexionWSProd().getPortProd().consultaProductoXId(idDska);
			this.mensaje = "Ok";
		} catch (Exception e) {
			e.printStackTrace();
			this.mensaje = "Error";
			this.traza = "Error " + e;
		}
		return rta;
	}

	/**
	 * Funcion con la cual se valida si el codigo externo esta duplicado
	 * 
	 * @param dska
	 * @param codExterno
	 * @return
	 */
	public String validaCodExtDuplicados(Integer dska, String codExterno) {
		String rta = "";
		try {
			rta = conexionWSProd().getPortProd().validaCodigoExterno(dska, codExterno);
		} catch (Exception e) {
			e.printStackTrace();
			rta = "Error " + e;
		}
		return rta;
	}

	/**
	 * Funcion con la cual llamo al web services de actualizacion de productos
	 * 
	 * @return
	 */
	public String actualizaCamposProducto(ProductoSimpleEntity producto) {
		String rta = "";
		try {
			rta = conexionWSProd().getPortProd().actualizaProductoSimple(producto);
		} catch (Exception e) {
			e.printStackTrace();
			rta = "Error " + e;
		}
		return rta;
	}

	/**
	 * Funcion con la cual se busca el historico de precios de un producto por
	 * sede
	 * 
	 * @param idDska
	 * @param idSede
	 * @return
	 */
	public List<PrecioProdSimpleEntity> buscaPreciosHistoricosProdXSede(Integer idDska, Integer idSede) {
		List<PrecioProdSimpleEntity> rta = null;
		try {
			rta = conexionWSProd().getPortProd().buscaHistProdXSede(idDska, idSede);
			this.mensaje = "Ok";
		} catch (Exception e) {
			e.printStackTrace();
			this.mensaje = "Error";
			this.traza = "Error " + e;
		}
		return rta;
	}

	/**
	 * Funcion con la cual se llama el web service que realiza la
	 * parametrizacion de porcentajes, los cuales se utilizaran como base para
	 * la parametrizacion de precios automaticos
	 * 
	 * @param idCate
	 * @param idRefe
	 * @param idMarca
	 * @param idSede
	 * @param porcUnid
	 * @param porcCent
	 * @param porcMill
	 * @param porcBase
	 * @param idTius
	 * @return
	 */
	public String parametrizaPorcPrecios(Integer idCate, Integer idRefe, Integer idMarca, Integer idSede,
			Integer porcUnid, Integer porcCent, Integer porcMill, Integer porcBase, Integer idTius) {
		String rta = "";
		try {
			rta = conexionWSProd().getPortProd().insercionParamPrecioMasivo(idCate, idRefe, idMarca, idSede, porcUnid,
					porcCent, porcMill, porcBase, idTius);
		} catch (Exception e) {
			e.printStackTrace();
			rta = "Error " + e;
		}
		return rta;
	}

	/**
	 * Funcion con la cual se obtiene la lista de parametros activos para la
	 * parametrizacion de precios
	 * 
	 * @param estado
	 * @return
	 */
	public List<PorcentajePrecioEntity> consultaGeneralPorc(String estado) {
		List<PorcentajePrecioEntity> rta = null;
		try {
			rta = conexionWSProd().getPortProd().buscaPorcentajePrecio(estado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual se obtiene la lista de parametros activos y por
	 * filtros para la parametrizacion de precios
	 * 
	 * @param estado
	 * @return
	 */
	public List<PorcentajePrecioEntity> consultaGeneralPorc(String estado, Integer idSede, Integer idCate,
			Integer idRefe, Integer idMarca) {
		List<PorcentajePrecioEntity> rta = null;
		try {
			rta = conexionWSProd().getPortProd().buscaPorcentajePrecioFiltros(estado, idSede, idCate, idRefe, idMarca);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual llamo el proceso que actualiza masivamente los
	 * precios de los productos
	 * 
	 * @param idCate
	 * @param idRefe
	 * @param idMarca
	 * @param idSede
	 * @param idTius
	 * @return
	 */
	public String ejecutaCambioPrecioMasivo(Integer idCate, Integer idRefe, Integer idMarca, Integer idSede,
			Integer idTius) {
		String rta = "";
		try {
			rta = conexionWSProd().getPortProd().ejecutaCambioPrecioMasivoEnProd(idSede, idCate, idRefe, idMarca,
					idTius);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual obtiene el kardex de un producto basandose en una
	 * sede
	 * 
	 * @param idDska
	 * @param idSede
	 * @return
	 */
	public List<KardexProductoEntity> buscaKardexProductoXSede(Integer idDska, Integer idSede, Date fechaIni,
			Date fechaFin) {
		List<KardexProductoEntity> rta = null;
		try {
			if (fechaFin != null) {
				fechaFin.setHours(23);
				fechaFin.setMinutes(59);
				fechaFin.setSeconds(59);
			}
			rta = conexionWSProd().getPortProd().buscaKardexProductoXSede(idDska, idSede,
					Utilitites.dateToXMLGC(fechaIni), Utilitites.dateToXMLGC(fechaFin));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual consulto las existencias totales de un producto
	 * 
	 * @return
	 */
	public Integer existenciasProducto(Integer idDska) {
		PromPonderaEntity existencias = null;
		try {
			existencias = conexionWSNewProd().getPortNewProductos().obtenerPromedioPonderadoProducto(idDska);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return existencias.getExistencias();
	}
	/**
	 * Funcion con la cual llamo el WebServices que obtiene las existencias de un producto en todas las sedes
	 * y busca las existencias de la sede que se necesita
	 * @param idDska
	 * @param idSede
	 * @return
	 */
	public Integer existenciaProductoXSede(Integer idDska, Integer idSede){
		Integer existencias = 0;
		List<ExistenciaXSedeEntity> lista = null;
		try {
			lista = conexionWSNewProd().getPortNewProductos().obtenerExistenciasProducto(idDska);
			for(ExistenciaXSedeEntity item : lista){
				if(idSede == item.getSede().getId()){
					existencias =  item.getExistencias();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return existencias;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getTraza() {
		return traza;
	}

	public void setTraza(String traza) {
		this.traza = traza;
	}

}
