
package co.com.codesoftware.servicio.facturacion;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para facturaCompraTmpEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="facturaCompraTmpEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://facturacion.servicio.codesoftware.com.co/}respuestaEntity">
 *       &lt;sequence>
 *         &lt;element name="ajusteFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cobraRete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaFacCompra" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaRecepcion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plazo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="porcRetencion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="proveedor" type="{http://facturacion.servicio.codesoftware.com.co/}proveedoresEntity" minOccurs="0"/>
 *         &lt;element name="rutaImagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sede" type="{http://facturacion.servicio.codesoftware.com.co/}sedeEntity" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valorAjuste" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorFacura" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorIva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorProductos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorRetencion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorTotalPagar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facturaCompraTmpEntity", propOrder = {
    "ajusteFactura",
    "cobraRete",
    "estado",
    "fechaCreacion",
    "fechaFacCompra",
    "fechaRecepcion",
    "id",
    "numeroFactura",
    "plazo",
    "porcRetencion",
    "proveedor",
    "rutaImagen",
    "sede",
    "usuario",
    "valorAjuste",
    "valorFacura",
    "valorIva",
    "valorProductos",
    "valorRetencion",
    "valorTotalPagar"
})
public class FacturaCompraTmpEntity
    extends RespuestaEntity
{

    protected String ajusteFactura;
    protected String cobraRete;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFacCompra;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRecepcion;
    protected Integer id;
    protected String numeroFactura;
    protected Integer plazo;
    protected BigDecimal porcRetencion;
    protected ProveedoresEntity proveedor;
    protected String rutaImagen;
    protected SedeEntity sede;
    protected Integer usuario;
    protected BigDecimal valorAjuste;
    protected BigDecimal valorFacura;
    protected BigDecimal valorIva;
    protected BigDecimal valorProductos;
    protected BigDecimal valorRetencion;
    protected BigDecimal valorTotalPagar;

    /**
     * Obtiene el valor de la propiedad ajusteFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAjusteFactura() {
        return ajusteFactura;
    }

    /**
     * Define el valor de la propiedad ajusteFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAjusteFactura(String value) {
        this.ajusteFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad cobraRete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobraRete() {
        return cobraRete;
    }

    /**
     * Define el valor de la propiedad cobraRete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobraRete(String value) {
        this.cobraRete = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFacCompra.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFacCompra() {
        return fechaFacCompra;
    }

    /**
     * Define el valor de la propiedad fechaFacCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFacCompra(XMLGregorianCalendar value) {
        this.fechaFacCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Define el valor de la propiedad fechaRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRecepcion(XMLGregorianCalendar value) {
        this.fechaRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Define el valor de la propiedad numeroFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFactura(String value) {
        this.numeroFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad plazo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlazo() {
        return plazo;
    }

    /**
     * Define el valor de la propiedad plazo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlazo(Integer value) {
        this.plazo = value;
    }

    /**
     * Obtiene el valor de la propiedad porcRetencion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcRetencion() {
        return porcRetencion;
    }

    /**
     * Define el valor de la propiedad porcRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcRetencion(BigDecimal value) {
        this.porcRetencion = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link ProveedoresEntity }
     *     
     */
    public ProveedoresEntity getProveedor() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link ProveedoresEntity }
     *     
     */
    public void setProveedor(ProveedoresEntity value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad rutaImagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * Define el valor de la propiedad rutaImagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaImagen(String value) {
        this.rutaImagen = value;
    }

    /**
     * Obtiene el valor de la propiedad sede.
     * 
     * @return
     *     possible object is
     *     {@link SedeEntity }
     *     
     */
    public SedeEntity getSede() {
        return sede;
    }

    /**
     * Define el valor de la propiedad sede.
     * 
     * @param value
     *     allowed object is
     *     {@link SedeEntity }
     *     
     */
    public void setSede(SedeEntity value) {
        this.sede = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuario(Integer value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad valorAjuste.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAjuste() {
        return valorAjuste;
    }

    /**
     * Define el valor de la propiedad valorAjuste.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAjuste(BigDecimal value) {
        this.valorAjuste = value;
    }

    /**
     * Obtiene el valor de la propiedad valorFacura.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorFacura() {
        return valorFacura;
    }

    /**
     * Define el valor de la propiedad valorFacura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorFacura(BigDecimal value) {
        this.valorFacura = value;
    }

    /**
     * Obtiene el valor de la propiedad valorIva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIva() {
        return valorIva;
    }

    /**
     * Define el valor de la propiedad valorIva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIva(BigDecimal value) {
        this.valorIva = value;
    }

    /**
     * Obtiene el valor de la propiedad valorProductos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProductos() {
        return valorProductos;
    }

    /**
     * Define el valor de la propiedad valorProductos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProductos(BigDecimal value) {
        this.valorProductos = value;
    }

    /**
     * Obtiene el valor de la propiedad valorRetencion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRetencion() {
        return valorRetencion;
    }

    /**
     * Define el valor de la propiedad valorRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRetencion(BigDecimal value) {
        this.valorRetencion = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTotalPagar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalPagar() {
        return valorTotalPagar;
    }

    /**
     * Define el valor de la propiedad valorTotalPagar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalPagar(BigDecimal value) {
        this.valorTotalPagar = value;
    }

}
