
package co.com.codesoftware.servicio.facturacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerFacturasConFiltrosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerFacturasConFiltrosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaFacturas" type="{http://facturacion.servicio.codesoftware.com.co/}facturaEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerFacturasConFiltrosResponse", propOrder = {
    "listaFacturas"
})
public class ObtenerFacturasConFiltrosResponse {

    protected List<FacturaEntity> listaFacturas;

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
     * {@link FacturaEntity }
     * 
     * 
     */
    public List<FacturaEntity> getListaFacturas() {
        if (listaFacturas == null) {
            listaFacturas = new ArrayList<FacturaEntity>();
        }
        return this.listaFacturas;
    }

}
