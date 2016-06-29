
package co.com.codesoftware.server.productos;

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
@WebService(name = "ProductosEndPoint", targetNamespace = "http://productos.server.codesoftware.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductosEndPoint {


    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.server.productos.ProductoSimpleEntity>
     */
    @WebMethod
    @WebResult(name = "ProductoSimple", targetNamespace = "")
    @RequestWrapper(localName = "consultaProductos", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ConsultaProductos")
    @ResponseWrapper(localName = "consultaProductosResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ConsultaProductosResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/consultaProductosRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/consultaProductosResponse")
    public List<ProductoSimpleEntity> consultaProductos();

    /**
     * 
     * @param dskaDska
     * @return
     *     returns co.com.codesoftware.server.productos.ProductoSimpleEntity
     */
    @WebMethod
    @WebResult(name = "ProductoSimple", targetNamespace = "")
    @RequestWrapper(localName = "consultaProductoXId", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ConsultaProductoXId")
    @ResponseWrapper(localName = "consultaProductoXIdResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ConsultaProductoXIdResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/consultaProductoXIdRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/consultaProductoXIdResponse")
    public ProductoSimpleEntity consultaProductoXId(
        @WebParam(name = "dska_dska", targetNamespace = "")
        Integer dskaDska);

    /**
     * 
     * @param dskaCodExt
     * @param dskaDska
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "validacion", targetNamespace = "")
    @RequestWrapper(localName = "validaCodigoExterno", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ValidaCodigoExterno")
    @ResponseWrapper(localName = "validaCodigoExternoResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ValidaCodigoExternoResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/validaCodigoExternoRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/validaCodigoExternoResponse")
    public String validaCodigoExterno(
        @WebParam(name = "dska_dska", targetNamespace = "")
        Integer dskaDska,
        @WebParam(name = "dska_cod_ext", targetNamespace = "")
        String dskaCodExt);

    /**
     * 
     * @param productoSimple
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "respuesta", targetNamespace = "")
    @RequestWrapper(localName = "actualizaProductoSimple", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ActualizaProductoSimple")
    @ResponseWrapper(localName = "actualizaProductoSimpleResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ActualizaProductoSimpleResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/actualizaProductoSimpleRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/actualizaProductoSimpleResponse")
    public String actualizaProductoSimple(
        @WebParam(name = "productoSimple", targetNamespace = "")
        ProductoSimpleEntity productoSimple);

    /**
     * 
     * @param idSede
     * @param idDska
     * @return
     *     returns java.util.List<co.com.codesoftware.server.productos.PrecioProdSimpleEntity>
     */
    @WebMethod
    @WebResult(name = "listaPrecios", targetNamespace = "")
    @RequestWrapper(localName = "buscaHistProdXSede", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.BuscaHistProdXSede")
    @ResponseWrapper(localName = "buscaHistProdXSedeResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.BuscaHistProdXSedeResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/buscaHistProdXSedeRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/buscaHistProdXSedeResponse")
    public List<PrecioProdSimpleEntity> buscaHistProdXSede(
        @WebParam(name = "idDska", targetNamespace = "")
        Integer idDska,
        @WebParam(name = "idSede", targetNamespace = "")
        Integer idSede);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg7
     * @param arg6
     * @param arg8
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "respuesta", targetNamespace = "")
    @RequestWrapper(localName = "insercionParamPrecioMasivo", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.InsercionParamPrecioMasivo")
    @ResponseWrapper(localName = "insercionParamPrecioMasivoResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.InsercionParamPrecioMasivoResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/insercionParamPrecioMasivoRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/insercionParamPrecioMasivoResponse")
    public String insercionParamPrecioMasivo(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Integer arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        Integer arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        Integer arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        Integer arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        Integer arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        Integer arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        Integer arg8);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.server.productos.PorcentajePrecioEntity>
     */
    @WebMethod
    @WebResult(name = "listaPorcPrecio", targetNamespace = "")
    @RequestWrapper(localName = "buscaPorcentajePrecio", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.BuscaPorcentajePrecio")
    @ResponseWrapper(localName = "buscaPorcentajePrecioResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.BuscaPorcentajePrecioResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/buscaPorcentajePrecioRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/buscaPorcentajePrecioResponse")
    public List<PorcentajePrecioEntity> buscaPorcentajePrecio(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.server.productos.PorcentajePrecioEntity>
     */
    @WebMethod
    @WebResult(name = "listaPorcPrecio", targetNamespace = "")
    @RequestWrapper(localName = "buscaPorcentajePrecioFiltros", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.BuscaPorcentajePrecioFiltros")
    @ResponseWrapper(localName = "buscaPorcentajePrecioFiltrosResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.BuscaPorcentajePrecioFiltrosResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/buscaPorcentajePrecioFiltrosRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/buscaPorcentajePrecioFiltrosResponse")
    public List<PorcentajePrecioEntity> buscaPorcentajePrecioFiltros(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Integer arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        Integer arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        Integer arg4);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns co.com.codesoftware.server.productos.ProductoEntity
     */
    @WebMethod
    @WebResult(name = "listaProducto", targetNamespace = "")
    @RequestWrapper(localName = "buscaProductoFiltros", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.BuscaProductoFiltros")
    @ResponseWrapper(localName = "buscaProductoFiltrosResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.BuscaProductoFiltrosResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/buscaProductoFiltrosRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/buscaProductoFiltrosResponse")
    public ProductoEntity buscaProductoFiltros(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "respuesta", targetNamespace = "")
    @RequestWrapper(localName = "ejecutaCambioPrecioMasivo", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.EjecutaCambioPrecioMasivo")
    @ResponseWrapper(localName = "ejecutaCambioPrecioMasivoResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.EjecutaCambioPrecioMasivoResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/ejecutaCambioPrecioMasivoRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/ejecutaCambioPrecioMasivoResponse")
    public String ejecutaCambioPrecioMasivo(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Integer arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        Integer arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        Integer arg4);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "respuesta", targetNamespace = "")
    @RequestWrapper(localName = "ejecutaCambioPrecioMasivoEnProd", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.EjecutaCambioPrecioMasivoEnProd")
    @ResponseWrapper(localName = "ejecutaCambioPrecioMasivoEnProdResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.EjecutaCambioPrecioMasivoEnProdResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/ejecutaCambioPrecioMasivoEnProdRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/ejecutaCambioPrecioMasivoEnProdResponse")
    public String ejecutaCambioPrecioMasivoEnProd(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Integer arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        Integer arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        Integer arg4);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.server.productos.FacturaCompraTotalEntity>
     */
    @WebMethod
    @WebResult(name = "FacturaCompraTotalEntity", targetNamespace = "")
    @RequestWrapper(localName = "consultaFacturaCompraFiltros", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ConsultaFacturaCompraFiltros")
    @ResponseWrapper(localName = "consultaFacturaCompraFiltrosResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ConsultaFacturaCompraFiltrosResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/consultaFacturaCompraFiltrosRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/consultaFacturaCompraFiltrosResponse")
    public List<FacturaCompraTotalEntity> consultaFacturaCompraFiltros(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        XMLGregorianCalendar arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        XMLGregorianCalendar arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5);

    /**
     * 
     * @param arg0
     * @return
     *     returns co.com.codesoftware.server.productos.RespuestaEntity
     */
    @WebMethod
    @WebResult(name = "ResultEntity", targetNamespace = "")
    @RequestWrapper(localName = "insertaImagenesFacturaCompra", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.InsertaImagenesFacturaCompra")
    @ResponseWrapper(localName = "insertaImagenesFacturaCompraResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.InsertaImagenesFacturaCompraResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/insertaImagenesFacturaCompraRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/insertaImagenesFacturaCompraResponse")
    public RespuestaEntity insertaImagenesFacturaCompra(
        @WebParam(name = "arg0", targetNamespace = "")
        ImagenesFacCompraEntity arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns co.com.codesoftware.server.productos.FacturaCompraGeneralEntity
     */
    @WebMethod
    @WebResult(name = "FacturaCompraGeneralEntity", targetNamespace = "")
    @RequestWrapper(localName = "consultaFacturaTotal", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ConsultaFacturaTotal")
    @ResponseWrapper(localName = "consultaFacturaTotalResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.ConsultaFacturaTotalResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/consultaFacturaTotalRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/consultaFacturaTotalResponse")
    public FacturaCompraGeneralEntity consultaFacturaTotal(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param fechaIni
     * @param idSede
     * @param fechaFin
     * @param idDska
     * @return
     *     returns java.util.List<co.com.codesoftware.server.productos.KardexProductoEntity>
     */
    @WebMethod
    @WebResult(name = "listaKardexProd", targetNamespace = "")
    @RequestWrapper(localName = "buscaKardexProductoXSede", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.BuscaKardexProductoXSede")
    @ResponseWrapper(localName = "buscaKardexProductoXSedeResponse", targetNamespace = "http://productos.server.codesoftware.com.co/", className = "co.com.codesoftware.server.productos.BuscaKardexProductoXSedeResponse")
    @Action(input = "http://productos.server.codesoftware.com.co/ProductosEndPoint/buscaKardexProductoXSedeRequest", output = "http://productos.server.codesoftware.com.co/ProductosEndPoint/buscaKardexProductoXSedeResponse")
    public List<KardexProductoEntity> buscaKardexProductoXSede(
        @WebParam(name = "idDska", targetNamespace = "")
        Integer idDska,
        @WebParam(name = "idSede", targetNamespace = "")
        Integer idSede,
        @WebParam(name = "fechaIni", targetNamespace = "")
        XMLGregorianCalendar fechaIni,
        @WebParam(name = "fechaFin", targetNamespace = "")
        XMLGregorianCalendar fechaFin);

}