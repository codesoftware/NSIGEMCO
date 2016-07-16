
package co.com.codesoftware.server.productos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaProductoXId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaProductoXId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dska_dska" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaProductoXId", propOrder = {
    "dskaDska"
})
public class ConsultaProductoXId {

    @XmlElement(name = "dska_dska")
    protected Integer dskaDska;

    /**
     * Obtiene el valor de la propiedad dskaDska.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDskaDska() {
        return dskaDska;
    }

    /**
     * Define el valor de la propiedad dskaDska.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDskaDska(Integer value) {
        this.dskaDska = value;
    }

}
