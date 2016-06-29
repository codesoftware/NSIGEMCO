
package co.com.codesoftware.server.nsigemco;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertaFacturaCompra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertaFacturaCompra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="factura" type="{http://nsigemco.server.codesoftware.com.co/}facturaCompraEntity" minOccurs="0"/>
 *         &lt;element name="pagoFactura" type="{http://nsigemco.server.codesoftware.com.co/}pagoFacCompraEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productosFactura" type="{http://nsigemco.server.codesoftware.com.co/}productoFacCompraEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertaFacturaCompra", propOrder = {
    "factura",
    "pagoFactura",
    "productosFactura"
})
public class InsertaFacturaCompra {

    protected FacturaCompraEntity factura;
    protected List<PagoFacCompraEntity> pagoFactura;
    protected List<ProductoFacCompraEntity> productosFactura;

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
     * Gets the value of the pagoFactura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagoFactura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagoFactura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PagoFacCompraEntity }
     * 
     * 
     */
    public List<PagoFacCompraEntity> getPagoFactura() {
        if (pagoFactura == null) {
            pagoFactura = new ArrayList<PagoFacCompraEntity>();
        }
        return this.pagoFactura;
    }

    /**
     * Gets the value of the productosFactura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productosFactura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductosFactura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductoFacCompraEntity }
     * 
     * 
     */
    public List<ProductoFacCompraEntity> getProductosFactura() {
        if (productosFactura == null) {
            productosFactura = new ArrayList<ProductoFacCompraEntity>();
        }
        return this.productosFactura;
    }

}
