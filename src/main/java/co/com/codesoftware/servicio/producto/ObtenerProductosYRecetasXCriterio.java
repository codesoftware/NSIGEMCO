
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProductosYRecetasXCriterio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProductosYRecetasXCriterio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sede_sede" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="criterio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProductosYRecetasXCriterio", propOrder = {
    "sedeSede",
    "criterio"
})
public class ObtenerProductosYRecetasXCriterio {

    @XmlElement(name = "sede_sede")
    protected int sedeSede;
    @XmlElement(required = true)
    protected String criterio;

    /**
     * Obtiene el valor de la propiedad sedeSede.
     * 
     */
    public int getSedeSede() {
        return sedeSede;
    }

    /**
     * Define el valor de la propiedad sedeSede.
     * 
     */
    public void setSedeSede(int value) {
        this.sedeSede = value;
    }

    /**
     * Obtiene el valor de la propiedad criterio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterio() {
        return criterio;
    }

    /**
     * Define el valor de la propiedad criterio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterio(String value) {
        this.criterio = value;
    }

}
