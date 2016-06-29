
package co.com.codesoftware.server.nsigemco;

import java.math.BigDecimal;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AdministrationEndPoint", targetNamespace = "http://nsigemco.server.codesoftware.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdministrationEndPoint {


    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.CategoriaEntity>
     */
    @WebMethod
    @WebResult(name = "listaCategorias", targetNamespace = "")
    @RequestWrapper(localName = "obtieneCategorias", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneCategorias")
    @ResponseWrapper(localName = "obtieneCategoriasResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneCategoriasResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneCategoriasRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneCategoriasResponse")
    public List<CategoriaEntity> obtieneCategorias();

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.MarcaEntity>
     */
    @WebMethod
    @WebResult(name = "listaMarcas", targetNamespace = "")
    @RequestWrapper(localName = "obtieneMarcas", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneMarcas")
    @ResponseWrapper(localName = "obtieneMarcasResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneMarcasResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneMarcasRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneMarcasResponse")
    public List<MarcaEntity> obtieneMarcas();

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.SubCuentaEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaSubcuentas", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ConsultaSubcuentas")
    @ResponseWrapper(localName = "consultaSubcuentasResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ConsultaSubcuentasResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/consultaSubcuentasRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/consultaSubcuentasResponse")
    public List<SubCuentaEntity> consultaSubcuentas();

    /**
     * 
     * @param arg0
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(name = "RespuestaEntity", targetNamespace = "")
    @RequestWrapper(localName = "actualizaReferencia", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ActualizaReferencia")
    @ResponseWrapper(localName = "actualizaReferenciaResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ActualizaReferenciaResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/actualizaReferenciaRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/actualizaReferenciaResponse")
    public RespuestaEntity actualizaReferencia(
        @WebParam(name = "arg0", targetNamespace = "")
        ReferenciaEntity arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(name = "RespuestaEntity", targetNamespace = "")
    @RequestWrapper(localName = "insertaReferencia", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaReferencia")
    @ResponseWrapper(localName = "insertaReferenciaResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaReferenciaResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaReferenciaRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaReferenciaResponse")
    public RespuestaEntity insertaReferencia(
        @WebParam(name = "arg0", targetNamespace = "")
        ReferenciaEntity arg0);

    /**
     * 
     * @param proveedor
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(name = "RespuestaEntity", targetNamespace = "")
    @RequestWrapper(localName = "actualizarProveedor", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ActualizarProveedor")
    @ResponseWrapper(localName = "actualizarProveedorResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ActualizarProveedorResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/actualizarProveedorRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/actualizarProveedorResponse")
    public RespuestaEntity actualizarProveedor(
        @WebParam(name = "proveedor", targetNamespace = "")
        ProveedoresEntity proveedor);

    /**
     * 
     * @param arg0
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertaPedidosProducto", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaPedidosProducto")
    @ResponseWrapper(localName = "insertaPedidosProductoResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaPedidosProductoResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaPedidosProductoRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaPedidosProductoResponse")
    public RespuestaEntity insertaPedidosProducto(
        @WebParam(name = "arg0", targetNamespace = "")
        PedidoEntity arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(name = "RespuestaEntity", targetNamespace = "")
    @RequestWrapper(localName = "insertaProveedor", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaProveedor")
    @ResponseWrapper(localName = "insertaProveedorResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaProveedorResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaProveedorRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaProveedorResponse")
    public RespuestaEntity insertaProveedor(
        @WebParam(name = "arg0", targetNamespace = "")
        ProveedoresEntity arg0);

    /**
     * 
     * @param idCate
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.MarcaEntity>
     */
    @WebMethod
    @WebResult(name = "listaMarcas", targetNamespace = "")
    @RequestWrapper(localName = "obtieneMarcasXCate", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneMarcasXCate")
    @ResponseWrapper(localName = "obtieneMarcasXCateResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneMarcasXCateResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneMarcasXCateRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneMarcasXCateResponse")
    public List<MarcaEntity> obtieneMarcasXCate(
        @WebParam(name = "idCate", targetNamespace = "")
        Integer idCate);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.ProveedoresEntity>
     */
    @WebMethod
    @WebResult(name = "listaProveedores", targetNamespace = "")
    @RequestWrapper(localName = "obtieneProveedores", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneProveedores")
    @ResponseWrapper(localName = "obtieneProveedoresResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneProveedoresResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneProveedoresRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneProveedoresResponse")
    public List<ProveedoresEntity> obtieneProveedores();

    /**
     * 
     * @param arg0
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(name = "RespuestaEntity", targetNamespace = "")
    @RequestWrapper(localName = "insertaMarca", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaMarca")
    @ResponseWrapper(localName = "insertaMarcaResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaMarcaResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaMarcaRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaMarcaResponse")
    public RespuestaEntity insertaMarca(
        @WebParam(name = "arg0", targetNamespace = "")
        MarcaEntity arg0);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.ReferenciaEntity>
     */
    @WebMethod
    @WebResult(name = "listaReferencias", targetNamespace = "")
    @RequestWrapper(localName = "obtieneReferencias", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneReferencias")
    @ResponseWrapper(localName = "obtieneReferenciasResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneReferenciasResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneReferenciasRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneReferenciasResponse")
    public List<ReferenciaEntity> obtieneReferencias();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.ProductoEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtieneProductos", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneProductos")
    @ResponseWrapper(localName = "obtieneProductosResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneProductosResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneProductosRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneProductosResponse")
    public List<ProductoEntity> obtieneProductos(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.ProductoEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtieneProductosCategoria", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneProductosCategoria")
    @ResponseWrapper(localName = "obtieneProductosCategoriaResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneProductosCategoriaResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneProductosCategoriaRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneProductosCategoriaResponse")
    public List<ProductoEntity> obtieneProductosCategoria(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.ReferenciaEntity>
     */
    @WebMethod
    @WebResult(name = "obtieneReferencias", targetNamespace = "")
    @RequestWrapper(localName = "obtieneReferenciasXIdCate", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneReferenciasXIdCate")
    @ResponseWrapper(localName = "obtieneReferenciasXIdCateResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneReferenciasXIdCateResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneReferenciasXIdCateRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneReferenciasXIdCateResponse")
    public List<ReferenciaEntity> obtieneReferenciasXIdCate(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param listaProductos
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarProductoTemporal", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertarProductoTemporal")
    @ResponseWrapper(localName = "insertarProductoTemporalResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertarProductoTemporalResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertarProductoTemporalRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertarProductoTemporalResponse")
    public RespuestaEntity insertarProductoTemporal(
        @WebParam(name = "listaProductos", targetNamespace = "")
        List<ProductoTmpEntity> listaProductos);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.ProductoTmpEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaProductosTemporal", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ConsultaProductosTemporal")
    @ResponseWrapper(localName = "consultaProductosTemporalResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ConsultaProductosTemporalResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/consultaProductosTemporalRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/consultaProductosTemporalResponse")
    public List<ProductoTmpEntity> consultaProductosTemporal();

    /**
     * 
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarProductoExcel", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertarProductoExcel")
    @ResponseWrapper(localName = "insertarProductoExcelResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertarProductoExcelResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertarProductoExcelRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertarProductoExcelResponse")
    public RespuestaEntity insertarProductoExcel();

    /**
     * 
     * @param usuario
     * @param contrasena
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginUsuario", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.LoginUsuario")
    @ResponseWrapper(localName = "loginUsuarioResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.LoginUsuarioResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/loginUsuarioRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/loginUsuarioResponse")
    public List<Object> loginUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @param sedeSede
     * @param precio
     * @param precioEstatic
     * @param dskaDska
     * @param precioDec
     * @param precioMil
     * @param precioUni
     * @param tiusTius
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cambioPrecioProducto", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.CambioPrecioProducto")
    @ResponseWrapper(localName = "cambioPrecioProductoResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.CambioPrecioProductoResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/cambioPrecioProductoRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/cambioPrecioProductoResponse")
    public RespuestaEntity cambioPrecioProducto(
        @WebParam(name = "tius_tius", targetNamespace = "")
        Integer tiusTius,
        @WebParam(name = "sede_sede", targetNamespace = "")
        Integer sedeSede,
        @WebParam(name = "dska_dska", targetNamespace = "")
        Integer dskaDska,
        @WebParam(name = "precio", targetNamespace = "")
        BigDecimal precio,
        @WebParam(name = "precioUni", targetNamespace = "")
        BigDecimal precioUni,
        @WebParam(name = "precioDec", targetNamespace = "")
        BigDecimal precioDec,
        @WebParam(name = "precioMil", targetNamespace = "")
        BigDecimal precioMil,
        @WebParam(name = "precioEstatic", targetNamespace = "")
        String precioEstatic);

    /**
     * 
     * @param factura
     * @param productosFactura
     * @param pagoFactura
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertaFacturaCompra", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaFacturaCompra")
    @ResponseWrapper(localName = "insertaFacturaCompraResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaFacturaCompraResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaFacturaCompraRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaFacturaCompraResponse")
    public RespuestaEntity insertaFacturaCompra(
        @WebParam(name = "factura", targetNamespace = "")
        FacturaCompraEntity factura,
        @WebParam(name = "pagoFactura", targetNamespace = "")
        List<PagoFacCompraEntity> pagoFactura,
        @WebParam(name = "productosFactura", targetNamespace = "")
        List<ProductoFacCompraEntity> productosFactura);

    /**
     * 
     * @param idVersion
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.ReteFuenteEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaTablasRetencion", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ConsultaTablasRetencion")
    @ResponseWrapper(localName = "consultaTablasRetencionResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ConsultaTablasRetencionResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/consultaTablasRetencionRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/consultaTablasRetencionResponse")
    public List<ReteFuenteEntity> consultaTablasRetencion(
        @WebParam(name = "idVersion", targetNamespace = "")
        Integer idVersion);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.ProductoEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaProductoCodigoExterno", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ConsultaProductoCodigoExterno")
    @ResponseWrapper(localName = "consultaProductoCodigoExternoResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ConsultaProductoCodigoExternoResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/consultaProductoCodigoExternoRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/consultaProductoCodigoExternoResponse")
    public List<ProductoEntity> consultaProductoCodigoExterno(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.SubCuentaEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtieneSubCuentasFiltro", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneSubCuentasFiltro")
    @ResponseWrapper(localName = "obtieneSubCuentasFiltroResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneSubCuentasFiltroResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneSubCuentasFiltroRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneSubCuentasFiltroResponse")
    public List<SubCuentaEntity> obtieneSubCuentasFiltro(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param datos
     * @return
     *     returns java.util.List<co.com.codesoftware.server.nsigemco.SubCuentaEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtieneSubCuentasFiltros", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneSubCuentasFiltros")
    @ResponseWrapper(localName = "obtieneSubCuentasFiltrosResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.ObtieneSubCuentasFiltrosResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneSubCuentasFiltrosRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/obtieneSubCuentasFiltrosResponse")
    public List<SubCuentaEntity> obtieneSubCuentasFiltros(
        @WebParam(name = "datos", targetNamespace = "")
        List<PucEntity> datos);

    /**
     * 
     * @param arg0
     * @return
     *     returns co.com.codesoftware.server.nsigemco.RespuestaEntity
     */
    @WebMethod
    @WebResult(name = "RespuestaEntity", targetNamespace = "")
    @RequestWrapper(localName = "insertaRegistroProducto", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaRegistroProducto")
    @ResponseWrapper(localName = "insertaRegistroProductoResponse", targetNamespace = "http://nsigemco.server.codesoftware.com.co/", className = "co.com.codesoftware.server.nsigemco.InsertaRegistroProductoResponse")
    @Action(input = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaRegistroProductoRequest", output = "http://nsigemco.server.codesoftware.com.co/AdministrationEndPoint/insertaRegistroProductoResponse")
    public RespuestaEntity insertaRegistroProducto(
        @WebParam(name = "arg0", targetNamespace = "")
        ProductoEntity arg0);

}
