
package co.com.codesoftware.servicio.producto;

import java.math.BigDecimal;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductoWS", targetNamespace = "http://producto.servicio.codesoftware.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductoWS {


    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.ProductosParamEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductosParametrizado", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductosParametrizado")
    @ResponseWrapper(localName = "obtenerProductosParametrizadoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductosParametrizadoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductosParametrizadoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductosParametrizadoResponse")
    public List<ProductosParamEntity> obtenerProductosParametrizado();

    /**
     * 
     * @param productoParametrizado
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizaProdParametrizado", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ActualizaProdParametrizado")
    @ResponseWrapper(localName = "actualizaProdParametrizadoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ActualizaProdParametrizadoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/actualizaProdParametrizadoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/actualizaProdParametrizadoResponse")
    public boolean actualizaProdParametrizado(
        @WebParam(name = "productoParametrizado", targetNamespace = "")
        ProductosParamEntity productoParametrizado);

    /**
     * 
     * @param idProd
     * @return
     *     returns co.com.codesoftware.servicio.producto.ProductosParamEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerProdParametrizado", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProdParametrizado")
    @ResponseWrapper(localName = "obtenerProdParametrizadoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProdParametrizadoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProdParametrizadoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProdParametrizadoResponse")
    public ProductosParamEntity obtenerProdParametrizado(
        @WebParam(name = "idProd", targetNamespace = "")
        Integer idProd);

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.PagoFacCompraEntity>
     */
    @WebMethod
    @WebResult(name = "PagoFacturaCompra", targetNamespace = "")
    @RequestWrapper(localName = "consultaPagoFactura", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaPagoFactura")
    @ResponseWrapper(localName = "consultaPagoFacturaResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaPagoFacturaResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaPagoFacturaRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaPagoFacturaResponse")
    public List<PagoFacCompraEntity> consultaPagoFactura(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.PagoFacturaCompraEntity>
     */
    @WebMethod
    @WebResult(name = "PagoFacturaCompra", targetNamespace = "")
    @RequestWrapper(localName = "consultaPagoFactReal", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaPagoFactReal")
    @ResponseWrapper(localName = "consultaPagoFactRealResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaPagoFactRealResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaPagoFactRealRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaPagoFactRealResponse")
    public List<PagoFacturaCompraEntity> consultaPagoFactReal(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

    /**
     * 
     * @param pago
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertaPagoFactCompra", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.InsertaPagoFactCompra")
    @ResponseWrapper(localName = "insertaPagoFactCompraResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.InsertaPagoFactCompraResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/insertaPagoFactCompraRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/insertaPagoFactCompraResponse")
    public String insertaPagoFactCompra(
        @WebParam(name = "pago", targetNamespace = "")
        PagoFacturaCompraEntity pago);

    /**
     * 
     * @param codigo
     * @param costo
     * @param idAporte
     * @param cantidad
     * @param idTius
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarProductoAporte", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.InsertarProductoAporte")
    @ResponseWrapper(localName = "insertarProductoAporteResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.InsertarProductoAporteResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/insertarProductoAporteRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/insertarProductoAporteResponse")
    public String insertarProductoAporte(
        @WebParam(name = "idAporte", targetNamespace = "")
        Integer idAporte,
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "cantidad", targetNamespace = "")
        Integer cantidad,
        @WebParam(name = "costo", targetNamespace = "")
        BigDecimal costo,
        @WebParam(name = "idTius", targetNamespace = "")
        Integer idTius);

    /**
     * 
     * @param idAporte
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminaProdAporte", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.EliminaProdAporte")
    @ResponseWrapper(localName = "eliminaProdAporteResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.EliminaProdAporteResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/eliminaProdAporteRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/eliminaProdAporteResponse")
    public String eliminaProdAporte(
        @WebParam(name = "idAporte", targetNamespace = "")
        Integer idAporte);

    /**
     * 
     * @param idAuxCon
     * @param idAporte
     * @param idTius
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generaProcesoAporte", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.GeneraProcesoAporte")
    @ResponseWrapper(localName = "generaProcesoAporteResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.GeneraProcesoAporteResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/generaProcesoAporteRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/generaProcesoAporteResponse")
    public String generaProcesoAporte(
        @WebParam(name = "idAporte", targetNamespace = "")
        Integer idAporte,
        @WebParam(name = "idAuxCon", targetNamespace = "")
        Integer idAuxCon,
        @WebParam(name = "idTius", targetNamespace = "")
        Integer idTius);

    /**
     * 
     * @param sedeSede
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.ProductoGenericoEntity>
     */
    @WebMethod
    @WebResult(name = "ListGeneric", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductosXSede", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductosXSede")
    @ResponseWrapper(localName = "obtenerProductosXSedeResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductosXSedeResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductosXSedeRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductosXSedeResponse")
    public List<ProductoGenericoEntity> obtenerProductosXSede(
        @WebParam(name = "sede_sede", targetNamespace = "")
        int sedeSede);

    /**
     * 
     * @param precio
     * @param dskaDska
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaPromPonderado", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaPromPonderado")
    @ResponseWrapper(localName = "consultaPromPonderadoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaPromPonderadoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaPromPonderadoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaPromPonderadoResponse")
    public String consultaPromPonderado(
        @WebParam(name = "dska_dska", targetNamespace = "")
        int dskaDska,
        @WebParam(name = "precio", targetNamespace = "")
        BigDecimal precio);

    /**
     * 
     * @param idDska
     * @return
     *     returns co.com.codesoftware.servicio.producto.PromPonderaEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerPromedioPonderadoProducto", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerPromedioPonderadoProducto")
    @ResponseWrapper(localName = "obtenerPromedioPonderadoProductoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerPromedioPonderadoProductoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerPromedioPonderadoProductoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerPromedioPonderadoProductoResponse")
    public PromPonderaEntity obtenerPromedioPonderadoProducto(
        @WebParam(name = "idDska", targetNamespace = "")
        int idDska);

    /**
     * 
     * @param idDska
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.ExistenciaXSedeEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerExistenciasProducto", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerExistenciasProducto")
    @ResponseWrapper(localName = "obtenerExistenciasProductoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerExistenciasProductoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerExistenciasProductoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerExistenciasProductoResponse")
    public List<ExistenciaXSedeEntity> obtenerExistenciasProducto(
        @WebParam(name = "idDska", targetNamespace = "")
        int idDska);

    /**
     * 
     * @param sedeSede
     * @param criterio
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.ProductoGenericoEntity>
     */
    @WebMethod
    @WebResult(name = "ListGeneric", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductosYRecetasXCriterio", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductosYRecetasXCriterio")
    @ResponseWrapper(localName = "obtenerProductosYRecetasXCriterioResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductosYRecetasXCriterioResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductosYRecetasXCriterioRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductosYRecetasXCriterioResponse")
    public List<ProductoGenericoEntity> obtenerProductosYRecetasXCriterio(
        @WebParam(name = "sede_sede", targetNamespace = "")
        int sedeSede,
        @WebParam(name = "criterio", targetNamespace = "")
        String criterio);

    /**
     * 
     * @param sedeSede
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.PrecioProductoEntity>
     */
    @WebMethod
    @WebResult(name = "PrecioProducto", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductoXSede", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductoXSede")
    @ResponseWrapper(localName = "obtenerProductoXSedeResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductoXSedeResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductoXSedeRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductoXSedeResponse")
    public List<PrecioProductoEntity> obtenerProductoXSede(
        @WebParam(name = "sede_sede", targetNamespace = "")
        int sedeSede);

    /**
     * 
     * @param codigoExterno
     * @return
     *     returns co.com.codesoftware.servicio.producto.ProductoGenericoEntity
     */
    @WebMethod
    @WebResult(name = "prodGenerico", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProdcutoGeneriXCodExt", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProdcutoGeneriXCodExt")
    @ResponseWrapper(localName = "obtenerProdcutoGeneriXCodExtResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProdcutoGeneriXCodExtResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProdcutoGeneriXCodExtRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProdcutoGeneriXCodExtResponse")
    public ProductoGenericoEntity obtenerProdcutoGeneriXCodExt(
        @WebParam(name = "codigoExterno", targetNamespace = "")
        String codigoExterno);

    /**
     * 
     * @param sedeSede
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.ProductoGenericoEntity>
     */
    @WebMethod
    @WebResult(name = "ListGeneric", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductosYRecetas", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductosYRecetas")
    @ResponseWrapper(localName = "obtenerProductosYRecetasResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductosYRecetasResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductosYRecetasRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductosYRecetasResponse")
    public List<ProductoGenericoEntity> obtenerProductosYRecetas(
        @WebParam(name = "sede_sede", targetNamespace = "")
        int sedeSede);

    /**
     * 
     * @param idSede
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.PrecioRecetaEntity>
     */
    @WebMethod
    @WebResult(name = "ListaReceta", targetNamespace = "")
    @RequestWrapper(localName = "obtieneRecetasXSede", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtieneRecetasXSede")
    @ResponseWrapper(localName = "obtieneRecetasXSedeResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtieneRecetasXSedeResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtieneRecetasXSedeRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtieneRecetasXSedeResponse")
    public List<PrecioRecetaEntity> obtieneRecetasXSede(
        @WebParam(name = "idSede", targetNamespace = "")
        Integer idSede);

    /**
     * 
     * @param sedeSede
     * @param dskaCod
     * @return
     *     returns co.com.codesoftware.servicio.producto.PrecioProductoEntity
     */
    @WebMethod
    @WebResult(name = "ProductoTable", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductoXCodigo", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductoXCodigo")
    @ResponseWrapper(localName = "obtenerProductoXCodigoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductoXCodigoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductoXCodigoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductoXCodigoResponse")
    public PrecioProductoEntity obtenerProductoXCodigo(
        @WebParam(name = "dska_cod", targetNamespace = "")
        String dskaCod,
        @WebParam(name = "sede_sede", targetNamespace = "")
        Integer sedeSede);

    /**
     * 
     * @param codigo
     * @param sede
     * @return
     *     returns co.com.codesoftware.servicio.producto.PrecioRecetaEntity
     */
    @WebMethod
    @WebResult(name = "recetaEntity", targetNamespace = "")
    @RequestWrapper(localName = "obtenerRecetaXCodigo", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerRecetaXCodigo")
    @ResponseWrapper(localName = "obtenerRecetaXCodigoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerRecetaXCodigoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerRecetaXCodigoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerRecetaXCodigoResponse")
    public PrecioRecetaEntity obtenerRecetaXCodigo(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "sede", targetNamespace = "")
        Integer sede);

    /**
     * 
     * @param sedeSede
     * @param codExt
     * @return
     *     returns co.com.codesoftware.servicio.producto.PrecioProductoEntity
     */
    @WebMethod
    @WebResult(name = "ProductoTable", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductoXCodExt", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductoXCodExt")
    @ResponseWrapper(localName = "obtenerProductoXCodExtResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductoXCodExtResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductoXCodExtRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductoXCodExtResponse")
    public PrecioProductoEntity obtenerProductoXCodExt(
        @WebParam(name = "codExt", targetNamespace = "")
        String codExt,
        @WebParam(name = "sede_sede", targetNamespace = "")
        Integer sedeSede);

    /**
     * 
     * @param sedeSede
     * @param codBarras
     * @return
     *     returns co.com.codesoftware.servicio.producto.PrecioProductoEntity
     */
    @WebMethod
    @WebResult(name = "ProductoTable", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductoXCodBarras", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductoXCodBarras")
    @ResponseWrapper(localName = "obtenerProductoXCodBarrasResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductoXCodBarrasResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductoXCodBarrasRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductoXCodBarrasResponse")
    public PrecioProductoEntity obtenerProductoXCodBarras(
        @WebParam(name = "codBarras", targetNamespace = "")
        String codBarras,
        @WebParam(name = "sede_sede", targetNamespace = "")
        Integer sedeSede);

    /**
     * 
     * @param sedeSede
     * @param idDska
     * @return
     *     returns co.com.codesoftware.servicio.producto.ExistenciaXSedeEntity
     */
    @WebMethod
    @WebResult(name = "ExistenciaXSedeEntity", targetNamespace = "")
    @RequestWrapper(localName = "obtenerCantidadesXSede", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerCantidadesXSede")
    @ResponseWrapper(localName = "obtenerCantidadesXSedeResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerCantidadesXSedeResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerCantidadesXSedeRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerCantidadesXSedeResponse")
    public ExistenciaXSedeEntity obtenerCantidadesXSede(
        @WebParam(name = "sede_sede", targetNamespace = "")
        int sedeSede,
        @WebParam(name = "idDska", targetNamespace = "")
        int idDska);

    /**
     * 
     * @param idDska
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.ExistenciaXSedeEntity>
     */
    @WebMethod
    @WebResult(name = "ExistenciaXSedeEntity", targetNamespace = "")
    @RequestWrapper(localName = "obtenerCantidadesTotales", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerCantidadesTotales")
    @ResponseWrapper(localName = "obtenerCantidadesTotalesResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerCantidadesTotalesResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerCantidadesTotalesRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerCantidadesTotalesResponse")
    public List<ExistenciaXSedeEntity> obtenerCantidadesTotales(
        @WebParam(name = "idDska", targetNamespace = "")
        int idDska);

    /**
     * 
     * @param idDska
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.ExistenciaXSedeEntity>
     */
    @WebMethod
    @WebResult(name = "ExistenciaXSedeEntity", targetNamespace = "")
    @RequestWrapper(localName = "obtenerCantidadesXProducto", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerCantidadesXProducto")
    @ResponseWrapper(localName = "obtenerCantidadesXProductoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerCantidadesXProductoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerCantidadesXProductoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerCantidadesXProductoResponse")
    public List<ExistenciaXSedeEntity> obtenerCantidadesXProducto(
        @WebParam(name = "idDska", targetNamespace = "")
        int idDska);

    /**
     * 
     * @param solicitud
     * @return
     *     returns co.com.codesoftware.servicio.producto.RespuestaEntity
     */
    @WebMethod
    @WebResult(name = "RespuestaEntity", targetNamespace = "")
    @RequestWrapper(localName = "insertaSolicitud", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.InsertaSolicitud")
    @ResponseWrapper(localName = "insertaSolicitudResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.InsertaSolicitudResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/insertaSolicitudRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/insertaSolicitudResponse")
    public RespuestaEntity insertaSolicitud(
        @WebParam(name = "solicitud", targetNamespace = "")
        SolicitudEntity solicitud);

    /**
     * 
     * @param codExterno
     * @return
     *     returns co.com.codesoftware.servicio.producto.ProductoSimpleEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaProdXcodExterno", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaProdXcodExterno")
    @ResponseWrapper(localName = "consultaProdXcodExternoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaProdXcodExternoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaProdXcodExternoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaProdXcodExternoResponse")
    public ProductoSimpleEntity consultaProdXcodExterno(
        @WebParam(name = "codExterno", targetNamespace = "")
        String codExterno);

    /**
     * 
     * @param idSede
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.ExistenciaXSedeEntity>
     */
    @WebMethod
    @WebResult(name = "ExistenciaXSedeEntity", targetNamespace = "")
    @RequestWrapper(localName = "obtenerCantidadesTotalesXSede", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerCantidadesTotalesXSede")
    @ResponseWrapper(localName = "obtenerCantidadesTotalesXSedeResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerCantidadesTotalesXSedeResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerCantidadesTotalesXSedeRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerCantidadesTotalesXSedeResponse")
    public List<ExistenciaXSedeEntity> obtenerCantidadesTotalesXSede(
        @WebParam(name = "idSede", targetNamespace = "")
        int idSede);

    /**
     * 
     * @param productosSolicitud
     * @return
     *     returns co.com.codesoftware.servicio.producto.RespuestaEntity
     */
    @WebMethod
    @WebResult(name = "respuestaEntity", targetNamespace = "")
    @RequestWrapper(localName = "insertaProductosSolicitud", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.InsertaProductosSolicitud")
    @ResponseWrapper(localName = "insertaProductosSolicitudResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.InsertaProductosSolicitudResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/insertaProductosSolicitudRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/insertaProductosSolicitudResponse")
    public RespuestaEntity insertaProductosSolicitud(
        @WebParam(name = "productosSolicitud", targetNamespace = "")
        List<SolicitudProdEntity> productosSolicitud);

    /**
     * 
     * @param fechaInicial
     * @param estado
     * @param sede
     * @param fechaFinal
     * @param usuario
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.SolicitudEntity>
     */
    @WebMethod
    @WebResult(name = "listaSolicitudes", targetNamespace = "")
    @RequestWrapper(localName = "obtenerSolicitudesFiltros", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerSolicitudesFiltros")
    @ResponseWrapper(localName = "obtenerSolicitudesFiltrosResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerSolicitudesFiltrosResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerSolicitudesFiltrosRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerSolicitudesFiltrosResponse")
    public List<SolicitudEntity> obtenerSolicitudesFiltros(
        @WebParam(name = "fechaInicial", targetNamespace = "")
        XMLGregorianCalendar fechaInicial,
        @WebParam(name = "fechaFinal", targetNamespace = "")
        XMLGregorianCalendar fechaFinal,
        @WebParam(name = "sede", targetNamespace = "")
        Integer sede,
        @WebParam(name = "usuario", targetNamespace = "")
        Integer usuario,
        @WebParam(name = "estado", targetNamespace = "")
        String estado);

    /**
     * 
     * @param idSolicitud
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.SolicitudProdEntity>
     */
    @WebMethod
    @WebResult(name = "listaProductos", targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductosXSolicitud", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductosXSolicitud")
    @ResponseWrapper(localName = "obtenerProductosXSolicitudResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerProductosXSolicitudResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductosXSolicitudRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerProductosXSolicitudResponse")
    public List<SolicitudProdEntity> obtenerProductosXSolicitud(
        @WebParam(name = "idSolicitud", targetNamespace = "")
        Integer idSolicitud);

    /**
     * 
     * @param fecha
     * @param sede
     * @param usuario
     * @return
     *     returns co.com.codesoftware.servicio.producto.SolicitudEntity
     */
    @WebMethod
    @WebResult(name = "solicitud", targetNamespace = "")
    @RequestWrapper(localName = "obtenerSolicitudXfiltro", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerSolicitudXfiltro")
    @ResponseWrapper(localName = "obtenerSolicitudXfiltroResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerSolicitudXfiltroResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerSolicitudXfiltroRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerSolicitudXfiltroResponse")
    public SolicitudEntity obtenerSolicitudXfiltro(
        @WebParam(name = "fecha", targetNamespace = "")
        XMLGregorianCalendar fecha,
        @WebParam(name = "sede", targetNamespace = "")
        Integer sede,
        @WebParam(name = "usuario", targetNamespace = "")
        Integer usuario);

    /**
     * 
     * @param id
     * @return
     *     returns co.com.codesoftware.servicio.producto.SolicitudEntity
     */
    @WebMethod
    @WebResult(name = "solicitud", targetNamespace = "")
    @RequestWrapper(localName = "obtenerSolicitudXId", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerSolicitudXId")
    @ResponseWrapper(localName = "obtenerSolicitudXIdResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ObtenerSolicitudXIdResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerSolicitudXIdRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/obtenerSolicitudXIdResponse")
    public SolicitudEntity obtenerSolicitudXId(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

    /**
     * 
     * @param productosSolicitud
     * @param idUsuario
     * @return
     *     returns co.com.codesoftware.servicio.producto.RespuestaEntity
     */
    @WebMethod
    @WebResult(name = "RespuestaEntity", targetNamespace = "")
    @RequestWrapper(localName = "actualizaSolicitud", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ActualizaSolicitud")
    @ResponseWrapper(localName = "actualizaSolicitudResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ActualizaSolicitudResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/actualizaSolicitudRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/actualizaSolicitudResponse")
    public RespuestaEntity actualizaSolicitud(
        @WebParam(name = "idUsuario", targetNamespace = "")
        Integer idUsuario,
        @WebParam(name = "productosSolicitud", targetNamespace = "")
        List<SolicitudProdEntity> productosSolicitud);

    /**
     * 
     * @param idFactura
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.producto.PagoFacturaCompraEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaPagosFactCompra", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaPagosFactCompra")
    @ResponseWrapper(localName = "consultaPagosFactCompraResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaPagosFactCompraResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaPagosFactCompraRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaPagosFactCompraResponse")
    public List<PagoFacturaCompraEntity> consultaPagosFactCompra(
        @WebParam(name = "idFactura", targetNamespace = "")
        Integer idFactura);

    /**
     * 
     * @param id
     * @return
     *     returns co.com.codesoftware.servicio.producto.FacturaCompraEntity
     */
    @WebMethod
    @WebResult(name = "facturaCompraEntity", targetNamespace = "")
    @RequestWrapper(localName = "consultaFactCompra", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaFactCompra")
    @ResponseWrapper(localName = "consultaFactCompraResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.ConsultaFactCompraResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaFactCompraRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/consultaFactCompraResponse")
    public FacturaCompraEntity consultaFactCompra(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

    /**
     * 
     * @param productoParametrizado
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarProdParametrizado", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.InsertarProdParametrizado")
    @ResponseWrapper(localName = "insertarProdParametrizadoResponse", targetNamespace = "http://producto.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.producto.InsertarProdParametrizadoResponse")
    @Action(input = "http://producto.servicio.codesoftware.com.co/ProductoWS/insertarProdParametrizadoRequest", output = "http://producto.servicio.codesoftware.com.co/ProductoWS/insertarProdParametrizadoResponse")
    public boolean insertarProdParametrizado(
        @WebParam(name = "productoParametrizado", targetNamespace = "")
        ProductosParamEntity productoParametrizado);

}
