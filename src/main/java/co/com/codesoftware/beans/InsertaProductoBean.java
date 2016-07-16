package co.com.codesoftware.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.entity.ProducImpEntity;
import co.com.codesoftware.logica.ProductosLogica;
import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.server.nsigemco.MarcaEntity;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.utilities.ErrorEnum;

@ManagedBean
@ViewScoped
public class InsertaProductoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private ProveedoresEntity proveedor;
	private CategoriaEntity categoria;
	private ReferenciaEntity referencia;
	private String codigoExterno;
	private String ubicacion;
	private String codigoBarras;
	private MarcaEntity marca;
	private ErrorEnum enumer;
	private String nombreProducto;

	/**
	 * Funcion que inserta un producto a la base de datos
	 */
	public void insertaProducto() {
		ProductosLogica logica = new ProductosLogica();
		RespuestaEntity respuesta = logica.insertaProducto(marca, nombreProducto, referencia, categoria, codigoExterno,
				ubicacion,codigoBarras);
		if (respuesta == null) {
			this.setEnumer(ErrorEnum.FATAL);
			this.messageBean("Error de conexion con el WebService");
		} else {
			if (respuesta.getCodigoRespuesta() == 0) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(respuesta.getDescripcionRespuesta());
			} else {
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("REGISTRO INSERTADO CORRECTAMENTE");
				this.marca = new MarcaEntity();
				this.categoria = new CategoriaEntity();
				this.referencia = new ReferenciaEntity();
				this.nombreProducto = new String();
				this.ubicacion = new String();
				this.codigoExterno = new String();
				this.codigoBarras = new String();
			}
		}
	}

	/**
	 * Metodo generico para mostrar mensajes de error o advertencia
	 * 
	 * @param message
	 */

	public void messageBean(String message) {
		switch (this.enumer) {
		case ERROR:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", message));
			break;
		case FATAL:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "Error de sistema"));
			break;
		case SUCCESS:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Ok!", message));
			break;

		default:
			break;
		}
	}
	
	/**
	 * Funcion con la cual seteo el codigo externo del producto
	 * @param codExterno
	 */
	public void insertaCodigoExterno(ProducImpEntity objEntity){
		try {
			this.codigoExterno = objEntity.getCodigoExterno();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Accessor y mutators
	public ProveedoresEntity getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedoresEntity proveedor) {
		this.proveedor = proveedor;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public CategoriaEntity getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}

	public MarcaEntity getMarca() {
		return marca;
	}

	public void setMarca(MarcaEntity marca) {
		this.marca = marca;
	}

	public ReferenciaEntity getReferencia() {
		return referencia;
	}

	public void setReferencia(ReferenciaEntity referencia) {
		this.referencia = referencia;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

}
