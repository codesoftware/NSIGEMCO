
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productosParamEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productosParamEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="axiliar" type="{http://producto.servicio.codesoftware.com.co/}auxContableEntity" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idProducto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productosParamEntity", propOrder = {
    "axiliar",
    "descripcion",
    "descripcionProducto",
    "estado",
    "id",
    "idProducto"
})
public class ProductosParamEntity {

    protected AuxContableEntity axiliar;
    protected String descripcion;
    protected String descripcionProducto;
    protected String estado;
    protected Integer id;
    protected Integer idProducto;

    /**
     * Obtiene el valor de la propiedad axiliar.
     * 
     * @return
     *     possible object is
     *     {@link AuxContableEntity }
     *     
     */
    public AuxContableEntity getAxiliar() {
        return axiliar;
    }

    /**
     * Define el valor de la propiedad axiliar.
     * 
     * @param value
     *     allowed object is
     *     {@link AuxContableEntity }
     *     
     */
    public void setAxiliar(AuxContableEntity value) {
        this.axiliar = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * Define el valor de la propiedad descripcionProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionProducto(String value) {
        this.descripcionProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProducto(Integer value) {
        this.idProducto = value;
    }

}
