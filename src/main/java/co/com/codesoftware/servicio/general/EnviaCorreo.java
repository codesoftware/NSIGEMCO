
package co.com.codesoftware.servicio.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enviaCorreo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="enviaCorreo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mensajeCorreo" type="{http://general.servicio.codesoftware.com.co/}correoWrapperRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enviaCorreo", propOrder = {
    "mensajeCorreo"
})
public class EnviaCorreo {

    protected CorreoWrapperRequest mensajeCorreo;

    /**
     * Obtiene el valor de la propiedad mensajeCorreo.
     * 
     * @return
     *     possible object is
     *     {@link CorreoWrapperRequest }
     *     
     */
    public CorreoWrapperRequest getMensajeCorreo() {
        return mensajeCorreo;
    }

    /**
     * Define el valor de la propiedad mensajeCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link CorreoWrapperRequest }
     *     
     */
    public void setMensajeCorreo(CorreoWrapperRequest value) {
        this.mensajeCorreo = value;
    }

}
