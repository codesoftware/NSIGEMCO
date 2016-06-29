
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validaUsuarioFacturadorResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validaUsuarioFacturadorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valida" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaUsuarioFacturadorResponse", propOrder = {
    "valida"
})
public class ValidaUsuarioFacturadorResponse {

    protected boolean valida;

    /**
     * Obtiene el valor de la propiedad valida.
     * 
     */
    public boolean isValida() {
        return valida;
    }

    /**
     * Define el valor de la propiedad valida.
     * 
     */
    public void setValida(boolean value) {
        this.valida = value;
    }

}
