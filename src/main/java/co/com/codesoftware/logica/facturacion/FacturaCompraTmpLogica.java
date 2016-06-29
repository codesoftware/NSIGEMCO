package co.com.codesoftware.logica.facturacion;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.com.codesoftware.logica.ProductosLogica;
import co.com.codesoftware.server.productos.ProductoSimpleEntity;
import co.com.codesoftware.servicio.facturacion.FacturaCompraTmpEntity;
import co.com.codesoftware.servicio.facturacion.ProdFacCompraTmpEntity;
import co.com.codesoftware.servicio.facturacion.ProductoEntity;
import co.com.codesoftware.utilities.Utilitites;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class FacturaCompraTmpLogica implements WSGeneralInterface {

	/**
	 * metodo que inserta una factura de compra temporal
	 * 
	 * @param entidad
	 * @return
	 */
	public Integer insertaFactura(FacturaCompraTmpEntity entidad) {
		Integer idFactura = null;
		try {
			idFactura = conexionWSFacturacion().getPortFact().insertarFacturaCompraTmp(entidad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return idFactura;
	}

	/**
	 * metodo que actualiza una factura de compra temporal
	 * 
	 * @param entidad
	 * @return
	 */
	public FacturaCompraTmpEntity actualizaFactura(FacturaCompraTmpEntity entidad) {
		FacturaCompraTmpEntity rta = null;
		try {
			rta = conexionWSFacturacion().getPortFact().actualizarFacturaCompraTmp(entidad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	
	/**
	 * metodo que inserta los productos de facturas de compra
	 * @param productos
	 * @param idFactura
	 * @return
	 */
	public List<ProdFacCompraTmpEntity> insertaProductosFactCompra(List<ProdFacCompraTmpEntity> productos,Integer idFactura){
		List<ProdFacCompraTmpEntity> rta = null;
		try {
			rta = conexionWSFacturacion().getPortFact().insertarProdFacturasCompraTmp(productos, idFactura);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo para consultar un producto por codigo externo
	 * 
	 * @param codExterno
	 * @return
	 */
	public ProdFacCompraTmpEntity consultaProductoXcodigoExt(String codExterno) {
		ProdFacCompraTmpEntity rta = new ProdFacCompraTmpEntity();
		co.com.codesoftware.server.productos.ProductoEntity objeto = new co.com.codesoftware.server.productos.ProductoEntity();
		try {
			ProductosLogica objLogica = new ProductosLogica();
			objeto = objLogica.buscaProductosXCodONombre("", codExterno, "");
			ProductoEntity prod = new ProductoEntity();
			if (objeto != null) {
				prod.setId(objeto.getId());
				prod.setNombre(objeto.getNombre());
				prod.setCodigoExt(objeto.getCodigoExt());
				prod.setDescripcion(objeto.getDescripcion());
				rta.setProducto(prod);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * funcion que adiciona un producto a la lista
	 * 
	 * @param lista
	 * @param idProducto
	 * @param cantidad
	 * @param porcentajeIva
	 * @param PrecioUnidad
	 * @return
	 */
	public List<ProdFacCompraTmpEntity> adicionaProductoLista(List<ProdFacCompraTmpEntity> lista,
			ProdFacCompraTmpEntity idProducto, Integer cantidad, BigDecimal porcentajeIva, BigDecimal precioUnidad) {
		List<ProdFacCompraTmpEntity> respuesta = new ArrayList<>();
		try {
			if (idProducto != null && idProducto.getProducto()!= null) {
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i).getProducto().getCodigoExt()
							.equalsIgnoreCase(idProducto.getProducto().getCodigoExt())) {
						lista.remove(i);
						break;
					}
				}

				idProducto.setCantidad(cantidad);
				idProducto.setPorcentajeIva(porcentajeIva);
				idProducto.setSubtotal(precioUnidad);
				BigDecimal iva = (porcentajeIva.divide(new BigDecimal(100)).add(new BigDecimal(1)));
				BigDecimal valorIva = precioUnidad.multiply(iva);
				idProducto.setTotal(valorIva.multiply(new BigDecimal(cantidad)));
				lista.add(0, idProducto);
			}
			respuesta = lista;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;

	}
	/**
	 * metodo que consulta los productos simple
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
	
	/**
	 * metodo que consulta las facturas de compra por criteriosS
	 * @param estado
	 * @param idSede
	 * @param fechaInicial
	 * @param fechaFinal
	 * @return
	 */
	public List<FacturaCompraTmpEntity> consultaFacturasXCriterio(String estado,Integer idSede,Date fechaInicial, Date fechaFinal){
		List<FacturaCompraTmpEntity> respuesta = null;
		try {
			respuesta = conexionWSFacturacion().getPortFact().obtenerFacturasCompraTmp(estado, Utilitites.dateToXMLGC(fechaInicial), Utilitites.dateToXMLGC(fechaFinal), idSede);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}
	
	/**
	 * metodo que consulta la factura de compra 
	 * @param id
	 * @return
	 */
	public FacturaCompraTmpEntity consultaFacturaID(Integer id){
		FacturaCompraTmpEntity entidad = new FacturaCompraTmpEntity();
		try {
			entidad = conexionWSFacturacion().getPortFact().obtenerFactTempCompraXId(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entidad;
	}
	
	/**
	 * consulta productos de facura de compra temporal
	 * @param id
	 * @return
	 */
	public List<ProdFacCompraTmpEntity> consultaProductosFacturaId(Integer id){
		List<ProdFacCompraTmpEntity> respuesta = new ArrayList<>();
		try {
			respuesta = conexionWSFacturacion().getPortFact().obtenerProdFacturasCompraTmp(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}
}
