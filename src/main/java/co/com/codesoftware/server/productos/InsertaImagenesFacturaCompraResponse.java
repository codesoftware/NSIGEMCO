
package co.com.codesoftware.server.productos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertaImagenesFacturaCompraResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertaImagenesFacturaCompraResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultEntity" type="{http://productos.server.codesoftware.com.co/}respuestaEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertaImagenesFacturaCompraResponse", propOrder = {
    "resultEntity"
})
public class InsertaImagenesFacturaCompraResponse {

    @XmlElement(name = "ResultEntity")
    protected RespuestaEntity resultEntity;

    /**
     * Obtiene el valor de la propiedad resultEntity.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaEntity }
     *     
     */
    public RespuestaEntity getResultEntity() {
        return resultEntity;
    }

    /**
     * Define el valor de la propiedad resultEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaEntity }
     *     
     */
    public void setResultEntity(RespuestaEntity value) {
        this.resultEntity = value;
    }

}
