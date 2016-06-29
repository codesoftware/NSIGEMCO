
package co.com.codesoftware.server.nsigemco;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import co.com.codesoftware.servicio.general.SedeEntity;


/**
 * <p>Clase Java para obtieneSedesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtieneSedesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaSedes" type="{http://nsigemco.server.codesoftware.com.co/}sedeEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtieneSedesResponse", propOrder = {
    "listaSedes"
})
public class ObtieneSedesResponse {

    protected List<SedeEntity> listaSedes;

    /**
     * Gets the value of the listaSedes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaSedes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaSedes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SedeEntity }
     * 
     * 
     */
    public List<SedeEntity> getListaSedes() {
        if (listaSedes == null) {
            listaSedes = new ArrayList<SedeEntity>();
        }
        return this.listaSedes;
    }

}
