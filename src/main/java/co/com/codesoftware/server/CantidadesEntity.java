
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import co.com.codesoftware.servicio.general.SedeEntity;


/**
 * <p>Clase Java para cantidadesEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cantidadesEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="existencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sede" type="{http://server.codesoftware.com.co/}sedeEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cantidadesEntity", propOrder = {
    "existencia",
    "id",
    "producto",
    "sede"
})
public class CantidadesEntity {

    protected Integer existencia;
    protected Integer id;
    protected Integer producto;
    protected SedeEntity sede;

    /**
     * Obtiene el valor de la propiedad existencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExistencia() {
        return existencia;
    }

    /**
     * Define el valor de la propiedad existencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExistencia(Integer value) {
        this.existencia = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProducto(Integer value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad sede.
     * 
     * @return
     *     possible object is
     *     {@link SedeEntity }
     *     
     */
    public SedeEntity getSede() {
        return sede;
    }

    /**
     * Define el valor de la propiedad sede.
     * 
     * @param value
     *     allowed object is
     *     {@link SedeEntity }
     *     
     */
    public void setSede(SedeEntity value) {
        this.sede = value;
    }

}
