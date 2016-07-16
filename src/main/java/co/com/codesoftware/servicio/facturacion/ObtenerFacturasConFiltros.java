
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para obtenerFacturasConFiltros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerFacturasConFiltros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="idFactura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerFacturasConFiltros", propOrder = {
    "fInicial",
    "fFinal",
    "idFactura",
    "idCliente",
    "codExterno"
})
public class ObtenerFacturasConFiltros {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fInicial;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fFinal;
    protected Integer idFactura;
    protected Integer idCliente;
    protected String codExterno;

    /**
     * Obtiene el valor de la propiedad fInicial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFInicial() {
        return fInicial;
    }

    /**
     * Define el valor de la propiedad fInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFInicial(XMLGregorianCalendar value) {
        this.fInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad fFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFFinal() {
        return fFinal;
    }

    /**
     * Define el valor de la propiedad fFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFFinal(XMLGregorianCalendar value) {
        this.fFinal = value;
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
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodExterno() {
        return codExterno;
    }

    /**
     * Define el valor de la propiedad codExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodExterno(String value) {
        this.codExterno = value;
    }

}
