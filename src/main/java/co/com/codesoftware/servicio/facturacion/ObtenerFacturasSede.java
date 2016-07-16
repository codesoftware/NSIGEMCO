
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para obtenerFacturasSede complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerFacturasSede">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="idSede" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerFacturasSede", propOrder = {
    "fInicial",
    "fFinal",
    "idSede"
})
public class ObtenerFacturasSede {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fInicial;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fFinal;
    protected int idSede;

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
     * Obtiene el valor de la propiedad idSede.
     * 
     */
    public int getIdSede() {
        return idSede;
    }

    /**
     * Define el valor de la propiedad idSede.
     * 
     */
    public void setIdSede(int value) {
        this.idSede = value;
    }

}
