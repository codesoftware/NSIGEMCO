
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getProducts complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getProducts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sede_sede" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProducts", propOrder = {
    "sedeSede"
})
public class GetProducts {

    @XmlElement(name = "sede_sede")
    protected Integer sedeSede;

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

}
