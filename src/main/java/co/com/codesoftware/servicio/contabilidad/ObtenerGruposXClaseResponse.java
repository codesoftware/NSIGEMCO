
package co.com.codesoftware.servicio.contabilidad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerGruposXClaseResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerGruposXClaseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaGrupos" type="{http://contabilidad.servicio.codesoftware.com.co/}grupoEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerGruposXClaseResponse", propOrder = {
    "listaGrupos"
})
public class ObtenerGruposXClaseResponse {

    protected List<GrupoEntity> listaGrupos;

    /**
     * Gets the value of the listaGrupos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaGrupos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaGrupos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrupoEntity }
     * 
     * 
     */
    public List<GrupoEntity> getListaGrupos() {
        if (listaGrupos == null) {
            listaGrupos = new ArrayList<GrupoEntity>();
        }
        return this.listaGrupos;
    }

}
