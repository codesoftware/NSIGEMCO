
package co.com.codesoftware.servicio.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizaParametroResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizaParametroResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaCiudades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizaParametroResponse", propOrder = {
    "listaCiudades"
})
public class ActualizaParametroResponse {

    protected String listaCiudades;

    /**
     * Obtiene el valor de la propiedad listaCiudades.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaCiudades() {
        return listaCiudades;
    }

    /**
     * Define el valor de la propiedad listaCiudades.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaCiudades(String value) {
        this.listaCiudades = value;
    }

}
