
package co.com.codesoftware.servicio.facturacion;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para detProduFacturaEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detProduFacturaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aplicaDescuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idFactura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idKardex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idKardexDevolucion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numProd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://facturacion.servicio.codesoftware.com.co/}productoEntity" minOccurs="0"/>
 *         &lt;element name="utilidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorIvaTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorIvaUnidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorUnidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorVentaTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorVentaUnidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detProduFacturaEntity", propOrder = {
    "aplicaDescuento",
    "cantidad",
    "descuento",
    "estado",
    "fecha",
    "id",
    "idFactura",
    "idKardex",
    "idKardexDevolucion",
    "numProd",
    "producto",
    "utilidad",
    "valorIvaTotal",
    "valorIvaUnidad",
    "valorTotal",
    "valorUnidad",
    "valorVentaTotal",
    "valorVentaUnidad"
})
public class DetProduFacturaEntity {

    protected String aplicaDescuento;
    protected Integer cantidad;
    protected String descuento;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Integer id;
    protected Integer idFactura;
    protected Integer idKardex;
    protected Integer idKardexDevolucion;
    protected Integer numProd;
    protected ProductoEntity producto;
    protected BigDecimal utilidad;
    protected BigDecimal valorIvaTotal;
    protected BigDecimal valorIvaUnidad;
    protected BigDecimal valorTotal;
    protected BigDecimal valorUnidad;
    protected BigDecimal valorVentaTotal;
    protected BigDecimal valorVentaUnidad;

    /**
     * Obtiene el valor de la propiedad aplicaDescuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplicaDescuento() {
        return aplicaDescuento;
    }

    /**
     * Define el valor de la propiedad aplicaDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAplicaDescuento(String value) {
        this.aplicaDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidad(Integer value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescuento(String value) {
        this.descuento = value;
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
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
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
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFactura(Integer value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad idKardex.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdKardex() {
        return idKardex;
    }

    /**
     * Define el valor de la propiedad idKardex.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdKardex(Integer value) {
        this.idKardex = value;
    }

    /**
     * Obtiene el valor de la propiedad idKardexDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdKardexDevolucion() {
        return idKardexDevolucion;
    }

    /**
     * Define el valor de la propiedad idKardexDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdKardexDevolucion(Integer value) {
        this.idKardexDevolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad numProd.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumProd() {
        return numProd;
    }

    /**
     * Define el valor de la propiedad numProd.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumProd(Integer value) {
        this.numProd = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link ProductoEntity }
     *     
     */
    public ProductoEntity getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoEntity }
     *     
     */
    public void setProducto(ProductoEntity value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad utilidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUtilidad() {
        return utilidad;
    }

    /**
     * Define el valor de la propiedad utilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUtilidad(BigDecimal value) {
        this.utilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad valorIvaTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIvaTotal() {
        return valorIvaTotal;
    }

    /**
     * Define el valor de la propiedad valorIvaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIvaTotal(BigDecimal value) {
        this.valorIvaTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad valorIvaUnidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIvaUnidad() {
        return valorIvaUnidad;
    }

    /**
     * Define el valor de la propiedad valorIvaUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIvaUnidad(BigDecimal value) {
        this.valorIvaUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * Define el valor de la propiedad valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotal(BigDecimal value) {
        this.valorTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUnidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorUnidad() {
        return valorUnidad;
    }

    /**
     * Define el valor de la propiedad valorUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorUnidad(BigDecimal value) {
        this.valorUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad valorVentaTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorVentaTotal() {
        return valorVentaTotal;
    }

    /**
     * Define el valor de la propiedad valorVentaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorVentaTotal(BigDecimal value) {
        this.valorVentaTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad valorVentaUnidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorVentaUnidad() {
        return valorVentaUnidad;
    }

    /**
     * Define el valor de la propiedad valorVentaUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorVentaUnidad(BigDecimal value) {
        this.valorVentaUnidad = value;
    }

}
