
package co.com.codesoftware.server.productos;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para kardexProductoEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="kardexProductoEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantMvto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cantidadTot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="costoMvtoTot" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="costoMvtoUni" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="costoSaldoTot" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="costoSaldoUni" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idConsProd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idProv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="movInv" type="{http://productos.server.codesoftware.com.co/}movimientoInventarioEntity" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://productos.server.codesoftware.com.co/}productoSimpleEntity" minOccurs="0"/>
 *         &lt;element name="sede" type="{http://productos.server.codesoftware.com.co/}sedeEntity" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://productos.server.codesoftware.com.co/}usuarioEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kardexProductoEntity", propOrder = {
    "cantMvto",
    "cantidadTot",
    "costoMvtoTot",
    "costoMvtoUni",
    "costoSaldoTot",
    "costoSaldoUni",
    "fecha",
    "id",
    "idConsProd",
    "idProv",
    "movInv",
    "producto",
    "sede",
    "usuario"
})
public class KardexProductoEntity {

    protected Integer cantMvto;
    protected Integer cantidadTot;
    protected BigDecimal costoMvtoTot;
    protected BigDecimal costoMvtoUni;
    protected BigDecimal costoSaldoTot;
    protected BigDecimal costoSaldoUni;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Integer id;
    protected Integer idConsProd;
    protected Integer idProv;
    protected MovimientoInventarioEntity movInv;
    protected ProductoSimpleEntity producto;
    protected SedeEntity sede;
    protected UsuarioEntity usuario;

    /**
     * Obtiene el valor de la propiedad cantMvto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantMvto() {
        return cantMvto;
    }

    /**
     * Define el valor de la propiedad cantMvto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantMvto(Integer value) {
        this.cantMvto = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadTot.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadTot() {
        return cantidadTot;
    }

    /**
     * Define el valor de la propiedad cantidadTot.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadTot(Integer value) {
        this.cantidadTot = value;
    }

    /**
     * Obtiene el valor de la propiedad costoMvtoTot.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostoMvtoTot() {
        return costoMvtoTot;
    }

    /**
     * Define el valor de la propiedad costoMvtoTot.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostoMvtoTot(BigDecimal value) {
        this.costoMvtoTot = value;
    }

    /**
     * Obtiene el valor de la propiedad costoMvtoUni.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostoMvtoUni() {
        return costoMvtoUni;
    }

    /**
     * Define el valor de la propiedad costoMvtoUni.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostoMvtoUni(BigDecimal value) {
        this.costoMvtoUni = value;
    }

    /**
     * Obtiene el valor de la propiedad costoSaldoTot.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostoSaldoTot() {
        return costoSaldoTot;
    }

    /**
     * Define el valor de la propiedad costoSaldoTot.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostoSaldoTot(BigDecimal value) {
        this.costoSaldoTot = value;
    }

    /**
     * Obtiene el valor de la propiedad costoSaldoUni.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostoSaldoUni() {
        return costoSaldoUni;
    }

    /**
     * Define el valor de la propiedad costoSaldoUni.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostoSaldoUni(BigDecimal value) {
        this.costoSaldoUni = value;
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
     * Obtiene el valor de la propiedad idConsProd.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdConsProd() {
        return idConsProd;
    }

    /**
     * Define el valor de la propiedad idConsProd.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdConsProd(Integer value) {
        this.idConsProd = value;
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
     * Obtiene el valor de la propiedad movInv.
     * 
     * @return
     *     possible object is
     *     {@link MovimientoInventarioEntity }
     *     
     */
    public MovimientoInventarioEntity getMovInv() {
        return movInv;
    }

    /**
     * Define el valor de la propiedad movInv.
     * 
     * @param value
     *     allowed object is
     *     {@link MovimientoInventarioEntity }
     *     
     */
    public void setMovInv(MovimientoInventarioEntity value) {
        this.movInv = value;
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

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioEntity }
     *     
     */
    public UsuarioEntity getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioEntity }
     *     
     */
    public void setUsuario(UsuarioEntity value) {
        this.usuario = value;
    }

}
