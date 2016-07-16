
package co.com.codesoftware.servicio.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerPerfilesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerPerfilesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaPerfiles" type="{http://usuario.servicio.codesoftware.com.co/}perfilEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerPerfilesResponse", propOrder = {
    "listaPerfiles"
})
public class ObtenerPerfilesResponse {

    protected List<PerfilEntity> listaPerfiles;

    /**
     * Gets the value of the listaPerfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPerfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPerfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerfilEntity }
     * 
     * 
     */
    public List<PerfilEntity> getListaPerfiles() {
        if (listaPerfiles == null) {
            listaPerfiles = new ArrayList<PerfilEntity>();
        }
        return this.listaPerfiles;
    }

}
