
package co.com.codesoftware.server.productos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.codesoftware.server.productos package. 
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

    private final static QName _ConsultaFacturaCompraFiltros_QNAME = new QName("http://productos.server.codesoftware.com.co/", "consultaFacturaCompraFiltros");
    private final static QName _EjecutaCambioPrecioMasivoEnProdResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "ejecutaCambioPrecioMasivoEnProdResponse");
    private final static QName _ConsultaFacturaTotal_QNAME = new QName("http://productos.server.codesoftware.com.co/", "consultaFacturaTotal");
    private final static QName _ConsultaProductoXId_QNAME = new QName("http://productos.server.codesoftware.com.co/", "consultaProductoXId");
    private final static QName _EjecutaCambioPrecioMasivo_QNAME = new QName("http://productos.server.codesoftware.com.co/", "ejecutaCambioPrecioMasivo");
    private final static QName _InsertaImagenesFacturaCompra_QNAME = new QName("http://productos.server.codesoftware.com.co/", "insertaImagenesFacturaCompra");
    private final static QName _BuscaProductoFiltrosResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "buscaProductoFiltrosResponse");
    private final static QName _InsercionParamPrecioMasivoResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "insercionParamPrecioMasivoResponse");
    private final static QName _ValidaCodigoExternoResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "validaCodigoExternoResponse");
    private final static QName _BuscaPorcentajePrecioResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "buscaPorcentajePrecioResponse");
    private final static QName _BuscaProductoFiltros_QNAME = new QName("http://productos.server.codesoftware.com.co/", "buscaProductoFiltros");
    private final static QName _EjecutaCambioPrecioMasivoResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "ejecutaCambioPrecioMasivoResponse");
    private final static QName _BuscaKardexProductoXSede_QNAME = new QName("http://productos.server.codesoftware.com.co/", "buscaKardexProductoXSede");
    private final static QName _BuscaPorcentajePrecioFiltros_QNAME = new QName("http://productos.server.codesoftware.com.co/", "buscaPorcentajePrecioFiltros");
    private final static QName _BuscaKardexProductoXSedeResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "buscaKardexProductoXSedeResponse");
    private final static QName _InsertaImagenesFacturaCompraResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "insertaImagenesFacturaCompraResponse");
    private final static QName _BuscaHistProdXSede_QNAME = new QName("http://productos.server.codesoftware.com.co/", "buscaHistProdXSede");
    private final static QName _ConsultaFacturaCompraFiltrosResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "consultaFacturaCompraFiltrosResponse");
    private final static QName _ConsultaProductosResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "consultaProductosResponse");
    private final static QName _InsercionParamPrecioMasivo_QNAME = new QName("http://productos.server.codesoftware.com.co/", "insercionParamPrecioMasivo");
    private final static QName _ActualizaProductoSimple_QNAME = new QName("http://productos.server.codesoftware.com.co/", "actualizaProductoSimple");
    private final static QName _ActualizaProductoSimpleResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "actualizaProductoSimpleResponse");
    private final static QName _ConsultaFacturaTotalResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "consultaFacturaTotalResponse");
    private final static QName _ConsultaProductoXIdResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "consultaProductoXIdResponse");
    private final static QName _EjecutaCambioPrecioMasivoEnProd_QNAME = new QName("http://productos.server.codesoftware.com.co/", "ejecutaCambioPrecioMasivoEnProd");
    private final static QName _BuscaHistProdXSedeResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "buscaHistProdXSedeResponse");
    private final static QName _BuscaPorcentajePrecio_QNAME = new QName("http://productos.server.codesoftware.com.co/", "buscaPorcentajePrecio");
    private final static QName _ConsultaProductos_QNAME = new QName("http://productos.server.codesoftware.com.co/", "consultaProductos");
    private final static QName _ValidaCodigoExterno_QNAME = new QName("http://productos.server.codesoftware.com.co/", "validaCodigoExterno");
    private final static QName _BuscaPorcentajePrecioFiltrosResponse_QNAME = new QName("http://productos.server.codesoftware.com.co/", "buscaPorcentajePrecioFiltrosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.codesoftware.server.productos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaFacturaTotal }
     * 
     */
    public ConsultaFacturaTotal createConsultaFacturaTotal() {
        return new ConsultaFacturaTotal();
    }

    /**
     * Create an instance of {@link ConsultaProductoXId }
     * 
     */
    public ConsultaProductoXId createConsultaProductoXId() {
        return new ConsultaProductoXId();
    }

    /**
     * Create an instance of {@link EjecutaCambioPrecioMasivo }
     * 
     */
    public EjecutaCambioPrecioMasivo createEjecutaCambioPrecioMasivo() {
        return new EjecutaCambioPrecioMasivo();
    }

    /**
     * Create an instance of {@link BuscaProductoFiltrosResponse }
     * 
     */
    public BuscaProductoFiltrosResponse createBuscaProductoFiltrosResponse() {
        return new BuscaProductoFiltrosResponse();
    }

    /**
     * Create an instance of {@link InsercionParamPrecioMasivoResponse }
     * 
     */
    public InsercionParamPrecioMasivoResponse createInsercionParamPrecioMasivoResponse() {
        return new InsercionParamPrecioMasivoResponse();
    }

    /**
     * Create an instance of {@link InsertaImagenesFacturaCompra }
     * 
     */
    public InsertaImagenesFacturaCompra createInsertaImagenesFacturaCompra() {
        return new InsertaImagenesFacturaCompra();
    }

    /**
     * Create an instance of {@link ConsultaFacturaCompraFiltros }
     * 
     */
    public ConsultaFacturaCompraFiltros createConsultaFacturaCompraFiltros() {
        return new ConsultaFacturaCompraFiltros();
    }

    /**
     * Create an instance of {@link EjecutaCambioPrecioMasivoEnProdResponse }
     * 
     */
    public EjecutaCambioPrecioMasivoEnProdResponse createEjecutaCambioPrecioMasivoEnProdResponse() {
        return new EjecutaCambioPrecioMasivoEnProdResponse();
    }

    /**
     * Create an instance of {@link BuscaKardexProductoXSede }
     * 
     */
    public BuscaKardexProductoXSede createBuscaKardexProductoXSede() {
        return new BuscaKardexProductoXSede();
    }

    /**
     * Create an instance of {@link BuscaPorcentajePrecioFiltros }
     * 
     */
    public BuscaPorcentajePrecioFiltros createBuscaPorcentajePrecioFiltros() {
        return new BuscaPorcentajePrecioFiltros();
    }

    /**
     * Create an instance of {@link BuscaProductoFiltros }
     * 
     */
    public BuscaProductoFiltros createBuscaProductoFiltros() {
        return new BuscaProductoFiltros();
    }

    /**
     * Create an instance of {@link ValidaCodigoExternoResponse }
     * 
     */
    public ValidaCodigoExternoResponse createValidaCodigoExternoResponse() {
        return new ValidaCodigoExternoResponse();
    }

    /**
     * Create an instance of {@link BuscaPorcentajePrecioResponse }
     * 
     */
    public BuscaPorcentajePrecioResponse createBuscaPorcentajePrecioResponse() {
        return new BuscaPorcentajePrecioResponse();
    }

    /**
     * Create an instance of {@link EjecutaCambioPrecioMasivoResponse }
     * 
     */
    public EjecutaCambioPrecioMasivoResponse createEjecutaCambioPrecioMasivoResponse() {
        return new EjecutaCambioPrecioMasivoResponse();
    }

    /**
     * Create an instance of {@link ActualizaProductoSimpleResponse }
     * 
     */
    public ActualizaProductoSimpleResponse createActualizaProductoSimpleResponse() {
        return new ActualizaProductoSimpleResponse();
    }

    /**
     * Create an instance of {@link ConsultaFacturaTotalResponse }
     * 
     */
    public ConsultaFacturaTotalResponse createConsultaFacturaTotalResponse() {
        return new ConsultaFacturaTotalResponse();
    }

    /**
     * Create an instance of {@link BuscaKardexProductoXSedeResponse }
     * 
     */
    public BuscaKardexProductoXSedeResponse createBuscaKardexProductoXSedeResponse() {
        return new BuscaKardexProductoXSedeResponse();
    }

    /**
     * Create an instance of {@link InsertaImagenesFacturaCompraResponse }
     * 
     */
    public InsertaImagenesFacturaCompraResponse createInsertaImagenesFacturaCompraResponse() {
        return new InsertaImagenesFacturaCompraResponse();
    }

    /**
     * Create an instance of {@link BuscaHistProdXSede }
     * 
     */
    public BuscaHistProdXSede createBuscaHistProdXSede() {
        return new BuscaHistProdXSede();
    }

    /**
     * Create an instance of {@link ConsultaFacturaCompraFiltrosResponse }
     * 
     */
    public ConsultaFacturaCompraFiltrosResponse createConsultaFacturaCompraFiltrosResponse() {
        return new ConsultaFacturaCompraFiltrosResponse();
    }

    /**
     * Create an instance of {@link ConsultaProductosResponse }
     * 
     */
    public ConsultaProductosResponse createConsultaProductosResponse() {
        return new ConsultaProductosResponse();
    }

    /**
     * Create an instance of {@link InsercionParamPrecioMasivo }
     * 
     */
    public InsercionParamPrecioMasivo createInsercionParamPrecioMasivo() {
        return new InsercionParamPrecioMasivo();
    }

    /**
     * Create an instance of {@link ActualizaProductoSimple }
     * 
     */
    public ActualizaProductoSimple createActualizaProductoSimple() {
        return new ActualizaProductoSimple();
    }

    /**
     * Create an instance of {@link ValidaCodigoExterno }
     * 
     */
    public ValidaCodigoExterno createValidaCodigoExterno() {
        return new ValidaCodigoExterno();
    }

    /**
     * Create an instance of {@link BuscaPorcentajePrecioFiltrosResponse }
     * 
     */
    public BuscaPorcentajePrecioFiltrosResponse createBuscaPorcentajePrecioFiltrosResponse() {
        return new BuscaPorcentajePrecioFiltrosResponse();
    }

    /**
     * Create an instance of {@link EjecutaCambioPrecioMasivoEnProd }
     * 
     */
    public EjecutaCambioPrecioMasivoEnProd createEjecutaCambioPrecioMasivoEnProd() {
        return new EjecutaCambioPrecioMasivoEnProd();
    }

    /**
     * Create an instance of {@link ConsultaProductoXIdResponse }
     * 
     */
    public ConsultaProductoXIdResponse createConsultaProductoXIdResponse() {
        return new ConsultaProductoXIdResponse();
    }

    /**
     * Create an instance of {@link ConsultaProductos }
     * 
     */
    public ConsultaProductos createConsultaProductos() {
        return new ConsultaProductos();
    }

    /**
     * Create an instance of {@link BuscaHistProdXSedeResponse }
     * 
     */
    public BuscaHistProdXSedeResponse createBuscaHistProdXSedeResponse() {
        return new BuscaHistProdXSedeResponse();
    }

    /**
     * Create an instance of {@link BuscaPorcentajePrecio }
     * 
     */
    public BuscaPorcentajePrecio createBuscaPorcentajePrecio() {
        return new BuscaPorcentajePrecio();
    }

    /**
     * Create an instance of {@link DepartamentoEntity }
     * 
     */
    public DepartamentoEntity createDepartamentoEntity() {
        return new DepartamentoEntity();
    }

    /**
     * Create an instance of {@link UsuarioEntity }
     * 
     */
    public UsuarioEntity createUsuarioEntity() {
        return new UsuarioEntity();
    }

    /**
     * Create an instance of {@link RespuestaEntity }
     * 
     */
    public RespuestaEntity createRespuestaEntity() {
        return new RespuestaEntity();
    }

    /**
     * Create an instance of {@link FacturaCompraEntity }
     * 
     */
    public FacturaCompraEntity createFacturaCompraEntity() {
        return new FacturaCompraEntity();
    }

    /**
     * Create an instance of {@link MovimientoInventarioEntity }
     * 
     */
    public MovimientoInventarioEntity createMovimientoInventarioEntity() {
        return new MovimientoInventarioEntity();
    }

    /**
     * Create an instance of {@link PerfilEntity }
     * 
     */
    public PerfilEntity createPerfilEntity() {
        return new PerfilEntity();
    }

    /**
     * Create an instance of {@link KardexProductoEntity }
     * 
     */
    public KardexProductoEntity createKardexProductoEntity() {
        return new KardexProductoEntity();
    }

    /**
     * Create an instance of {@link FacturaCompraGeneralEntity }
     * 
     */
    public FacturaCompraGeneralEntity createFacturaCompraGeneralEntity() {
        return new FacturaCompraGeneralEntity();
    }

    /**
     * Create an instance of {@link PagoFacCompraEntity }
     * 
     */
    public PagoFacCompraEntity createPagoFacCompraEntity() {
        return new PagoFacCompraEntity();
    }

    /**
     * Create an instance of {@link ProductoSimpleEntity }
     * 
     */
    public ProductoSimpleEntity createProductoSimpleEntity() {
        return new ProductoSimpleEntity();
    }

    /**
     * Create an instance of {@link CategoriaEntity }
     * 
     */
    public CategoriaEntity createCategoriaEntity() {
        return new CategoriaEntity();
    }

    /**
     * Create an instance of {@link MarcaEntity }
     * 
     */
    public MarcaEntity createMarcaEntity() {
        return new MarcaEntity();
    }

    /**
     * Create an instance of {@link PersonaEntity }
     * 
     */
    public PersonaEntity createPersonaEntity() {
        return new PersonaEntity();
    }

    /**
     * Create an instance of {@link ProductoEntity }
     * 
     */
    public ProductoEntity createProductoEntity() {
        return new ProductoEntity();
    }

    /**
     * Create an instance of {@link ProductoFacCompraEntity }
     * 
     */
    public ProductoFacCompraEntity createProductoFacCompraEntity() {
        return new ProductoFacCompraEntity();
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
     * Create an instance of {@link SedeEntity }
     * 
     */
    public SedeEntity createSedeEntity() {
        return new SedeEntity();
    }

    /**
     * Create an instance of {@link ReteFuenteEntity }
     * 
     */
    public ReteFuenteEntity createReteFuenteEntity() {
        return new ReteFuenteEntity();
    }

    /**
     * Create an instance of {@link SubCuentaEntity }
     * 
     */
    public SubCuentaEntity createSubCuentaEntity() {
        return new SubCuentaEntity();
    }

    /**
     * Create an instance of {@link FacturaCompraTotalEntity }
     * 
     */
    public FacturaCompraTotalEntity createFacturaCompraTotalEntity() {
        return new FacturaCompraTotalEntity();
    }

    /**
     * Create an instance of {@link ImagenesFacCompraEntity }
     * 
     */
    public ImagenesFacCompraEntity createImagenesFacCompraEntity() {
        return new ImagenesFacCompraEntity();
    }

    /**
     * Create an instance of {@link PrecioProdSimpleEntity }
     * 
     */
    public PrecioProdSimpleEntity createPrecioProdSimpleEntity() {
        return new PrecioProdSimpleEntity();
    }

    /**
     * Create an instance of {@link ReferenciaEntity }
     * 
     */
    public ReferenciaEntity createReferenciaEntity() {
        return new ReferenciaEntity();
    }

    /**
     * Create an instance of {@link PorcentajePrecioEntity }
     * 
     */
    public PorcentajePrecioEntity createPorcentajePrecioEntity() {
        return new PorcentajePrecioEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFacturaCompraFiltros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "consultaFacturaCompraFiltros")
    public JAXBElement<ConsultaFacturaCompraFiltros> createConsultaFacturaCompraFiltros(ConsultaFacturaCompraFiltros value) {
        return new JAXBElement<ConsultaFacturaCompraFiltros>(_ConsultaFacturaCompraFiltros_QNAME, ConsultaFacturaCompraFiltros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutaCambioPrecioMasivoEnProdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "ejecutaCambioPrecioMasivoEnProdResponse")
    public JAXBElement<EjecutaCambioPrecioMasivoEnProdResponse> createEjecutaCambioPrecioMasivoEnProdResponse(EjecutaCambioPrecioMasivoEnProdResponse value) {
        return new JAXBElement<EjecutaCambioPrecioMasivoEnProdResponse>(_EjecutaCambioPrecioMasivoEnProdResponse_QNAME, EjecutaCambioPrecioMasivoEnProdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFacturaTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "consultaFacturaTotal")
    public JAXBElement<ConsultaFacturaTotal> createConsultaFacturaTotal(ConsultaFacturaTotal value) {
        return new JAXBElement<ConsultaFacturaTotal>(_ConsultaFacturaTotal_QNAME, ConsultaFacturaTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductoXId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "consultaProductoXId")
    public JAXBElement<ConsultaProductoXId> createConsultaProductoXId(ConsultaProductoXId value) {
        return new JAXBElement<ConsultaProductoXId>(_ConsultaProductoXId_QNAME, ConsultaProductoXId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutaCambioPrecioMasivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "ejecutaCambioPrecioMasivo")
    public JAXBElement<EjecutaCambioPrecioMasivo> createEjecutaCambioPrecioMasivo(EjecutaCambioPrecioMasivo value) {
        return new JAXBElement<EjecutaCambioPrecioMasivo>(_EjecutaCambioPrecioMasivo_QNAME, EjecutaCambioPrecioMasivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaImagenesFacturaCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "insertaImagenesFacturaCompra")
    public JAXBElement<InsertaImagenesFacturaCompra> createInsertaImagenesFacturaCompra(InsertaImagenesFacturaCompra value) {
        return new JAXBElement<InsertaImagenesFacturaCompra>(_InsertaImagenesFacturaCompra_QNAME, InsertaImagenesFacturaCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaProductoFiltrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "buscaProductoFiltrosResponse")
    public JAXBElement<BuscaProductoFiltrosResponse> createBuscaProductoFiltrosResponse(BuscaProductoFiltrosResponse value) {
        return new JAXBElement<BuscaProductoFiltrosResponse>(_BuscaProductoFiltrosResponse_QNAME, BuscaProductoFiltrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsercionParamPrecioMasivoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "insercionParamPrecioMasivoResponse")
    public JAXBElement<InsercionParamPrecioMasivoResponse> createInsercionParamPrecioMasivoResponse(InsercionParamPrecioMasivoResponse value) {
        return new JAXBElement<InsercionParamPrecioMasivoResponse>(_InsercionParamPrecioMasivoResponse_QNAME, InsercionParamPrecioMasivoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaCodigoExternoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "validaCodigoExternoResponse")
    public JAXBElement<ValidaCodigoExternoResponse> createValidaCodigoExternoResponse(ValidaCodigoExternoResponse value) {
        return new JAXBElement<ValidaCodigoExternoResponse>(_ValidaCodigoExternoResponse_QNAME, ValidaCodigoExternoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPorcentajePrecioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "buscaPorcentajePrecioResponse")
    public JAXBElement<BuscaPorcentajePrecioResponse> createBuscaPorcentajePrecioResponse(BuscaPorcentajePrecioResponse value) {
        return new JAXBElement<BuscaPorcentajePrecioResponse>(_BuscaPorcentajePrecioResponse_QNAME, BuscaPorcentajePrecioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaProductoFiltros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "buscaProductoFiltros")
    public JAXBElement<BuscaProductoFiltros> createBuscaProductoFiltros(BuscaProductoFiltros value) {
        return new JAXBElement<BuscaProductoFiltros>(_BuscaProductoFiltros_QNAME, BuscaProductoFiltros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutaCambioPrecioMasivoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "ejecutaCambioPrecioMasivoResponse")
    public JAXBElement<EjecutaCambioPrecioMasivoResponse> createEjecutaCambioPrecioMasivoResponse(EjecutaCambioPrecioMasivoResponse value) {
        return new JAXBElement<EjecutaCambioPrecioMasivoResponse>(_EjecutaCambioPrecioMasivoResponse_QNAME, EjecutaCambioPrecioMasivoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaKardexProductoXSede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "buscaKardexProductoXSede")
    public JAXBElement<BuscaKardexProductoXSede> createBuscaKardexProductoXSede(BuscaKardexProductoXSede value) {
        return new JAXBElement<BuscaKardexProductoXSede>(_BuscaKardexProductoXSede_QNAME, BuscaKardexProductoXSede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPorcentajePrecioFiltros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "buscaPorcentajePrecioFiltros")
    public JAXBElement<BuscaPorcentajePrecioFiltros> createBuscaPorcentajePrecioFiltros(BuscaPorcentajePrecioFiltros value) {
        return new JAXBElement<BuscaPorcentajePrecioFiltros>(_BuscaPorcentajePrecioFiltros_QNAME, BuscaPorcentajePrecioFiltros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaKardexProductoXSedeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "buscaKardexProductoXSedeResponse")
    public JAXBElement<BuscaKardexProductoXSedeResponse> createBuscaKardexProductoXSedeResponse(BuscaKardexProductoXSedeResponse value) {
        return new JAXBElement<BuscaKardexProductoXSedeResponse>(_BuscaKardexProductoXSedeResponse_QNAME, BuscaKardexProductoXSedeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaImagenesFacturaCompraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "insertaImagenesFacturaCompraResponse")
    public JAXBElement<InsertaImagenesFacturaCompraResponse> createInsertaImagenesFacturaCompraResponse(InsertaImagenesFacturaCompraResponse value) {
        return new JAXBElement<InsertaImagenesFacturaCompraResponse>(_InsertaImagenesFacturaCompraResponse_QNAME, InsertaImagenesFacturaCompraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaHistProdXSede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "buscaHistProdXSede")
    public JAXBElement<BuscaHistProdXSede> createBuscaHistProdXSede(BuscaHistProdXSede value) {
        return new JAXBElement<BuscaHistProdXSede>(_BuscaHistProdXSede_QNAME, BuscaHistProdXSede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFacturaCompraFiltrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "consultaFacturaCompraFiltrosResponse")
    public JAXBElement<ConsultaFacturaCompraFiltrosResponse> createConsultaFacturaCompraFiltrosResponse(ConsultaFacturaCompraFiltrosResponse value) {
        return new JAXBElement<ConsultaFacturaCompraFiltrosResponse>(_ConsultaFacturaCompraFiltrosResponse_QNAME, ConsultaFacturaCompraFiltrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "consultaProductosResponse")
    public JAXBElement<ConsultaProductosResponse> createConsultaProductosResponse(ConsultaProductosResponse value) {
        return new JAXBElement<ConsultaProductosResponse>(_ConsultaProductosResponse_QNAME, ConsultaProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsercionParamPrecioMasivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "insercionParamPrecioMasivo")
    public JAXBElement<InsercionParamPrecioMasivo> createInsercionParamPrecioMasivo(InsercionParamPrecioMasivo value) {
        return new JAXBElement<InsercionParamPrecioMasivo>(_InsercionParamPrecioMasivo_QNAME, InsercionParamPrecioMasivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaProductoSimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "actualizaProductoSimple")
    public JAXBElement<ActualizaProductoSimple> createActualizaProductoSimple(ActualizaProductoSimple value) {
        return new JAXBElement<ActualizaProductoSimple>(_ActualizaProductoSimple_QNAME, ActualizaProductoSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaProductoSimpleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "actualizaProductoSimpleResponse")
    public JAXBElement<ActualizaProductoSimpleResponse> createActualizaProductoSimpleResponse(ActualizaProductoSimpleResponse value) {
        return new JAXBElement<ActualizaProductoSimpleResponse>(_ActualizaProductoSimpleResponse_QNAME, ActualizaProductoSimpleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFacturaTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "consultaFacturaTotalResponse")
    public JAXBElement<ConsultaFacturaTotalResponse> createConsultaFacturaTotalResponse(ConsultaFacturaTotalResponse value) {
        return new JAXBElement<ConsultaFacturaTotalResponse>(_ConsultaFacturaTotalResponse_QNAME, ConsultaFacturaTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductoXIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "consultaProductoXIdResponse")
    public JAXBElement<ConsultaProductoXIdResponse> createConsultaProductoXIdResponse(ConsultaProductoXIdResponse value) {
        return new JAXBElement<ConsultaProductoXIdResponse>(_ConsultaProductoXIdResponse_QNAME, ConsultaProductoXIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutaCambioPrecioMasivoEnProd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "ejecutaCambioPrecioMasivoEnProd")
    public JAXBElement<EjecutaCambioPrecioMasivoEnProd> createEjecutaCambioPrecioMasivoEnProd(EjecutaCambioPrecioMasivoEnProd value) {
        return new JAXBElement<EjecutaCambioPrecioMasivoEnProd>(_EjecutaCambioPrecioMasivoEnProd_QNAME, EjecutaCambioPrecioMasivoEnProd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaHistProdXSedeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "buscaHistProdXSedeResponse")
    public JAXBElement<BuscaHistProdXSedeResponse> createBuscaHistProdXSedeResponse(BuscaHistProdXSedeResponse value) {
        return new JAXBElement<BuscaHistProdXSedeResponse>(_BuscaHistProdXSedeResponse_QNAME, BuscaHistProdXSedeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPorcentajePrecio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "buscaPorcentajePrecio")
    public JAXBElement<BuscaPorcentajePrecio> createBuscaPorcentajePrecio(BuscaPorcentajePrecio value) {
        return new JAXBElement<BuscaPorcentajePrecio>(_BuscaPorcentajePrecio_QNAME, BuscaPorcentajePrecio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "consultaProductos")
    public JAXBElement<ConsultaProductos> createConsultaProductos(ConsultaProductos value) {
        return new JAXBElement<ConsultaProductos>(_ConsultaProductos_QNAME, ConsultaProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaCodigoExterno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "validaCodigoExterno")
    public JAXBElement<ValidaCodigoExterno> createValidaCodigoExterno(ValidaCodigoExterno value) {
        return new JAXBElement<ValidaCodigoExterno>(_ValidaCodigoExterno_QNAME, ValidaCodigoExterno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPorcentajePrecioFiltrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productos.server.codesoftware.com.co/", name = "buscaPorcentajePrecioFiltrosResponse")
    public JAXBElement<BuscaPorcentajePrecioFiltrosResponse> createBuscaPorcentajePrecioFiltrosResponse(BuscaPorcentajePrecioFiltrosResponse value) {
        return new JAXBElement<BuscaPorcentajePrecioFiltrosResponse>(_BuscaPorcentajePrecioFiltrosResponse_QNAME, BuscaPorcentajePrecioFiltrosResponse.class, null, value);
    }

}
