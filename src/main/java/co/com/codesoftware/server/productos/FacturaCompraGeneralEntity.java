
package co.com.codesoftware.server.productos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para facturaCompraGeneralEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="facturaCompraGeneralEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="factura" type="{http://productos.server.codesoftware.com.co/}facturaCompraEntity" minOccurs="0"/>
 *         &lt;element name="imagenes" type="{http://productos.server.codesoftware.com.co/}imagenesFacCompraEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pagos" type="{http://productos.server.codesoftware.com.co/}pagoFacCompraEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productos" type="{http://productos.server.codesoftware.com.co/}productoFacCompraEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facturaCompraGeneralEntity", propOrder = {
    "factura",
    "imagenes",
    "pagos",
    "productos"
})
public class FacturaCompraGeneralEntity {

    protected FacturaCompraEntity factura;
    @XmlElement(nillable = true)
    protected List<ImagenesFacCompraEntity> imagenes;
    @XmlElement(nillable = true)
    protected List<PagoFacCompraEntity> pagos;
    @XmlElement(nillable = true)
    protected List<ProductoFacCompraEntity> productos;

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link FacturaCompraEntity }
     *     
     */
    public FacturaCompraEntity getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaCompraEntity }
     *     
     */
    public void setFactura(FacturaCompraEntity value) {
        this.factura = value;
    }

    /**
     * Gets the value of the imagenes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagenes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagenes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagenesFacCompraEntity }
     * 
     * 
     */
    public List<ImagenesFacCompraEntity> getImagenes() {
        if (imagenes == null) {
            imagenes = new ArrayList<ImagenesFacCompraEntity>();
        }
        return this.imagenes;
    }

    /**
     * Gets the value of the pagos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PagoFacCompraEntity }
     * 
     * 
     */
    public List<PagoFacCompraEntity> getPagos() {
        if (pagos == null) {
            pagos = new ArrayList<PagoFacCompraEntity>();
        }
        return this.pagos;
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
     * {@link ProductoFacCompraEntity }
     * 
     * 
     */
    public List<ProductoFacCompraEntity> getProductos() {
        if (productos == null) {
            productos = new ArrayList<ProductoFacCompraEntity>();
        }
        return this.productos;
    }

}
