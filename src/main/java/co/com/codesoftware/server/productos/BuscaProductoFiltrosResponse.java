
package co.com.codesoftware.server.productos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaProductoFiltrosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaProductoFiltrosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaProducto" type="{http://productos.server.codesoftware.com.co/}productoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaProductoFiltrosResponse", propOrder = {
    "listaProducto"
})
public class BuscaProductoFiltrosResponse {

    protected ProductoEntity listaProducto;

    /**
     * Obtiene el valor de la propiedad listaProducto.
     * 
     * @return
     *     possible object is
     *     {@link ProductoEntity }
     *     
     */
    public ProductoEntity getListaProducto() {
        return listaProducto;
    }

    /**
     * Define el valor de la propiedad listaProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoEntity }
     *     
     */
    public void setListaProducto(ProductoEntity value) {
        this.listaProducto = value;
    }

}
