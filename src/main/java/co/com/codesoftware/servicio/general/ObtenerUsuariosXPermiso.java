
package co.com.codesoftware.servicio.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerUsuariosXPermiso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerUsuariosXPermiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="permiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerUsuariosXPermiso", propOrder = {
    "permiso"
})
public class ObtenerUsuariosXPermiso {

    protected String permiso;

    /**
     * Obtiene el valor de la propiedad permiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermiso() {
        return permiso;
    }

    /**
     * Define el valor de la propiedad permiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiso(String value) {
        this.permiso = value;
    }

}
