
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerFacturaXIdResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerFacturaXIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacturaEntity" type="{http://facturacion.servicio.codesoftware.com.co/}facturaEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerFacturaXIdResponse", propOrder = {
    "facturaEntity"
})
public class ObtenerFacturaXIdResponse {

    @XmlElement(name = "FacturaEntity")
    protected FacturaEntity facturaEntity;

    /**
     * Obtiene el valor de la propiedad facturaEntity.
     * 
     * @return
     *     possible object is
     *     {@link FacturaEntity }
     *     
     */
    public FacturaEntity getFacturaEntity() {
        return facturaEntity;
    }

    /**
     * Define el valor de la propiedad facturaEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaEntity }
     *     
     */
    public void setFacturaEntity(FacturaEntity value) {
        this.facturaEntity = value;
    }

}
