
package co.com.codesoftware.server.productos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaFacturaCompraFiltrosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaFacturaCompraFiltrosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacturaCompraTotalEntity" type="{http://productos.server.codesoftware.com.co/}facturaCompraTotalEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaFacturaCompraFiltrosResponse", propOrder = {
    "facturaCompraTotalEntity"
})
public class ConsultaFacturaCompraFiltrosResponse {

    @XmlElement(name = "FacturaCompraTotalEntity")
    protected List<FacturaCompraTotalEntity> facturaCompraTotalEntity;

    /**
     * Gets the value of the facturaCompraTotalEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facturaCompraTotalEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturaCompraTotalEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturaCompraTotalEntity }
     * 
     * 
     */
    public List<FacturaCompraTotalEntity> getFacturaCompraTotalEntity() {
        if (facturaCompraTotalEntity == null) {
            facturaCompraTotalEntity = new ArrayList<FacturaCompraTotalEntity>();
        }
        return this.facturaCompraTotalEntity;
    }

}
