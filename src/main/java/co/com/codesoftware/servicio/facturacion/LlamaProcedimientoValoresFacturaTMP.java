
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para llamaProcedimientoValoresFacturaTMP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="llamaProcedimientoValoresFacturaTMP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFacturaCompra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "llamaProcedimientoValoresFacturaTMP", propOrder = {
    "idFacturaCompra"
})
public class LlamaProcedimientoValoresFacturaTMP {

    protected Integer idFacturaCompra;

    /**
     * Obtiene el valor de la propiedad idFacturaCompra.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFacturaCompra() {
        return idFacturaCompra;
    }

    /**
     * Define el valor de la propiedad idFacturaCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFacturaCompra(Integer value) {
        this.idFacturaCompra = value;
    }

}
