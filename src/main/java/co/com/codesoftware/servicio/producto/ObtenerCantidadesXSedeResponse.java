
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerCantidadesXSedeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerCantidadesXSedeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExistenciaXSedeEntity" type="{http://producto.servicio.codesoftware.com.co/}existenciaXSedeEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCantidadesXSedeResponse", propOrder = {
    "existenciaXSedeEntity"
})
public class ObtenerCantidadesXSedeResponse {

    @XmlElement(name = "ExistenciaXSedeEntity")
    protected ExistenciaXSedeEntity existenciaXSedeEntity;

    /**
     * Obtiene el valor de la propiedad existenciaXSedeEntity.
     * 
     * @return
     *     possible object is
     *     {@link ExistenciaXSedeEntity }
     *     
     */
    public ExistenciaXSedeEntity getExistenciaXSedeEntity() {
        return existenciaXSedeEntity;
    }

    /**
     * Define el valor de la propiedad existenciaXSedeEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistenciaXSedeEntity }
     *     
     */
    public void setExistenciaXSedeEntity(ExistenciaXSedeEntity value) {
        this.existenciaXSedeEntity = value;
    }

}
