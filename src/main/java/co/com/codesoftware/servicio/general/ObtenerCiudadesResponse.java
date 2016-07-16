
package co.com.codesoftware.servicio.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerCiudadesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerCiudadesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaCiudades" type="{http://general.servicio.codesoftware.com.co/}ciudadEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCiudadesResponse", propOrder = {
    "listaCiudades"
})
public class ObtenerCiudadesResponse {

    protected List<CiudadEntity> listaCiudades;

    /**
     * Gets the value of the listaCiudades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCiudades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCiudades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiudadEntity }
     * 
     * 
     */
    public List<CiudadEntity> getListaCiudades() {
        if (listaCiudades == null) {
            listaCiudades = new ArrayList<CiudadEntity>();
        }
        return this.listaCiudades;
    }

}
