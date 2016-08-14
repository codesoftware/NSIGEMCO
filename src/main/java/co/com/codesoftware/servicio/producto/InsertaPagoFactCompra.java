
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertaPagoFactCompra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertaPagoFactCompra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pago" type="{http://producto.servicio.codesoftware.com.co/}pagoFacturaCompraEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertaPagoFactCompra", propOrder = {
    "pago"
})
public class InsertaPagoFactCompra {

    protected PagoFacturaCompraEntity pago;

    /**
     * Obtiene el valor de la propiedad pago.
     * 
     * @return
     *     possible object is
     *     {@link PagoFacturaCompraEntity }
     *     
     */
    public PagoFacturaCompraEntity getPago() {
        return pago;
    }

    /**
     * Define el valor de la propiedad pago.
     * 
     * @param value
     *     allowed object is
     *     {@link PagoFacturaCompraEntity }
     *     
     */
    public void setPago(PagoFacturaCompraEntity value) {
        this.pago = value;
    }

}
