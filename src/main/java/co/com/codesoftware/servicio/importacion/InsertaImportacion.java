
package co.com.codesoftware.servicio.importacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertaImportacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertaImportacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importEntity" type="{http://importacion.servicio.codesoftware.com.co/}importacionEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertaImportacion", propOrder = {
    "importEntity"
})
public class InsertaImportacion {

    protected ImportacionEntity importEntity;

    /**
     * Obtiene el valor de la propiedad importEntity.
     * 
     * @return
     *     possible object is
     *     {@link ImportacionEntity }
     *     
     */
    public ImportacionEntity getImportEntity() {
        return importEntity;
    }

    /**
     * Define el valor de la propiedad importEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportacionEntity }
     *     
     */
    public void setImportEntity(ImportacionEntity value) {
        this.importEntity = value;
    }

}
