
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerCantidadesXSede complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerCantidadesXSede">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sede_sede" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "obtenerCantidadesXSede", propOrder = {
    "sedeSede",
    "idDska"
})
public class ObtenerCantidadesXSede {

    @XmlElement(name = "sede_sede")
    protected int sedeSede;
    protected int idDska;

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
