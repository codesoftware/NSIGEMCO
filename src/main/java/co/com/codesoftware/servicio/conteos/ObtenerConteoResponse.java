
package co.com.codesoftware.servicio.conteos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerConteoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerConteoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conteo" type="{http://conteos.servicio.codesoftware.com.co/}conteoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerConteoResponse", propOrder = {
    "conteo"
})
public class ObtenerConteoResponse {

    protected ConteoEntity conteo;

    /**
     * Obtiene el valor de la propiedad conteo.
     * 
     * @return
     *     possible object is
     *     {@link ConteoEntity }
     *     
     */
    public ConteoEntity getConteo() {
        return conteo;
    }

    /**
     * Define el valor de la propiedad conteo.
     * 
     * @param value
     *     allowed object is
     *     {@link ConteoEntity }
     *     
     */
    public void setConteo(ConteoEntity value) {
        this.conteo = value;
    }

}
