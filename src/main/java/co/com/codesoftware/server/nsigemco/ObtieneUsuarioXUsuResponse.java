
package co.com.codesoftware.server.nsigemco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import co.com.codesoftware.servicio.usuario.UsuarioEntity;


/**
 * <p>Clase Java para obtieneUsuarioXUsuResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtieneUsuarioXUsuResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuarioEntity" type="{http://nsigemco.server.codesoftware.com.co/}usuarioEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtieneUsuarioXUsuResponse", propOrder = {
    "usuarioEntity"
})
public class ObtieneUsuarioXUsuResponse {

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
