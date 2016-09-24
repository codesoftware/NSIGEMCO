
package co.com.codesoftware.servicio.contabilidad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerMoviContCuentaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerMoviContCuentaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaMovimientos" type="{http://contabilidad.servicio.codesoftware.com.co/}moviContableEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerMoviContCuentaResponse", propOrder = {
    "listaMovimientos"
})
public class ObtenerMoviContCuentaResponse {

    protected List<MoviContableEntity> listaMovimientos;

    /**
     * Gets the value of the listaMovimientos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaMovimientos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaMovimientos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoviContableEntity }
     * 
     * 
     */
    public List<MoviContableEntity> getListaMovimientos() {
        if (listaMovimientos == null) {
            listaMovimientos = new ArrayList<MoviContableEntity>();
        }
        return this.listaMovimientos;
    }

}
