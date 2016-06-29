
package co.com.codesoftware.servicio.facturacion;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para moviContableEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="moviContableEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idLlave" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMovimiento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturaleza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subcuenta" type="{http://facturacion.servicio.codesoftware.com.co/}subCuentaEntity" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://facturacion.servicio.codesoftware.com.co/}tipoDocumentoEntity" minOccurs="0"/>
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
@XmlType(name = "moviContableEntity", propOrder = {
    "id",
    "idLlave",
    "idMovimiento",
    "llave",
    "naturaleza",
    "subcuenta",
    "tipoDocumento",
    "valor"
})
public class MoviContableEntity {

    protected Integer id;
    protected Integer idLlave;
    protected Integer idMovimiento;
    protected String llave;
    protected String naturaleza;
    protected SubCuentaEntity subcuenta;
    protected TipoDocumentoEntity tipoDocumento;
    protected BigDecimal valor;

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
     * Obtiene el valor de la propiedad idLlave.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdLlave() {
        return idLlave;
    }

    /**
     * Define el valor de la propiedad idLlave.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdLlave(Integer value) {
        this.idLlave = value;
    }

    /**
     * Obtiene el valor de la propiedad idMovimiento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    /**
     * Define el valor de la propiedad idMovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMovimiento(Integer value) {
        this.idMovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad llave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlave() {
        return llave;
    }

    /**
     * Define el valor de la propiedad llave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlave(String value) {
        this.llave = value;
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
     * Obtiene el valor de la propiedad subcuenta.
     * 
     * @return
     *     possible object is
     *     {@link SubCuentaEntity }
     *     
     */
    public SubCuentaEntity getSubcuenta() {
        return subcuenta;
    }

    /**
     * Define el valor de la propiedad subcuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCuentaEntity }
     *     
     */
    public void setSubcuenta(SubCuentaEntity value) {
        this.subcuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoEntity }
     *     
     */
    public TipoDocumentoEntity getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoEntity }
     *     
     */
    public void setTipoDocumento(TipoDocumentoEntity value) {
        this.tipoDocumento = value;
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
