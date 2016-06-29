
package co.com.codesoftware.servicio.general;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutaPagoRemision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutaPagoRemision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTius" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idFact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valorPago" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="tipoPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pagoTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutaPagoRemision", propOrder = {
    "idTius",
    "idFact",
    "valorPago",
    "tipoPago",
    "pagoTotal"
})
public class EjecutaPagoRemision {

    protected int idTius;
    protected int idFact;
    @XmlElement(required = true)
    protected BigDecimal valorPago;
    @XmlElement(required = true)
    protected String tipoPago;
    @XmlElement(required = true)
    protected String pagoTotal;

    /**
     * Obtiene el valor de la propiedad idTius.
     * 
     */
    public int getIdTius() {
        return idTius;
    }

    /**
     * Define el valor de la propiedad idTius.
     * 
     */
    public void setIdTius(int value) {
        this.idTius = value;
    }

    /**
     * Obtiene el valor de la propiedad idFact.
     * 
     */
    public int getIdFact() {
        return idFact;
    }

    /**
     * Define el valor de la propiedad idFact.
     * 
     */
    public void setIdFact(int value) {
        this.idFact = value;
    }

    /**
     * Obtiene el valor de la propiedad valorPago.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorPago() {
        return valorPago;
    }

    /**
     * Define el valor de la propiedad valorPago.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorPago(BigDecimal value) {
        this.valorPago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * Define el valor de la propiedad tipoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPago(String value) {
        this.tipoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagoTotal() {
        return pagoTotal;
    }

    /**
     * Define el valor de la propiedad pagoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagoTotal(String value) {
        this.pagoTotal = value;
    }

}
