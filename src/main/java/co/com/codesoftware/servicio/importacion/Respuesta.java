
package co.com.codesoftware.servicio.importacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="provInter" type="{http://importacion.servicio.codesoftware.com.co/}proveedorInterEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuesta", propOrder = {
    "provInter"
})
public class Respuesta {

    protected ProveedorInterEntity provInter;

    /**
     * Obtiene el valor de la propiedad provInter.
     * 
     * @return
     *     possible object is
     *     {@link ProveedorInterEntity }
     *     
     */
    public ProveedorInterEntity getProvInter() {
        return provInter;
    }

    /**
     * Define el valor de la propiedad provInter.
     * 
     * @param value
     *     allowed object is
     *     {@link ProveedorInterEntity }
     *     
     */
    public void setProvInter(ProveedorInterEntity value) {
        this.provInter = value;
    }

}
