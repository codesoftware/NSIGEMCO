
package co.com.codesoftware.servicio.importacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertaGastoImportacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertaGastoImportacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gasto" type="{http://importacion.servicio.codesoftware.com.co/}gastoImpoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertaGastoImportacion", propOrder = {
    "gasto"
})
public class InsertaGastoImportacion {

    protected GastoImpoEntity gasto;

    /**
     * Obtiene el valor de la propiedad gasto.
     * 
     * @return
     *     possible object is
     *     {@link GastoImpoEntity }
     *     
     */
    public GastoImpoEntity getGasto() {
        return gasto;
    }

    /**
     * Define el valor de la propiedad gasto.
     * 
     * @param value
     *     allowed object is
     *     {@link GastoImpoEntity }
     *     
     */
    public void setGasto(GastoImpoEntity value) {
        this.gasto = value;
    }

}
