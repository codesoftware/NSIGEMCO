
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarFacturaCompraTmp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarFacturaCompraTmp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facturaCompraTmp" type="{http://facturacion.servicio.codesoftware.com.co/}facturaCompraTmpEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarFacturaCompraTmp", propOrder = {
    "facturaCompraTmp"
})
public class InsertarFacturaCompraTmp {

    protected FacturaCompraTmpEntity facturaCompraTmp;

    /**
     * Obtiene el valor de la propiedad facturaCompraTmp.
     * 
     * @return
     *     possible object is
     *     {@link FacturaCompraTmpEntity }
     *     
     */
    public FacturaCompraTmpEntity getFacturaCompraTmp() {
        return facturaCompraTmp;
    }

    /**
     * Define el valor de la propiedad facturaCompraTmp.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaCompraTmpEntity }
     *     
     */
    public void setFacturaCompraTmp(FacturaCompraTmpEntity value) {
        this.facturaCompraTmp = value;
    }

}
