
package co.com.codesoftware.servicio.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizaResolucion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizaResolucion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objEntity" type="{http://general.servicio.codesoftware.com.co/}resolucionFactEntity"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizaResolucion", propOrder = {
    "objEntity"
})
public class ActualizaResolucion {

    @XmlElement(required = true)
    protected ResolucionFactEntity objEntity;

    /**
     * Obtiene el valor de la propiedad objEntity.
     * 
     * @return
     *     possible object is
     *     {@link ResolucionFactEntity }
     *     
     */
    public ResolucionFactEntity getObjEntity() {
        return objEntity;
    }

    /**
     * Define el valor de la propiedad objEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolucionFactEntity }
     *     
     */
    public void setObjEntity(ResolucionFactEntity value) {
        this.objEntity = value;
    }

}
