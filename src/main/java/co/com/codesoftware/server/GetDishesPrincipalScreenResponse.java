
package co.com.codesoftware.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getDishesPrincipalScreenResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getDishesPrincipalScreenResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PantallaPrincipalFactTable" type="{http://server.codesoftware.com.co/}pantallaPrincipalFacTable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDishesPrincipalScreenResponse", propOrder = {
    "pantallaPrincipalFactTable"
})
public class GetDishesPrincipalScreenResponse {

    @XmlElement(name = "PantallaPrincipalFactTable")
    protected List<PantallaPrincipalFacTable> pantallaPrincipalFactTable;

    /**
     * Gets the value of the pantallaPrincipalFactTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pantallaPrincipalFactTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPantallaPrincipalFactTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PantallaPrincipalFacTable }
     * 
     * 
     */
    public List<PantallaPrincipalFacTable> getPantallaPrincipalFactTable() {
        if (pantallaPrincipalFactTable == null) {
            pantallaPrincipalFactTable = new ArrayList<PantallaPrincipalFacTable>();
        }
        return this.pantallaPrincipalFactTable;
    }

}
