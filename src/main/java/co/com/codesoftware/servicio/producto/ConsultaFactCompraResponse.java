
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaFactCompraResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaFactCompraResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facturaCompraEntity" type="{http://producto.servicio.codesoftware.com.co/}facturaCompraEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaFactCompraResponse", propOrder = {
    "facturaCompraEntity"
})
public class ConsultaFactCompraResponse {

    protected FacturaCompraEntity facturaCompraEntity;

    /**
     * Obtiene el valor de la propiedad facturaCompraEntity.
     * 
     * @return
     *     possible object is
     *     {@link FacturaCompraEntity }
     *     
     */
    public FacturaCompraEntity getFacturaCompraEntity() {
        return facturaCompraEntity;
    }

    /**
     * Define el valor de la propiedad facturaCompraEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaCompraEntity }
     *     
     */
    public void setFacturaCompraEntity(FacturaCompraEntity value) {
        this.facturaCompraEntity = value;
    }

}
