
package co.com.codesoftware.servicio.producto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerProductosXSolicitudResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerProductosXSolicitudResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaProductos" type="{http://producto.servicio.codesoftware.com.co/}solicitudProdEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerProductosXSolicitudResponse", propOrder = {
    "listaProductos"
})
public class ObtenerProductosXSolicitudResponse {

    protected List<SolicitudProdEntity> listaProductos;

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
     * {@link SolicitudProdEntity }
     * 
     * 
     */
    public List<SolicitudProdEntity> getListaProductos() {
        if (listaProductos == null) {
            listaProductos = new ArrayList<SolicitudProdEntity>();
        }
        return this.listaProductos;
    }

}
