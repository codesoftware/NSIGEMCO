
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validaUsuarioFacturador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validaUsuarioFacturador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tius_tius" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaUsuarioFacturador", propOrder = {
    "tiusTius"
})
public class ValidaUsuarioFacturador {

    @XmlElement(name = "tius_tius")
    protected long tiusTius;

    /**
     * Obtiene el valor de la propiedad tiusTius.
     * 
     */
    public long getTiusTius() {
        return tiusTius;
    }

    /**
     * Define el valor de la propiedad tiusTius.
     * 
     */
    public void setTiusTius(long value) {
        this.tiusTius = value;
    }

}
