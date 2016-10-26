
package co.com.codesoftware.servicio.facturacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarProdFacturasCompraTmp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarProdFacturasCompraTmp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaProductos" type="{http://facturacion.servicio.codesoftware.com.co/}prodFacCompraTmpEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idFactCompraTmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarProdFacturasCompraTmp", propOrder = {
    "listaProductos",
    "idFactCompraTmp"
})
public class InsertarProdFacturasCompraTmp {

    protected List<ProdFacCompraTmpEntity> listaProductos;
    protected Integer idFactCompraTmp;

    /**
     * Gets the value of the listaProductos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaProductos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaProductos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdFacCompraTmpEntity }
     * 
     * 
     */
    public List<ProdFacCompraTmpEntity> getListaProductos() {
        if (listaProductos == null) {
            listaProductos = new ArrayList<ProdFacCompraTmpEntity>();
        }
        return this.listaProductos;
    }

    /**
     * Obtiene el valor de la propiedad idFactCompraTmp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFactCompraTmp() {
        return idFactCompraTmp;
    }

    /**
     * Define el valor de la propiedad idFactCompraTmp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFactCompraTmp(Integer value) {
        this.idFactCompraTmp = value;
    }

}
