
package co.com.codesoftware.servicio.producto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaPagoFactRealResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaPagoFactRealResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PagoFacturaCompra" type="{http://producto.servicio.codesoftware.com.co/}pagoFacturaCompraEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaPagoFactRealResponse", propOrder = {
    "pagoFacturaCompra"
})
public class ConsultaPagoFactRealResponse {

    @XmlElement(name = "PagoFacturaCompra")
    protected List<PagoFacturaCompraEntity> pagoFacturaCompra;

    /**
     * Gets the value of the pagoFacturaCompra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagoFacturaCompra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagoFacturaCompra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PagoFacturaCompraEntity }
     * 
     * 
     */
    public List<PagoFacturaCompraEntity> getPagoFacturaCompra() {
        if (pagoFacturaCompra == null) {
            pagoFacturaCompra = new ArrayList<PagoFacturaCompraEntity>();
        }
        return this.pagoFacturaCompra;
    }

}
