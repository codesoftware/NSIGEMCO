
package co.com.codesoftware.server.nsigemco;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambioPrecioProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambioPrecioProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tius_tius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sede_sede" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dska_dska" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="precioUni" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="precioDec" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="precioMil" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="precioEstatic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambioPrecioProducto", propOrder = {
    "tiusTius",
    "sedeSede",
    "dskaDska",
    "precio",
    "precioUni",
    "precioDec",
    "precioMil",
    "precioEstatic"
})
public class CambioPrecioProducto {

    @XmlElement(name = "tius_tius")
    protected Integer tiusTius;
    @XmlElement(name = "sede_sede")
    protected Integer sedeSede;
    @XmlElement(name = "dska_dska")
    protected Integer dskaDska;
    protected BigDecimal precio;
    protected BigDecimal precioUni;
    protected BigDecimal precioDec;
    protected BigDecimal precioMil;
    protected String precioEstatic;

    /**
     * Obtiene el valor de la propiedad tiusTius.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTiusTius() {
        return tiusTius;
    }

    /**
     * Define el valor de la propiedad tiusTius.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTiusTius(Integer value) {
        this.tiusTius = value;
    }

    /**
     * Obtiene el valor de la propiedad sedeSede.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSedeSede() {
        return sedeSede;
    }

    /**
     * Define el valor de la propiedad sedeSede.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSedeSede(Integer value) {
        this.sedeSede = value;
    }

    /**
     * Obtiene el valor de la propiedad dskaDska.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDskaDska() {
        return dskaDska;
    }

    /**
     * Define el valor de la propiedad dskaDska.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDskaDska(Integer value) {
        this.dskaDska = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecio(BigDecimal value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUni.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecioUni() {
        return precioUni;
    }

    /**
     * Define el valor de la propiedad precioUni.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecioUni(BigDecimal value) {
        this.precioUni = value;
    }

    /**
     * Obtiene el valor de la propiedad precioDec.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecioDec() {
        return precioDec;
    }

    /**
     * Define el valor de la propiedad precioDec.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecioDec(BigDecimal value) {
        this.precioDec = value;
    }

    /**
     * Obtiene el valor de la propiedad precioMil.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecioMil() {
        return precioMil;
    }

    /**
     * Define el valor de la propiedad precioMil.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecioMil(BigDecimal value) {
        this.precioMil = value;
    }

    /**
     * Obtiene el valor de la propiedad precioEstatic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioEstatic() {
        return precioEstatic;
    }

    /**
     * Define el valor de la propiedad precioEstatic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioEstatic(String value) {
        this.precioEstatic = value;
    }

}
