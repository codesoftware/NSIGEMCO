
package co.com.codesoftware.servicio.producto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerSolicitudesFiltrosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerSolicitudesFiltrosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaSolicitudes" type="{http://producto.servicio.codesoftware.com.co/}solicitudEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerSolicitudesFiltrosResponse", propOrder = {
    "listaSolicitudes"
})
public class ObtenerSolicitudesFiltrosResponse {

    protected List<SolicitudEntity> listaSolicitudes;

    /**
     * Gets the value of the listaSolicitudes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaSolicitudes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaSolicitudes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolicitudEntity }
     * 
     * 
     */
    public List<SolicitudEntity> getListaSolicitudes() {
        if (listaSolicitudes == null) {
            listaSolicitudes = new ArrayList<SolicitudEntity>();
        }
        return this.listaSolicitudes;
    }

}
