
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaPedidoXIdResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaPedidoXIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespuestaPedidoEntity" type="{http://server.codesoftware.com.co/}respuestaPedidoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaPedidoXIdResponse", propOrder = {
    "respuestaPedidoEntity"
})
public class ConsultaPedidoXIdResponse {

    @XmlElement(name = "RespuestaPedidoEntity")
    protected RespuestaPedidoEntity respuestaPedidoEntity;

    /**
     * Obtiene el valor de la propiedad respuestaPedidoEntity.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaPedidoEntity }
     *     
     */
    public RespuestaPedidoEntity getRespuestaPedidoEntity() {
        return respuestaPedidoEntity;
    }

    /**
     * Define el valor de la propiedad respuestaPedidoEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaPedidoEntity }
     *     
     */
    public void setRespuestaPedidoEntity(RespuestaPedidoEntity value) {
        this.respuestaPedidoEntity = value;
    }

}
