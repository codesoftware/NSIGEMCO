
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para existenciaXSedeEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="existenciaXSedeEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="existencias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idDska" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sede" type="{http://producto.servicio.codesoftware.com.co/}sedeEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existenciaXSedeEntity", propOrder = {
    "codigoExterno",
    "descripcionProducto",
    "existencias",
    "id",
    "idDska",
    "sede"
})
public class ExistenciaXSedeEntity {

    protected String codigoExterno;
    protected String descripcionProducto;
    protected Integer existencias;
    protected Integer id;
    protected Integer idDska;
    protected SedeEntity sede;

    /**
     * Obtiene el valor de la propiedad codigoExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoExterno() {
        return codigoExterno;
    }

    /**
     * Define el valor de la propiedad codigoExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoExterno(String value) {
        this.codigoExterno = value;
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
     * Obtiene el valor de la propiedad existencias.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExistencias() {
        return existencias;
    }

    /**
     * Define el valor de la propiedad existencias.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExistencias(Integer value) {
        this.existencias = value;
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
     * Obtiene el valor de la propiedad idDska.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDska() {
        return idDska;
    }

    /**
     * Define el valor de la propiedad idDska.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDska(Integer value) {
        this.idDska = value;
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
