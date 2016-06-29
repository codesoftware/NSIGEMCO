
package co.com.codesoftware.server;

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
 *         &lt;element name="Facturacion" type="{http://server.codesoftware.com.co/}facturacion"/>
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

    @XmlElement(name = "Facturacion", required = true)
    protected Facturacion facturacion;

    /**
     * Obtiene el valor de la propiedad facturacion.
     * 
     * @return
     *     possible object is
     *     {@link Facturacion }
     *     
     */
    public Facturacion getFacturacion() {
        return facturacion;
    }

    /**
     * Define el valor de la propiedad facturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Facturacion }
     *     
     */
    public void setFacturacion(Facturacion value) {
        this.facturacion = value;
    }

}
