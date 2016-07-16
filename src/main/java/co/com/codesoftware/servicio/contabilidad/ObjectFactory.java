
package co.com.codesoftware.servicio.contabilidad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.codesoftware.servicio.contabilidad package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerAsientoContable_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerAsientoContable");
    private final static QName _ObtenerAuxContableXIdResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerAuxContableXIdResponse");
    private final static QName _ObtenerSubCuentaXCuenta_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerSubCuentaXCuenta");
    private final static QName _ObtenerMovimientosContables_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerMovimientosContables");
    private final static QName _ObtenerAuxContableXCritResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerAuxContableXCritResponse");
    private final static QName _ObtenerGruposXClaseResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerGruposXClaseResponse");
    private final static QName _InsertaAuxiliarCont_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "insertaAuxiliarCont");
    private final static QName _InsertaSubCuenta_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "insertaSubCuenta");
    private final static QName _ObtenerAsientoContableResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerAsientoContableResponse");
    private final static QName _ObtenerSubCuentaXCuentaResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerSubCuentaXCuentaResponse");
    private final static QName _InsertaSubCuentaResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "insertaSubCuentaResponse");
    private final static QName _ObtenerGruposXClase_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerGruposXClase");
    private final static QName _ObtenerMovimientosContablesResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerMovimientosContablesResponse");
    private final static QName _ObtenerClasesResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerClasesResponse");
    private final static QName _ObtenerAuxContableXSubCuenta_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerAuxContableXSubCuenta");
    private final static QName _ObtenerCuentaXGrupoResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerCuentaXGrupoResponse");
    private final static QName _ObtenerAuxContableXId_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerAuxContableXId");
    private final static QName _ObtenerCuentaXGrupo_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerCuentaXGrupo");
    private final static QName _InsertaAuxiliarContResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "insertaAuxiliarContResponse");
    private final static QName _ObtenerAuxContableXCrit_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerAuxContableXCrit");
    private final static QName _ObtenerAuxContableXSubCuentaResponse_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerAuxContableXSubCuentaResponse");
    private final static QName _ObtenerClases_QNAME = new QName("http://contabilidad.servicio.codesoftware.com.co/", "obtenerClases");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.codesoftware.servicio.contabilidad
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertaAuxiliarContResponse }
     * 
     */
    public InsertaAuxiliarContResponse createInsertaAuxiliarContResponse() {
        return new InsertaAuxiliarContResponse();
    }

    /**
     * Create an instance of {@link ObtenerAuxContableXId }
     * 
     */
    public ObtenerAuxContableXId createObtenerAuxContableXId() {
        return new ObtenerAuxContableXId();
    }

    /**
     * Create an instance of {@link ObtenerCuentaXGrupo }
     * 
     */
    public ObtenerCuentaXGrupo createObtenerCuentaXGrupo() {
        return new ObtenerCuentaXGrupo();
    }

    /**
     * Create an instance of {@link ObtenerAuxContableXCrit }
     * 
     */
    public ObtenerAuxContableXCrit createObtenerAuxContableXCrit() {
        return new ObtenerAuxContableXCrit();
    }

    /**
     * Create an instance of {@link ObtenerAuxContableXSubCuentaResponse }
     * 
     */
    public ObtenerAuxContableXSubCuentaResponse createObtenerAuxContableXSubCuentaResponse() {
        return new ObtenerAuxContableXSubCuentaResponse();
    }

    /**
     * Create an instance of {@link ObtenerClases }
     * 
     */
    public ObtenerClases createObtenerClases() {
        return new ObtenerClases();
    }

    /**
     * Create an instance of {@link ObtenerGruposXClase }
     * 
     */
    public ObtenerGruposXClase createObtenerGruposXClase() {
        return new ObtenerGruposXClase();
    }

    /**
     * Create an instance of {@link ObtenerMovimientosContablesResponse }
     * 
     */
    public ObtenerMovimientosContablesResponse createObtenerMovimientosContablesResponse() {
        return new ObtenerMovimientosContablesResponse();
    }

    /**
     * Create an instance of {@link ObtenerCuentaXGrupoResponse }
     * 
     */
    public ObtenerCuentaXGrupoResponse createObtenerCuentaXGrupoResponse() {
        return new ObtenerCuentaXGrupoResponse();
    }

    /**
     * Create an instance of {@link ObtenerAuxContableXSubCuenta }
     * 
     */
    public ObtenerAuxContableXSubCuenta createObtenerAuxContableXSubCuenta() {
        return new ObtenerAuxContableXSubCuenta();
    }

    /**
     * Create an instance of {@link ObtenerClasesResponse }
     * 
     */
    public ObtenerClasesResponse createObtenerClasesResponse() {
        return new ObtenerClasesResponse();
    }

    /**
     * Create an instance of {@link InsertaSubCuenta }
     * 
     */
    public InsertaSubCuenta createInsertaSubCuenta() {
        return new InsertaSubCuenta();
    }

    /**
     * Create an instance of {@link InsertaAuxiliarCont }
     * 
     */
    public InsertaAuxiliarCont createInsertaAuxiliarCont() {
        return new InsertaAuxiliarCont();
    }

    /**
     * Create an instance of {@link InsertaSubCuentaResponse }
     * 
     */
    public InsertaSubCuentaResponse createInsertaSubCuentaResponse() {
        return new InsertaSubCuentaResponse();
    }

    /**
     * Create an instance of {@link ObtenerAsientoContableResponse }
     * 
     */
    public ObtenerAsientoContableResponse createObtenerAsientoContableResponse() {
        return new ObtenerAsientoContableResponse();
    }

    /**
     * Create an instance of {@link ObtenerSubCuentaXCuentaResponse }
     * 
     */
    public ObtenerSubCuentaXCuentaResponse createObtenerSubCuentaXCuentaResponse() {
        return new ObtenerSubCuentaXCuentaResponse();
    }

    /**
     * Create an instance of {@link ObtenerAuxContableXIdResponse }
     * 
     */
    public ObtenerAuxContableXIdResponse createObtenerAuxContableXIdResponse() {
        return new ObtenerAuxContableXIdResponse();
    }

    /**
     * Create an instance of {@link ObtenerAsientoContable }
     * 
     */
    public ObtenerAsientoContable createObtenerAsientoContable() {
        return new ObtenerAsientoContable();
    }

    /**
     * Create an instance of {@link ObtenerAuxContableXCritResponse }
     * 
     */
    public ObtenerAuxContableXCritResponse createObtenerAuxContableXCritResponse() {
        return new ObtenerAuxContableXCritResponse();
    }

    /**
     * Create an instance of {@link ObtenerGruposXClaseResponse }
     * 
     */
    public ObtenerGruposXClaseResponse createObtenerGruposXClaseResponse() {
        return new ObtenerGruposXClaseResponse();
    }

    /**
     * Create an instance of {@link ObtenerMovimientosContables }
     * 
     */
    public ObtenerMovimientosContables createObtenerMovimientosContables() {
        return new ObtenerMovimientosContables();
    }

    /**
     * Create an instance of {@link ObtenerSubCuentaXCuenta }
     * 
     */
    public ObtenerSubCuentaXCuenta createObtenerSubCuentaXCuenta() {
        return new ObtenerSubCuentaXCuenta();
    }

    /**
     * Create an instance of {@link AuxContableEntity }
     * 
     */
    public AuxContableEntity createAuxContableEntity() {
        return new AuxContableEntity();
    }

    /**
     * Create an instance of {@link SubCuentaEntity }
     * 
     */
    public SubCuentaEntity createSubCuentaEntity() {
        return new SubCuentaEntity();
    }

    /**
     * Create an instance of {@link MoviContableEntity }
     * 
     */
    public MoviContableEntity createMoviContableEntity() {
        return new MoviContableEntity();
    }

    /**
     * Create an instance of {@link TipoDocumentoEntity }
     * 
     */
    public TipoDocumentoEntity createTipoDocumentoEntity() {
        return new TipoDocumentoEntity();
    }

    /**
     * Create an instance of {@link CuentaEntity }
     * 
     */
    public CuentaEntity createCuentaEntity() {
        return new CuentaEntity();
    }

    /**
     * Create an instance of {@link GrupoEntity }
     * 
     */
    public GrupoEntity createGrupoEntity() {
        return new GrupoEntity();
    }

    /**
     * Create an instance of {@link ClaseEntity }
     * 
     */
    public ClaseEntity createClaseEntity() {
        return new ClaseEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAsientoContable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerAsientoContable")
    public JAXBElement<ObtenerAsientoContable> createObtenerAsientoContable(ObtenerAsientoContable value) {
        return new JAXBElement<ObtenerAsientoContable>(_ObtenerAsientoContable_QNAME, ObtenerAsientoContable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAuxContableXIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerAuxContableXIdResponse")
    public JAXBElement<ObtenerAuxContableXIdResponse> createObtenerAuxContableXIdResponse(ObtenerAuxContableXIdResponse value) {
        return new JAXBElement<ObtenerAuxContableXIdResponse>(_ObtenerAuxContableXIdResponse_QNAME, ObtenerAuxContableXIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerSubCuentaXCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerSubCuentaXCuenta")
    public JAXBElement<ObtenerSubCuentaXCuenta> createObtenerSubCuentaXCuenta(ObtenerSubCuentaXCuenta value) {
        return new JAXBElement<ObtenerSubCuentaXCuenta>(_ObtenerSubCuentaXCuenta_QNAME, ObtenerSubCuentaXCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMovimientosContables }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerMovimientosContables")
    public JAXBElement<ObtenerMovimientosContables> createObtenerMovimientosContables(ObtenerMovimientosContables value) {
        return new JAXBElement<ObtenerMovimientosContables>(_ObtenerMovimientosContables_QNAME, ObtenerMovimientosContables.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAuxContableXCritResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerAuxContableXCritResponse")
    public JAXBElement<ObtenerAuxContableXCritResponse> createObtenerAuxContableXCritResponse(ObtenerAuxContableXCritResponse value) {
        return new JAXBElement<ObtenerAuxContableXCritResponse>(_ObtenerAuxContableXCritResponse_QNAME, ObtenerAuxContableXCritResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerGruposXClaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerGruposXClaseResponse")
    public JAXBElement<ObtenerGruposXClaseResponse> createObtenerGruposXClaseResponse(ObtenerGruposXClaseResponse value) {
        return new JAXBElement<ObtenerGruposXClaseResponse>(_ObtenerGruposXClaseResponse_QNAME, ObtenerGruposXClaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaAuxiliarCont }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "insertaAuxiliarCont")
    public JAXBElement<InsertaAuxiliarCont> createInsertaAuxiliarCont(InsertaAuxiliarCont value) {
        return new JAXBElement<InsertaAuxiliarCont>(_InsertaAuxiliarCont_QNAME, InsertaAuxiliarCont.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaSubCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "insertaSubCuenta")
    public JAXBElement<InsertaSubCuenta> createInsertaSubCuenta(InsertaSubCuenta value) {
        return new JAXBElement<InsertaSubCuenta>(_InsertaSubCuenta_QNAME, InsertaSubCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAsientoContableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerAsientoContableResponse")
    public JAXBElement<ObtenerAsientoContableResponse> createObtenerAsientoContableResponse(ObtenerAsientoContableResponse value) {
        return new JAXBElement<ObtenerAsientoContableResponse>(_ObtenerAsientoContableResponse_QNAME, ObtenerAsientoContableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerSubCuentaXCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerSubCuentaXCuentaResponse")
    public JAXBElement<ObtenerSubCuentaXCuentaResponse> createObtenerSubCuentaXCuentaResponse(ObtenerSubCuentaXCuentaResponse value) {
        return new JAXBElement<ObtenerSubCuentaXCuentaResponse>(_ObtenerSubCuentaXCuentaResponse_QNAME, ObtenerSubCuentaXCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaSubCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "insertaSubCuentaResponse")
    public JAXBElement<InsertaSubCuentaResponse> createInsertaSubCuentaResponse(InsertaSubCuentaResponse value) {
        return new JAXBElement<InsertaSubCuentaResponse>(_InsertaSubCuentaResponse_QNAME, InsertaSubCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerGruposXClase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerGruposXClase")
    public JAXBElement<ObtenerGruposXClase> createObtenerGruposXClase(ObtenerGruposXClase value) {
        return new JAXBElement<ObtenerGruposXClase>(_ObtenerGruposXClase_QNAME, ObtenerGruposXClase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMovimientosContablesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerMovimientosContablesResponse")
    public JAXBElement<ObtenerMovimientosContablesResponse> createObtenerMovimientosContablesResponse(ObtenerMovimientosContablesResponse value) {
        return new JAXBElement<ObtenerMovimientosContablesResponse>(_ObtenerMovimientosContablesResponse_QNAME, ObtenerMovimientosContablesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClasesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerClasesResponse")
    public JAXBElement<ObtenerClasesResponse> createObtenerClasesResponse(ObtenerClasesResponse value) {
        return new JAXBElement<ObtenerClasesResponse>(_ObtenerClasesResponse_QNAME, ObtenerClasesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAuxContableXSubCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerAuxContableXSubCuenta")
    public JAXBElement<ObtenerAuxContableXSubCuenta> createObtenerAuxContableXSubCuenta(ObtenerAuxContableXSubCuenta value) {
        return new JAXBElement<ObtenerAuxContableXSubCuenta>(_ObtenerAuxContableXSubCuenta_QNAME, ObtenerAuxContableXSubCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCuentaXGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerCuentaXGrupoResponse")
    public JAXBElement<ObtenerCuentaXGrupoResponse> createObtenerCuentaXGrupoResponse(ObtenerCuentaXGrupoResponse value) {
        return new JAXBElement<ObtenerCuentaXGrupoResponse>(_ObtenerCuentaXGrupoResponse_QNAME, ObtenerCuentaXGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAuxContableXId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerAuxContableXId")
    public JAXBElement<ObtenerAuxContableXId> createObtenerAuxContableXId(ObtenerAuxContableXId value) {
        return new JAXBElement<ObtenerAuxContableXId>(_ObtenerAuxContableXId_QNAME, ObtenerAuxContableXId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCuentaXGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerCuentaXGrupo")
    public JAXBElement<ObtenerCuentaXGrupo> createObtenerCuentaXGrupo(ObtenerCuentaXGrupo value) {
        return new JAXBElement<ObtenerCuentaXGrupo>(_ObtenerCuentaXGrupo_QNAME, ObtenerCuentaXGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaAuxiliarContResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "insertaAuxiliarContResponse")
    public JAXBElement<InsertaAuxiliarContResponse> createInsertaAuxiliarContResponse(InsertaAuxiliarContResponse value) {
        return new JAXBElement<InsertaAuxiliarContResponse>(_InsertaAuxiliarContResponse_QNAME, InsertaAuxiliarContResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAuxContableXCrit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerAuxContableXCrit")
    public JAXBElement<ObtenerAuxContableXCrit> createObtenerAuxContableXCrit(ObtenerAuxContableXCrit value) {
        return new JAXBElement<ObtenerAuxContableXCrit>(_ObtenerAuxContableXCrit_QNAME, ObtenerAuxContableXCrit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAuxContableXSubCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerAuxContableXSubCuentaResponse")
    public JAXBElement<ObtenerAuxContableXSubCuentaResponse> createObtenerAuxContableXSubCuentaResponse(ObtenerAuxContableXSubCuentaResponse value) {
        return new JAXBElement<ObtenerAuxContableXSubCuentaResponse>(_ObtenerAuxContableXSubCuentaResponse_QNAME, ObtenerAuxContableXSubCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClases }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contabilidad.servicio.codesoftware.com.co/", name = "obtenerClases")
    public JAXBElement<ObtenerClases> createObtenerClases(ObtenerClases value) {
        return new JAXBElement<ObtenerClases>(_ObtenerClases_QNAME, ObtenerClases.class, null, value);
    }

}
