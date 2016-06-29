
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaCantidadesXSedeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaCantidadesXSedeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CantidadesEntity" type="{http://server.codesoftware.com.co/}cantidadesEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaCantidadesXSedeResponse", propOrder = {
    "cantidadesEntity"
})
public class ConsultaCantidadesXSedeResponse {

    @XmlElement(name = "CantidadesEntity")
    protected CantidadesEntity cantidadesEntity;

    /**
     * Obtiene el valor de la propiedad cantidadesEntity.
     * 
     * @return
     *     possible object is
     *     {@link CantidadesEntity }
     *     
     */
    public CantidadesEntity getCantidadesEntity() {
        return cantidadesEntity;
    }

    /**
     * Define el valor de la propiedad cantidadesEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link CantidadesEntity }
     *     
     */
    public void setCantidadesEntity(CantidadesEntity value) {
        this.cantidadesEntity = value;
    }

}
