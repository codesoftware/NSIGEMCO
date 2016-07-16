
package co.com.codesoftware.server.nsigemco;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtieneProveedoresResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtieneProveedoresResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaProveedores" type="{http://nsigemco.server.codesoftware.com.co/}proveedoresEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtieneProveedoresResponse", propOrder = {
    "listaProveedores"
})
public class ObtieneProveedoresResponse {

    protected List<ProveedoresEntity> listaProveedores;

    /**
     * Gets the value of the listaProveedores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaProveedores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaProveedores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProveedoresEntity }
     * 
     * 
     */
    public List<ProveedoresEntity> getListaProveedores() {
        if (listaProveedores == null) {
            listaProveedores = new ArrayList<ProveedoresEntity>();
        }
        return this.listaProveedores;
    }

}
