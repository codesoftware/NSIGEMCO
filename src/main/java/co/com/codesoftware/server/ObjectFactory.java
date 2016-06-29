
package co.com.codesoftware.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import co.com.codesoftware.servicio.general.SedeEntity;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.codesoftware.server package. 
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

    private final static QName _GetFacturas_QNAME = new QName("http://server.codesoftware.com.co/", "getFacturas");
    private final static QName _GeneraPdfCotizacionResponse_QNAME = new QName("http://server.codesoftware.com.co/", "generaPdfCotizacionResponse");
    private final static QName _InsertaPedidosProducto_QNAME = new QName("http://server.codesoftware.com.co/", "insertaPedidosProducto");
    private final static QName _ConsultaPermisosUsuario_QNAME = new QName("http://server.codesoftware.com.co/", "consultaPermisosUsuario");
    private final static QName _LoginResponse_QNAME = new QName("http://server.codesoftware.com.co/", "loginResponse");
    private final static QName _UpdateClienteResponse_QNAME = new QName("http://server.codesoftware.com.co/", "updateClienteResponse");
    private final static QName _GetClientesResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getClientesResponse");
    private final static QName _CambiaClaveUsuario_QNAME = new QName("http://server.codesoftware.com.co/", "cambiaClaveUsuario");
    private final static QName _ConsultaCantidadesXSedeResponse_QNAME = new QName("http://server.codesoftware.com.co/", "consultaCantidadesXSedeResponse");
    private final static QName _GetProductForCodeResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getProductForCodeResponse");
    private final static QName _SearchBoxNow_QNAME = new QName("http://server.codesoftware.com.co/", "searchBoxNow");
    private final static QName _ConsultaCantidadesXSede_QNAME = new QName("http://server.codesoftware.com.co/", "consultaCantidadesXSede");
    private final static QName _FacturarAvanzadaResponse_QNAME = new QName("http://server.codesoftware.com.co/", "facturarAvanzadaResponse");
    private final static QName _GetRecetas_QNAME = new QName("http://server.codesoftware.com.co/", "getRecetas");
    private final static QName _CambiaEstadoPedidoResponse_QNAME = new QName("http://server.codesoftware.com.co/", "cambiaEstadoPedidoResponse");
    private final static QName _GetFacturasResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getFacturasResponse");
    private final static QName _SearchBoxNowResponse_QNAME = new QName("http://server.codesoftware.com.co/", "searchBoxNowResponse");
    private final static QName _CambiaClaveUsuarioResponse_QNAME = new QName("http://server.codesoftware.com.co/", "cambiaClaveUsuarioResponse");
    private final static QName _Facturar_QNAME = new QName("http://server.codesoftware.com.co/", "facturar");
    private final static QName _GetDishesPrincipalScreenResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getDishesPrincipalScreenResponse");
    private final static QName _GetClienteXCedula_QNAME = new QName("http://server.codesoftware.com.co/", "getClienteXCedula");
    private final static QName _GetProductPrincipalScreen_QNAME = new QName("http://server.codesoftware.com.co/", "getProductPrincipalScreen");
    private final static QName _GetRecetaForcodeResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getRecetaForcodeResponse");
    private final static QName _ConsultaReferenciasHomeCategoriaResponse_QNAME = new QName("http://server.codesoftware.com.co/", "consultaReferenciasHomeCategoriaResponse");
    private final static QName _GetParamsEmpresa_QNAME = new QName("http://server.codesoftware.com.co/", "getParamsEmpresa");
    private final static QName _FacturarResponse_QNAME = new QName("http://server.codesoftware.com.co/", "facturarResponse");
    private final static QName _GetUsers_QNAME = new QName("http://server.codesoftware.com.co/", "getUsers");
    private final static QName _BuscaCotizacionPorClienteResponse_QNAME = new QName("http://server.codesoftware.com.co/", "buscaCotizacionPorClienteResponse");
    private final static QName _ConsultaPedidoXId_QNAME = new QName("http://server.codesoftware.com.co/", "consultaPedidoXId");
    private final static QName _FindProductosAndDishesResponse_QNAME = new QName("http://server.codesoftware.com.co/", "findProductosAndDishesResponse");
    private final static QName _GeneraCodigoPedido_QNAME = new QName("http://server.codesoftware.com.co/", "generaCodigoPedido");
    private final static QName _FindBillForIdResponse_QNAME = new QName("http://server.codesoftware.com.co/", "findBillForIdResponse");
    private final static QName _BuscaProductoXCodBarras_QNAME = new QName("http://server.codesoftware.com.co/", "buscaProductoXCodBarras");
    private final static QName _AddCliente_QNAME = new QName("http://server.codesoftware.com.co/", "addCliente");
    private final static QName _EliminaPedido_QNAME = new QName("http://server.codesoftware.com.co/", "eliminaPedido");
    private final static QName _GeneraPdfCotizacion_QNAME = new QName("http://server.codesoftware.com.co/", "generaPdfCotizacion");
    private final static QName _GetFacturaForIdResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getFacturaForIdResponse");
    private final static QName _ConsultaProductoCodigoExterno_QNAME = new QName("http://server.codesoftware.com.co/", "consultaProductoCodigoExterno");
    private final static QName _BuscaCotizacionPorCliente_QNAME = new QName("http://server.codesoftware.com.co/", "buscaCotizacionPorCliente");
    private final static QName _ConsultaCantidadesXProductoResponse_QNAME = new QName("http://server.codesoftware.com.co/", "consultaCantidadesXProductoResponse");
    private final static QName _ConsultaPedidosXEstadoResponse_QNAME = new QName("http://server.codesoftware.com.co/", "consultaPedidosXEstadoResponse");
    private final static QName _ConsultaProductosXReferencia_QNAME = new QName("http://server.codesoftware.com.co/", "consultaProductosXReferencia");
    private final static QName _FindExistsForSedeResponse_QNAME = new QName("http://server.codesoftware.com.co/", "findExistsForSedeResponse");
    private final static QName _GetFacturaForId_QNAME = new QName("http://server.codesoftware.com.co/", "getFacturaForId");
    private final static QName _GetParamsEmpresaResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getParamsEmpresaResponse");
    private final static QName _CambiaEstadoPedido_QNAME = new QName("http://server.codesoftware.com.co/", "cambiaEstadoPedido");
    private final static QName _GetSedes_QNAME = new QName("http://server.codesoftware.com.co/", "getSedes");
    private final static QName _ConsultaPermisosUsuarioResponse_QNAME = new QName("http://server.codesoftware.com.co/", "consultaPermisosUsuarioResponse");
    private final static QName _ValidaUsuarioFacturadorResponse_QNAME = new QName("http://server.codesoftware.com.co/", "validaUsuarioFacturadorResponse");
    private final static QName _ConsultaCantidadesXProducto_QNAME = new QName("http://server.codesoftware.com.co/", "consultaCantidadesXProducto");
    private final static QName _ConsultaPedidosXEstado_QNAME = new QName("http://server.codesoftware.com.co/", "consultaPedidosXEstado");
    private final static QName _GetProductForCode_QNAME = new QName("http://server.codesoftware.com.co/", "getProductForCode");
    private final static QName _BuscaProductoXCodBarrasResponse_QNAME = new QName("http://server.codesoftware.com.co/", "buscaProductoXCodBarrasResponse");
    private final static QName _InsertaProductosXPedidoResponse_QNAME = new QName("http://server.codesoftware.com.co/", "insertaProductosXPedidoResponse");
    private final static QName _ConsultaPedidosXFiltros_QNAME = new QName("http://server.codesoftware.com.co/", "consultaPedidosXFiltros");
    private final static QName _FacturarAvanzada_QNAME = new QName("http://server.codesoftware.com.co/", "facturarAvanzada");
    private final static QName _AddClienteResponse_QNAME = new QName("http://server.codesoftware.com.co/", "addClienteResponse");
    private final static QName _GetRecetaForcode_QNAME = new QName("http://server.codesoftware.com.co/", "getRecetaForcode");
    private final static QName _GetUsersResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getUsersResponse");
    private final static QName _ConsultaPedidoSedeResponse_QNAME = new QName("http://server.codesoftware.com.co/", "consultaPedidoSedeResponse");
    private final static QName _FindBillForId_QNAME = new QName("http://server.codesoftware.com.co/", "findBillForId");
    private final static QName _FindExistsForSede_QNAME = new QName("http://server.codesoftware.com.co/", "findExistsForSede");
    private final static QName _GetRecetasResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getRecetasResponse");
    private final static QName _GetProductPrincipalScreenResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getProductPrincipalScreenResponse");
    private final static QName _ConsultaReferenciasHomeCategoria_QNAME = new QName("http://server.codesoftware.com.co/", "consultaReferenciasHomeCategoria");
    private final static QName _EliminaPedidoResponse_QNAME = new QName("http://server.codesoftware.com.co/", "eliminaPedidoResponse");
    private final static QName _Login_QNAME = new QName("http://server.codesoftware.com.co/", "login");
    private final static QName _GetProductsResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getProductsResponse");
    private final static QName _ConsultaProductosXReferenciaResponse_QNAME = new QName("http://server.codesoftware.com.co/", "consultaProductosXReferenciaResponse");
    private final static QName _InsertaProductosXPedido_QNAME = new QName("http://server.codesoftware.com.co/", "insertaProductosXPedido");
    private final static QName _GetClienteXCedulaResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getClienteXCedulaResponse");
    private final static QName _GetFacturasSedeResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getFacturasSedeResponse");
    private final static QName _GeneraCodigoPedidoResponse_QNAME = new QName("http://server.codesoftware.com.co/", "generaCodigoPedidoResponse");
    private final static QName _ConsultaPedidoSede_QNAME = new QName("http://server.codesoftware.com.co/", "consultaPedidoSede");
    private final static QName _ConsultaProductoCodigoExternoResponse_QNAME = new QName("http://server.codesoftware.com.co/", "consultaProductoCodigoExternoResponse");
    private final static QName _InsertaPedidosProductoResponse_QNAME = new QName("http://server.codesoftware.com.co/", "insertaPedidosProductoResponse");
    private final static QName _FindProductosAndDishes_QNAME = new QName("http://server.codesoftware.com.co/", "findProductosAndDishes");
    private final static QName _GetClientes_QNAME = new QName("http://server.codesoftware.com.co/", "getClientes");
    private final static QName _GetDishesPrincipalScreen_QNAME = new QName("http://server.codesoftware.com.co/", "getDishesPrincipalScreen");
    private final static QName _UpdateCliente_QNAME = new QName("http://server.codesoftware.com.co/", "updateCliente");
    private final static QName _ValidaUsuarioFacturador_QNAME = new QName("http://server.codesoftware.com.co/", "validaUsuarioFacturador");
    private final static QName _GetUserForUser_QNAME = new QName("http://server.codesoftware.com.co/", "getUserForUser");
    private final static QName _ConsultaPedidoXIdResponse_QNAME = new QName("http://server.codesoftware.com.co/", "consultaPedidoXIdResponse");
    private final static QName _GetProducts_QNAME = new QName("http://server.codesoftware.com.co/", "getProducts");
    private final static QName _GetSedesResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getSedesResponse");
    private final static QName _GetUserForUserResponse_QNAME = new QName("http://server.codesoftware.com.co/", "getUserForUserResponse");
    private final static QName _GetFacturasSede_QNAME = new QName("http://server.codesoftware.com.co/", "getFacturasSede");
    private final static QName _ConsultaPedidosXFiltrosResponse_QNAME = new QName("http://server.codesoftware.com.co/", "consultaPedidosXFiltrosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.codesoftware.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductPrincipalScreen }
     * 
     */
    public GetProductPrincipalScreen createGetProductPrincipalScreen() {
        return new GetProductPrincipalScreen();
    }

    /**
     * Create an instance of {@link GetClienteXCedula }
     * 
     */
    public GetClienteXCedula createGetClienteXCedula() {
        return new GetClienteXCedula();
    }

    /**
     * Create an instance of {@link Facturar }
     * 
     */
    public Facturar createFacturar() {
        return new Facturar();
    }

    /**
     * Create an instance of {@link GetDishesPrincipalScreenResponse }
     * 
     */
    public GetDishesPrincipalScreenResponse createGetDishesPrincipalScreenResponse() {
        return new GetDishesPrincipalScreenResponse();
    }

    /**
     * Create an instance of {@link GetParamsEmpresa }
     * 
     */
    public GetParamsEmpresa createGetParamsEmpresa() {
        return new GetParamsEmpresa();
    }

    /**
     * Create an instance of {@link ConsultaReferenciasHomeCategoriaResponse }
     * 
     */
    public ConsultaReferenciasHomeCategoriaResponse createConsultaReferenciasHomeCategoriaResponse() {
        return new ConsultaReferenciasHomeCategoriaResponse();
    }

    /**
     * Create an instance of {@link GetRecetaForcodeResponse }
     * 
     */
    public GetRecetaForcodeResponse createGetRecetaForcodeResponse() {
        return new GetRecetaForcodeResponse();
    }

    /**
     * Create an instance of {@link ConsultaProductoCodigoExterno }
     * 
     */
    public ConsultaProductoCodigoExterno createConsultaProductoCodigoExterno() {
        return new ConsultaProductoCodigoExterno();
    }

    /**
     * Create an instance of {@link AddCliente }
     * 
     */
    public AddCliente createAddCliente() {
        return new AddCliente();
    }

    /**
     * Create an instance of {@link EliminaPedido }
     * 
     */
    public EliminaPedido createEliminaPedido() {
        return new EliminaPedido();
    }

    /**
     * Create an instance of {@link GeneraPdfCotizacion }
     * 
     */
    public GeneraPdfCotizacion createGeneraPdfCotizacion() {
        return new GeneraPdfCotizacion();
    }

    /**
     * Create an instance of {@link GetFacturaForIdResponse }
     * 
     */
    public GetFacturaForIdResponse createGetFacturaForIdResponse() {
        return new GetFacturaForIdResponse();
    }

    /**
     * Create an instance of {@link BuscaProductoXCodBarras }
     * 
     */
    public BuscaProductoXCodBarras createBuscaProductoXCodBarras() {
        return new BuscaProductoXCodBarras();
    }

    /**
     * Create an instance of {@link FindBillForIdResponse }
     * 
     */
    public FindBillForIdResponse createFindBillForIdResponse() {
        return new FindBillForIdResponse();
    }

    /**
     * Create an instance of {@link GeneraCodigoPedido }
     * 
     */
    public GeneraCodigoPedido createGeneraCodigoPedido() {
        return new GeneraCodigoPedido();
    }

    /**
     * Create an instance of {@link BuscaCotizacionPorClienteResponse }
     * 
     */
    public BuscaCotizacionPorClienteResponse createBuscaCotizacionPorClienteResponse() {
        return new BuscaCotizacionPorClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultaPedidoXId }
     * 
     */
    public ConsultaPedidoXId createConsultaPedidoXId() {
        return new ConsultaPedidoXId();
    }

    /**
     * Create an instance of {@link FindProductosAndDishesResponse }
     * 
     */
    public FindProductosAndDishesResponse createFindProductosAndDishesResponse() {
        return new FindProductosAndDishesResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link FacturarResponse }
     * 
     */
    public FacturarResponse createFacturarResponse() {
        return new FacturarResponse();
    }

    /**
     * Create an instance of {@link BuscaCotizacionPorCliente }
     * 
     */
    public BuscaCotizacionPorCliente createBuscaCotizacionPorCliente() {
        return new BuscaCotizacionPorCliente();
    }

    /**
     * Create an instance of {@link ConsultaPermisosUsuario }
     * 
     */
    public ConsultaPermisosUsuario createConsultaPermisosUsuario() {
        return new ConsultaPermisosUsuario();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GeneraPdfCotizacionResponse }
     * 
     */
    public GeneraPdfCotizacionResponse createGeneraPdfCotizacionResponse() {
        return new GeneraPdfCotizacionResponse();
    }

    /**
     * Create an instance of {@link InsertaPedidosProducto }
     * 
     */
    public InsertaPedidosProducto createInsertaPedidosProducto() {
        return new InsertaPedidosProducto();
    }

    /**
     * Create an instance of {@link GetFacturas }
     * 
     */
    public GetFacturas createGetFacturas() {
        return new GetFacturas();
    }

    /**
     * Create an instance of {@link CambiaClaveUsuario }
     * 
     */
    public CambiaClaveUsuario createCambiaClaveUsuario() {
        return new CambiaClaveUsuario();
    }

    /**
     * Create an instance of {@link GetClientesResponse }
     * 
     */
    public GetClientesResponse createGetClientesResponse() {
        return new GetClientesResponse();
    }

    /**
     * Create an instance of {@link UpdateClienteResponse }
     * 
     */
    public UpdateClienteResponse createUpdateClienteResponse() {
        return new UpdateClienteResponse();
    }

    /**
     * Create an instance of {@link FacturarAvanzadaResponse }
     * 
     */
    public FacturarAvanzadaResponse createFacturarAvanzadaResponse() {
        return new FacturarAvanzadaResponse();
    }

    /**
     * Create an instance of {@link GetRecetas }
     * 
     */
    public GetRecetas createGetRecetas() {
        return new GetRecetas();
    }

    /**
     * Create an instance of {@link ConsultaCantidadesXSede }
     * 
     */
    public ConsultaCantidadesXSede createConsultaCantidadesXSede() {
        return new ConsultaCantidadesXSede();
    }

    /**
     * Create an instance of {@link ConsultaCantidadesXSedeResponse }
     * 
     */
    public ConsultaCantidadesXSedeResponse createConsultaCantidadesXSedeResponse() {
        return new ConsultaCantidadesXSedeResponse();
    }

    /**
     * Create an instance of {@link GetProductForCodeResponse }
     * 
     */
    public GetProductForCodeResponse createGetProductForCodeResponse() {
        return new GetProductForCodeResponse();
    }

    /**
     * Create an instance of {@link SearchBoxNow }
     * 
     */
    public SearchBoxNow createSearchBoxNow() {
        return new SearchBoxNow();
    }

    /**
     * Create an instance of {@link CambiaClaveUsuarioResponse }
     * 
     */
    public CambiaClaveUsuarioResponse createCambiaClaveUsuarioResponse() {
        return new CambiaClaveUsuarioResponse();
    }

    /**
     * Create an instance of {@link SearchBoxNowResponse }
     * 
     */
    public SearchBoxNowResponse createSearchBoxNowResponse() {
        return new SearchBoxNowResponse();
    }

    /**
     * Create an instance of {@link GetFacturasResponse }
     * 
     */
    public GetFacturasResponse createGetFacturasResponse() {
        return new GetFacturasResponse();
    }

    /**
     * Create an instance of {@link CambiaEstadoPedidoResponse }
     * 
     */
    public CambiaEstadoPedidoResponse createCambiaEstadoPedidoResponse() {
        return new CambiaEstadoPedidoResponse();
    }

    /**
     * Create an instance of {@link GetRecetasResponse }
     * 
     */
    public GetRecetasResponse createGetRecetasResponse() {
        return new GetRecetasResponse();
    }

    /**
     * Create an instance of {@link FindExistsForSede }
     * 
     */
    public FindExistsForSede createFindExistsForSede() {
        return new FindExistsForSede();
    }

    /**
     * Create an instance of {@link FindBillForId }
     * 
     */
    public FindBillForId createFindBillForId() {
        return new FindBillForId();
    }

    /**
     * Create an instance of {@link ConsultaProductosXReferenciaResponse }
     * 
     */
    public ConsultaProductosXReferenciaResponse createConsultaProductosXReferenciaResponse() {
        return new ConsultaProductosXReferenciaResponse();
    }

    /**
     * Create an instance of {@link InsertaProductosXPedido }
     * 
     */
    public InsertaProductosXPedido createInsertaProductosXPedido() {
        return new InsertaProductosXPedido();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link EliminaPedidoResponse }
     * 
     */
    public EliminaPedidoResponse createEliminaPedidoResponse() {
        return new EliminaPedidoResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ConsultaReferenciasHomeCategoria }
     * 
     */
    public ConsultaReferenciasHomeCategoria createConsultaReferenciasHomeCategoria() {
        return new ConsultaReferenciasHomeCategoria();
    }

    /**
     * Create an instance of {@link GetProductPrincipalScreenResponse }
     * 
     */
    public GetProductPrincipalScreenResponse createGetProductPrincipalScreenResponse() {
        return new GetProductPrincipalScreenResponse();
    }

    /**
     * Create an instance of {@link GetClientes }
     * 
     */
    public GetClientes createGetClientes() {
        return new GetClientes();
    }

    /**
     * Create an instance of {@link GetDishesPrincipalScreen }
     * 
     */
    public GetDishesPrincipalScreen createGetDishesPrincipalScreen() {
        return new GetDishesPrincipalScreen();
    }

    /**
     * Create an instance of {@link UpdateCliente }
     * 
     */
    public UpdateCliente createUpdateCliente() {
        return new UpdateCliente();
    }

    /**
     * Create an instance of {@link ValidaUsuarioFacturador }
     * 
     */
    public ValidaUsuarioFacturador createValidaUsuarioFacturador() {
        return new ValidaUsuarioFacturador();
    }

    /**
     * Create an instance of {@link FindProductosAndDishes }
     * 
     */
    public FindProductosAndDishes createFindProductosAndDishes() {
        return new FindProductosAndDishes();
    }

    /**
     * Create an instance of {@link ConsultaProductoCodigoExternoResponse }
     * 
     */
    public ConsultaProductoCodigoExternoResponse createConsultaProductoCodigoExternoResponse() {
        return new ConsultaProductoCodigoExternoResponse();
    }

    /**
     * Create an instance of {@link InsertaPedidosProductoResponse }
     * 
     */
    public InsertaPedidosProductoResponse createInsertaPedidosProductoResponse() {
        return new InsertaPedidosProductoResponse();
    }

    /**
     * Create an instance of {@link ConsultaPedidoSede }
     * 
     */
    public ConsultaPedidoSede createConsultaPedidoSede() {
        return new ConsultaPedidoSede();
    }

    /**
     * Create an instance of {@link GeneraCodigoPedidoResponse }
     * 
     */
    public GeneraCodigoPedidoResponse createGeneraCodigoPedidoResponse() {
        return new GeneraCodigoPedidoResponse();
    }

    /**
     * Create an instance of {@link GetClienteXCedulaResponse }
     * 
     */
    public GetClienteXCedulaResponse createGetClienteXCedulaResponse() {
        return new GetClienteXCedulaResponse();
    }

    /**
     * Create an instance of {@link GetFacturasSedeResponse }
     * 
     */
    public GetFacturasSedeResponse createGetFacturasSedeResponse() {
        return new GetFacturasSedeResponse();
    }

    /**
     * Create an instance of {@link ConsultaPedidosXFiltrosResponse }
     * 
     */
    public ConsultaPedidosXFiltrosResponse createConsultaPedidosXFiltrosResponse() {
        return new ConsultaPedidosXFiltrosResponse();
    }

    /**
     * Create an instance of {@link GetFacturasSede }
     * 
     */
    public GetFacturasSede createGetFacturasSede() {
        return new GetFacturasSede();
    }

    /**
     * Create an instance of {@link GetSedesResponse }
     * 
     */
    public GetSedesResponse createGetSedesResponse() {
        return new GetSedesResponse();
    }

    /**
     * Create an instance of {@link GetUserForUserResponse }
     * 
     */
    public GetUserForUserResponse createGetUserForUserResponse() {
        return new GetUserForUserResponse();
    }

    /**
     * Create an instance of {@link ConsultaPedidoXIdResponse }
     * 
     */
    public ConsultaPedidoXIdResponse createConsultaPedidoXIdResponse() {
        return new ConsultaPedidoXIdResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetUserForUser }
     * 
     */
    public GetUserForUser createGetUserForUser() {
        return new GetUserForUser();
    }

    /**
     * Create an instance of {@link ConsultaProductosXReferencia }
     * 
     */
    public ConsultaProductosXReferencia createConsultaProductosXReferencia() {
        return new ConsultaProductosXReferencia();
    }

    /**
     * Create an instance of {@link ConsultaPedidosXEstadoResponse }
     * 
     */
    public ConsultaPedidosXEstadoResponse createConsultaPedidosXEstadoResponse() {
        return new ConsultaPedidosXEstadoResponse();
    }

    /**
     * Create an instance of {@link ConsultaCantidadesXProductoResponse }
     * 
     */
    public ConsultaCantidadesXProductoResponse createConsultaCantidadesXProductoResponse() {
        return new ConsultaCantidadesXProductoResponse();
    }

    /**
     * Create an instance of {@link ConsultaPermisosUsuarioResponse }
     * 
     */
    public ConsultaPermisosUsuarioResponse createConsultaPermisosUsuarioResponse() {
        return new ConsultaPermisosUsuarioResponse();
    }

    /**
     * Create an instance of {@link ValidaUsuarioFacturadorResponse }
     * 
     */
    public ValidaUsuarioFacturadorResponse createValidaUsuarioFacturadorResponse() {
        return new ValidaUsuarioFacturadorResponse();
    }

    /**
     * Create an instance of {@link CambiaEstadoPedido }
     * 
     */
    public CambiaEstadoPedido createCambiaEstadoPedido() {
        return new CambiaEstadoPedido();
    }

    /**
     * Create an instance of {@link GetSedes }
     * 
     */
    public GetSedes createGetSedes() {
        return new GetSedes();
    }

    /**
     * Create an instance of {@link GetParamsEmpresaResponse }
     * 
     */
    public GetParamsEmpresaResponse createGetParamsEmpresaResponse() {
        return new GetParamsEmpresaResponse();
    }

    /**
     * Create an instance of {@link GetFacturaForId }
     * 
     */
    public GetFacturaForId createGetFacturaForId() {
        return new GetFacturaForId();
    }

    /**
     * Create an instance of {@link FindExistsForSedeResponse }
     * 
     */
    public FindExistsForSedeResponse createFindExistsForSedeResponse() {
        return new FindExistsForSedeResponse();
    }

    /**
     * Create an instance of {@link AddClienteResponse }
     * 
     */
    public AddClienteResponse createAddClienteResponse() {
        return new AddClienteResponse();
    }

    /**
     * Create an instance of {@link FacturarAvanzada }
     * 
     */
    public FacturarAvanzada createFacturarAvanzada() {
        return new FacturarAvanzada();
    }

    /**
     * Create an instance of {@link ConsultaPedidosXFiltros }
     * 
     */
    public ConsultaPedidosXFiltros createConsultaPedidosXFiltros() {
        return new ConsultaPedidosXFiltros();
    }

    /**
     * Create an instance of {@link BuscaProductoXCodBarrasResponse }
     * 
     */
    public BuscaProductoXCodBarrasResponse createBuscaProductoXCodBarrasResponse() {
        return new BuscaProductoXCodBarrasResponse();
    }

    /**
     * Create an instance of {@link InsertaProductosXPedidoResponse }
     * 
     */
    public InsertaProductosXPedidoResponse createInsertaProductosXPedidoResponse() {
        return new InsertaProductosXPedidoResponse();
    }

    /**
     * Create an instance of {@link ConsultaCantidadesXProducto }
     * 
     */
    public ConsultaCantidadesXProducto createConsultaCantidadesXProducto() {
        return new ConsultaCantidadesXProducto();
    }

    /**
     * Create an instance of {@link ConsultaPedidosXEstado }
     * 
     */
    public ConsultaPedidosXEstado createConsultaPedidosXEstado() {
        return new ConsultaPedidosXEstado();
    }

    /**
     * Create an instance of {@link GetProductForCode }
     * 
     */
    public GetProductForCode createGetProductForCode() {
        return new GetProductForCode();
    }

    /**
     * Create an instance of {@link ConsultaPedidoSedeResponse }
     * 
     */
    public ConsultaPedidoSedeResponse createConsultaPedidoSedeResponse() {
        return new ConsultaPedidoSedeResponse();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link GetRecetaForcode }
     * 
     */
    public GetRecetaForcode createGetRecetaForcode() {
        return new GetRecetaForcode();
    }

    /**
     * Create an instance of {@link PedidoEntity }
     * 
     */
    public PedidoEntity createPedidoEntity() {
        return new PedidoEntity();
    }

    /**
     * Create an instance of {@link ProductoGenEntity }
     * 
     */
    public ProductoGenEntity createProductoGenEntity() {
        return new ProductoGenEntity();
    }

    /**
     * Create an instance of {@link UsuarioTable }
     * 
     */
    public UsuarioTable createUsuarioTable() {
        return new UsuarioTable();
    }

    /**
     * Create an instance of {@link DetReceFacturacionTable }
     * 
     */
    public DetReceFacturacionTable createDetReceFacturacionTable() {
        return new DetReceFacturacionTable();
    }

    /**
     * Create an instance of {@link RecetaTable }
     * 
     */
    public RecetaTable createRecetaTable() {
        return new RecetaTable();
    }

    /**
     * Create an instance of {@link MarcaEntity }
     * 
     */
    public MarcaEntity createMarcaEntity() {
        return new MarcaEntity();
    }

    /**
     * Create an instance of {@link PrecioRecetaTable }
     * 
     */
    public PrecioRecetaTable createPrecioRecetaTable() {
        return new PrecioRecetaTable();
    }

    /**
     * Create an instance of {@link ProductosHomeEntity }
     * 
     */
    public ProductosHomeEntity createProductosHomeEntity() {
        return new ProductosHomeEntity();
    }

    /**
     * Create an instance of {@link PrecioProductoTable }
     * 
     */
    public PrecioProductoTable createPrecioProductoTable() {
        return new PrecioProductoTable();
    }

    /**
     * Create an instance of {@link ProductoTable }
     * 
     */
    public ProductoTable createProductoTable() {
        return new ProductoTable();
    }

    /**
     * Create an instance of {@link Sede }
     * 
     */
    public Sede createSede() {
        return new Sede();
    }

    /**
     * Create an instance of {@link SubCuentaEntity }
     * 
     */
    public SubCuentaEntity createSubCuentaEntity() {
        return new SubCuentaEntity();
    }

    /**
     * Create an instance of {@link CantidadesEntity }
     * 
     */
    public CantidadesEntity createCantidadesEntity() {
        return new CantidadesEntity();
    }

    /**
     * Create an instance of {@link PersonaUsuarioTable }
     * 
     */
    public PersonaUsuarioTable createPersonaUsuarioTable() {
        return new PersonaUsuarioTable();
    }

    /**
     * Create an instance of {@link DetProdFacturaTable }
     * 
     */
    public DetProdFacturaTable createDetProdFacturaTable() {
        return new DetProdFacturaTable();
    }

    /**
     * Create an instance of {@link Facturacion }
     * 
     */
    public Facturacion createFacturacion() {
        return new Facturacion();
    }

    /**
     * Create an instance of {@link PrecioProductoEntity }
     * 
     */
    public PrecioProductoEntity createPrecioProductoEntity() {
        return new PrecioProductoEntity();
    }

    /**
     * Create an instance of {@link RespuestaEntity }
     * 
     */
    public RespuestaEntity createRespuestaEntity() {
        return new RespuestaEntity();
    }

    /**
     * Create an instance of {@link RespuestaFacturacion }
     * 
     */
    public RespuestaFacturacion createRespuestaFacturacion() {
        return new RespuestaFacturacion();
    }

    /**
     * Create an instance of {@link TipoUsuarioEntity }
     * 
     */
    public TipoUsuarioEntity createTipoUsuarioEntity() {
        return new TipoUsuarioEntity();
    }

    /**
     * Create an instance of {@link ProductoGenericoEntity }
     * 
     */
    public ProductoGenericoEntity createProductoGenericoEntity() {
        return new ProductoGenericoEntity();
    }

    /**
     * Create an instance of {@link FacturaTable }
     * 
     */
    public FacturaTable createFacturaTable() {
        return new FacturaTable();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link CategoriaEntity }
     * 
     */
    public CategoriaEntity createCategoriaEntity() {
        return new CategoriaEntity();
    }

    /**
     * Create an instance of {@link PedidoProductoEntity }
     * 
     */
    public PedidoProductoEntity createPedidoProductoEntity() {
        return new PedidoProductoEntity();
    }

    /**
     * Create an instance of {@link ParametrosEmpresaTable }
     * 
     */
    public ParametrosEmpresaTable createParametrosEmpresaTable() {
        return new ParametrosEmpresaTable();
    }

    /**
     * Create an instance of {@link TemporalProdTable }
     * 
     */
    public TemporalProdTable createTemporalProdTable() {
        return new TemporalProdTable();
    }

    /**
     * Create an instance of {@link PerfilesEntity }
     * 
     */
    public PerfilesEntity createPerfilesEntity() {
        return new PerfilesEntity();
    }

    /**
     * Create an instance of {@link ProductoEntity }
     * 
     */
    public ProductoEntity createProductoEntity() {
        return new ProductoEntity();
    }

    /**
     * Create an instance of {@link TemporalRecTable }
     * 
     */
    public TemporalRecTable createTemporalRecTable() {
        return new TemporalRecTable();
    }

    /**
     * Create an instance of {@link SedeEntity }
     * 
     */
    public SedeEntity createSedeEntity() {
        return new SedeEntity();
    }

    /**
     * Create an instance of {@link RespuestaPedidoEntity }
     * 
     */
    public RespuestaPedidoEntity createRespuestaPedidoEntity() {
        return new RespuestaPedidoEntity();
    }

    /**
     * Create an instance of {@link PantallaPrincipalFacTable }
     * 
     */
    public PantallaPrincipalFacTable createPantallaPrincipalFacTable() {
        return new PantallaPrincipalFacTable();
    }

    /**
     * Create an instance of {@link ReferenciaEntity }
     * 
     */
    public ReferenciaEntity createReferenciaEntity() {
        return new ReferenciaEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacturas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getFacturas")
    public JAXBElement<GetFacturas> createGetFacturas(GetFacturas value) {
        return new JAXBElement<GetFacturas>(_GetFacturas_QNAME, GetFacturas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneraPdfCotizacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "generaPdfCotizacionResponse")
    public JAXBElement<GeneraPdfCotizacionResponse> createGeneraPdfCotizacionResponse(GeneraPdfCotizacionResponse value) {
        return new JAXBElement<GeneraPdfCotizacionResponse>(_GeneraPdfCotizacionResponse_QNAME, GeneraPdfCotizacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaPedidosProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "insertaPedidosProducto")
    public JAXBElement<InsertaPedidosProducto> createInsertaPedidosProducto(InsertaPedidosProducto value) {
        return new JAXBElement<InsertaPedidosProducto>(_InsertaPedidosProducto_QNAME, InsertaPedidosProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPermisosUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaPermisosUsuario")
    public JAXBElement<ConsultaPermisosUsuario> createConsultaPermisosUsuario(ConsultaPermisosUsuario value) {
        return new JAXBElement<ConsultaPermisosUsuario>(_ConsultaPermisosUsuario_QNAME, ConsultaPermisosUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "updateClienteResponse")
    public JAXBElement<UpdateClienteResponse> createUpdateClienteResponse(UpdateClienteResponse value) {
        return new JAXBElement<UpdateClienteResponse>(_UpdateClienteResponse_QNAME, UpdateClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getClientesResponse")
    public JAXBElement<GetClientesResponse> createGetClientesResponse(GetClientesResponse value) {
        return new JAXBElement<GetClientesResponse>(_GetClientesResponse_QNAME, GetClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiaClaveUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "cambiaClaveUsuario")
    public JAXBElement<CambiaClaveUsuario> createCambiaClaveUsuario(CambiaClaveUsuario value) {
        return new JAXBElement<CambiaClaveUsuario>(_CambiaClaveUsuario_QNAME, CambiaClaveUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCantidadesXSedeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaCantidadesXSedeResponse")
    public JAXBElement<ConsultaCantidadesXSedeResponse> createConsultaCantidadesXSedeResponse(ConsultaCantidadesXSedeResponse value) {
        return new JAXBElement<ConsultaCantidadesXSedeResponse>(_ConsultaCantidadesXSedeResponse_QNAME, ConsultaCantidadesXSedeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductForCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getProductForCodeResponse")
    public JAXBElement<GetProductForCodeResponse> createGetProductForCodeResponse(GetProductForCodeResponse value) {
        return new JAXBElement<GetProductForCodeResponse>(_GetProductForCodeResponse_QNAME, GetProductForCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBoxNow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "searchBoxNow")
    public JAXBElement<SearchBoxNow> createSearchBoxNow(SearchBoxNow value) {
        return new JAXBElement<SearchBoxNow>(_SearchBoxNow_QNAME, SearchBoxNow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCantidadesXSede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaCantidadesXSede")
    public JAXBElement<ConsultaCantidadesXSede> createConsultaCantidadesXSede(ConsultaCantidadesXSede value) {
        return new JAXBElement<ConsultaCantidadesXSede>(_ConsultaCantidadesXSede_QNAME, ConsultaCantidadesXSede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturarAvanzadaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "facturarAvanzadaResponse")
    public JAXBElement<FacturarAvanzadaResponse> createFacturarAvanzadaResponse(FacturarAvanzadaResponse value) {
        return new JAXBElement<FacturarAvanzadaResponse>(_FacturarAvanzadaResponse_QNAME, FacturarAvanzadaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecetas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getRecetas")
    public JAXBElement<GetRecetas> createGetRecetas(GetRecetas value) {
        return new JAXBElement<GetRecetas>(_GetRecetas_QNAME, GetRecetas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiaEstadoPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "cambiaEstadoPedidoResponse")
    public JAXBElement<CambiaEstadoPedidoResponse> createCambiaEstadoPedidoResponse(CambiaEstadoPedidoResponse value) {
        return new JAXBElement<CambiaEstadoPedidoResponse>(_CambiaEstadoPedidoResponse_QNAME, CambiaEstadoPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacturasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getFacturasResponse")
    public JAXBElement<GetFacturasResponse> createGetFacturasResponse(GetFacturasResponse value) {
        return new JAXBElement<GetFacturasResponse>(_GetFacturasResponse_QNAME, GetFacturasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBoxNowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "searchBoxNowResponse")
    public JAXBElement<SearchBoxNowResponse> createSearchBoxNowResponse(SearchBoxNowResponse value) {
        return new JAXBElement<SearchBoxNowResponse>(_SearchBoxNowResponse_QNAME, SearchBoxNowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiaClaveUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "cambiaClaveUsuarioResponse")
    public JAXBElement<CambiaClaveUsuarioResponse> createCambiaClaveUsuarioResponse(CambiaClaveUsuarioResponse value) {
        return new JAXBElement<CambiaClaveUsuarioResponse>(_CambiaClaveUsuarioResponse_QNAME, CambiaClaveUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facturar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "facturar")
    public JAXBElement<Facturar> createFacturar(Facturar value) {
        return new JAXBElement<Facturar>(_Facturar_QNAME, Facturar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDishesPrincipalScreenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getDishesPrincipalScreenResponse")
    public JAXBElement<GetDishesPrincipalScreenResponse> createGetDishesPrincipalScreenResponse(GetDishesPrincipalScreenResponse value) {
        return new JAXBElement<GetDishesPrincipalScreenResponse>(_GetDishesPrincipalScreenResponse_QNAME, GetDishesPrincipalScreenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClienteXCedula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getClienteXCedula")
    public JAXBElement<GetClienteXCedula> createGetClienteXCedula(GetClienteXCedula value) {
        return new JAXBElement<GetClienteXCedula>(_GetClienteXCedula_QNAME, GetClienteXCedula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductPrincipalScreen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getProductPrincipalScreen")
    public JAXBElement<GetProductPrincipalScreen> createGetProductPrincipalScreen(GetProductPrincipalScreen value) {
        return new JAXBElement<GetProductPrincipalScreen>(_GetProductPrincipalScreen_QNAME, GetProductPrincipalScreen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecetaForcodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getRecetaForcodeResponse")
    public JAXBElement<GetRecetaForcodeResponse> createGetRecetaForcodeResponse(GetRecetaForcodeResponse value) {
        return new JAXBElement<GetRecetaForcodeResponse>(_GetRecetaForcodeResponse_QNAME, GetRecetaForcodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaReferenciasHomeCategoriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaReferenciasHomeCategoriaResponse")
    public JAXBElement<ConsultaReferenciasHomeCategoriaResponse> createConsultaReferenciasHomeCategoriaResponse(ConsultaReferenciasHomeCategoriaResponse value) {
        return new JAXBElement<ConsultaReferenciasHomeCategoriaResponse>(_ConsultaReferenciasHomeCategoriaResponse_QNAME, ConsultaReferenciasHomeCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParamsEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getParamsEmpresa")
    public JAXBElement<GetParamsEmpresa> createGetParamsEmpresa(GetParamsEmpresa value) {
        return new JAXBElement<GetParamsEmpresa>(_GetParamsEmpresa_QNAME, GetParamsEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "facturarResponse")
    public JAXBElement<FacturarResponse> createFacturarResponse(FacturarResponse value) {
        return new JAXBElement<FacturarResponse>(_FacturarResponse_QNAME, FacturarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaCotizacionPorClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "buscaCotizacionPorClienteResponse")
    public JAXBElement<BuscaCotizacionPorClienteResponse> createBuscaCotizacionPorClienteResponse(BuscaCotizacionPorClienteResponse value) {
        return new JAXBElement<BuscaCotizacionPorClienteResponse>(_BuscaCotizacionPorClienteResponse_QNAME, BuscaCotizacionPorClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPedidoXId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaPedidoXId")
    public JAXBElement<ConsultaPedidoXId> createConsultaPedidoXId(ConsultaPedidoXId value) {
        return new JAXBElement<ConsultaPedidoXId>(_ConsultaPedidoXId_QNAME, ConsultaPedidoXId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductosAndDishesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "findProductosAndDishesResponse")
    public JAXBElement<FindProductosAndDishesResponse> createFindProductosAndDishesResponse(FindProductosAndDishesResponse value) {
        return new JAXBElement<FindProductosAndDishesResponse>(_FindProductosAndDishesResponse_QNAME, FindProductosAndDishesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneraCodigoPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "generaCodigoPedido")
    public JAXBElement<GeneraCodigoPedido> createGeneraCodigoPedido(GeneraCodigoPedido value) {
        return new JAXBElement<GeneraCodigoPedido>(_GeneraCodigoPedido_QNAME, GeneraCodigoPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBillForIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "findBillForIdResponse")
    public JAXBElement<FindBillForIdResponse> createFindBillForIdResponse(FindBillForIdResponse value) {
        return new JAXBElement<FindBillForIdResponse>(_FindBillForIdResponse_QNAME, FindBillForIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaProductoXCodBarras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "buscaProductoXCodBarras")
    public JAXBElement<BuscaProductoXCodBarras> createBuscaProductoXCodBarras(BuscaProductoXCodBarras value) {
        return new JAXBElement<BuscaProductoXCodBarras>(_BuscaProductoXCodBarras_QNAME, BuscaProductoXCodBarras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "addCliente")
    public JAXBElement<AddCliente> createAddCliente(AddCliente value) {
        return new JAXBElement<AddCliente>(_AddCliente_QNAME, AddCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "eliminaPedido")
    public JAXBElement<EliminaPedido> createEliminaPedido(EliminaPedido value) {
        return new JAXBElement<EliminaPedido>(_EliminaPedido_QNAME, EliminaPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneraPdfCotizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "generaPdfCotizacion")
    public JAXBElement<GeneraPdfCotizacion> createGeneraPdfCotizacion(GeneraPdfCotizacion value) {
        return new JAXBElement<GeneraPdfCotizacion>(_GeneraPdfCotizacion_QNAME, GeneraPdfCotizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacturaForIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getFacturaForIdResponse")
    public JAXBElement<GetFacturaForIdResponse> createGetFacturaForIdResponse(GetFacturaForIdResponse value) {
        return new JAXBElement<GetFacturaForIdResponse>(_GetFacturaForIdResponse_QNAME, GetFacturaForIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductoCodigoExterno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaProductoCodigoExterno")
    public JAXBElement<ConsultaProductoCodigoExterno> createConsultaProductoCodigoExterno(ConsultaProductoCodigoExterno value) {
        return new JAXBElement<ConsultaProductoCodigoExterno>(_ConsultaProductoCodigoExterno_QNAME, ConsultaProductoCodigoExterno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaCotizacionPorCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "buscaCotizacionPorCliente")
    public JAXBElement<BuscaCotizacionPorCliente> createBuscaCotizacionPorCliente(BuscaCotizacionPorCliente value) {
        return new JAXBElement<BuscaCotizacionPorCliente>(_BuscaCotizacionPorCliente_QNAME, BuscaCotizacionPorCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCantidadesXProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaCantidadesXProductoResponse")
    public JAXBElement<ConsultaCantidadesXProductoResponse> createConsultaCantidadesXProductoResponse(ConsultaCantidadesXProductoResponse value) {
        return new JAXBElement<ConsultaCantidadesXProductoResponse>(_ConsultaCantidadesXProductoResponse_QNAME, ConsultaCantidadesXProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPedidosXEstadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaPedidosXEstadoResponse")
    public JAXBElement<ConsultaPedidosXEstadoResponse> createConsultaPedidosXEstadoResponse(ConsultaPedidosXEstadoResponse value) {
        return new JAXBElement<ConsultaPedidosXEstadoResponse>(_ConsultaPedidosXEstadoResponse_QNAME, ConsultaPedidosXEstadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductosXReferencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaProductosXReferencia")
    public JAXBElement<ConsultaProductosXReferencia> createConsultaProductosXReferencia(ConsultaProductosXReferencia value) {
        return new JAXBElement<ConsultaProductosXReferencia>(_ConsultaProductosXReferencia_QNAME, ConsultaProductosXReferencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindExistsForSedeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "findExistsForSedeResponse")
    public JAXBElement<FindExistsForSedeResponse> createFindExistsForSedeResponse(FindExistsForSedeResponse value) {
        return new JAXBElement<FindExistsForSedeResponse>(_FindExistsForSedeResponse_QNAME, FindExistsForSedeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacturaForId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getFacturaForId")
    public JAXBElement<GetFacturaForId> createGetFacturaForId(GetFacturaForId value) {
        return new JAXBElement<GetFacturaForId>(_GetFacturaForId_QNAME, GetFacturaForId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParamsEmpresaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getParamsEmpresaResponse")
    public JAXBElement<GetParamsEmpresaResponse> createGetParamsEmpresaResponse(GetParamsEmpresaResponse value) {
        return new JAXBElement<GetParamsEmpresaResponse>(_GetParamsEmpresaResponse_QNAME, GetParamsEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiaEstadoPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "cambiaEstadoPedido")
    public JAXBElement<CambiaEstadoPedido> createCambiaEstadoPedido(CambiaEstadoPedido value) {
        return new JAXBElement<CambiaEstadoPedido>(_CambiaEstadoPedido_QNAME, CambiaEstadoPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSedes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getSedes")
    public JAXBElement<GetSedes> createGetSedes(GetSedes value) {
        return new JAXBElement<GetSedes>(_GetSedes_QNAME, GetSedes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPermisosUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaPermisosUsuarioResponse")
    public JAXBElement<ConsultaPermisosUsuarioResponse> createConsultaPermisosUsuarioResponse(ConsultaPermisosUsuarioResponse value) {
        return new JAXBElement<ConsultaPermisosUsuarioResponse>(_ConsultaPermisosUsuarioResponse_QNAME, ConsultaPermisosUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaUsuarioFacturadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "validaUsuarioFacturadorResponse")
    public JAXBElement<ValidaUsuarioFacturadorResponse> createValidaUsuarioFacturadorResponse(ValidaUsuarioFacturadorResponse value) {
        return new JAXBElement<ValidaUsuarioFacturadorResponse>(_ValidaUsuarioFacturadorResponse_QNAME, ValidaUsuarioFacturadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCantidadesXProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaCantidadesXProducto")
    public JAXBElement<ConsultaCantidadesXProducto> createConsultaCantidadesXProducto(ConsultaCantidadesXProducto value) {
        return new JAXBElement<ConsultaCantidadesXProducto>(_ConsultaCantidadesXProducto_QNAME, ConsultaCantidadesXProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPedidosXEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaPedidosXEstado")
    public JAXBElement<ConsultaPedidosXEstado> createConsultaPedidosXEstado(ConsultaPedidosXEstado value) {
        return new JAXBElement<ConsultaPedidosXEstado>(_ConsultaPedidosXEstado_QNAME, ConsultaPedidosXEstado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductForCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getProductForCode")
    public JAXBElement<GetProductForCode> createGetProductForCode(GetProductForCode value) {
        return new JAXBElement<GetProductForCode>(_GetProductForCode_QNAME, GetProductForCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaProductoXCodBarrasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "buscaProductoXCodBarrasResponse")
    public JAXBElement<BuscaProductoXCodBarrasResponse> createBuscaProductoXCodBarrasResponse(BuscaProductoXCodBarrasResponse value) {
        return new JAXBElement<BuscaProductoXCodBarrasResponse>(_BuscaProductoXCodBarrasResponse_QNAME, BuscaProductoXCodBarrasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaProductosXPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "insertaProductosXPedidoResponse")
    public JAXBElement<InsertaProductosXPedidoResponse> createInsertaProductosXPedidoResponse(InsertaProductosXPedidoResponse value) {
        return new JAXBElement<InsertaProductosXPedidoResponse>(_InsertaProductosXPedidoResponse_QNAME, InsertaProductosXPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPedidosXFiltros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaPedidosXFiltros")
    public JAXBElement<ConsultaPedidosXFiltros> createConsultaPedidosXFiltros(ConsultaPedidosXFiltros value) {
        return new JAXBElement<ConsultaPedidosXFiltros>(_ConsultaPedidosXFiltros_QNAME, ConsultaPedidosXFiltros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturarAvanzada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "facturarAvanzada")
    public JAXBElement<FacturarAvanzada> createFacturarAvanzada(FacturarAvanzada value) {
        return new JAXBElement<FacturarAvanzada>(_FacturarAvanzada_QNAME, FacturarAvanzada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "addClienteResponse")
    public JAXBElement<AddClienteResponse> createAddClienteResponse(AddClienteResponse value) {
        return new JAXBElement<AddClienteResponse>(_AddClienteResponse_QNAME, AddClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecetaForcode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getRecetaForcode")
    public JAXBElement<GetRecetaForcode> createGetRecetaForcode(GetRecetaForcode value) {
        return new JAXBElement<GetRecetaForcode>(_GetRecetaForcode_QNAME, GetRecetaForcode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPedidoSedeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaPedidoSedeResponse")
    public JAXBElement<ConsultaPedidoSedeResponse> createConsultaPedidoSedeResponse(ConsultaPedidoSedeResponse value) {
        return new JAXBElement<ConsultaPedidoSedeResponse>(_ConsultaPedidoSedeResponse_QNAME, ConsultaPedidoSedeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBillForId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "findBillForId")
    public JAXBElement<FindBillForId> createFindBillForId(FindBillForId value) {
        return new JAXBElement<FindBillForId>(_FindBillForId_QNAME, FindBillForId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindExistsForSede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "findExistsForSede")
    public JAXBElement<FindExistsForSede> createFindExistsForSede(FindExistsForSede value) {
        return new JAXBElement<FindExistsForSede>(_FindExistsForSede_QNAME, FindExistsForSede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecetasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getRecetasResponse")
    public JAXBElement<GetRecetasResponse> createGetRecetasResponse(GetRecetasResponse value) {
        return new JAXBElement<GetRecetasResponse>(_GetRecetasResponse_QNAME, GetRecetasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductPrincipalScreenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getProductPrincipalScreenResponse")
    public JAXBElement<GetProductPrincipalScreenResponse> createGetProductPrincipalScreenResponse(GetProductPrincipalScreenResponse value) {
        return new JAXBElement<GetProductPrincipalScreenResponse>(_GetProductPrincipalScreenResponse_QNAME, GetProductPrincipalScreenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaReferenciasHomeCategoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaReferenciasHomeCategoria")
    public JAXBElement<ConsultaReferenciasHomeCategoria> createConsultaReferenciasHomeCategoria(ConsultaReferenciasHomeCategoria value) {
        return new JAXBElement<ConsultaReferenciasHomeCategoria>(_ConsultaReferenciasHomeCategoria_QNAME, ConsultaReferenciasHomeCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "eliminaPedidoResponse")
    public JAXBElement<EliminaPedidoResponse> createEliminaPedidoResponse(EliminaPedidoResponse value) {
        return new JAXBElement<EliminaPedidoResponse>(_EliminaPedidoResponse_QNAME, EliminaPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductosXReferenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaProductosXReferenciaResponse")
    public JAXBElement<ConsultaProductosXReferenciaResponse> createConsultaProductosXReferenciaResponse(ConsultaProductosXReferenciaResponse value) {
        return new JAXBElement<ConsultaProductosXReferenciaResponse>(_ConsultaProductosXReferenciaResponse_QNAME, ConsultaProductosXReferenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaProductosXPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "insertaProductosXPedido")
    public JAXBElement<InsertaProductosXPedido> createInsertaProductosXPedido(InsertaProductosXPedido value) {
        return new JAXBElement<InsertaProductosXPedido>(_InsertaProductosXPedido_QNAME, InsertaProductosXPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClienteXCedulaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getClienteXCedulaResponse")
    public JAXBElement<GetClienteXCedulaResponse> createGetClienteXCedulaResponse(GetClienteXCedulaResponse value) {
        return new JAXBElement<GetClienteXCedulaResponse>(_GetClienteXCedulaResponse_QNAME, GetClienteXCedulaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacturasSedeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getFacturasSedeResponse")
    public JAXBElement<GetFacturasSedeResponse> createGetFacturasSedeResponse(GetFacturasSedeResponse value) {
        return new JAXBElement<GetFacturasSedeResponse>(_GetFacturasSedeResponse_QNAME, GetFacturasSedeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneraCodigoPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "generaCodigoPedidoResponse")
    public JAXBElement<GeneraCodigoPedidoResponse> createGeneraCodigoPedidoResponse(GeneraCodigoPedidoResponse value) {
        return new JAXBElement<GeneraCodigoPedidoResponse>(_GeneraCodigoPedidoResponse_QNAME, GeneraCodigoPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPedidoSede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaPedidoSede")
    public JAXBElement<ConsultaPedidoSede> createConsultaPedidoSede(ConsultaPedidoSede value) {
        return new JAXBElement<ConsultaPedidoSede>(_ConsultaPedidoSede_QNAME, ConsultaPedidoSede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductoCodigoExternoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaProductoCodigoExternoResponse")
    public JAXBElement<ConsultaProductoCodigoExternoResponse> createConsultaProductoCodigoExternoResponse(ConsultaProductoCodigoExternoResponse value) {
        return new JAXBElement<ConsultaProductoCodigoExternoResponse>(_ConsultaProductoCodigoExternoResponse_QNAME, ConsultaProductoCodigoExternoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaPedidosProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "insertaPedidosProductoResponse")
    public JAXBElement<InsertaPedidosProductoResponse> createInsertaPedidosProductoResponse(InsertaPedidosProductoResponse value) {
        return new JAXBElement<InsertaPedidosProductoResponse>(_InsertaPedidosProductoResponse_QNAME, InsertaPedidosProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductosAndDishes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "findProductosAndDishes")
    public JAXBElement<FindProductosAndDishes> createFindProductosAndDishes(FindProductosAndDishes value) {
        return new JAXBElement<FindProductosAndDishes>(_FindProductosAndDishes_QNAME, FindProductosAndDishes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getClientes")
    public JAXBElement<GetClientes> createGetClientes(GetClientes value) {
        return new JAXBElement<GetClientes>(_GetClientes_QNAME, GetClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDishesPrincipalScreen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getDishesPrincipalScreen")
    public JAXBElement<GetDishesPrincipalScreen> createGetDishesPrincipalScreen(GetDishesPrincipalScreen value) {
        return new JAXBElement<GetDishesPrincipalScreen>(_GetDishesPrincipalScreen_QNAME, GetDishesPrincipalScreen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "updateCliente")
    public JAXBElement<UpdateCliente> createUpdateCliente(UpdateCliente value) {
        return new JAXBElement<UpdateCliente>(_UpdateCliente_QNAME, UpdateCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaUsuarioFacturador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "validaUsuarioFacturador")
    public JAXBElement<ValidaUsuarioFacturador> createValidaUsuarioFacturador(ValidaUsuarioFacturador value) {
        return new JAXBElement<ValidaUsuarioFacturador>(_ValidaUsuarioFacturador_QNAME, ValidaUsuarioFacturador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getUserForUser")
    public JAXBElement<GetUserForUser> createGetUserForUser(GetUserForUser value) {
        return new JAXBElement<GetUserForUser>(_GetUserForUser_QNAME, GetUserForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPedidoXIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaPedidoXIdResponse")
    public JAXBElement<ConsultaPedidoXIdResponse> createConsultaPedidoXIdResponse(ConsultaPedidoXIdResponse value) {
        return new JAXBElement<ConsultaPedidoXIdResponse>(_ConsultaPedidoXIdResponse_QNAME, ConsultaPedidoXIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSedesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getSedesResponse")
    public JAXBElement<GetSedesResponse> createGetSedesResponse(GetSedesResponse value) {
        return new JAXBElement<GetSedesResponse>(_GetSedesResponse_QNAME, GetSedesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserForUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getUserForUserResponse")
    public JAXBElement<GetUserForUserResponse> createGetUserForUserResponse(GetUserForUserResponse value) {
        return new JAXBElement<GetUserForUserResponse>(_GetUserForUserResponse_QNAME, GetUserForUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacturasSede }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "getFacturasSede")
    public JAXBElement<GetFacturasSede> createGetFacturasSede(GetFacturasSede value) {
        return new JAXBElement<GetFacturasSede>(_GetFacturasSede_QNAME, GetFacturasSede.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPedidosXFiltrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.codesoftware.com.co/", name = "consultaPedidosXFiltrosResponse")
    public JAXBElement<ConsultaPedidosXFiltrosResponse> createConsultaPedidosXFiltrosResponse(ConsultaPedidosXFiltrosResponse value) {
        return new JAXBElement<ConsultaPedidosXFiltrosResponse>(_ConsultaPedidosXFiltrosResponse_QNAME, ConsultaPedidosXFiltrosResponse.class, null, value);
    }

}
