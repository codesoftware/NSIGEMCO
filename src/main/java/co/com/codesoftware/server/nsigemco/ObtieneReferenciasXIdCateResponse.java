
package co.com.codesoftware.server.nsigemco;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtieneReferenciasXIdCateResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtieneReferenciasXIdCateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obtieneReferencias" type="{http://nsigemco.server.codesoftware.com.co/}referenciaEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtieneReferenciasXIdCateResponse", propOrder = {
    "obtieneReferencias"
})
public class ObtieneReferenciasXIdCateResponse {

    protected List<ReferenciaEntity> obtieneReferencias;

    /**
     * Gets the value of the obtieneReferencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obtieneReferencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObtieneReferencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenciaEntity }
     * 
     * 
     */
    public List<ReferenciaEntity> getObtieneReferencias() {
        if (obtieneReferencias == null) {
            obtieneReferencias = new ArrayList<ReferenciaEntity>();
        }
        return this.obtieneReferencias;
    }

}
