
package co.com.codesoftware.servicio.producto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProductosYRecetasXCriterioResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProductosYRecetasXCriterioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListGeneric" type="{http://producto.servicio.codesoftware.com.co/}productoGenericoEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProductosYRecetasXCriterioResponse", propOrder = {
    "listGeneric"
})
public class ObtenerProductosYRecetasXCriterioResponse {

    @XmlElement(name = "ListGeneric")
    protected List<ProductoGenericoEntity> listGeneric;

    /**
     * Gets the value of the listGeneric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listGeneric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListGeneric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductoGenericoEntity }
     * 
     * 
     */
    public List<ProductoGenericoEntity> getListGeneric() {
        if (listGeneric == null) {
            listGeneric = new ArrayList<ProductoGenericoEntity>();
        }
        return this.listGeneric;
    }

}
