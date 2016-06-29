
package co.com.codesoftware.servicio.producto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProductoXSedeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProductoXSedeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrecioProducto" type="{http://producto.servicio.codesoftware.com.co/}precioProductoEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProductoXSedeResponse", propOrder = {
    "precioProducto"
})
public class ObtenerProductoXSedeResponse {

    @XmlElement(name = "PrecioProducto")
    protected List<PrecioProductoEntity> precioProducto;

    /**
     * Gets the value of the precioProducto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precioProducto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecioProducto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecioProductoEntity }
     * 
     * 
     */
    public List<PrecioProductoEntity> getPrecioProducto() {
        if (precioProducto == null) {
            precioProducto = new ArrayList<PrecioProductoEntity>();
        }
        return this.precioProducto;
    }

}
