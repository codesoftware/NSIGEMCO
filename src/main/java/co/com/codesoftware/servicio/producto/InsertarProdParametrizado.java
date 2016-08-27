
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarProdParametrizado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarProdParametrizado">
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
@XmlType(name = "insertarProdParametrizado", propOrder = {
    "productoParametrizado"
})
public class InsertarProdParametrizado {

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
