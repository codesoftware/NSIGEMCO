
package co.com.codesoftware.servicio.contabilidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerAsientoContable complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerAsientoContable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTransCont" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerAsientoContable", propOrder = {
    "idTransCont"
})
public class ObtenerAsientoContable {

    protected int idTransCont;

    /**
     * Obtiene el valor de la propiedad idTransCont.
     * 
     */
    public int getIdTransCont() {
        return idTransCont;
    }

    /**
     * Define el valor de la propiedad idTransCont.
     * 
     */
    public void setIdTransCont(int value) {
        this.idTransCont = value;
    }

}
