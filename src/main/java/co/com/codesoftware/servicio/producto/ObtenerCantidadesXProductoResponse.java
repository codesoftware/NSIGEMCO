
package co.com.codesoftware.servicio.producto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerCantidadesXProductoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerCantidadesXProductoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExistenciaXSedeEntity" type="{http://producto.servicio.codesoftware.com.co/}existenciaXSedeEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCantidadesXProductoResponse", propOrder = {
    "existenciaXSedeEntity"
})
public class ObtenerCantidadesXProductoResponse {

    @XmlElement(name = "ExistenciaXSedeEntity")
    protected List<ExistenciaXSedeEntity> existenciaXSedeEntity;

    /**
     * Gets the value of the existenciaXSedeEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the existenciaXSedeEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExistenciaXSedeEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExistenciaXSedeEntity }
     * 
     * 
     */
    public List<ExistenciaXSedeEntity> getExistenciaXSedeEntity() {
        if (existenciaXSedeEntity == null) {
            existenciaXSedeEntity = new ArrayList<ExistenciaXSedeEntity>();
        }
        return this.existenciaXSedeEntity;
    }

}
