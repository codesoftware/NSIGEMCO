
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para facturarAvanzadaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="facturarAvanzadaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respuestaFacturacion" type="{http://facturacion.servicio.codesoftware.com.co/}respuestaFacturacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facturarAvanzadaResponse", propOrder = {
    "respuestaFacturacion"
})
public class FacturarAvanzadaResponse {

    protected RespuestaFacturacion respuestaFacturacion;

    /**
     * Obtiene el valor de la propiedad respuestaFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaFacturacion }
     *     
     */
    public RespuestaFacturacion getRespuestaFacturacion() {
        return respuestaFacturacion;
    }

    /**
     * Define el valor de la propiedad respuestaFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaFacturacion }
     *     
     */
    public void setRespuestaFacturacion(RespuestaFacturacion value) {
        this.respuestaFacturacion = value;
    }

}
