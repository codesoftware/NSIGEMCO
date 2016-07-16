
package co.com.codesoftware.server.productos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaHistProdXSedeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaHistProdXSedeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaPrecios" type="{http://productos.server.codesoftware.com.co/}precioProdSimpleEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaHistProdXSedeResponse", propOrder = {
    "listaPrecios"
})
public class BuscaHistProdXSedeResponse {

    protected List<PrecioProdSimpleEntity> listaPrecios;

    /**
     * Gets the value of the listaPrecios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPrecios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPrecios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecioProdSimpleEntity }
     * 
     * 
     */
    public List<PrecioProdSimpleEntity> getListaPrecios() {
        if (listaPrecios == null) {
            listaPrecios = new ArrayList<PrecioProdSimpleEntity>();
        }
        return this.listaPrecios;
    }

}
