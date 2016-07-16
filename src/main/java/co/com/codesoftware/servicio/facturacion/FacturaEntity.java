
package co.com.codesoftware.servicio.facturacion;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para facturaEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="facturaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://facturacion.servicio.codesoftware.com.co/}clienteEntity" minOccurs="0"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consecutivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="detalleProductos" type="{http://facturacion.servicio.codesoftware.com.co/}detProduFacturaEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detalleRecetas" type="{http://facturacion.servicio.codesoftware.com.co/}detReceFacturaEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="devolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="efectivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaExacta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idCierre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSede" type="{http://facturacion.servicio.codesoftware.com.co/}sedeEntity" minOccurs="0"/>
 *         &lt;element name="idTius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVaucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturaleza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="original" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resolucion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tarjeta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tipoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorCobrar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrIva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vlrReteFu" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facturaEntity", propOrder = {
    "cliente",
    "comentarios",
    "consecutivo",
    "descuento",
    "detalleProductos",
    "detalleRecetas",
    "devolucion",
    "efectivo",
    "estado",
    "fecha",
    "fechaExacta",
    "id",
    "idCierre",
    "idSede",
    "idTius",
    "idVaucher",
    "naturaleza",
    "original",
    "resolucion",
    "tarjeta",
    "tipoPago",
    "valor",
    "valorCobrar",
    "vlrIva",
    "vlrReteFu"
})
public class FacturaEntity {

    protected ClienteEntity cliente;
    protected String comentarios;
    protected Integer consecutivo;
    protected BigDecimal descuento;
    @XmlElement(nillable = true)
    protected List<DetProduFacturaEntity> detalleProductos;
    @XmlElement(nillable = true)
    protected List<DetReceFacturaEntity> detalleRecetas;
    protected String devolucion;
    protected BigDecimal efectivo;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaExacta;
    protected Integer id;
    protected Integer idCierre;
    protected SedeEntity idSede;
    protected Integer idTius;
    protected String idVaucher;
    protected String naturaleza;
    protected Integer original;
    protected Integer resolucion;
    protected BigDecimal tarjeta;
    protected String tipoPago;
    protected BigDecimal valor;
    protected BigDecimal valorCobrar;
    protected BigDecimal vlrIva;
    protected BigDecimal vlrReteFu;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link ClienteEntity }
     *     
     */
    public ClienteEntity getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteEntity }
     *     
     */
    public void setCliente(ClienteEntity value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad comentarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Define el valor de la propiedad comentarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarios(String value) {
        this.comentarios = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsecutivo() {
        return consecutivo;
    }

    /**
     * Define el valor de la propiedad consecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsecutivo(Integer value) {
        this.consecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescuento(BigDecimal value) {
        this.descuento = value;
    }

    /**
     * Gets the value of the detalleProductos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleProductos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleProductos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetProduFacturaEntity }
     * 
     * 
     */
    public List<DetProduFacturaEntity> getDetalleProductos() {
        if (detalleProductos == null) {
            detalleProductos = new ArrayList<DetProduFacturaEntity>();
        }
        return this.detalleProductos;
    }

    /**
     * Gets the value of the detalleRecetas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleRecetas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleRecetas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetReceFacturaEntity }
     * 
     * 
     */
    public List<DetReceFacturaEntity> getDetalleRecetas() {
        if (detalleRecetas == null) {
            detalleRecetas = new ArrayList<DetReceFacturaEntity>();
        }
        return this.detalleRecetas;
    }

    /**
     * Obtiene el valor de la propiedad devolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevolucion() {
        return devolucion;
    }

    /**
     * Define el valor de la propiedad devolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevolucion(String value) {
        this.devolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad efectivo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEfectivo() {
        return efectivo;
    }

    /**
     * Define el valor de la propiedad efectivo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEfectivo(BigDecimal value) {
        this.efectivo = value;
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
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExacta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaExacta() {
        return fechaExacta;
    }

    /**
     * Define el valor de la propiedad fechaExacta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaExacta(XMLGregorianCalendar value) {
        this.fechaExacta = value;
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
     * Obtiene el valor de la propiedad idCierre.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCierre() {
        return idCierre;
    }

    /**
     * Define el valor de la propiedad idCierre.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCierre(Integer value) {
        this.idCierre = value;
    }

    /**
     * Obtiene el valor de la propiedad idSede.
     * 
     * @return
     *     possible object is
     *     {@link SedeEntity }
     *     
     */
    public SedeEntity getIdSede() {
        return idSede;
    }

    /**
     * Define el valor de la propiedad idSede.
     * 
     * @param value
     *     allowed object is
     *     {@link SedeEntity }
     *     
     */
    public void setIdSede(SedeEntity value) {
        this.idSede = value;
    }

    /**
     * Obtiene el valor de la propiedad idTius.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTius() {
        return idTius;
    }

    /**
     * Define el valor de la propiedad idTius.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTius(Integer value) {
        this.idTius = value;
    }

    /**
     * Obtiene el valor de la propiedad idVaucher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVaucher() {
        return idVaucher;
    }

    /**
     * Define el valor de la propiedad idVaucher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdVaucher(String value) {
        this.idVaucher = value;
    }

    /**
     * Obtiene el valor de la propiedad naturaleza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturaleza() {
        return naturaleza;
    }

    /**
     * Define el valor de la propiedad naturaleza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturaleza(String value) {
        this.naturaleza = value;
    }

    /**
     * Obtiene el valor de la propiedad original.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginal() {
        return original;
    }

    /**
     * Define el valor de la propiedad original.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginal(Integer value) {
        this.original = value;
    }

    /**
     * Obtiene el valor de la propiedad resolucion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResolucion() {
        return resolucion;
    }

    /**
     * Define el valor de la propiedad resolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResolucion(Integer value) {
        this.resolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjeta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarjeta() {
        return tarjeta;
    }

    /**
     * Define el valor de la propiedad tarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarjeta(BigDecimal value) {
        this.tarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * Define el valor de la propiedad tipoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPago(String value) {
        this.tipoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

    /**
     * Obtiene el valor de la propiedad valorCobrar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCobrar() {
        return valorCobrar;
    }

    /**
     * Define el valor de la propiedad valorCobrar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCobrar(BigDecimal value) {
        this.valorCobrar = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrIva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrIva() {
        return vlrIva;
    }

    /**
     * Define el valor de la propiedad vlrIva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrIva(BigDecimal value) {
        this.vlrIva = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrReteFu.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrReteFu() {
        return vlrReteFu;
    }

    /**
     * Define el valor de la propiedad vlrReteFu.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrReteFu(BigDecimal value) {
        this.vlrReteFu = value;
    }

}
