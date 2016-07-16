
package co.com.codesoftware.servicio.conteos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerConteoEstadoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerConteoEstadoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConteosEntity" type="{http://conteos.servicio.codesoftware.com.co/}conteoEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerConteoEstadoResponse", propOrder = {
    "conteosEntity"
})
public class ObtenerConteoEstadoResponse {

    @XmlElement(name = "ConteosEntity")
    protected List<ConteoEntity> conteosEntity;

    /**
     * Gets the value of the conteosEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conteosEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConteosEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConteoEntity }
     * 
     * 
     */
    public List<ConteoEntity> getConteosEntity() {
        if (conteosEntity == null) {
            conteosEntity = new ArrayList<ConteoEntity>();
        }
        return this.conteosEntity;
    }

}
