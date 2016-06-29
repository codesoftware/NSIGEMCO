
package co.com.codesoftware.servicio.usuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerUsuarioXUser complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerUsuarioXUser">
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
@XmlType(name = "obtenerUsuarioXUser", propOrder = {
    "tiusUsuario"
})
public class ObtenerUsuarioXUser {

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
