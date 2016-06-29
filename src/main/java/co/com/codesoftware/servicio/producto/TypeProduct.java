
package co.com.codesoftware.servicio.producto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para typeProduct.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProduct">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRODUCTO"/>
 *     &lt;enumeration value="RECETA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeProduct")
@XmlEnum
public enum TypeProduct {

    PRODUCTO,
    RECETA;

    public String value() {
        return name();
    }

    public static TypeProduct fromValue(String v) {
        return valueOf(v);
    }

}
