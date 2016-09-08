
package co.com.codesoftware.servicio.contabilidad;

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
@WebService(name = "ContabilidadWS", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContabilidadWS {


    /**
     * 
     * @param idClase
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.contabilidad.GrupoEntity>
     */
    @WebMethod
    @WebResult(name = "listaGrupos", targetNamespace = "")
    @RequestWrapper(localName = "obtenerGruposXClase", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerGruposXClase")
    @ResponseWrapper(localName = "obtenerGruposXClaseResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerGruposXClaseResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerGruposXClaseRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerGruposXClaseResponse")
    public List<GrupoEntity> obtenerGruposXClase(
        @WebParam(name = "idClase", targetNamespace = "")
        Integer idClase);

    /**
     * 
     * @param idGrupo
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.contabilidad.CuentaEntity>
     */
    @WebMethod
    @WebResult(name = "listaCuentas", targetNamespace = "")
    @RequestWrapper(localName = "obtenerCuentaXGrupo", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerCuentaXGrupo")
    @ResponseWrapper(localName = "obtenerCuentaXGrupoResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerCuentaXGrupoResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerCuentaXGrupoRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerCuentaXGrupoResponse")
    public List<CuentaEntity> obtenerCuentaXGrupo(
        @WebParam(name = "idGrupo", targetNamespace = "")
        Integer idGrupo);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.contabilidad.SubCuentaEntity>
     */
    @WebMethod
    @WebResult(name = "listaSubCuentas", targetNamespace = "")
    @RequestWrapper(localName = "obtenerSubCuentaXCuenta", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerSubCuentaXCuenta")
    @ResponseWrapper(localName = "obtenerSubCuentaXCuentaResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerSubCuentaXCuentaResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerSubCuentaXCuentaRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerSubCuentaXCuentaResponse")
    public List<SubCuentaEntity> obtenerSubCuentaXCuenta(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "rta", targetNamespace = "")
    @RequestWrapper(localName = "insertaAuxiliarCont", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.InsertaAuxiliarCont")
    @ResponseWrapper(localName = "insertaAuxiliarContResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.InsertaAuxiliarContResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/insertaAuxiliarContRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/insertaAuxiliarContResponse")
    public String insertaAuxiliarCont(
        @WebParam(name = "arg0", targetNamespace = "")
        AuxContableEntity arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.contabilidad.AuxContableEntity>
     */
    @WebMethod
    @WebResult(name = "listaAuxConta", targetNamespace = "")
    @RequestWrapper(localName = "obtenerAuxContableXSubCuenta", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerAuxContableXSubCuenta")
    @ResponseWrapper(localName = "obtenerAuxContableXSubCuentaResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerAuxContableXSubCuentaResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerAuxContableXSubCuentaRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerAuxContableXSubCuentaResponse")
    public List<AuxContableEntity> obtenerAuxContableXSubCuenta(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.contabilidad.AuxContableEntity>
     */
    @WebMethod
    @WebResult(name = "listaAuxConta", targetNamespace = "")
    @RequestWrapper(localName = "obtenerAuxContableXCrit", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerAuxContableXCrit")
    @ResponseWrapper(localName = "obtenerAuxContableXCritResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerAuxContableXCritResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerAuxContableXCritRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerAuxContableXCritResponse")
    public List<AuxContableEntity> obtenerAuxContableXCrit(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns co.com.codesoftware.servicio.contabilidad.AuxContableEntity
     */
    @WebMethod
    @WebResult(name = "auxiliarContable", targetNamespace = "")
    @RequestWrapper(localName = "obtenerAuxContableXId", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerAuxContableXId")
    @ResponseWrapper(localName = "obtenerAuxContableXIdResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerAuxContableXIdResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerAuxContableXIdRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerAuxContableXIdResponse")
    public AuxContableEntity obtenerAuxContableXId(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param idTransCont
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.contabilidad.MoviContableEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerAsientoContable", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerAsientoContable")
    @ResponseWrapper(localName = "obtenerAsientoContableResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerAsientoContableResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerAsientoContableRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerAsientoContableResponse")
    public List<MoviContableEntity> obtenerAsientoContable(
        @WebParam(name = "idTransCont", targetNamespace = "")
        int idTransCont);

    /**
     * 
     * @param fechaFi
     * @param tipoDoc
     * @param fechaIn
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.contabilidad.MoviContableEntity>
     */
    @WebMethod
    @WebResult(name = "listaMovimientos", targetNamespace = "")
    @RequestWrapper(localName = "obtenerMovimientosContables", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerMovimientosContables")
    @ResponseWrapper(localName = "obtenerMovimientosContablesResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerMovimientosContablesResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerMovimientosContablesRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerMovimientosContablesResponse")
    public List<MoviContableEntity> obtenerMovimientosContables(
        @WebParam(name = "fechaIn", targetNamespace = "")
        XMLGregorianCalendar fechaIn,
        @WebParam(name = "fechaFi", targetNamespace = "")
        XMLGregorianCalendar fechaFi,
        @WebParam(name = "tipoDoc", targetNamespace = "")
        String tipoDoc);

    /**
     * 
     * @param fechaFi
     * @param cuenta
     * @param fechaIn
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.contabilidad.MoviContableEntity>
     */
    @WebMethod
    @WebResult(name = "listaMovimientos", targetNamespace = "")
    @RequestWrapper(localName = "obtenerMoviContCuenta", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerMoviContCuenta")
    @ResponseWrapper(localName = "obtenerMoviContCuentaResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerMoviContCuentaResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerMoviContCuentaRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerMoviContCuentaResponse")
    public List<MoviContableEntity> obtenerMoviContCuenta(
        @WebParam(name = "fechaIn", targetNamespace = "")
        XMLGregorianCalendar fechaIn,
        @WebParam(name = "fechaFi", targetNamespace = "")
        XMLGregorianCalendar fechaFi,
        @WebParam(name = "cuenta", targetNamespace = "")
        String cuenta);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.contabilidad.ClaseEntity>
     */
    @WebMethod
    @WebResult(name = "listaClases", targetNamespace = "")
    @RequestWrapper(localName = "obtenerClases", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerClases")
    @ResponseWrapper(localName = "obtenerClasesResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.ObtenerClasesResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerClasesRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/obtenerClasesResponse")
    public List<ClaseEntity> obtenerClases();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertaSubCuenta", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.InsertaSubCuenta")
    @ResponseWrapper(localName = "insertaSubCuentaResponse", targetNamespace = "http://contabilidad.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.contabilidad.InsertaSubCuentaResponse")
    @Action(input = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/insertaSubCuentaRequest", output = "http://contabilidad.servicio.codesoftware.com.co/ContabilidadWS/insertaSubCuentaResponse")
    public String insertaSubCuenta(
        @WebParam(name = "arg0", targetNamespace = "")
        SubCuentaEntity arg0);

}
