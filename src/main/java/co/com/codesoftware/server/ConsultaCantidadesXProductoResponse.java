
package co.com.codesoftware.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaCantidadesXProductoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaCantidadesXProductoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CantidadesEntity" type="{http://server.codesoftware.com.co/}cantidadesEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaCantidadesXProductoResponse", propOrder = {
    "cantidadesEntity"
})
public class ConsultaCantidadesXProductoResponse {

    @XmlElement(name = "CantidadesEntity")
    protected List<CantidadesEntity> cantidadesEntity;

    /**
     * Gets the value of the cantidadesEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cantidadesEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCantidadesEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CantidadesEntity }
     * 
     * 
     */
    public List<CantidadesEntity> getCantidadesEntity() {
        if (cantidadesEntity == null) {
            cantidadesEntity = new ArrayList<CantidadesEntity>();
        }
        return this.cantidadesEntity;
    }

}
