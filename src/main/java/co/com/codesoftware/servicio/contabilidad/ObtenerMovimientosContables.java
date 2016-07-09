
package co.com.codesoftware.servicio.contabilidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para obtenerMovimientosContables complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerMovimientosContables">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaIn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaFi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tipoDoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerMovimientosContables", propOrder = {
    "fechaIn",
    "fechaFi",
    "tipoDoc"
})
public class ObtenerMovimientosContables {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFi;
    @XmlElement(required = true)
    protected String tipoDoc;

    /**
     * Obtiene el valor de la propiedad fechaIn.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIn() {
        return fechaIn;
    }

    /**
     * Define el valor de la propiedad fechaIn.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIn(XMLGregorianCalendar value) {
        this.fechaIn = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFi.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFi() {
        return fechaFi;
    }

    /**
     * Define el valor de la propiedad fechaFi.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFi(XMLGregorianCalendar value) {
        this.fechaFi = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Define el valor de la propiedad tipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDoc(String value) {
        this.tipoDoc = value;
    }

}
