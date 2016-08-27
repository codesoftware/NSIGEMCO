
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerCantidadesTotalesXSede complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerCantidadesTotalesXSede">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSede" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCantidadesTotalesXSede", propOrder = {
    "idSede"
})
public class ObtenerCantidadesTotalesXSede {

    protected int idSede;

    /**
     * Obtiene el valor de la propiedad idSede.
     * 
     */
    public int getIdSede() {
        return idSede;
    }

    /**
     * Define el valor de la propiedad idSede.
     * 
     */
    public void setIdSede(int value) {
        this.idSede = value;
    }

}
