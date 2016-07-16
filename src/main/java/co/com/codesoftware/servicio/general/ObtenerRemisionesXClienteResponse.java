
package co.com.codesoftware.servicio.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerRemisionesXClienteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerRemisionesXClienteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remisiones" type="{http://general.servicio.codesoftware.com.co/}remisionEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerRemisionesXClienteResponse", propOrder = {
    "remisiones"
})
public class ObtenerRemisionesXClienteResponse {

    protected List<RemisionEntity> remisiones;

    /**
     * Gets the value of the remisiones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remisiones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemisiones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemisionEntity }
     * 
     * 
     */
    public List<RemisionEntity> getRemisiones() {
        if (remisiones == null) {
            remisiones = new ArrayList<RemisionEntity>();
        }
        return this.remisiones;
    }

}
