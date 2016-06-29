
package co.com.codesoftware.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getRecetaForcodeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getRecetaForcodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecetaTable" type="{http://server.codesoftware.com.co/}recetaTable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecetaForcodeResponse", propOrder = {
    "recetaTable"
})
public class GetRecetaForcodeResponse {

    @XmlElement(name = "RecetaTable")
    protected RecetaTable recetaTable;

    /**
     * Obtiene el valor de la propiedad recetaTable.
     * 
     * @return
     *     possible object is
     *     {@link RecetaTable }
     *     
     */
    public RecetaTable getRecetaTable() {
        return recetaTable;
    }

    /**
     * Define el valor de la propiedad recetaTable.
     * 
     * @param value
     *     allowed object is
     *     {@link RecetaTable }
     *     
     */
    public void setRecetaTable(RecetaTable value) {
        this.recetaTable = value;
    }

}
