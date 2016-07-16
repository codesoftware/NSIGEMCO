
package co.com.codesoftware.servicio.importacion;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para importacionEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="importacionEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCrea" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaLleg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idProv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idTranCont" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idtius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tazaPromedio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="trm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrImpuestos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importacionEntity", propOrder = {
    "estado",
    "fechaCrea",
    "fechaLleg",
    "id",
    "idProv",
    "idTranCont",
    "idtius",
    "nombre",
    "tazaPromedio",
    "trm",
    "vlrImpuestos",
    "vlrTotal"
})
public class ImportacionEntity {

    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCrea;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaLleg;
    protected Integer id;
    protected Integer idProv;
    protected Integer idTranCont;
    protected Integer idtius;
    protected String nombre;
    protected BigDecimal tazaPromedio;
    protected BigDecimal trm;
    protected BigDecimal vlrImpuestos;
    protected BigDecimal vlrTotal;

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
     * Obtiene el valor de la propiedad fechaCrea.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCrea() {
        return fechaCrea;
    }

    /**
     * Define el valor de la propiedad fechaCrea.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCrea(XMLGregorianCalendar value) {
        this.fechaCrea = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaLleg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaLleg() {
        return fechaLleg;
    }

    /**
     * Define el valor de la propiedad fechaLleg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaLleg(XMLGregorianCalendar value) {
        this.fechaLleg = value;
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
     * Obtiene el valor de la propiedad idProv.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProv() {
        return idProv;
    }

    /**
     * Define el valor de la propiedad idProv.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProv(Integer value) {
        this.idProv = value;
    }

    /**
     * Obtiene el valor de la propiedad idTranCont.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTranCont() {
        return idTranCont;
    }

    /**
     * Define el valor de la propiedad idTranCont.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTranCont(Integer value) {
        this.idTranCont = value;
    }

    /**
     * Obtiene el valor de la propiedad idtius.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdtius() {
        return idtius;
    }

    /**
     * Define el valor de la propiedad idtius.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdtius(Integer value) {
        this.idtius = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tazaPromedio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTazaPromedio() {
        return tazaPromedio;
    }

    /**
     * Define el valor de la propiedad tazaPromedio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTazaPromedio(BigDecimal value) {
        this.tazaPromedio = value;
    }

    /**
     * Obtiene el valor de la propiedad trm.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrm() {
        return trm;
    }

    /**
     * Define el valor de la propiedad trm.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrm(BigDecimal value) {
        this.trm = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrImpuestos() {
        return vlrImpuestos;
    }

    /**
     * Define el valor de la propiedad vlrImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrImpuestos(BigDecimal value) {
        this.vlrImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrTotal() {
        return vlrTotal;
    }

    /**
     * Define el valor de la propiedad vlrTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrTotal(BigDecimal value) {
        this.vlrTotal = value;
    }

}
