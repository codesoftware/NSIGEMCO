
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaProductoCodigoExternoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaProductoCodigoExternoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrecioProductoEntity" type="{http://server.codesoftware.com.co/}precioProductoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaProductoCodigoExternoResponse", propOrder = {
    "precioProductoEntity"
})
public class ConsultaProductoCodigoExternoResponse {

    @XmlElement(name = "PrecioProductoEntity")
    protected PrecioProductoEntity precioProductoEntity;

    /**
     * Obtiene el valor de la propiedad precioProductoEntity.
     * 
     * @return
     *     possible object is
     *     {@link PrecioProductoEntity }
     *     
     */
    public PrecioProductoEntity getPrecioProductoEntity() {
        return precioProductoEntity;
    }

    /**
     * Define el valor de la propiedad precioProductoEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecioProductoEntity }
     *     
     */
    public void setPrecioProductoEntity(PrecioProductoEntity value) {
        this.precioProductoEntity = value;
    }

}
