
package co.com.codesoftware.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaProductoXCodBarrasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaProductoXCodBarrasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrecioProductoEntity" type="{http://server.codesoftware.com.co/}precioProductoEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaProductoXCodBarrasResponse", propOrder = {
    "precioProductoEntity"
})
public class BuscaProductoXCodBarrasResponse {

    @XmlElement(name = "PrecioProductoEntity")
    protected List<PrecioProductoEntity> precioProductoEntity;

    /**
     * Gets the value of the precioProductoEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precioProductoEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecioProductoEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecioProductoEntity }
     * 
     * 
     */
    public List<PrecioProductoEntity> getPrecioProductoEntity() {
        if (precioProductoEntity == null) {
            precioProductoEntity = new ArrayList<PrecioProductoEntity>();
        }
        return this.precioProductoEntity;
    }

}
