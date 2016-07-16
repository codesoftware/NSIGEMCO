
package co.com.codesoftware.servicio.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDetallePagos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDetallePagos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDetallePagos", propOrder = {
    "idPago"
})
public class ObtenerDetallePagos {

    protected int idPago;

    /**
     * Obtiene el valor de la propiedad idPago.
     * 
     */
    public int getIdPago() {
        return idPago;
    }

    /**
     * Define el valor de la propiedad idPago.
     * 
     */
    public void setIdPago(int value) {
        this.idPago = value;
    }

}
