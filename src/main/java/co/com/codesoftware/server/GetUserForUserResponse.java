
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUserForUserResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUserForUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsuarioTable" type="{http://server.codesoftware.com.co/}usuarioTable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserForUserResponse", propOrder = {
    "usuarioTable"
})
public class GetUserForUserResponse {

    @XmlElement(name = "UsuarioTable")
    protected UsuarioTable usuarioTable;

    /**
     * Obtiene el valor de la propiedad usuarioTable.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioTable }
     *     
     */
    public UsuarioTable getUsuarioTable() {
        return usuarioTable;
    }

    /**
     * Define el valor de la propiedad usuarioTable.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioTable }
     *     
     */
    public void setUsuarioTable(UsuarioTable value) {
        this.usuarioTable = value;
    }

}
