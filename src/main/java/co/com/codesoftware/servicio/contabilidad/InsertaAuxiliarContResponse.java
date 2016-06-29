
package co.com.codesoftware.servicio.contabilidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertaAuxiliarContResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertaAuxiliarContResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertaAuxiliarContResponse", propOrder = {
    "rta"
})
public class InsertaAuxiliarContResponse {

    protected String rta;

    /**
     * Obtiene el valor de la propiedad rta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRta() {
        return rta;
    }

    /**
     * Define el valor de la propiedad rta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRta(String value) {
        this.rta = value;
    }

}
