
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProductoXCodExtResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProductoXCodExtResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductoTable" type="{http://producto.servicio.codesoftware.com.co/}precioProductoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProductoXCodExtResponse", propOrder = {
    "productoTable"
})
public class ObtenerProductoXCodExtResponse {

    @XmlElement(name = "ProductoTable")
    protected PrecioProductoEntity productoTable;

    /**
     * Obtiene el valor de la propiedad productoTable.
     * 
     * @return
     *     possible object is
     *     {@link PrecioProductoEntity }
     *     
     */
    public PrecioProductoEntity getProductoTable() {
        return productoTable;
    }

    /**
     * Define el valor de la propiedad productoTable.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecioProductoEntity }
     *     
     */
    public void setProductoTable(PrecioProductoEntity value) {
        this.productoTable = value;
    }

}
