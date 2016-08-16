
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para generaProcesoAporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generaProcesoAporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAporte" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAuxCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idTius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generaProcesoAporte", propOrder = {
    "idAporte",
    "idAuxCon",
    "idTius"
})
public class GeneraProcesoAporte {

    protected Integer idAporte;
    protected Integer idAuxCon;
    protected Integer idTius;

    /**
     * Obtiene el valor de la propiedad idAporte.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAporte() {
        return idAporte;
    }

    /**
     * Define el valor de la propiedad idAporte.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAporte(Integer value) {
        this.idAporte = value;
    }

    /**
     * Obtiene el valor de la propiedad idAuxCon.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAuxCon() {
        return idAuxCon;
    }

    /**
     * Define el valor de la propiedad idAuxCon.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAuxCon(Integer value) {
        this.idAuxCon = value;
    }

    /**
     * Obtiene el valor de la propiedad idTius.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTius() {
        return idTius;
    }

    /**
     * Define el valor de la propiedad idTius.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTius(Integer value) {
        this.idTius = value;
    }

}
