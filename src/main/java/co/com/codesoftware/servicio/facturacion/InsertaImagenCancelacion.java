
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertaImagenCancelacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertaImagenCancelacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatosCancelacion" type="{http://facturacion.servicio.codesoftware.com.co/}cancelaFacturaWrapRequest" minOccurs="0"/>
 *         &lt;element name="DatosImagen" type="{http://facturacion.servicio.codesoftware.com.co/}imagenFacturaEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertaImagenCancelacion", propOrder = {
    "datosCancelacion",
    "datosImagen"
})
public class InsertaImagenCancelacion {

    @XmlElement(name = "DatosCancelacion")
    protected CancelaFacturaWrapRequest datosCancelacion;
    @XmlElement(name = "DatosImagen")
    protected ImagenFacturaEntity datosImagen;

    /**
     * Obtiene el valor de la propiedad datosCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link CancelaFacturaWrapRequest }
     *     
     */
    public CancelaFacturaWrapRequest getDatosCancelacion() {
        return datosCancelacion;
    }

    /**
     * Define el valor de la propiedad datosCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelaFacturaWrapRequest }
     *     
     */
    public void setDatosCancelacion(CancelaFacturaWrapRequest value) {
        this.datosCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datosImagen.
     * 
     * @return
     *     possible object is
     *     {@link ImagenFacturaEntity }
     *     
     */
    public ImagenFacturaEntity getDatosImagen() {
        return datosImagen;
    }

    /**
     * Define el valor de la propiedad datosImagen.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagenFacturaEntity }
     *     
     */
    public void setDatosImagen(ImagenFacturaEntity value) {
        this.datosImagen = value;
    }

}
