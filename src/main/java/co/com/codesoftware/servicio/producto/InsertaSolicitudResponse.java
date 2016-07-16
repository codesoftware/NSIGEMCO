
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertaSolicitudResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertaSolicitudResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespuestaEntity" type="{http://producto.servicio.codesoftware.com.co/}respuestaEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertaSolicitudResponse", propOrder = {
    "respuestaEntity"
})
public class InsertaSolicitudResponse {

    @XmlElement(name = "RespuestaEntity")
    protected RespuestaEntity respuestaEntity;

    /**
     * Obtiene el valor de la propiedad respuestaEntity.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaEntity }
     *     
     */
    public RespuestaEntity getRespuestaEntity() {
        return respuestaEntity;
    }

    /**
     * Define el valor de la propiedad respuestaEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaEntity }
     *     
     */
    public void setRespuestaEntity(RespuestaEntity value) {
        this.respuestaEntity = value;
    }

}
