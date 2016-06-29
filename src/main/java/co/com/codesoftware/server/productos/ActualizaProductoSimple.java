
package co.com.codesoftware.server.productos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizaProductoSimple complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizaProductoSimple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productoSimple" type="{http://productos.server.codesoftware.com.co/}productoSimpleEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizaProductoSimple", propOrder = {
    "productoSimple"
})
public class ActualizaProductoSimple {

    protected ProductoSimpleEntity productoSimple;

    /**
     * Obtiene el valor de la propiedad productoSimple.
     * 
     * @return
     *     possible object is
     *     {@link ProductoSimpleEntity }
     *     
     */
    public ProductoSimpleEntity getProductoSimple() {
        return productoSimple;
    }

    /**
     * Define el valor de la propiedad productoSimple.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoSimpleEntity }
     *     
     */
    public void setProductoSimple(ProductoSimpleEntity value) {
        this.productoSimple = value;
    }

}
