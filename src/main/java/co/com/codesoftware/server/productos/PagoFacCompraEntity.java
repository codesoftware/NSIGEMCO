
package co.com.codesoftware.server.productos;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para pagoFacCompraEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pagoFacCompraEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diasPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idFacturaCompra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSubcuenta" type="{http://productos.server.codesoftware.com.co/}subCuentaEntity" minOccurs="0"/>
 *         &lt;element name="idVaucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagoFacCompraEntity", propOrder = {
    "diasPago",
    "estado",
    "fechaPago",
    "id",
    "idFacturaCompra",
    "idSubcuenta",
    "idVaucher",
    "tipoPago",
    "valor"
})
public class PagoFacCompraEntity {

    protected Integer diasPago;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPago;
    protected Integer id;
    protected Integer idFacturaCompra;
    protected SubCuentaEntity idSubcuenta;
    protected String idVaucher;
    protected String tipoPago;
    protected BigDecimal valor;

    /**
     * Obtiene el valor de la propiedad diasPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiasPago() {
        return diasPago;
    }

    /**
     * Define el valor de la propiedad diasPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiasPago(Integer value) {
        this.diasPago = value;
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
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPago(XMLGregorianCalendar value) {
        this.fechaPago = value;
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
     * Obtiene el valor de la propiedad idFacturaCompra.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFacturaCompra() {
        return idFacturaCompra;
    }

    /**
     * Define el valor de la propiedad idFacturaCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFacturaCompra(Integer value) {
        this.idFacturaCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad idSubcuenta.
     * 
     * @return
     *     possible object is
     *     {@link SubCuentaEntity }
     *     
     */
    public SubCuentaEntity getIdSubcuenta() {
        return idSubcuenta;
    }

    /**
     * Define el valor de la propiedad idSubcuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCuentaEntity }
     *     
     */
    public void setIdSubcuenta(SubCuentaEntity value) {
        this.idSubcuenta = value;
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

}
