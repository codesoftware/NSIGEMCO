
package co.com.codesoftware.server;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para detReceFacturacionTable complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detReceFacturacionTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="conDescuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idFact" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idRece" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="receta" type="{http://server.codesoftware.com.co/}recetaTable" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="utilidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrDescuento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrIvaTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrIvaUni" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrRecetasTot" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrRecetasUni" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrVentaTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrVentaUni" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detReceFacturacionTable", propOrder = {
    "cantidad",
    "conDescuento",
    "descuento",
    "estado",
    "fecha",
    "id",
    "idFact",
    "idRece",
    "receta",
    "total",
    "utilidad",
    "vlrDescuento",
    "vlrIvaTotal",
    "vlrIvaUni",
    "vlrRecetasTot",
    "vlrRecetasUni",
    "vlrVentaTotal",
    "vlrVentaUni"
})
public class DetReceFacturacionTable {

    protected Integer cantidad;
    protected String conDescuento;
    protected String descuento;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Integer id;
    protected Integer idFact;
    protected Integer idRece;
    protected RecetaTable receta;
    protected BigDecimal total;
    protected BigDecimal utilidad;
    protected BigDecimal vlrDescuento;
    protected BigDecimal vlrIvaTotal;
    protected BigDecimal vlrIvaUni;
    protected BigDecimal vlrRecetasTot;
    protected BigDecimal vlrRecetasUni;
    protected BigDecimal vlrVentaTotal;
    protected BigDecimal vlrVentaUni;

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
     * Obtiene el valor de la propiedad conDescuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConDescuento() {
        return conDescuento;
    }

    /**
     * Define el valor de la propiedad conDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConDescuento(String value) {
        this.conDescuento = value;
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
     * Obtiene el valor de la propiedad idFact.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFact() {
        return idFact;
    }

    /**
     * Define el valor de la propiedad idFact.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFact(Integer value) {
        this.idFact = value;
    }

    /**
     * Obtiene el valor de la propiedad idRece.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdRece() {
        return idRece;
    }

    /**
     * Define el valor de la propiedad idRece.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdRece(Integer value) {
        this.idRece = value;
    }

    /**
     * Obtiene el valor de la propiedad receta.
     * 
     * @return
     *     possible object is
     *     {@link RecetaTable }
     *     
     */
    public RecetaTable getReceta() {
        return receta;
    }

    /**
     * Define el valor de la propiedad receta.
     * 
     * @param value
     *     allowed object is
     *     {@link RecetaTable }
     *     
     */
    public void setReceta(RecetaTable value) {
        this.receta = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
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
     * Obtiene el valor de la propiedad vlrDescuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrDescuento() {
        return vlrDescuento;
    }

    /**
     * Define el valor de la propiedad vlrDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrDescuento(BigDecimal value) {
        this.vlrDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrIvaTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrIvaTotal() {
        return vlrIvaTotal;
    }

    /**
     * Define el valor de la propiedad vlrIvaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrIvaTotal(BigDecimal value) {
        this.vlrIvaTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrIvaUni.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrIvaUni() {
        return vlrIvaUni;
    }

    /**
     * Define el valor de la propiedad vlrIvaUni.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrIvaUni(BigDecimal value) {
        this.vlrIvaUni = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrRecetasTot.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrRecetasTot() {
        return vlrRecetasTot;
    }

    /**
     * Define el valor de la propiedad vlrRecetasTot.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrRecetasTot(BigDecimal value) {
        this.vlrRecetasTot = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrRecetasUni.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrRecetasUni() {
        return vlrRecetasUni;
    }

    /**
     * Define el valor de la propiedad vlrRecetasUni.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrRecetasUni(BigDecimal value) {
        this.vlrRecetasUni = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrVentaTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrVentaTotal() {
        return vlrVentaTotal;
    }

    /**
     * Define el valor de la propiedad vlrVentaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrVentaTotal(BigDecimal value) {
        this.vlrVentaTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrVentaUni.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrVentaUni() {
        return vlrVentaUni;
    }

    /**
     * Define el valor de la propiedad vlrVentaUni.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrVentaUni(BigDecimal value) {
        this.vlrVentaUni = value;
    }

}
