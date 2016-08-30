
package co.com.codesoftware.server.nsigemco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarAportes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarAportes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aporte" type="{http://nsigemco.server.codesoftware.com.co/}aporteSocioEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarAportes", propOrder = {
    "aporte"
})
public class ActualizarAportes {

    @XmlElement(name = "Aporte")
    protected AporteSocioEntity aporte;

    /**
     * Obtiene el valor de la propiedad aporte.
     * 
     * @return
     *     possible object is
     *     {@link AporteSocioEntity }
     *     
     */
    public AporteSocioEntity getAporte() {
        return aporte;
    }

    /**
     * Define el valor de la propiedad aporte.
     * 
     * @param value
     *     allowed object is
     *     {@link AporteSocioEntity }
     *     
     */
    public void setAporte(AporteSocioEntity value) {
        this.aporte = value;
    }

}
