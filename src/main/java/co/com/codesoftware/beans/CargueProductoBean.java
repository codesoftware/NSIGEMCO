package co.com.codesoftware.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import co.com.codesoftware.logica.CargueProductoLogica;
import co.com.codesoftware.server.nsigemco.ProductoTmpEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class CargueProductoBean implements Serializable, GeneralBean {
	private static final long serialVersionUID = 1L;
	private UploadedFile file;
	private ErrorEnum enumer;
	private List<ProductoTmpEntity> listaProductos;
	private List<ProductoTmpEntity> listaProductosFiltered;
	private UsuarioEntity objetoSesion;
	private List<String> codigosRepetidos;

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("dataSession");
	}
	// metodos del programador

	/**
	 * metodo que verifica si el excel cargo correctamente
	 */
	public void validaCargueExcel(FileUploadEvent event) {
		RespuestaEntity respuesta = new RespuestaEntity();
		try {
			CargueProductoLogica logica = new CargueProductoLogica();
			// logica.guardarArchivo(event.getFile().getFileName(),
			// event.getFile().getInputstream());

			respuesta = logica.cargaExcel(file, event);
			listaProductos = logica.consultaProductosTemporal();
			this.codigosRepetidos = null;
			this.setEnumer(ErrorEnum.WARNING);
			this.messageBean(respuesta.getMensajeRespuesta());

		} catch (Exception e) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("Error al cargar el archivo " + event.getFile().getFileName());
			e.printStackTrace();
		}

	}

	/**
	 * Funcion con la cual cargo un excel de solo productos
	 * 
	 * @param event
	 */
	public void cargueExcelSoloProd(FileUploadEvent event) {
		RespuestaEntity respuesta = new RespuestaEntity();
		try {
			CargueProductoLogica logica = new CargueProductoLogica();
			respuesta = logica.cargaExcelProducto(file, event, this.objetoSesion.getId());
			if("Ok".equalsIgnoreCase(respuesta.getMensajeRespuesta())){
				listaProductos = logica.consultaProductosTemporal();
			}else{
				this.messageBean(respuesta.getMensajeRespuesta().toUpperCase()+ ". Por favor revisar la linea indicada" , ErrorEnum.ERROR);
			}
		} catch (Exception e) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("Error al cargar el archivo " + event.getFile().getFileName());
			e.printStackTrace();
		}

	}

	/**
	 * Funcion con la cual consulto la lista de productos temporales
	 */
	public void consultaProductosTemporal() {
		try {
			CargueProductoLogica logica = new CargueProductoLogica();
			listaProductos = logica.consultaProductosTemporal();
			if (this.listaProductos == null || this.listaProductos.size() == 0) {
				this.messageBean("La consulta no arrojo ningun resultado", ErrorEnum.SUCCESS);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual consulto los codigos repetidos dentro del excel
	 */
	public void consultaRepetidosExcel() {
		CargueProductoLogica objLogica = new CargueProductoLogica();
		try {
			this.codigosRepetidos = objLogica.buscaRepetidosExcel();
			if (this.codigosRepetidos == null || this.codigosRepetidos.size() == 0) {
				this.messageBean("En el excel cargado no hay codigos repetidos", ErrorEnum.ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual consulto los codigos repetidos en el sistema y en el
	 * excel cargado
	 */
	public void consultaRepetidosSistemaExcel() {
		CargueProductoLogica objLogica = new CargueProductoLogica();
		try {
			this.codigosRepetidos = objLogica.buscaRepetidosExcelSistema();
			if (this.codigosRepetidos == null || this.codigosRepetidos.size() == 0) {
				this.messageBean("En el excel cargado no hay codigos repetidos", ErrorEnum.ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo que inserta la parametrizacion del excel
	 */
	public void insertaParametrizacion() {
		CargueProductoLogica logica = new CargueProductoLogica();
		try {
			RespuestaEntity entity = logica.insertaParametros();
			if (entity.getCodigoRespuesta() == 0) {
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("CARGUE REALIZADO CORRECTAMENTE");
				this.listaProductos = new ArrayList<>();
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(entity.getDescripcionRespuesta());
			}

		} catch (Exception e) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual registro los productos del excel cargado previamente
	 */
	public void registroProductos() {
		try {
			CargueProductoLogica objLogica = new CargueProductoLogica();
			String valida = objLogica.enviaRegistroProductos();
			if ("Ok".equalsIgnoreCase(valida)) {
				messageBean("Ok", ErrorEnum.SUCCESS);
			} else {
				messageBean("Error al registrar los productos " + valida, ErrorEnum.ERROR);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual borro los datos de la temporal
	 */
	public void borrarTemporal() {
		try {
			CargueProductoLogica objLogica = new CargueProductoLogica();
			String valida = objLogica.borrarTemporalProducto();
			if ("Ok".equalsIgnoreCase(valida)) {
				this.messageBean("Datos Borrados de la tabla temporal", ErrorEnum.SUCCESS);
			} else {
				this.messageBean("Error al borrar los datos: " + valida, ErrorEnum.ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
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

	// accesor y mutators
	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public List<ProductoTmpEntity> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<ProductoTmpEntity> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public List<String> getCodigosRepetidos() {
		return codigosRepetidos;
	}

	public void setCodigosRepetidos(List<String> codigosRepetidos) {
		this.codigosRepetidos = codigosRepetidos;
	}

	public List<ProductoTmpEntity> getListaProductosFiltered() {
		return listaProductosFiltered;
	}

	public void setListaProductosFiltered(List<ProductoTmpEntity> listaProductosFiltered) {
		this.listaProductosFiltered = listaProductosFiltered;
	}

}
