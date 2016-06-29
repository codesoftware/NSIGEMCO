
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaPermisosUsuarioResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaPermisosUsuarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoUsuarioEntity" type="{http://server.codesoftware.com.co/}tipoUsuarioEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaPermisosUsuarioResponse", propOrder = {
    "tipoUsuarioEntity"
})
public class ConsultaPermisosUsuarioResponse {

    @XmlElement(name = "TipoUsuarioEntity")
    protected TipoUsuarioEntity tipoUsuarioEntity;

    /**
     * Obtiene el valor de la propiedad tipoUsuarioEntity.
     * 
     * @return
     *     possible object is
     *     {@link TipoUsuarioEntity }
     *     
     */
    public TipoUsuarioEntity getTipoUsuarioEntity() {
        return tipoUsuarioEntity;
    }

    /**
     * Define el valor de la propiedad tipoUsuarioEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUsuarioEntity }
     *     
     */
    public void setTipoUsuarioEntity(TipoUsuarioEntity value) {
        this.tipoUsuarioEntity = value;
    }

}
