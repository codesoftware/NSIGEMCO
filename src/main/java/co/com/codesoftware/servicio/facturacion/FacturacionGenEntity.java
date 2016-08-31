
package co.com.codesoftware.servicio.facturacion;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para facturacionGenEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="facturacionGenEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="domicilio" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idPedido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSede" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idTius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVoucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagoTarjeta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productos" type="{http://facturacion.servicio.codesoftware.com.co/}temporalProdTable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recetas" type="{http://facturacion.servicio.codesoftware.com.co/}temporalRecTable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reteFuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facturacionGenEntity", propOrder = {
    "descuento",
    "domicilio",
    "idCliente",
    "idPedido",
    "idSede",
    "idTius",
    "idVoucher",
    "pagoTarjeta",
    "productos",
    "recetas",
    "reteFuente",
    "tipoPago"
})
public class FacturacionGenEntity {

    protected BigDecimal descuento;
    protected boolean domicilio;
    protected Integer idCliente;
    protected Integer idPedido;
    protected Integer idSede;
    protected Integer idTius;
    protected String idVoucher;
    protected BigDecimal pagoTarjeta;
    @XmlElement(nillable = true)
    protected List<TemporalProdTable> productos;
    @XmlElement(nillable = true)
    protected List<TemporalRecTable> recetas;
    protected String reteFuente;
    protected String tipoPago;

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
     * Obtiene el valor de la propiedad domicilio.
     * 
     */
    public boolean isDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     */
    public void setDomicilio(boolean value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idPedido.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPedido() {
        return idPedido;
    }

    /**
     * Define el valor de la propiedad idPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPedido(Integer value) {
        this.idPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad idSede.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSede() {
        return idSede;
    }

    /**
     * Define el valor de la propiedad idSede.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSede(Integer value) {
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
     * Obtiene el valor de la propiedad idVoucher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVoucher() {
        return idVoucher;
    }

    /**
     * Define el valor de la propiedad idVoucher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdVoucher(String value) {
        this.idVoucher = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPagoTarjeta() {
        return pagoTarjeta;
    }

    /**
     * Define el valor de la propiedad pagoTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPagoTarjeta(BigDecimal value) {
        this.pagoTarjeta = value;
    }

    /**
     * Gets the value of the productos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemporalProdTable }
     * 
     * 
     */
    public List<TemporalProdTable> getProductos() {
        if (productos == null) {
            productos = new ArrayList<TemporalProdTable>();
        }
        return this.productos;
    }

    /**
     * Gets the value of the recetas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recetas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecetas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemporalRecTable }
     * 
     * 
     */
    public List<TemporalRecTable> getRecetas() {
        if (recetas == null) {
            recetas = new ArrayList<TemporalRecTable>();
        }
        return this.recetas;
    }

    /**
     * Obtiene el valor de la propiedad reteFuente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReteFuente() {
        return reteFuente;
    }

    /**
     * Define el valor de la propiedad reteFuente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReteFuente(String value) {
        this.reteFuente = value;
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

}
