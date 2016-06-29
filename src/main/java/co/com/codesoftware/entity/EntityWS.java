package co.com.codesoftware.entity;

import co.com.codesoftware.server.SAFWS;
import co.com.codesoftware.server.nsigemco.AdministrationEndPoint;
import co.com.codesoftware.server.productos.ProductosEndPoint;
import co.com.codesoftware.servicio.contabilidad.ContabilidadWS;
import co.com.codesoftware.servicio.conteos.ConteoWS;
import co.com.codesoftware.servicio.facturacion.FacturacionWS;
import co.com.codesoftware.servicio.general.GeneralWS;
import co.com.codesoftware.servicio.importacion.ImportacionWS;
import co.com.codesoftware.servicio.producto.ProductoWS;
import co.com.codesoftware.servicio.usuario.UsuarioWS;

public class EntityWS {
	private String validaConexionAdm;
	private AdministrationEndPoint portAdm;

	private String validaConexionProd;
	private ProductosEndPoint portProd;

	private String validaConexionCont;
	private ConteoWS portConteo;

	private String validaConexionSafPrinc;
	private SAFWS portSafPrinc;

	private String validaConexionFacturacion;
	private FacturacionWS portFact;

	private String validaConexionGeneral;
	private GeneralWS portGeneral;

	private String validaConexionUsuarios;
	private UsuarioWS portUsuarios;

	private String validaProductoNuevo;
	private ProductoWS portNewProductos;

	private String validaImportacion;
	private ImportacionWS portImportacion;

	private String validaContabilidad;
	private ContabilidadWS portContabilidad;

	public String getValidaConexionAdm() {
		return validaConexionAdm;
	}

	public void setValidaConexionAdm(String validaConexionAdm) {
		this.validaConexionAdm = validaConexionAdm;
	}

	public AdministrationEndPoint getPortAdm() {
		return portAdm;
	}

	public void setPortAdm(AdministrationEndPoint portAdm) {
		this.portAdm = portAdm;
	}

	public String getValidaConexionProd() {
		return validaConexionProd;
	}

	public void setValidaConexionProd(String validaConexionProd) {
		this.validaConexionProd = validaConexionProd;
	}

	public ProductosEndPoint getPortProd() {
		return portProd;
	}

	public void setPortProd(ProductosEndPoint portProd) {
		this.portProd = portProd;
	}

	public String getValidaConexionCont() {
		return validaConexionCont;
	}

	public void setValidaConexionCont(String validaConexionCont) {
		this.validaConexionCont = validaConexionCont;
	}

	public String getValidaConexionSafPrinc() {
		return validaConexionSafPrinc;
	}

	public void setValidaConexionSafPrinc(String validaConexionSafPrinc) {
		this.validaConexionSafPrinc = validaConexionSafPrinc;
	}

	public SAFWS getPortSafPrinc() {
		return portSafPrinc;
	}

	public void setPortSafPrinc(SAFWS portSafPrinc) {
		this.portSafPrinc = portSafPrinc;
	}

	public String getValidaConexionFacturacion() {
		return validaConexionFacturacion;
	}

	public void setValidaConexionFacturacion(String validaConexionFacturacion) {
		this.validaConexionFacturacion = validaConexionFacturacion;
	}

	public FacturacionWS getPortFact() {
		return portFact;
	}

	public void setPortFact(FacturacionWS portFact) {
		this.portFact = portFact;
	}

	public GeneralWS getPortGeneral() {
		return portGeneral;
	}

	public void setPortGeneral(GeneralWS portGeneral) {
		this.portGeneral = portGeneral;
	}

	public String getValidaConexionGeneral() {
		return validaConexionGeneral;
	}

	public void setValidaConexionGeneral(String validaConexionGeneral) {
		this.validaConexionGeneral = validaConexionGeneral;
	}

	public String getValidaConexionUsuarios() {
		return validaConexionUsuarios;
	}

	public void setValidaConexionUsuarios(String validaConexionUsuarios) {
		this.validaConexionUsuarios = validaConexionUsuarios;
	}

	public UsuarioWS getPortUsuarios() {
		return portUsuarios;
	}

	public void setPortUsuarios(UsuarioWS portUsuarios) {
		this.portUsuarios = portUsuarios;
	}

	public String getValidaProductoNuevo() {
		return validaProductoNuevo;
	}

	public void setValidaProductoNuevo(String validaProductoNuevo) {
		this.validaProductoNuevo = validaProductoNuevo;
	}

	public ProductoWS getPortNewProductos() {
		return portNewProductos;
	}

	public void setPortNewProductos(ProductoWS portNewProductos) {
		this.portNewProductos = portNewProductos;
	}

	public ConteoWS getPortConteo() {
		return portConteo;
	}

	public void setPortConteo(ConteoWS portConteo) {
		this.portConteo = portConteo;
	}

	public String getValidaImportacion() {
		return validaImportacion;
	}

	public void setValidaImportacion(String validaImportacion) {
		this.validaImportacion = validaImportacion;
	}

	public ImportacionWS getPortImportacion() {
		return portImportacion;
	}

	public void setPortImportacion(ImportacionWS portImportacion) {
		this.portImportacion = portImportacion;
	}

	public String getValidaContabilidad() {
		return validaContabilidad;
	}

	public void setValidaContabilidad(String validaContabilidad) {
		this.validaContabilidad = validaContabilidad;
	}

	public ContabilidadWS getPortContabilidad() {
		return portContabilidad;
	}

	public void setPortContabilidad(ContabilidadWS portContabilidad) {
		this.portContabilidad = portContabilidad;
	}

}
