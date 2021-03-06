
package co.com.codesoftware.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFacturasSedeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFacturasSedeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaFacturas" type="{http://server.codesoftware.com.co/}facturaTable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFacturasSedeResponse", propOrder = {
    "listaFacturas"
})
public class GetFacturasSedeResponse {

    protected List<FacturaTable> listaFacturas;

    /**
     * Gets the value of the listaFacturas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaFacturas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaFacturas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturaTable }
     * 
     * 
     */
    public List<FacturaTable> getListaFacturas() {
        if (listaFacturas == null) {
            listaFacturas = new ArrayList<FacturaTable>();
        }
        return this.listaFacturas;
    }

}
