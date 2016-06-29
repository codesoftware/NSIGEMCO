
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerImagenXIdFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerImagenXIdFactura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fact_fact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerImagenXIdFactura", propOrder = {
    "factFact"
})
public class ObtenerImagenXIdFactura {

    @XmlElement(name = "fact_fact", required = true)
    protected String factFact;

    /**
     * Obtiene el valor de la propiedad factFact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactFact() {
        return factFact;
    }

    /**
     * Define el valor de la propiedad factFact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactFact(String value) {
        this.factFact = value;
    }

}
