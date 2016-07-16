
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para generaPdfCotizacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generaPdfCotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generaPdfCotizacion", propOrder = {
    "idPedido"
})
public class GeneraPdfCotizacion {

    protected int idPedido;

    /**
     * Obtiene el valor de la propiedad idPedido.
     * 
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Define el valor de la propiedad idPedido.
     * 
     */
    public void setIdPedido(int value) {
        this.idPedido = value;
    }

}
