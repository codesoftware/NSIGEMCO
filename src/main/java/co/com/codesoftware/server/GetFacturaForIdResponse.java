
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFacturaForIdResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFacturaForIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacturaTable" type="{http://server.codesoftware.com.co/}facturaTable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFacturaForIdResponse", propOrder = {
    "facturaTable"
})
public class GetFacturaForIdResponse {

    @XmlElement(name = "FacturaTable")
    protected FacturaTable facturaTable;

    /**
     * Obtiene el valor de la propiedad facturaTable.
     * 
     * @return
     *     possible object is
     *     {@link FacturaTable }
     *     
     */
    public FacturaTable getFacturaTable() {
        return facturaTable;
    }

    /**
     * Define el valor de la propiedad facturaTable.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaTable }
     *     
     */
    public void setFacturaTable(FacturaTable value) {
        this.facturaTable = value;
    }

}
