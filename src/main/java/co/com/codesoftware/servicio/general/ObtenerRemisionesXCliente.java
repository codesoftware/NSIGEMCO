
package co.com.codesoftware.servicio.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para obtenerRemisionesXCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerRemisionesXCliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaIni" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechafin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerRemisionesXCliente", propOrder = {
    "idCliente",
    "fechaIni",
    "fechafin"
})
public class ObtenerRemisionesXCliente {

    protected int idCliente;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIni;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechafin;

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIni.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIni() {
        return fechaIni;
    }

    /**
     * Define el valor de la propiedad fechaIni.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIni(XMLGregorianCalendar value) {
        this.fechaIni = value;
    }

    /**
     * Obtiene el valor de la propiedad fechafin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechafin() {
        return fechafin;
    }

    /**
     * Define el valor de la propiedad fechafin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechafin(XMLGregorianCalendar value) {
        this.fechafin = value;
    }

}
