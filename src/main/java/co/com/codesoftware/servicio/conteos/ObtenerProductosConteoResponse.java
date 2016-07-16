
package co.com.codesoftware.servicio.conteos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProductosConteoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProductosConteoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductoConteoEntityTR" type="{http://conteos.servicio.codesoftware.com.co/}productoConteoEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProductosConteoResponse", propOrder = {
    "productoConteoEntityTR"
})
public class ObtenerProductosConteoResponse {

    @XmlElement(name = "ProductoConteoEntityTR")
    protected List<ProductoConteoEntity> productoConteoEntityTR;

    /**
     * Gets the value of the productoConteoEntityTR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productoConteoEntityTR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductoConteoEntityTR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductoConteoEntity }
     * 
     * 
     */
    public List<ProductoConteoEntity> getProductoConteoEntityTR() {
        if (productoConteoEntityTR == null) {
            productoConteoEntityTR = new ArrayList<ProductoConteoEntity>();
        }
        return this.productoConteoEntityTR;
    }

}
