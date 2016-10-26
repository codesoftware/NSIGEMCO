
package co.com.codesoftware.servicio.facturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerFacturaXConsec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerFacturaXConsec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idResolucion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idConsec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerFacturaXConsec", propOrder = {
    "idResolucion",
    "idConsec"
})
public class ObtenerFacturaXConsec {

    protected int idResolucion;
    protected int idConsec;

    /**
     * Obtiene el valor de la propiedad idResolucion.
     * 
     */
    public int getIdResolucion() {
        return idResolucion;
    }

    /**
     * Define el valor de la propiedad idResolucion.
     * 
     */
    public void setIdResolucion(int value) {
        this.idResolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad idConsec.
     * 
     */
    public int getIdConsec() {
        return idConsec;
    }

    /**
     * Define el valor de la propiedad idConsec.
     * 
     */
    public void setIdConsec(int value) {
        this.idConsec = value;
    }

}
