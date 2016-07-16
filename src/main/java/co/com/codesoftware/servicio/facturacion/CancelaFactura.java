
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cancelaFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cancelaFactura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatosCancelacion" type="{http://facturacion.servicio.codesoftware.com.co/}cancelaFacturaWrapRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelaFactura", propOrder = {
    "datosCancelacion"
})
public class CancelaFactura {

    @XmlElement(name = "DatosCancelacion")
    protected CancelaFacturaWrapRequest datosCancelacion;

    /**
     * Obtiene el valor de la propiedad datosCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link CancelaFacturaWrapRequest }
     *     
     */
    public CancelaFacturaWrapRequest getDatosCancelacion() {
        return datosCancelacion;
    }

    /**
     * Define el valor de la propiedad datosCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelaFacturaWrapRequest }
     *     
     */
    public void setDatosCancelacion(CancelaFacturaWrapRequest value) {
        this.datosCancelacion = value;
    }

}
