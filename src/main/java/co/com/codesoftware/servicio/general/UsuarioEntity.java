
package co.com.codesoftware.servicio.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para usuarioEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarioEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cambioContra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha_registro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordFuturo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfil" type="{http://general.servicio.codesoftware.com.co/}perfilEntity" minOccurs="0"/>
 *         &lt;element name="persona" type="{http://general.servicio.codesoftware.com.co/}personaEntity" minOccurs="0"/>
 *         &lt;element name="sede" type="{http://general.servicio.codesoftware.com.co/}sedeEntity" minOccurs="0"/>
 *         &lt;element name="ultimo_ingresa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarioEntity", propOrder = {
    "cambioContra",
    "estado",
    "fechaRegistro",
    "id",
    "password",
    "passwordFuturo",
    "perfil",
    "persona",
    "sede",
    "ultimoIngresa",
    "usuario"
})
public class UsuarioEntity {

    protected String cambioContra;
    protected String estado;
    @XmlElement(name = "fecha_registro")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    protected Integer id;
    protected String password;
    protected String passwordFuturo;
    protected PerfilEntity perfil;
    protected PersonaEntity persona;
    protected SedeEntity sede;
    @XmlElement(name = "ultimo_ingresa")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ultimoIngresa;
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad cambioContra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCambioContra() {
        return cambioContra;
    }

    /**
     * Define el valor de la propiedad cambioContra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCambioContra(String value) {
        this.cambioContra = value;
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
     * Obtiene el valor de la propiedad fechaRegistro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Define el valor de la propiedad fechaRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
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
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad passwordFuturo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordFuturo() {
        return passwordFuturo;
    }

    /**
     * Define el valor de la propiedad passwordFuturo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordFuturo(String value) {
        this.passwordFuturo = value;
    }

    /**
     * Obtiene el valor de la propiedad perfil.
     * 
     * @return
     *     possible object is
     *     {@link PerfilEntity }
     *     
     */
    public PerfilEntity getPerfil() {
        return perfil;
    }

    /**
     * Define el valor de la propiedad perfil.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilEntity }
     *     
     */
    public void setPerfil(PerfilEntity value) {
        this.perfil = value;
    }

    /**
     * Obtiene el valor de la propiedad persona.
     * 
     * @return
     *     possible object is
     *     {@link PersonaEntity }
     *     
     */
    public PersonaEntity getPersona() {
        return persona;
    }

    /**
     * Define el valor de la propiedad persona.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaEntity }
     *     
     */
    public void setPersona(PersonaEntity value) {
        this.persona = value;
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
     * Obtiene el valor de la propiedad ultimoIngresa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUltimoIngresa() {
        return ultimoIngresa;
    }

    /**
     * Define el valor de la propiedad ultimoIngresa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUltimoIngresa(XMLGregorianCalendar value) {
        this.ultimoIngresa = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
