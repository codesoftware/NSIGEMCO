
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para generaCodigoPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generaCodigoPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedi_pedi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generaCodigoPedido", propOrder = {
    "pediPedi"
})
public class GeneraCodigoPedido {

    @XmlElement(name = "pedi_pedi")
    protected int pediPedi;

    /**
     * Obtiene el valor de la propiedad pediPedi.
     * 
     */
    public int getPediPedi() {
        return pediPedi;
    }

    /**
     * Define el valor de la propiedad pediPedi.
     * 
     */
    public void setPediPedi(int value) {
        this.pediPedi = value;
    }

}
