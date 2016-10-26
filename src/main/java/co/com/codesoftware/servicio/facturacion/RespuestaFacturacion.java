
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaFacturacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaFacturacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trazaExcepcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaFacturacion", propOrder = {
    "idFacturacion",
    "respuesta",
    "trazaExcepcion"
})
public class RespuestaFacturacion {

    protected String idFacturacion;
    protected String respuesta;
    protected String trazaExcepcion;

    /**
     * Obtiene el valor de la propiedad idFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFacturacion() {
        return idFacturacion;
    }

    /**
     * Define el valor de la propiedad idFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFacturacion(String value) {
        this.idFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad trazaExcepcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrazaExcepcion() {
        return trazaExcepcion;
    }

    /**
     * Define el valor de la propiedad trazaExcepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrazaExcepcion(String value) {
        this.trazaExcepcion = value;
    }

}
