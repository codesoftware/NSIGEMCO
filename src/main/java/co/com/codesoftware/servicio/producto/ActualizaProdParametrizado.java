
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizaProdParametrizado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizaProdParametrizado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productoParametrizado" type="{http://producto.servicio.codesoftware.com.co/}productosParamEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizaProdParametrizado", propOrder = {
    "productoParametrizado"
})
public class ActualizaProdParametrizado {

    protected ProductosParamEntity productoParametrizado;

    /**
     * Obtiene el valor de la propiedad productoParametrizado.
     * 
     * @return
     *     possible object is
     *     {@link ProductosParamEntity }
     *     
     */
    public ProductosParamEntity getProductoParametrizado() {
        return productoParametrizado;
    }

    /**
     * Define el valor de la propiedad productoParametrizado.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductosParamEntity }
     *     
     */
    public void setProductoParametrizado(ProductosParamEntity value) {
        this.productoParametrizado = value;
    }

}
