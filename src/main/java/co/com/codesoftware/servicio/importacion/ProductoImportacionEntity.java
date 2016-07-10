
package co.com.codesoftware.servicio.importacion;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productoImportacionEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productoImportacionEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consecutivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idImpo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://importacion.servicio.codesoftware.com.co/}productoSimpleEntity" minOccurs="0"/>
 *         &lt;element name="vlrDolar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrPesTRM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrPesTzProm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productoImportacionEntity", propOrder = {
    "cantidad",
    "consecutivo",
    "id",
    "idImpo",
    "producto",
    "vlrDolar",
    "vlrPesTRM",
    "vlrPesTzProm"
})
public class ProductoImportacionEntity {

    protected Integer cantidad;
    protected Integer consecutivo;
    protected Integer id;
    protected Integer idImpo;
    protected ProductoSimpleEntity producto;
    protected BigDecimal vlrDolar;
    protected BigDecimal vlrPesTRM;
    protected BigDecimal vlrPesTzProm;

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
     * Obtiene el valor de la propiedad consecutivo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsecutivo() {
        return consecutivo;
    }

    /**
     * Define el valor de la propiedad consecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsecutivo(Integer value) {
        this.consecutivo = value;
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
     * Obtiene el valor de la propiedad idImpo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdImpo() {
        return idImpo;
    }

    /**
     * Define el valor de la propiedad idImpo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdImpo(Integer value) {
        this.idImpo = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link ProductoSimpleEntity }
     *     
     */
    public ProductoSimpleEntity getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoSimpleEntity }
     *     
     */
    public void setProducto(ProductoSimpleEntity value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrDolar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrDolar() {
        return vlrDolar;
    }

    /**
     * Define el valor de la propiedad vlrDolar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrDolar(BigDecimal value) {
        this.vlrDolar = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrPesTRM.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrPesTRM() {
        return vlrPesTRM;
    }

    /**
     * Define el valor de la propiedad vlrPesTRM.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrPesTRM(BigDecimal value) {
        this.vlrPesTRM = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrPesTzProm.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrPesTzProm() {
        return vlrPesTzProm;
    }

    /**
     * Define el valor de la propiedad vlrPesTzProm.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrPesTzProm(BigDecimal value) {
        this.vlrPesTzProm = value;
    }

}
