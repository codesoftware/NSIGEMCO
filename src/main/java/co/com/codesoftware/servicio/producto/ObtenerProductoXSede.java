
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProductoXSede complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProductoXSede">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sede_sede" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProductoXSede", propOrder = {
    "sedeSede"
})
public class ObtenerProductoXSede {

    @XmlElement(name = "sede_sede")
    protected int sedeSede;

    /**
     * Obtiene el valor de la propiedad sedeSede.
     * 
     */
    public int getSedeSede() {
        return sedeSede;
    }

    /**
     * Define el valor de la propiedad sedeSede.
     * 
     */
    public void setSedeSede(int value) {
        this.sedeSede = value;
    }

}
