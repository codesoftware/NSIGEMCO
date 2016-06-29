
package co.com.codesoftware.server.nsigemco;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtieneMarcasXCateResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtieneMarcasXCateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaMarcas" type="{http://nsigemco.server.codesoftware.com.co/}marcaEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtieneMarcasXCateResponse", propOrder = {
    "listaMarcas"
})
public class ObtieneMarcasXCateResponse {

    protected List<MarcaEntity> listaMarcas;

    /**
     * Gets the value of the listaMarcas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaMarcas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaMarcas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarcaEntity }
     * 
     * 
     */
    public List<MarcaEntity> getListaMarcas() {
        if (listaMarcas == null) {
            listaMarcas = new ArrayList<MarcaEntity>();
        }
        return this.listaMarcas;
    }

}
