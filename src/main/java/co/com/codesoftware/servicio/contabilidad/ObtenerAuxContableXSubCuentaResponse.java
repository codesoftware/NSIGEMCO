
package co.com.codesoftware.servicio.contabilidad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerAuxContableXSubCuentaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerAuxContableXSubCuentaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaAuxConta" type="{http://contabilidad.servicio.codesoftware.com.co/}auxContableEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerAuxContableXSubCuentaResponse", propOrder = {
    "listaAuxConta"
})
public class ObtenerAuxContableXSubCuentaResponse {

    protected List<AuxContableEntity> listaAuxConta;

    /**
     * Gets the value of the listaAuxConta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaAuxConta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaAuxConta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxContableEntity }
     * 
     * 
     */
    public List<AuxContableEntity> getListaAuxConta() {
        if (listaAuxConta == null) {
            listaAuxConta = new ArrayList<AuxContableEntity>();
        }
        return this.listaAuxConta;
    }

}
