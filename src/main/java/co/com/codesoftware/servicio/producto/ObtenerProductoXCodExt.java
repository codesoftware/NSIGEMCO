
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProductoXCodExt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProductoXCodExt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sede_sede" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProductoXCodExt", propOrder = {
    "codExt",
    "sedeSede"
})
public class ObtenerProductoXCodExt {

    protected String codExt;
    @XmlElement(name = "sede_sede")
    protected Integer sedeSede;

    /**
     * Obtiene el valor de la propiedad codExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodExt() {
        return codExt;
    }

    /**
     * Define el valor de la propiedad codExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodExt(String value) {
        this.codExt = value;
    }

    /**
     * Obtiene el valor de la propiedad sedeSede.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSedeSede() {
        return sedeSede;
    }

    /**
     * Define el valor de la propiedad sedeSede.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSedeSede(Integer value) {
        this.sedeSede = value;
    }

}
