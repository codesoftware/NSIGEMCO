
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerPromedioPonderadoProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerPromedioPonderadoProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDska" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerPromedioPonderadoProducto", propOrder = {
    "idDska"
})
public class ObtenerPromedioPonderadoProducto {

    protected int idDska;

    /**
     * Obtiene el valor de la propiedad idDska.
     * 
     */
    public int getIdDska() {
        return idDska;
    }

    /**
     * Define el valor de la propiedad idDska.
     * 
     */
    public void setIdDska(int value) {
        this.idDska = value;
    }

}
