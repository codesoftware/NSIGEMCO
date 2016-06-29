
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para findExistsForSede complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="findExistsForSede">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sede_sede" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dska_dska" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findExistsForSede", propOrder = {
    "sedeSede",
    "dskaDska"
})
public class FindExistsForSede {

    @XmlElement(name = "sede_sede", required = true)
    protected String sedeSede;
    @XmlElement(name = "dska_dska", required = true)
    protected String dskaDska;

    /**
     * Obtiene el valor de la propiedad sedeSede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSedeSede() {
        return sedeSede;
    }

    /**
     * Define el valor de la propiedad sedeSede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSedeSede(String value) {
        this.sedeSede = value;
    }

    /**
     * Obtiene el valor de la propiedad dskaDska.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDskaDska() {
        return dskaDska;
    }

    /**
     * Define el valor de la propiedad dskaDska.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDskaDska(String value) {
        this.dskaDska = value;
    }

}
