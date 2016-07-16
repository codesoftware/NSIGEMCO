
package co.com.codesoftware.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaPedidoEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaPedidoEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://server.codesoftware.com.co/}cliente" minOccurs="0"/>
 *         &lt;element name="listaProductos" type="{http://server.codesoftware.com.co/}productoGenEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="respuesta" type="{http://server.codesoftware.com.co/}respuestaEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaPedidoEntity", propOrder = {
    "cliente",
    "listaProductos",
    "respuesta"
})
public class RespuestaPedidoEntity {

    protected Cliente cliente;
    @XmlElement(nillable = true)
    protected List<ProductoGenEntity> listaProductos;
    protected RespuestaEntity respuesta;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

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
     * {@link ProductoGenEntity }
     * 
     * 
     */
    public List<ProductoGenEntity> getListaProductos() {
        if (listaProductos == null) {
            listaProductos = new ArrayList<ProductoGenEntity>();
        }
        return this.listaProductos;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaEntity }
     *     
     */
    public RespuestaEntity getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaEntity }
     *     
     */
    public void setRespuesta(RespuestaEntity value) {
        this.respuesta = value;
    }

}
