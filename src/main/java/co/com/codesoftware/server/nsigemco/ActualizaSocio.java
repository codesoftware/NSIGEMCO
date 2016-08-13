
package co.com.codesoftware.server.nsigemco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizaSocio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizaSocio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="socio" type="{http://nsigemco.server.codesoftware.com.co/}socioEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizaSocio", propOrder = {
    "socio"
})
public class ActualizaSocio {

    protected SocioEntity socio;

    /**
     * Obtiene el valor de la propiedad socio.
     * 
     * @return
     *     possible object is
     *     {@link SocioEntity }
     *     
     */
    public SocioEntity getSocio() {
        return socio;
    }

    /**
     * Define el valor de la propiedad socio.
     * 
     * @param value
     *     allowed object is
     *     {@link SocioEntity }
     *     
     */
    public void setSocio(SocioEntity value) {
        this.socio = value;
    }

}
