
package co.com.codesoftware.servicio.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerPrincPagoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerPrincPagoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pagoRemision" type="{http://general.servicio.codesoftware.com.co/}pagoRemisionEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerPrincPagoResponse", propOrder = {
    "pagoRemision"
})
public class ObtenerPrincPagoResponse {

    protected PagoRemisionEntity pagoRemision;

    /**
     * Obtiene el valor de la propiedad pagoRemision.
     * 
     * @return
     *     possible object is
     *     {@link PagoRemisionEntity }
     *     
     */
    public PagoRemisionEntity getPagoRemision() {
        return pagoRemision;
    }

    /**
     * Define el valor de la propiedad pagoRemision.
     * 
     * @param value
     *     allowed object is
     *     {@link PagoRemisionEntity }
     *     
     */
    public void setPagoRemision(PagoRemisionEntity value) {
        this.pagoRemision = value;
    }

}
