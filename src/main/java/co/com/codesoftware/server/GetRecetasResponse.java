
package co.com.codesoftware.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getRecetasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getRecetasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecetaTable" type="{http://server.codesoftware.com.co/}recetaTable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecetasResponse", propOrder = {
    "recetaTable"
})
public class GetRecetasResponse {

    @XmlElement(name = "RecetaTable")
    protected List<RecetaTable> recetaTable;

    /**
     * Gets the value of the recetaTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recetaTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecetaTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecetaTable }
     * 
     * 
     */
    public List<RecetaTable> getRecetaTable() {
        if (recetaTable == null) {
            recetaTable = new ArrayList<RecetaTable>();
        }
        return this.recetaTable;
    }

}
