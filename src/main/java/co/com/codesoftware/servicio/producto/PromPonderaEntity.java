
package co.com.codesoftware.servicio.producto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para promPonderaEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promPonderaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="existencias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idDska" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="promTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="promUni" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promPonderaEntity", propOrder = {
    "existencias",
    "id",
    "idDska",
    "promTotal",
    "promUni"
})
public class PromPonderaEntity {

    protected Integer existencias;
    protected Integer id;
    protected Integer idDska;
    protected BigDecimal promTotal;
    protected BigDecimal promUni;

    /**
     * Obtiene el valor de la propiedad existencias.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExistencias() {
        return existencias;
    }

    /**
     * Define el valor de la propiedad existencias.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExistencias(Integer value) {
        this.existencias = value;
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
     * Obtiene el valor de la propiedad idDska.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDska() {
        return idDska;
    }

    /**
     * Define el valor de la propiedad idDska.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDska(Integer value) {
        this.idDska = value;
    }

    /**
     * Obtiene el valor de la propiedad promTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromTotal() {
        return promTotal;
    }

    /**
     * Define el valor de la propiedad promTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromTotal(BigDecimal value) {
        this.promTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad promUni.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromUni() {
        return promUni;
    }

    /**
     * Define el valor de la propiedad promUni.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromUni(BigDecimal value) {
        this.promUni = value;
    }

}
