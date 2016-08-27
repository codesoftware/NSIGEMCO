
package co.com.codesoftware.servicio.producto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarProductoAporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarProductoAporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAporte" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productos" type="{http://producto.servicio.codesoftware.com.co/}productoAporte" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idTius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarProductoAporte", propOrder = {
    "idAporte",
    "productos",
    "idTius"
})
public class InsertarProductoAporte {

    protected Integer idAporte;
    protected List<ProductoAporte> productos;
    protected Integer idTius;

    /**
     * Obtiene el valor de la propiedad idAporte.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAporte() {
        return idAporte;
    }

    /**
     * Define el valor de la propiedad idAporte.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAporte(Integer value) {
        this.idAporte = value;
    }

    /**
     * Gets the value of the productos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductoAporte }
     * 
     * 
     */
    public List<ProductoAporte> getProductos() {
        if (productos == null) {
            productos = new ArrayList<ProductoAporte>();
        }
        return this.productos;
    }

    /**
     * Obtiene el valor de la propiedad idTius.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTius() {
        return idTius;
    }

    /**
     * Define el valor de la propiedad idTius.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTius(Integer value) {
        this.idTius = value;
    }

}
