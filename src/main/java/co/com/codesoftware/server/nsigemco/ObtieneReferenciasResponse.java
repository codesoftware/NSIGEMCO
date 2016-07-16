
package co.com.codesoftware.server.nsigemco;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtieneReferenciasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtieneReferenciasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaReferencias" type="{http://nsigemco.server.codesoftware.com.co/}referenciaEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtieneReferenciasResponse", propOrder = {
    "listaReferencias"
})
public class ObtieneReferenciasResponse {

    protected List<ReferenciaEntity> listaReferencias;

    /**
     * Gets the value of the listaReferencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaReferencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaReferencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenciaEntity }
     * 
     * 
     */
    public List<ReferenciaEntity> getListaReferencias() {
        if (listaReferencias == null) {
            listaReferencias = new ArrayList<ReferenciaEntity>();
        }
        return this.listaReferencias;
    }

}
