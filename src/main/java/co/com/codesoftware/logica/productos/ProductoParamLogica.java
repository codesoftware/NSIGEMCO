package co.com.codesoftware.logica.productos;

import java.util.List;

import co.com.codesoftware.servicio.producto.ProductosParamEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ProductoParamLogica implements WSGeneralInterface{

	/**
	 * metodo que consulta todos los productos parametrizados del sistema
	 * @return
	 */
	public List<ProductosParamEntity> consultaProdParam(){
		return conexionWSNewProd().getPortNewProductos().obtenerProductosParametrizado();
	}
	/**
	 * metodo que consulta el producto por id
	 * @param idProducto
	 * @return
	 */
	public ProductosParamEntity consultaUnicoProd(Integer idProducto){
		return conexionWSNewProd().getPortNewProductos().obtenerProdParametrizado(idProducto);
	}
	/**
	 * metodo que inserta un producto para paraametrizar
	 * @param entidad
	 * @return
	 */
	public boolean insertaProducto(ProductosParamEntity entidad){
		return conexionWSNewProd().getPortNewProductos().insertarProdParametrizado(entidad);
	}
	/**
	 * metodo que actualiza el producto parametrizado
	 * @param entidad
	 * @return
	 */
	public boolean actualizaProducto(ProductosParamEntity entidad){
		return conexionWSNewProd().getPortNewProductos().actualizaProdParametrizado(entidad);
	}
}
