
package co.com.codesoftware.server.productos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaFacturaTotalResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaFacturaTotalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacturaCompraGeneralEntity" type="{http://productos.server.codesoftware.com.co/}facturaCompraGeneralEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaFacturaTotalResponse", propOrder = {
    "facturaCompraGeneralEntity"
})
public class ConsultaFacturaTotalResponse {

    @XmlElement(name = "FacturaCompraGeneralEntity")
    protected FacturaCompraGeneralEntity facturaCompraGeneralEntity;

    /**
     * Obtiene el valor de la propiedad facturaCompraGeneralEntity.
     * 
     * @return
     *     possible object is
     *     {@link FacturaCompraGeneralEntity }
     *     
     */
    public FacturaCompraGeneralEntity getFacturaCompraGeneralEntity() {
        return facturaCompraGeneralEntity;
    }

    /**
     * Define el valor de la propiedad facturaCompraGeneralEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaCompraGeneralEntity }
     *     
     */
    public void setFacturaCompraGeneralEntity(FacturaCompraGeneralEntity value) {
        this.facturaCompraGeneralEntity = value;
    }

}
