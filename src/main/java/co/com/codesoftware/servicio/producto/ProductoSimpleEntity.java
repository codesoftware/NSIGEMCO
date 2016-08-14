
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para productoSimpleEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productoSimpleEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="categoriaObj" type="{http://producto.servicio.codesoftware.com.co/}categoriaEntity" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="iniciaConteo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ivaPorc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="marcaObj" type="{http://producto.servicio.codesoftware.com.co/}marcaEntity" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="referenciaObj" type="{http://producto.servicio.codesoftware.com.co/}referenciaEntity" minOccurs="0"/>
 *         &lt;element name="subcuenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ubicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productoSimpleEntity", propOrder = {
    "categoria",
    "categoriaObj",
    "codigo",
    "codigoBarras",
    "codigoExt",
    "descripcion",
    "estado",
    "fecha",
    "id",
    "iniciaConteo",
    "iva",
    "ivaPorc",
    "marca",
    "marcaObj",
    "nombre",
    "referencia",
    "referenciaObj",
    "subcuenta",
    "ubicacion"
})
public class ProductoSimpleEntity {

    protected Integer categoria;
    protected CategoriaEntity categoriaObj;
    protected String codigo;
    protected String codigoBarras;
    protected String codigoExt;
    protected String descripcion;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Integer id;
    protected String iniciaConteo;
    protected String iva;
    protected Integer ivaPorc;
    protected Integer marca;
    protected MarcaEntity marcaObj;
    protected String nombre;
    protected Integer referencia;
    protected ReferenciaEntity referenciaObj;
    protected Integer subcuenta;
    protected String ubicacion;

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoria(Integer value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaObj.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaEntity }
     *     
     */
    public CategoriaEntity getCategoriaObj() {
        return categoriaObj;
    }

    /**
     * Define el valor de la propiedad categoriaObj.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaEntity }
     *     
     */
    public void setCategoriaObj(CategoriaEntity value) {
        this.categoriaObj = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBarras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * Define el valor de la propiedad codigoBarras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBarras(String value) {
        this.codigoBarras = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoExt() {
        return codigoExt;
    }

    /**
     * Define el valor de la propiedad codigoExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoExt(String value) {
        this.codigoExt = value;
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
     * Obtiene el valor de la propiedad iniciaConteo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIniciaConteo() {
        return iniciaConteo;
    }

    /**
     * Define el valor de la propiedad iniciaConteo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIniciaConteo(String value) {
        this.iniciaConteo = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIva() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIva(String value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad ivaPorc.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIvaPorc() {
        return ivaPorc;
    }

    /**
     * Define el valor de la propiedad ivaPorc.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIvaPorc(Integer value) {
        this.ivaPorc = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarca(Integer value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaObj.
     * 
     * @return
     *     possible object is
     *     {@link MarcaEntity }
     *     
     */
    public MarcaEntity getMarcaObj() {
        return marcaObj;
    }

    /**
     * Define el valor de la propiedad marcaObj.
     * 
     * @param value
     *     allowed object is
     *     {@link MarcaEntity }
     *     
     */
    public void setMarcaObj(MarcaEntity value) {
        this.marcaObj = value;
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
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferencia(Integer value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaObj.
     * 
     * @return
     *     possible object is
     *     {@link ReferenciaEntity }
     *     
     */
    public ReferenciaEntity getReferenciaObj() {
        return referenciaObj;
    }

    /**
     * Define el valor de la propiedad referenciaObj.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenciaEntity }
     *     
     */
    public void setReferenciaObj(ReferenciaEntity value) {
        this.referenciaObj = value;
    }

    /**
     * Obtiene el valor de la propiedad subcuenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubcuenta() {
        return subcuenta;
    }

    /**
     * Define el valor de la propiedad subcuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubcuenta(Integer value) {
        this.subcuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

}
