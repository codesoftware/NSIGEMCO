
package co.com.codesoftware.servicio.contabilidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerAuxContableXIdResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerAuxContableXIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auxiliarContable" type="{http://contabilidad.servicio.codesoftware.com.co/}auxContableEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerAuxContableXIdResponse", propOrder = {
    "auxiliarContable"
})
public class ObtenerAuxContableXIdResponse {

    protected AuxContableEntity auxiliarContable;

    /**
     * Obtiene el valor de la propiedad auxiliarContable.
     * 
     * @return
     *     possible object is
     *     {@link AuxContableEntity }
     *     
     */
    public AuxContableEntity getAuxiliarContable() {
        return auxiliarContable;
    }

    /**
     * Define el valor de la propiedad auxiliarContable.
     * 
     * @param value
     *     allowed object is
     *     {@link AuxContableEntity }
     *     
     */
    public void setAuxiliarContable(AuxContableEntity value) {
        this.auxiliarContable = value;
    }

}
