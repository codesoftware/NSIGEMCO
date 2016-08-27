
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProdcutoGeneriXCodExtResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProdcutoGeneriXCodExtResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prodGenerico" type="{http://producto.servicio.codesoftware.com.co/}productoGenericoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProdcutoGeneriXCodExtResponse", propOrder = {
    "prodGenerico"
})
public class ObtenerProdcutoGeneriXCodExtResponse {

    protected ProductoGenericoEntity prodGenerico;

    /**
     * Obtiene el valor de la propiedad prodGenerico.
     * 
     * @return
     *     possible object is
     *     {@link ProductoGenericoEntity }
     *     
     */
    public ProductoGenericoEntity getProdGenerico() {
        return prodGenerico;
    }

    /**
     * Define el valor de la propiedad prodGenerico.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoGenericoEntity }
     *     
     */
    public void setProdGenerico(ProductoGenericoEntity value) {
        this.prodGenerico = value;
    }

}
