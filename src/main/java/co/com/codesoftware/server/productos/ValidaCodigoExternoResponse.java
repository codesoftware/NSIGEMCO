
package co.com.codesoftware.server.productos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validaCodigoExternoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validaCodigoExternoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaCodigoExternoResponse", propOrder = {
    "validacion"
})
public class ValidaCodigoExternoResponse {

    protected String validacion;

    /**
     * Obtiene el valor de la propiedad validacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacion() {
        return validacion;
    }

    /**
     * Define el valor de la propiedad validacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacion(String value) {
        this.validacion = value;
    }

}
