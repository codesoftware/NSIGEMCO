
package co.com.codesoftware.servicio.usuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerUsuarioXUserResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerUsuarioXUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsuarioEntity" type="{http://usuario.servicio.codesoftware.com.co/}usuarioEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerUsuarioXUserResponse", propOrder = {
    "usuarioEntity"
})
public class ObtenerUsuarioXUserResponse {

    @XmlElement(name = "UsuarioEntity")
    protected UsuarioEntity usuarioEntity;

    /**
     * Obtiene el valor de la propiedad usuarioEntity.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioEntity }
     *     
     */
    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    /**
     * Define el valor de la propiedad usuarioEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioEntity }
     *     
     */
    public void setUsuarioEntity(UsuarioEntity value) {
        this.usuarioEntity = value;
    }

}
