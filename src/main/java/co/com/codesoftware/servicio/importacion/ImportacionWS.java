
package co.com.codesoftware.servicio.importacion;

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
@WebService(name = "ImportacionWS", targetNamespace = "http://importacion.servicio.codesoftware.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ImportacionWS {


    /**
     * 
     * @param idGast
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarGastoImportacion", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.EliminarGastoImportacion")
    @ResponseWrapper(localName = "eliminarGastoImportacionResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.EliminarGastoImportacionResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/eliminarGastoImportacionRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/eliminarGastoImportacionResponse")
    public String eliminarGastoImportacion(
        @WebParam(name = "idGast", targetNamespace = "")
        Integer idGast);

    /**
     * 
     * @param provInter
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarProveedorInternacional", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertarProveedorInternacional")
    @ResponseWrapper(localName = "insertarProveedorInternacionalResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertarProveedorInternacionalResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertarProveedorInternacionalRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertarProveedorInternacionalResponse")
    public String insertarProveedorInternacional(
        @WebParam(name = "provInter", targetNamespace = "")
        ProveedorInterEntity provInter);

    /**
     * 
     * @param fechaInicial
     * @param fechaFinal
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.importacion.ImportacionEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerImportaciones", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerImportaciones")
    @ResponseWrapper(localName = "obtenerImportacionesResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerImportacionesResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerImportacionesRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerImportacionesResponse")
    public List<ImportacionEntity> obtenerImportaciones(
        @WebParam(name = "fechaInicial", targetNamespace = "")
        XMLGregorianCalendar fechaInicial,
        @WebParam(name = "fechaFinal", targetNamespace = "")
        XMLGregorianCalendar fechaFinal);

    /**
     * 
     * @param idImpo
     * @return
     *     returns co.com.codesoftware.servicio.importacion.ImportacionEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerImportacion", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerImportacion")
    @ResponseWrapper(localName = "obtenerImportacionResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerImportacionResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerImportacionRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerImportacionResponse")
    public ImportacionEntity obtenerImportacion(
        @WebParam(name = "idImpo", targetNamespace = "")
        Integer idImpo);

    /**
     * 
     * @param importEntity
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertaImportacion", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertaImportacion")
    @ResponseWrapper(localName = "insertaImportacionResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertaImportacionResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertaImportacionRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertaImportacionResponse")
    public String insertaImportacion(
        @WebParam(name = "importEntity", targetNamespace = "")
        ImportacionEntity importEntity);

    /**
     * 
     * @param tazaProm
     * @param idImpo
     * @param trm
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertaValorDolaresProd", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertaValorDolaresProd")
    @ResponseWrapper(localName = "insertaValorDolaresProdResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertaValorDolaresProdResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertaValorDolaresProdRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertaValorDolaresProdResponse")
    public String insertaValorDolaresProd(
        @WebParam(name = "idImpo", targetNamespace = "")
        Integer idImpo,
        @WebParam(name = "trm", targetNamespace = "")
        BigDecimal trm,
        @WebParam(name = "tazaProm", targetNamespace = "")
        BigDecimal tazaProm);

    /**
     * 
     * @param idImpo
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.importacion.GastoImpoEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerGastosImpo", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerGastosImpo")
    @ResponseWrapper(localName = "obtenerGastosImpoResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerGastosImpoResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerGastosImpoRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerGastosImpoResponse")
    public List<GastoImpoEntity> obtenerGastosImpo(
        @WebParam(name = "idImpo", targetNamespace = "")
        Integer idImpo);

    /**
     * 
     * @param precio
     * @param codExterno
     * @param cantidad
     * @param idImpo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarProductoImportacion", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertarProductoImportacion")
    @ResponseWrapper(localName = "insertarProductoImportacionResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertarProductoImportacionResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertarProductoImportacionRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertarProductoImportacionResponse")
    public String insertarProductoImportacion(
        @WebParam(name = "idImpo", targetNamespace = "")
        Integer idImpo,
        @WebParam(name = "codExterno", targetNamespace = "")
        String codExterno,
        @WebParam(name = "cantidad", targetNamespace = "")
        Integer cantidad,
        @WebParam(name = "precio", targetNamespace = "")
        BigDecimal precio);

    /**
     * 
     * @param idImpo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "borrarProductosImportacion", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.BorrarProductosImportacion")
    @ResponseWrapper(localName = "borrarProductosImportacionResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.BorrarProductosImportacionResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/borrarProductosImportacionRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/borrarProductosImportacionResponse")
    public String borrarProductosImportacion(
        @WebParam(name = "idImpo", targetNamespace = "")
        Integer idImpo);

    /**
     * 
     * @param idImpo
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.importacion.ProductoImportacionEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductosImportacion", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerProductosImportacion")
    @ResponseWrapper(localName = "obtenerProductosImportacionResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerProductosImportacionResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerProductosImportacionRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerProductosImportacionResponse")
    public List<ProductoImportacionEntity> obtenerProductosImportacion(
        @WebParam(name = "idImpo", targetNamespace = "")
        Integer idImpo);

    /**
     * 
     * @param detalle
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarDetalleGasto", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertarDetalleGasto")
    @ResponseWrapper(localName = "insertarDetalleGastoResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertarDetalleGastoResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertarDetalleGastoRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertarDetalleGastoResponse")
    public String insertarDetalleGasto(
        @WebParam(name = "detalle", targetNamespace = "")
        DetalleGastoEntity detalle);

    /**
     * 
     * @param gasto
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertaGastoImportacion", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertaGastoImportacion")
    @ResponseWrapper(localName = "insertaGastoImportacionResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.InsertaGastoImportacionResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertaGastoImportacionRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/insertaGastoImportacionResponse")
    public String insertaGastoImportacion(
        @WebParam(name = "gasto", targetNamespace = "")
        GastoImpoEntity gasto);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.importacion.ProveedorInterEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerProveedoresInter", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerProveedoresInter")
    @ResponseWrapper(localName = "obtenerProveedoresInterResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerProveedoresInterResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerProveedoresInterRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerProveedoresInterResponse")
    public List<ProveedorInterEntity> obtenerProveedoresInter();

    /**
     * 
     * @param idDet
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarDetalleGasto", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.EliminarDetalleGasto")
    @ResponseWrapper(localName = "eliminarDetalleGastoResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.EliminarDetalleGastoResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/eliminarDetalleGastoRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/eliminarDetalleGastoResponse")
    public String eliminarDetalleGasto(
        @WebParam(name = "idDet", targetNamespace = "")
        Integer idDet);

    /**
     * 
     * @param idtius
     * @param idSede
     * @param idImpo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ejecutaProcesoImportacion", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.EjecutaProcesoImportacion")
    @ResponseWrapper(localName = "ejecutaProcesoImportacionResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.EjecutaProcesoImportacionResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/ejecutaProcesoImportacionRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/ejecutaProcesoImportacionResponse")
    public String ejecutaProcesoImportacion(
        @WebParam(name = "idtius", targetNamespace = "")
        Integer idtius,
        @WebParam(name = "idImpo", targetNamespace = "")
        Integer idImpo,
        @WebParam(name = "idSede", targetNamespace = "")
        Integer idSede);

    /**
     * 
     * @param idGasto
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.importacion.DetalleGastoEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerDetalleGasto", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerDetalleGasto")
    @ResponseWrapper(localName = "obtenerDetalleGastoResponse", targetNamespace = "http://importacion.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.importacion.ObtenerDetalleGastoResponse")
    @Action(input = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerDetalleGastoRequest", output = "http://importacion.servicio.codesoftware.com.co/ImportacionWS/obtenerDetalleGastoResponse")
    public List<DetalleGastoEntity> obtenerDetalleGasto(
        @WebParam(name = "idGasto", targetNamespace = "")
        Integer idGasto);

}
