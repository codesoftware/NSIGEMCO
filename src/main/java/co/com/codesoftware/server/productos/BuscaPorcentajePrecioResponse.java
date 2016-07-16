
package co.com.codesoftware.server.productos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaPorcentajePrecioResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaPorcentajePrecioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaPorcPrecio" type="{http://productos.server.codesoftware.com.co/}porcentajePrecioEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaPorcentajePrecioResponse", propOrder = {
    "listaPorcPrecio"
})
public class BuscaPorcentajePrecioResponse {

    protected List<PorcentajePrecioEntity> listaPorcPrecio;

    /**
     * Gets the value of the listaPorcPrecio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPorcPrecio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPorcPrecio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PorcentajePrecioEntity }
     * 
     * 
     */
    public List<PorcentajePrecioEntity> getListaPorcPrecio() {
        if (listaPorcPrecio == null) {
            listaPorcPrecio = new ArrayList<PorcentajePrecioEntity>();
        }
        return this.listaPorcPrecio;
    }

}
