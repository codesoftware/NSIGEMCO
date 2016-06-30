
package co.com.codesoftware.servicio.importacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutaProcesoImportacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutaProcesoImportacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idtius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idImpo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutaProcesoImportacion", propOrder = {
    "idtius",
    "idImpo"
})
public class EjecutaProcesoImportacion {

    protected Integer idtius;
    protected Integer idImpo;

    /**
     * Obtiene el valor de la propiedad idtius.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdtius() {
        return idtius;
    }

    /**
     * Define el valor de la propiedad idtius.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdtius(Integer value) {
        this.idtius = value;
    }

    /**
     * Obtiene el valor de la propiedad idImpo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdImpo() {
        return idImpo;
    }

    /**
     * Define el valor de la propiedad idImpo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdImpo(Integer value) {
        this.idImpo = value;
    }

}
