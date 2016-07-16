
package co.com.codesoftware.servicio.importacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.codesoftware.servicio.importacion package. 
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

    private final static QName _InsertarProveedorInternacionalResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertarProveedorInternacionalResponse");
    private final static QName _ObtenerImportacionesResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerImportacionesResponse");
    private final static QName _BorrarProductosImportacion_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "borrarProductosImportacion");
    private final static QName _EliminarGastoImportacion_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "eliminarGastoImportacion");
    private final static QName _InsertaImportacionResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertaImportacionResponse");
    private final static QName _BorrarProductosImportacionResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "borrarProductosImportacionResponse");
    private final static QName _ObtenerDetalleGasto_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerDetalleGasto");
    private final static QName _EjecutaProcesoImportacion_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "ejecutaProcesoImportacion");
    private final static QName _ObtenerGastosImpoResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerGastosImpoResponse");
    private final static QName _InsertarProveedorInternacional_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertarProveedorInternacional");
    private final static QName _ObtenerGastosImpo_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerGastosImpo");
    private final static QName _ObtenerImportacion_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerImportacion");
    private final static QName _InsertaImportacion_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertaImportacion");
    private final static QName _EliminarDetalleGasto_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "eliminarDetalleGasto");
    private final static QName _InsertarProductoImportacionResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertarProductoImportacionResponse");
    private final static QName _ObtenerProveedoresInterResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerProveedoresInterResponse");
    private final static QName _ObtenerDetalleGastoResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerDetalleGastoResponse");
    private final static QName _ObtenerProductosImportacion_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerProductosImportacion");
    private final static QName _ObtenerProveedoresInter_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerProveedoresInter");
    private final static QName _EliminarGastoImportacionResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "eliminarGastoImportacionResponse");
    private final static QName _ObtenerProductosImportacionResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerProductosImportacionResponse");
    private final static QName _InsertaValorDolaresProdResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertaValorDolaresProdResponse");
    private final static QName _EjecutaProcesoImportacionResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "ejecutaProcesoImportacionResponse");
    private final static QName _EliminarDetalleGastoResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "eliminarDetalleGastoResponse");
    private final static QName _InsertaGastoImportacion_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertaGastoImportacion");
    private final static QName _InsertarDetalleGasto_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertarDetalleGasto");
    private final static QName _ObtenerImportaciones_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerImportaciones");
    private final static QName _InsertarProductoImportacion_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertarProductoImportacion");
    private final static QName _InsertarDetalleGastoResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertarDetalleGastoResponse");
    private final static QName _InsertaGastoImportacionResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertaGastoImportacionResponse");
    private final static QName _ObtenerImportacionResponse_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "obtenerImportacionResponse");
    private final static QName _InsertaValorDolaresProd_QNAME = new QName("http://importacion.servicio.codesoftware.com.co/", "insertaValorDolaresProd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.codesoftware.servicio.importacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerProductosImportacion }
     * 
     */
    public ObtenerProductosImportacion createObtenerProductosImportacion() {
        return new ObtenerProductosImportacion();
    }

    /**
     * Create an instance of {@link ObtenerDetalleGastoResponse }
     * 
     */
    public ObtenerDetalleGastoResponse createObtenerDetalleGastoResponse() {
        return new ObtenerDetalleGastoResponse();
    }

    /**
     * Create an instance of {@link ObtenerProveedoresInterResponse }
     * 
     */
    public ObtenerProveedoresInterResponse createObtenerProveedoresInterResponse() {
        return new ObtenerProveedoresInterResponse();
    }

    /**
     * Create an instance of {@link EliminarDetalleGasto }
     * 
     */
    public EliminarDetalleGasto createEliminarDetalleGasto() {
        return new EliminarDetalleGasto();
    }

    /**
     * Create an instance of {@link InsertarProductoImportacionResponse }
     * 
     */
    public InsertarProductoImportacionResponse createInsertarProductoImportacionResponse() {
        return new InsertarProductoImportacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerImportacion }
     * 
     */
    public ObtenerImportacion createObtenerImportacion() {
        return new ObtenerImportacion();
    }

    /**
     * Create an instance of {@link InsertaImportacion }
     * 
     */
    public InsertaImportacion createInsertaImportacion() {
        return new InsertaImportacion();
    }

    /**
     * Create an instance of {@link InsertarProveedorInternacional }
     * 
     */
    public InsertarProveedorInternacional createInsertarProveedorInternacional() {
        return new InsertarProveedorInternacional();
    }

    /**
     * Create an instance of {@link ObtenerGastosImpo }
     * 
     */
    public ObtenerGastosImpo createObtenerGastosImpo() {
        return new ObtenerGastosImpo();
    }

    /**
     * Create an instance of {@link ObtenerGastosImpoResponse }
     * 
     */
    public ObtenerGastosImpoResponse createObtenerGastosImpoResponse() {
        return new ObtenerGastosImpoResponse();
    }

    /**
     * Create an instance of {@link EjecutaProcesoImportacion }
     * 
     */
    public EjecutaProcesoImportacion createEjecutaProcesoImportacion() {
        return new EjecutaProcesoImportacion();
    }

    /**
     * Create an instance of {@link ObtenerDetalleGasto }
     * 
     */
    public ObtenerDetalleGasto createObtenerDetalleGasto() {
        return new ObtenerDetalleGasto();
    }

    /**
     * Create an instance of {@link BorrarProductosImportacion }
     * 
     */
    public BorrarProductosImportacion createBorrarProductosImportacion() {
        return new BorrarProductosImportacion();
    }

    /**
     * Create an instance of {@link EliminarGastoImportacion }
     * 
     */
    public EliminarGastoImportacion createEliminarGastoImportacion() {
        return new EliminarGastoImportacion();
    }

    /**
     * Create an instance of {@link InsertaImportacionResponse }
     * 
     */
    public InsertaImportacionResponse createInsertaImportacionResponse() {
        return new InsertaImportacionResponse();
    }

    /**
     * Create an instance of {@link BorrarProductosImportacionResponse }
     * 
     */
    public BorrarProductosImportacionResponse createBorrarProductosImportacionResponse() {
        return new BorrarProductosImportacionResponse();
    }

    /**
     * Create an instance of {@link InsertarProveedorInternacionalResponse }
     * 
     */
    public InsertarProveedorInternacionalResponse createInsertarProveedorInternacionalResponse() {
        return new InsertarProveedorInternacionalResponse();
    }

    /**
     * Create an instance of {@link ObtenerImportacionesResponse }
     * 
     */
    public ObtenerImportacionesResponse createObtenerImportacionesResponse() {
        return new ObtenerImportacionesResponse();
    }

    /**
     * Create an instance of {@link InsertaValorDolaresProd }
     * 
     */
    public InsertaValorDolaresProd createInsertaValorDolaresProd() {
        return new InsertaValorDolaresProd();
    }

    /**
     * Create an instance of {@link ObtenerImportacionResponse }
     * 
     */
    public ObtenerImportacionResponse createObtenerImportacionResponse() {
        return new ObtenerImportacionResponse();
    }

    /**
     * Create an instance of {@link InsertaGastoImportacionResponse }
     * 
     */
    public InsertaGastoImportacionResponse createInsertaGastoImportacionResponse() {
        return new InsertaGastoImportacionResponse();
    }

    /**
     * Create an instance of {@link InsertarProductoImportacion }
     * 
     */
    public InsertarProductoImportacion createInsertarProductoImportacion() {
        return new InsertarProductoImportacion();
    }

    /**
     * Create an instance of {@link InsertarDetalleGastoResponse }
     * 
     */
    public InsertarDetalleGastoResponse createInsertarDetalleGastoResponse() {
        return new InsertarDetalleGastoResponse();
    }

    /**
     * Create an instance of {@link ObtenerImportaciones }
     * 
     */
    public ObtenerImportaciones createObtenerImportaciones() {
        return new ObtenerImportaciones();
    }

    /**
     * Create an instance of {@link InsertarDetalleGasto }
     * 
     */
    public InsertarDetalleGasto createInsertarDetalleGasto() {
        return new InsertarDetalleGasto();
    }

    /**
     * Create an instance of {@link EjecutaProcesoImportacionResponse }
     * 
     */
    public EjecutaProcesoImportacionResponse createEjecutaProcesoImportacionResponse() {
        return new EjecutaProcesoImportacionResponse();
    }

    /**
     * Create an instance of {@link EliminarDetalleGastoResponse }
     * 
     */
    public EliminarDetalleGastoResponse createEliminarDetalleGastoResponse() {
        return new EliminarDetalleGastoResponse();
    }

    /**
     * Create an instance of {@link InsertaGastoImportacion }
     * 
     */
    public InsertaGastoImportacion createInsertaGastoImportacion() {
        return new InsertaGastoImportacion();
    }

    /**
     * Create an instance of {@link InsertaValorDolaresProdResponse }
     * 
     */
    public InsertaValorDolaresProdResponse createInsertaValorDolaresProdResponse() {
        return new InsertaValorDolaresProdResponse();
    }

    /**
     * Create an instance of {@link EliminarGastoImportacionResponse }
     * 
     */
    public EliminarGastoImportacionResponse createEliminarGastoImportacionResponse() {
        return new EliminarGastoImportacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerProductosImportacionResponse }
     * 
     */
    public ObtenerProductosImportacionResponse createObtenerProductosImportacionResponse() {
        return new ObtenerProductosImportacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerProveedoresInter }
     * 
     */
    public ObtenerProveedoresInter createObtenerProveedoresInter() {
        return new ObtenerProveedoresInter();
    }

    /**
     * Create an instance of {@link DepartamentoEntity }
     * 
     */
    public DepartamentoEntity createDepartamentoEntity() {
        return new DepartamentoEntity();
    }

    /**
     * Create an instance of {@link CiudadEntity }
     * 
     */
    public CiudadEntity createCiudadEntity() {
        return new CiudadEntity();
    }

    /**
     * Create an instance of {@link ProveedoresEntity }
     * 
     */
    public ProveedoresEntity createProveedoresEntity() {
        return new ProveedoresEntity();
    }

    /**
     * Create an instance of {@link ImportacionEntity }
     * 
     */
    public ImportacionEntity createImportacionEntity() {
        return new ImportacionEntity();
    }

    /**
     * Create an instance of {@link GastoImpoEntity }
     * 
     */
    public GastoImpoEntity createGastoImpoEntity() {
        return new GastoImpoEntity();
    }

    /**
     * Create an instance of {@link ProductoImportacionEntity }
     * 
     */
    public ProductoImportacionEntity createProductoImportacionEntity() {
        return new ProductoImportacionEntity();
    }

    /**
     * Create an instance of {@link ReteFuenteEntity }
     * 
     */
    public ReteFuenteEntity createReteFuenteEntity() {
        return new ReteFuenteEntity();
    }

    /**
     * Create an instance of {@link AuxContableEntity }
     * 
     */
    public AuxContableEntity createAuxContableEntity() {
        return new AuxContableEntity();
    }

    /**
     * Create an instance of {@link DetalleGastoEntity }
     * 
     */
    public DetalleGastoEntity createDetalleGastoEntity() {
        return new DetalleGastoEntity();
    }

    /**
     * Create an instance of {@link ProveedorInterEntity }
     * 
     */
    public ProveedorInterEntity createProveedorInterEntity() {
        return new ProveedorInterEntity();
    }

    /**
     * Create an instance of {@link ProductoSimpleEntity }
     * 
     */
    public ProductoSimpleEntity createProductoSimpleEntity() {
        return new ProductoSimpleEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarProveedorInternacionalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertarProveedorInternacionalResponse")
    public JAXBElement<InsertarProveedorInternacionalResponse> createInsertarProveedorInternacionalResponse(InsertarProveedorInternacionalResponse value) {
        return new JAXBElement<InsertarProveedorInternacionalResponse>(_InsertarProveedorInternacionalResponse_QNAME, InsertarProveedorInternacionalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerImportacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerImportacionesResponse")
    public JAXBElement<ObtenerImportacionesResponse> createObtenerImportacionesResponse(ObtenerImportacionesResponse value) {
        return new JAXBElement<ObtenerImportacionesResponse>(_ObtenerImportacionesResponse_QNAME, ObtenerImportacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarProductosImportacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "borrarProductosImportacion")
    public JAXBElement<BorrarProductosImportacion> createBorrarProductosImportacion(BorrarProductosImportacion value) {
        return new JAXBElement<BorrarProductosImportacion>(_BorrarProductosImportacion_QNAME, BorrarProductosImportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarGastoImportacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "eliminarGastoImportacion")
    public JAXBElement<EliminarGastoImportacion> createEliminarGastoImportacion(EliminarGastoImportacion value) {
        return new JAXBElement<EliminarGastoImportacion>(_EliminarGastoImportacion_QNAME, EliminarGastoImportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaImportacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertaImportacionResponse")
    public JAXBElement<InsertaImportacionResponse> createInsertaImportacionResponse(InsertaImportacionResponse value) {
        return new JAXBElement<InsertaImportacionResponse>(_InsertaImportacionResponse_QNAME, InsertaImportacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarProductosImportacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "borrarProductosImportacionResponse")
    public JAXBElement<BorrarProductosImportacionResponse> createBorrarProductosImportacionResponse(BorrarProductosImportacionResponse value) {
        return new JAXBElement<BorrarProductosImportacionResponse>(_BorrarProductosImportacionResponse_QNAME, BorrarProductosImportacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDetalleGasto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerDetalleGasto")
    public JAXBElement<ObtenerDetalleGasto> createObtenerDetalleGasto(ObtenerDetalleGasto value) {
        return new JAXBElement<ObtenerDetalleGasto>(_ObtenerDetalleGasto_QNAME, ObtenerDetalleGasto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutaProcesoImportacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "ejecutaProcesoImportacion")
    public JAXBElement<EjecutaProcesoImportacion> createEjecutaProcesoImportacion(EjecutaProcesoImportacion value) {
        return new JAXBElement<EjecutaProcesoImportacion>(_EjecutaProcesoImportacion_QNAME, EjecutaProcesoImportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerGastosImpoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerGastosImpoResponse")
    public JAXBElement<ObtenerGastosImpoResponse> createObtenerGastosImpoResponse(ObtenerGastosImpoResponse value) {
        return new JAXBElement<ObtenerGastosImpoResponse>(_ObtenerGastosImpoResponse_QNAME, ObtenerGastosImpoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarProveedorInternacional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertarProveedorInternacional")
    public JAXBElement<InsertarProveedorInternacional> createInsertarProveedorInternacional(InsertarProveedorInternacional value) {
        return new JAXBElement<InsertarProveedorInternacional>(_InsertarProveedorInternacional_QNAME, InsertarProveedorInternacional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerGastosImpo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerGastosImpo")
    public JAXBElement<ObtenerGastosImpo> createObtenerGastosImpo(ObtenerGastosImpo value) {
        return new JAXBElement<ObtenerGastosImpo>(_ObtenerGastosImpo_QNAME, ObtenerGastosImpo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerImportacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerImportacion")
    public JAXBElement<ObtenerImportacion> createObtenerImportacion(ObtenerImportacion value) {
        return new JAXBElement<ObtenerImportacion>(_ObtenerImportacion_QNAME, ObtenerImportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaImportacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertaImportacion")
    public JAXBElement<InsertaImportacion> createInsertaImportacion(InsertaImportacion value) {
        return new JAXBElement<InsertaImportacion>(_InsertaImportacion_QNAME, InsertaImportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleGasto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "eliminarDetalleGasto")
    public JAXBElement<EliminarDetalleGasto> createEliminarDetalleGasto(EliminarDetalleGasto value) {
        return new JAXBElement<EliminarDetalleGasto>(_EliminarDetalleGasto_QNAME, EliminarDetalleGasto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarProductoImportacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertarProductoImportacionResponse")
    public JAXBElement<InsertarProductoImportacionResponse> createInsertarProductoImportacionResponse(InsertarProductoImportacionResponse value) {
        return new JAXBElement<InsertarProductoImportacionResponse>(_InsertarProductoImportacionResponse_QNAME, InsertarProductoImportacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProveedoresInterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerProveedoresInterResponse")
    public JAXBElement<ObtenerProveedoresInterResponse> createObtenerProveedoresInterResponse(ObtenerProveedoresInterResponse value) {
        return new JAXBElement<ObtenerProveedoresInterResponse>(_ObtenerProveedoresInterResponse_QNAME, ObtenerProveedoresInterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDetalleGastoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerDetalleGastoResponse")
    public JAXBElement<ObtenerDetalleGastoResponse> createObtenerDetalleGastoResponse(ObtenerDetalleGastoResponse value) {
        return new JAXBElement<ObtenerDetalleGastoResponse>(_ObtenerDetalleGastoResponse_QNAME, ObtenerDetalleGastoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProductosImportacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerProductosImportacion")
    public JAXBElement<ObtenerProductosImportacion> createObtenerProductosImportacion(ObtenerProductosImportacion value) {
        return new JAXBElement<ObtenerProductosImportacion>(_ObtenerProductosImportacion_QNAME, ObtenerProductosImportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProveedoresInter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerProveedoresInter")
    public JAXBElement<ObtenerProveedoresInter> createObtenerProveedoresInter(ObtenerProveedoresInter value) {
        return new JAXBElement<ObtenerProveedoresInter>(_ObtenerProveedoresInter_QNAME, ObtenerProveedoresInter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarGastoImportacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "eliminarGastoImportacionResponse")
    public JAXBElement<EliminarGastoImportacionResponse> createEliminarGastoImportacionResponse(EliminarGastoImportacionResponse value) {
        return new JAXBElement<EliminarGastoImportacionResponse>(_EliminarGastoImportacionResponse_QNAME, EliminarGastoImportacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProductosImportacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerProductosImportacionResponse")
    public JAXBElement<ObtenerProductosImportacionResponse> createObtenerProductosImportacionResponse(ObtenerProductosImportacionResponse value) {
        return new JAXBElement<ObtenerProductosImportacionResponse>(_ObtenerProductosImportacionResponse_QNAME, ObtenerProductosImportacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaValorDolaresProdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertaValorDolaresProdResponse")
    public JAXBElement<InsertaValorDolaresProdResponse> createInsertaValorDolaresProdResponse(InsertaValorDolaresProdResponse value) {
        return new JAXBElement<InsertaValorDolaresProdResponse>(_InsertaValorDolaresProdResponse_QNAME, InsertaValorDolaresProdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutaProcesoImportacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "ejecutaProcesoImportacionResponse")
    public JAXBElement<EjecutaProcesoImportacionResponse> createEjecutaProcesoImportacionResponse(EjecutaProcesoImportacionResponse value) {
        return new JAXBElement<EjecutaProcesoImportacionResponse>(_EjecutaProcesoImportacionResponse_QNAME, EjecutaProcesoImportacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleGastoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "eliminarDetalleGastoResponse")
    public JAXBElement<EliminarDetalleGastoResponse> createEliminarDetalleGastoResponse(EliminarDetalleGastoResponse value) {
        return new JAXBElement<EliminarDetalleGastoResponse>(_EliminarDetalleGastoResponse_QNAME, EliminarDetalleGastoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaGastoImportacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertaGastoImportacion")
    public JAXBElement<InsertaGastoImportacion> createInsertaGastoImportacion(InsertaGastoImportacion value) {
        return new JAXBElement<InsertaGastoImportacion>(_InsertaGastoImportacion_QNAME, InsertaGastoImportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDetalleGasto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertarDetalleGasto")
    public JAXBElement<InsertarDetalleGasto> createInsertarDetalleGasto(InsertarDetalleGasto value) {
        return new JAXBElement<InsertarDetalleGasto>(_InsertarDetalleGasto_QNAME, InsertarDetalleGasto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerImportaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerImportaciones")
    public JAXBElement<ObtenerImportaciones> createObtenerImportaciones(ObtenerImportaciones value) {
        return new JAXBElement<ObtenerImportaciones>(_ObtenerImportaciones_QNAME, ObtenerImportaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarProductoImportacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertarProductoImportacion")
    public JAXBElement<InsertarProductoImportacion> createInsertarProductoImportacion(InsertarProductoImportacion value) {
        return new JAXBElement<InsertarProductoImportacion>(_InsertarProductoImportacion_QNAME, InsertarProductoImportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDetalleGastoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertarDetalleGastoResponse")
    public JAXBElement<InsertarDetalleGastoResponse> createInsertarDetalleGastoResponse(InsertarDetalleGastoResponse value) {
        return new JAXBElement<InsertarDetalleGastoResponse>(_InsertarDetalleGastoResponse_QNAME, InsertarDetalleGastoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaGastoImportacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertaGastoImportacionResponse")
    public JAXBElement<InsertaGastoImportacionResponse> createInsertaGastoImportacionResponse(InsertaGastoImportacionResponse value) {
        return new JAXBElement<InsertaGastoImportacionResponse>(_InsertaGastoImportacionResponse_QNAME, InsertaGastoImportacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerImportacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "obtenerImportacionResponse")
    public JAXBElement<ObtenerImportacionResponse> createObtenerImportacionResponse(ObtenerImportacionResponse value) {
        return new JAXBElement<ObtenerImportacionResponse>(_ObtenerImportacionResponse_QNAME, ObtenerImportacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaValorDolaresProd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://importacion.servicio.codesoftware.com.co/", name = "insertaValorDolaresProd")
    public JAXBElement<InsertaValorDolaresProd> createInsertaValorDolaresProd(InsertaValorDolaresProd value) {
        return new JAXBElement<InsertaValorDolaresProd>(_InsertaValorDolaresProd_QNAME, InsertaValorDolaresProd.class, null, value);
    }

}
