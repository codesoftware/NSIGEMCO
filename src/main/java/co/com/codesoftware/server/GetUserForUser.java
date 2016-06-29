
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUserForUser complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUserForUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tius_usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserForUser", propOrder = {
    "tiusUsuario"
})
public class GetUserForUser {

    @XmlElement(name = "tius_usuario", required = true)
    protected String tiusUsuario;

    /**
     * Obtiene el valor de la propiedad tiusUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiusUsuario() {
        return tiusUsuario;
    }

    /**
     * Define el valor de la propiedad tiusUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiusUsuario(String value) {
        this.tiusUsuario = value;
    }

}
