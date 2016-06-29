
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para solicitudProdEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitudProdEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadEnvidada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cantidadSede" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cantidadSolicitada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://producto.servicio.codesoftware.com.co/}productoSimpleEntity" minOccurs="0"/>
 *         &lt;element name="sedeProducto" type="{http://producto.servicio.codesoftware.com.co/}sedeEntity" minOccurs="0"/>
 *         &lt;element name="solicitud" type="{http://producto.servicio.codesoftware.com.co/}solicitudEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudProdEntity", propOrder = {
    "cantidadEnvidada",
    "cantidadSede",
    "cantidadSolicitada",
    "id",
    "producto",
    "sedeProducto",
    "solicitud"
})
public class SolicitudProdEntity {

    protected Integer cantidadEnvidada;
    protected Integer cantidadSede;
    protected Integer cantidadSolicitada;
    protected Integer id;
    protected ProductoSimpleEntity producto;
    protected SedeEntity sedeProducto;
    protected SolicitudEntity solicitud;

    /**
     * Obtiene el valor de la propiedad cantidadEnvidada.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadEnvidada() {
        return cantidadEnvidada;
    }

    /**
     * Define el valor de la propiedad cantidadEnvidada.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadEnvidada(Integer value) {
        this.cantidadEnvidada = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadSede.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadSede() {
        return cantidadSede;
    }

    /**
     * Define el valor de la propiedad cantidadSede.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadSede(Integer value) {
        this.cantidadSede = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadSolicitada.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    /**
     * Define el valor de la propiedad cantidadSolicitada.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadSolicitada(Integer value) {
        this.cantidadSolicitada = value;
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
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link ProductoSimpleEntity }
     *     
     */
    public ProductoSimpleEntity getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoSimpleEntity }
     *     
     */
    public void setProducto(ProductoSimpleEntity value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad sedeProducto.
     * 
     * @return
     *     possible object is
     *     {@link SedeEntity }
     *     
     */
    public SedeEntity getSedeProducto() {
        return sedeProducto;
    }

    /**
     * Define el valor de la propiedad sedeProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link SedeEntity }
     *     
     */
    public void setSedeProducto(SedeEntity value) {
        this.sedeProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitud.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudEntity }
     *     
     */
    public SolicitudEntity getSolicitud() {
        return solicitud;
    }

    /**
     * Define el valor de la propiedad solicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudEntity }
     *     
     */
    public void setSolicitud(SolicitudEntity value) {
        this.solicitud = value;
    }

}
