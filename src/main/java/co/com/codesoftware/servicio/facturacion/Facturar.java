
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para facturar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="facturar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facturacion" type="{http://facturacion.servicio.codesoftware.com.co/}facturacionGenEntity"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facturar", propOrder = {
    "facturacion"
})
public class Facturar {

    @XmlElement(required = true)
    protected FacturacionGenEntity facturacion;

    /**
     * Obtiene el valor de la propiedad facturacion.
     * 
     * @return
     *     possible object is
     *     {@link FacturacionGenEntity }
     *     
     */
    public FacturacionGenEntity getFacturacion() {
        return facturacion;
    }

    /**
     * Define el valor de la propiedad facturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturacionGenEntity }
     *     
     */
    public void setFacturacion(FacturacionGenEntity value) {
        this.facturacion = value;
    }

}
