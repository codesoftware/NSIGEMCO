
package co.com.codesoftware.servicio.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerUsuariosXPermisoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerUsuariosXPermisoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaUsuarios" type="{http://general.servicio.codesoftware.com.co/}usuarioEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerUsuariosXPermisoResponse", propOrder = {
    "listaUsuarios"
})
public class ObtenerUsuariosXPermisoResponse {

    protected List<UsuarioEntity> listaUsuarios;

    /**
     * Gets the value of the listaUsuarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaUsuarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaUsuarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioEntity }
     * 
     * 
     */
    public List<UsuarioEntity> getListaUsuarios() {
        if (listaUsuarios == null) {
            listaUsuarios = new ArrayList<UsuarioEntity>();
        }
        return this.listaUsuarios;
    }

}
