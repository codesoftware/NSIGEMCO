
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getRecetaForcode complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getRecetaForcode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rece_codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rece_sede" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecetaForcode", propOrder = {
    "receCodigo",
    "receSede"
})
public class GetRecetaForcode {

    @XmlElement(name = "rece_codigo", required = true)
    protected String receCodigo;
    @XmlElement(name = "rece_sede")
    protected int receSede;

    /**
     * Obtiene el valor de la propiedad receCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceCodigo() {
        return receCodigo;
    }

    /**
     * Define el valor de la propiedad receCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceCodigo(String value) {
        this.receCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad receSede.
     * 
     */
    public int getReceSede() {
        return receSede;
    }

    /**
     * Define el valor de la propiedad receSede.
     * 
     */
    public void setReceSede(int value) {
        this.receSede = value;
    }

}
