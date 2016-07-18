
package co.com.codesoftware.servicio.general;

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
@WebService(name = "GeneralWS", targetNamespace = "http://general.servicio.codesoftware.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GeneralWS {


    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.general.SedeEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerSedes", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerSedes")
    @ResponseWrapper(localName = "obtenerSedesResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerSedesResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerSedesRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerSedesResponse")
    public List<SedeEntity> obtenerSedes();

    /**
     * 
     * @param sede
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarSede", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ActualizarSede")
    @ResponseWrapper(localName = "actualizarSedeResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ActualizarSedeResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/actualizarSedeRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/actualizarSedeResponse")
    public String actualizarSede(
        @WebParam(name = "sede", targetNamespace = "")
        SedeEntity sede);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generaReportes", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.GeneraReportes")
    @ResponseWrapper(localName = "generaReportesResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.GeneraReportesResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/generaReportesRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/generaReportesResponse")
    public String generaReportes(
        @WebParam(name = "arg0", targetNamespace = "")
        List<MapaEntity> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<MapaEntity> arg1);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.general.CiudadEntity>
     */
    @WebMethod
    @WebResult(name = "listaCiudades", targetNamespace = "")
    @RequestWrapper(localName = "obtenerCiudades", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerCiudades")
    @ResponseWrapper(localName = "obtenerCiudadesResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerCiudadesResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerCiudadesRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerCiudadesResponse")
    public List<CiudadEntity> obtenerCiudades();

    /**
     * 
     * @param idRemision
     * @param idFactura
     * @return
     *     returns co.com.codesoftware.servicio.general.PagoRemisionEntity
     */
    @WebMethod
    @WebResult(name = "pagoRemision", targetNamespace = "")
    @RequestWrapper(localName = "obtenerPrincPago", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerPrincPago")
    @ResponseWrapper(localName = "obtenerPrincPagoResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerPrincPagoResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerPrincPagoRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerPrincPagoResponse")
    public PagoRemisionEntity obtenerPrincPago(
        @WebParam(name = "idRemision", targetNamespace = "")
        int idRemision,
        @WebParam(name = "idFactura", targetNamespace = "")
        int idFactura);

    /**
     * 
     * @param mensajeCorreo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "enviaCorreo", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.EnviaCorreo")
    @ResponseWrapper(localName = "enviaCorreoResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.EnviaCorreoResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/enviaCorreoRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/enviaCorreoResponse")
    public String enviaCorreo(
        @WebParam(name = "mensajeCorreo", targetNamespace = "")
        CorreoWrapperRequest mensajeCorreo);

    /**
     * 
     * @param sql
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generarExcelSql", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.GenerarExcelSql")
    @ResponseWrapper(localName = "generarExcelSqlResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.GenerarExcelSqlResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/generarExcelSqlRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/generarExcelSqlResponse")
    public String generarExcelSql(
        @WebParam(name = "sql", targetNamespace = "")
        String sql);

    /**
     * 
     * @param idDocumento
     * @param tipoDoc
     * @return
     *     returns co.com.codesoftware.servicio.general.RelFacRemiGenEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaDocumentosPagosRemi", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.BuscaDocumentosPagosRemi")
    @ResponseWrapper(localName = "buscaDocumentosPagosRemiResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.BuscaDocumentosPagosRemiResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/buscaDocumentosPagosRemiRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/buscaDocumentosPagosRemiResponse")
    public RelFacRemiGenEntity buscaDocumentosPagosRemi(
        @WebParam(name = "tipoDoc", targetNamespace = "")
        String tipoDoc,
        @WebParam(name = "idDocumento", targetNamespace = "")
        int idDocumento);

    /**
     * 
     * @param idRemision
     * @param idRsfa
     * @param diasPlazo
     * @param idTius
     * @param retefuente
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "respuesta", targetNamespace = "")
    @RequestWrapper(localName = "realizarFacturaXRemision", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.RealizarFacturaXRemision")
    @ResponseWrapper(localName = "realizarFacturaXRemisionResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.RealizarFacturaXRemisionResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/realizarFacturaXRemisionRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/realizarFacturaXRemisionResponse")
    public String realizarFacturaXRemision(
        @WebParam(name = "idRemision", targetNamespace = "")
        int idRemision,
        @WebParam(name = "idTius", targetNamespace = "")
        int idTius,
        @WebParam(name = "idRsfa", targetNamespace = "")
        int idRsfa,
        @WebParam(name = "diasPlazo", targetNamespace = "")
        int diasPlazo,
        @WebParam(name = "retefuente", targetNamespace = "")
        String retefuente);

    /**
     * 
     * @param idRemision
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.general.DetProdRemision>
     */
    @WebMethod
    @WebResult(name = "detalles", targetNamespace = "")
    @RequestWrapper(localName = "obtenerDetalleRemision", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerDetalleRemision")
    @ResponseWrapper(localName = "obtenerDetalleRemisionResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerDetalleRemisionResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerDetalleRemisionRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerDetalleRemisionResponse")
    public List<DetProdRemision> obtenerDetalleRemision(
        @WebParam(name = "idRemision", targetNamespace = "")
        int idRemision);

    /**
     * 
     * @param idCliente
     * @param fechaIni
     * @param fechafin
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.general.RemisionEntity>
     */
    @WebMethod
    @WebResult(name = "remisiones", targetNamespace = "")
    @RequestWrapper(localName = "obtenerRemisionesXCliente", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerRemisionesXCliente")
    @ResponseWrapper(localName = "obtenerRemisionesXClienteResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerRemisionesXClienteResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerRemisionesXClienteRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerRemisionesXClienteResponse")
    public List<RemisionEntity> obtenerRemisionesXCliente(
        @WebParam(name = "idCliente", targetNamespace = "")
        int idCliente,
        @WebParam(name = "fechaIni", targetNamespace = "")
        XMLGregorianCalendar fechaIni,
        @WebParam(name = "fechafin", targetNamespace = "")
        XMLGregorianCalendar fechafin);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.general.ResolucionFactEntity>
     */
    @WebMethod
    @WebResult(name = "resoluciones", targetNamespace = "")
    @RequestWrapper(localName = "obtenerResolucionesFact", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerResolucionesFact")
    @ResponseWrapper(localName = "obtenerResolucionesFactResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerResolucionesFactResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerResolucionesFactRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerResolucionesFactResponse")
    public List<ResolucionFactEntity> obtenerResolucionesFact();

    /**
     * 
     * @param objEntity
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "respuesta", targetNamespace = "")
    @RequestWrapper(localName = "actualizaResolucion", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ActualizaResolucion")
    @ResponseWrapper(localName = "actualizaResolucionResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ActualizaResolucionResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/actualizaResolucionRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/actualizaResolucionResponse")
    public String actualizaResolucion(
        @WebParam(name = "objEntity", targetNamespace = "")
        ResolucionFactEntity objEntity);

    /**
     * 
     * @param objEntity
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "respuesta", targetNamespace = "")
    @RequestWrapper(localName = "insertarResolucion", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.InsertarResolucion")
    @ResponseWrapper(localName = "insertarResolucionResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.InsertarResolucionResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/insertarResolucionRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/insertarResolucionResponse")
    public String insertarResolucion(
        @WebParam(name = "objEntity", targetNamespace = "")
        ResolucionFactEntity objEntity);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.general.ParametrosEmpresaEntity>
     */
    @WebMethod
    @WebResult(name = "parametros", targetNamespace = "")
    @RequestWrapper(localName = "obtenerParametrosEmpresa", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerParametrosEmpresa")
    @ResponseWrapper(localName = "obtenerParametrosEmpresaResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerParametrosEmpresaResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerParametrosEmpresaRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerParametrosEmpresaResponse")
    public List<ParametrosEmpresaEntity> obtenerParametrosEmpresa();

    /**
     * 
     * @param valor
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod
    @WebResult(name = "valor", targetNamespace = "")
    @RequestWrapper(localName = "obtenerValorVentasMes", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerValorVentasMes")
    @ResponseWrapper(localName = "obtenerValorVentasMesResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerValorVentasMesResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerValorVentasMesRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerValorVentasMesResponse")
    public BigDecimal obtenerValorVentasMes(
        @WebParam(name = "valor", targetNamespace = "")
        Integer valor);

    /**
     * 
     * @param permiso
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.general.UsuarioEntity>
     */
    @WebMethod
    @WebResult(name = "listaUsuarios", targetNamespace = "")
    @RequestWrapper(localName = "obtenerUsuariosXPermiso", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerUsuariosXPermiso")
    @ResponseWrapper(localName = "obtenerUsuariosXPermisoResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerUsuariosXPermisoResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerUsuariosXPermisoRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerUsuariosXPermisoResponse")
    public List<UsuarioEntity> obtenerUsuariosXPermiso(
        @WebParam(name = "permiso", targetNamespace = "")
        String permiso);

    /**
     * 
     * @param idPago
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.general.DetallePagoRemision>
     */
    @WebMethod
    @WebResult(name = "detallePago", targetNamespace = "")
    @RequestWrapper(localName = "obtenerDetallePagos", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerDetallePagos")
    @ResponseWrapper(localName = "obtenerDetallePagosResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerDetallePagosResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerDetallePagosRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerDetallePagosResponse")
    public List<DetallePagoRemision> obtenerDetallePagos(
        @WebParam(name = "idPago", targetNamespace = "")
        int idPago);

    /**
     * 
     * @param clave
     * @param nuevoValor
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "listaCiudades", targetNamespace = "")
    @RequestWrapper(localName = "actualizaParametro", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ActualizaParametro")
    @ResponseWrapper(localName = "actualizaParametroResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ActualizaParametroResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/actualizaParametroRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/actualizaParametroResponse")
    public String actualizaParametro(
        @WebParam(name = "clave", targetNamespace = "")
        String clave,
        @WebParam(name = "nuevoValor", targetNamespace = "")
        String nuevoValor);

    /**
     * 
     * @param idDepto
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.general.CiudadEntity>
     */
    @WebMethod
    @WebResult(name = "listaCiudades", targetNamespace = "")
    @RequestWrapper(localName = "obtenerCiudadesXDepartamento", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerCiudadesXDepartamento")
    @ResponseWrapper(localName = "obtenerCiudadesXDepartamentoResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerCiudadesXDepartamentoResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerCiudadesXDepartamentoRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerCiudadesXDepartamentoResponse")
    public List<CiudadEntity> obtenerCiudadesXDepartamento(
        @WebParam(name = "idDepto", targetNamespace = "")
        Integer idDepto);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.general.DepartamentoEntity>
     */
    @WebMethod
    @WebResult(name = "listaDepartamentos", targetNamespace = "")
    @RequestWrapper(localName = "obtenerDepartamentos", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerDepartamentos")
    @ResponseWrapper(localName = "obtenerDepartamentosResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.ObtenerDepartamentosResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerDepartamentosRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/obtenerDepartamentosResponse")
    public List<DepartamentoEntity> obtenerDepartamentos();

    /**
     * 
     * @param idFact
     * @param valorPago
     * @param pagoTotal
     * @param tipoPago
     * @param idTius
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ejecutaPagoRemision", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.EjecutaPagoRemision")
    @ResponseWrapper(localName = "ejecutaPagoRemisionResponse", targetNamespace = "http://general.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.general.EjecutaPagoRemisionResponse")
    @Action(input = "http://general.servicio.codesoftware.com.co/GeneralWS/ejecutaPagoRemisionRequest", output = "http://general.servicio.codesoftware.com.co/GeneralWS/ejecutaPagoRemisionResponse")
    public String ejecutaPagoRemision(
        @WebParam(name = "idTius", targetNamespace = "")
        int idTius,
        @WebParam(name = "idFact", targetNamespace = "")
        int idFact,
        @WebParam(name = "valorPago", targetNamespace = "")
        BigDecimal valorPago,
        @WebParam(name = "tipoPago", targetNamespace = "")
        String tipoPago,
        @WebParam(name = "pagoTotal", targetNamespace = "")
        String pagoTotal);

}
