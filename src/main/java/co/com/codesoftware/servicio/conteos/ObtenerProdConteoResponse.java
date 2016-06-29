
package co.com.codesoftware.servicio.conteos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProdConteoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProdConteoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductoConteoEntityTR" type="{http://conteos.servicio.codesoftware.com.co/}productoConteoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProdConteoResponse", propOrder = {
    "productoConteoEntityTR"
})
public class ObtenerProdConteoResponse {

    @XmlElement(name = "ProductoConteoEntityTR")
    protected ProductoConteoEntity productoConteoEntityTR;

    /**
     * Obtiene el valor de la propiedad productoConteoEntityTR.
     * 
     * @return
     *     possible object is
     *     {@link ProductoConteoEntity }
     *     
     */
    public ProductoConteoEntity getProductoConteoEntityTR() {
        return productoConteoEntityTR;
    }

    /**
     * Define el valor de la propiedad productoConteoEntityTR.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoConteoEntity }
     *     
     */
    public void setProductoConteoEntityTR(ProductoConteoEntity value) {
        this.productoConteoEntityTR = value;
    }

}
