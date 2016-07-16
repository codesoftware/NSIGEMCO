
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerRecetaXCodigoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerRecetaXCodigoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recetaEntity" type="{http://producto.servicio.codesoftware.com.co/}precioRecetaEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerRecetaXCodigoResponse", propOrder = {
    "recetaEntity"
})
public class ObtenerRecetaXCodigoResponse {

    protected PrecioRecetaEntity recetaEntity;

    /**
     * Obtiene el valor de la propiedad recetaEntity.
     * 
     * @return
     *     possible object is
     *     {@link PrecioRecetaEntity }
     *     
     */
    public PrecioRecetaEntity getRecetaEntity() {
        return recetaEntity;
    }

    /**
     * Define el valor de la propiedad recetaEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecioRecetaEntity }
     *     
     */
    public void setRecetaEntity(PrecioRecetaEntity value) {
        this.recetaEntity = value;
    }

}
