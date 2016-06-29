
package co.com.codesoftware.servicio.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDepartamentosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDepartamentosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaDepartamentos" type="{http://general.servicio.codesoftware.com.co/}departamentoEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDepartamentosResponse", propOrder = {
    "listaDepartamentos"
})
public class ObtenerDepartamentosResponse {

    protected List<DepartamentoEntity> listaDepartamentos;

    /**
     * Gets the value of the listaDepartamentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaDepartamentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaDepartamentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepartamentoEntity }
     * 
     * 
     */
    public List<DepartamentoEntity> getListaDepartamentos() {
        if (listaDepartamentos == null) {
            listaDepartamentos = new ArrayList<DepartamentoEntity>();
        }
        return this.listaDepartamentos;
    }

}
