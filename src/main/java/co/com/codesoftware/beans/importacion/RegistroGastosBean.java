package co.com.codesoftware.beans.importacion;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.xml.datatype.XMLGregorianCalendar;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.admin.ContabilidadLogic;
import co.com.codesoftware.logica.importacion.ImportacionLogica;
import co.com.codesoftware.servicio.contabilidad.AuxContableEntity;
import co.com.codesoftware.servicio.importacion.DetalleGastoEntity;
import co.com.codesoftware.servicio.importacion.GastoImpoEntity;
import co.com.codesoftware.servicio.importacion.ImportacionEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;
import co.com.codesoftware.utilities.Utilitites;

@ManagedBean
@ViewScoped
public class RegistroGastosBean implements Serializable, GeneralBean {

	private static final long serialVersionUID = 1L;
	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ImportacionEntity importacion;
	private List<GastoImpoEntity> listaGastos;
	// Valores del Gasto
	private Date fechaGasto;
	private String descripGasto;
	private BigDecimal valorGasto;
	private AuxContableEntity auxContable;
	// Valores del Detalle del Gasto
	private Date detFechaGasto;
	private String detDescripGasto;
	private BigDecimal detValorGasto;
	private AuxContableEntity detAuxContable;
	private GastoImpoEntity gastoSelected;
	private List<DetalleGastoEntity> listaDetalleGasto;

	/**
	 * Funcion con la cual registro un gasto
	 */
	public void insertarGasto() {
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			if (this.descripGasto == null || "".equalsIgnoreCase(this.descripGasto)) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("El campo descripcion no puede ser vacio");
			} else if (this.fechaGasto == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("La fecha en la cual realizo el gasto no puede ser nula");
			} else if (this.valorGasto == null || this.valorGasto.compareTo(new BigDecimal(0)) <= 0) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("El valor del gasto debe ser mayor a cero");
			} else if (this.auxContable == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("El campo auxiliar contable no puede ser vacio ");
			} else {
				GastoImpoEntity objEntity = new GastoImpoEntity();
				objEntity.setDescrip(descripGasto);
				XMLGregorianCalendar fecha = Utilitites.dateToXMLGC(fechaGasto);
				objEntity.setFecha(fecha);
				objEntity.setIdImpo(this.importacion.getId());
				objEntity.setIdTius(objetoSesion.getId());
				objEntity.setValorGasto(valorGasto);
				String valida = objLogica.insertaGastoImportacion(objEntity);
				if (valida.toUpperCase().contains("OK")) {
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean(valida);
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('dialogInsGasto').hide();");
					this.listaGastos = objLogica.obtenerGastosImportacion(this.importacion.getId());
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean(valida);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual selecciono un gasto para insertar un detalle
	 * 
	 * @param obj
	 */
	public void visualizaInsertDetalle(GastoImpoEntity obj) {
		this.gastoSelected = obj;
	}

	/**
	 * Funcion con la cual inserto un detalle al gasto
	 * 
	 * @param objEntity
	 */
	public void insertarDetalleGasto() {
		ImportacionLogica objLogica = new ImportacionLogica();
		if (this.detDescripGasto == null || "".equalsIgnoreCase(this.detDescripGasto)) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("El campo descripcion no puede ser vacio");
		} else if (this.detFechaGasto == null) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("La fecha en la cual realizo el gasto no puede ser nula");
		} else if (this.detValorGasto == null || this.detValorGasto.compareTo(new BigDecimal(0)) <= 0) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("El valor del gasto debe ser mayor a cero");
		} else if (this.detAuxContable == null) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("El campo auxiliar contable no puede ser vacio ");
		} else {
			DetalleGastoEntity objEntity = new DetalleGastoEntity();
			objEntity.setDescr(this.detDescripGasto);
			XMLGregorianCalendar fecha = Utilitites.dateToXMLGC(detFechaGasto);
			objEntity.setFechaRegi(fecha);
			objEntity.setIdGasto(this.gastoSelected.getId());
			objEntity.setIdTius(objetoSesion.getId());
			objEntity.setValor(detValorGasto);
			
			co.com.codesoftware.servicio.importacion.AuxContableEntity aux = objEntity.getIdAuxconta();
			if(aux == null){
				aux = new co.com.codesoftware.servicio.importacion.AuxContableEntity();
				aux.setId(this.detAuxContable.getId());
			}
			objEntity.setIdAuxconta(aux);
			String valida = objLogica.insertaDetalleGasto(objEntity);
			if (valida.toUpperCase().contains("OK")) {
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean(valida);
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('dialogInsDetGasto').hide();");
				this.listaGastos = objLogica.obtenerGastosImportacion(this.importacion.getId());
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean(valida);
			}
		}

	}

	/**
	 * Funcion con la cual realizo el autocomplete de los auxiliares contables
	 * 
	 * @return
	 */
	public List<AuxContableEntity> completaAuxContable(String query) {
		List<AuxContableEntity> rta = null;
		try {
			ContabilidadLogic objLogic = new ContabilidadLogic();
			rta = objLogic.obtenerAuxiliarContXCriterio(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual obtengo el detalle de un gasto
	 * 
	 * @param idGasto
	 */
	public void buscaDetallesGasto(Integer idGasto) {
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			this.listaDetalleGasto = objLogica.obtenerDetalleGasto(idGasto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public ImportacionEntity getImportacion() {
		return importacion;
	}

	public void setImportacion(ImportacionEntity importacion) {
		this.importacion = importacion;
	}

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("dataSession");
		try {
			this.importacion = (ImportacionEntity) FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap().get("importacionSelected");
			ImportacionLogica objLogica = new ImportacionLogica();
			this.listaGastos = objLogica.obtenerGastosImportacion(this.importacion.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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

	public Date getFechaGasto() {
		return fechaGasto;
	}

	public void setFechaGasto(Date fechaGasto) {
		this.fechaGasto = fechaGasto;
	}

	public String getDescripGasto() {
		return descripGasto;
	}

	public void setDescripGasto(String descripGasto) {
		this.descripGasto = descripGasto;
	}

	public BigDecimal getValorGasto() {
		return valorGasto;
	}

	public void setValorGasto(BigDecimal valorGasto) {
		this.valorGasto = valorGasto;
	}

	public List<GastoImpoEntity> getListaGastos() {
		return listaGastos;
	}

	public void setListaGastos(List<GastoImpoEntity> listaGastos) {
		this.listaGastos = listaGastos;
	}

	public AuxContableEntity getAuxContable() {
		return auxContable;
	}

	public void setAuxContable(AuxContableEntity auxContable) {
		this.auxContable = auxContable;
	}

	public Date getDetFechaGasto() {
		return detFechaGasto;
	}

	public void setDetFechaGasto(Date detFechaGasto) {
		this.detFechaGasto = detFechaGasto;
	}

	public String getDetDescripGasto() {
		return detDescripGasto;
	}

	public void setDetDescripGasto(String detDescripGasto) {
		this.detDescripGasto = detDescripGasto;
	}

	public BigDecimal getDetValorGasto() {
		return detValorGasto;
	}

	public void setDetValorGasto(BigDecimal detValorGasto) {
		this.detValorGasto = detValorGasto;
	}

	public AuxContableEntity getDetAuxContable() {
		return detAuxContable;
	}

	public void setDetAuxContable(AuxContableEntity detAuxContable) {
		this.detAuxContable = detAuxContable;
	}

	public GastoImpoEntity getGastoSelected() {
		return gastoSelected;
	}

	public void setGastoSelected(GastoImpoEntity gastoSelected) {
		this.gastoSelected = gastoSelected;
	}

	public List<DetalleGastoEntity> getListaDetalleGasto() {
		return listaDetalleGasto;
	}

	public void setListaDetalleGasto(List<DetalleGastoEntity> listaDetalleGasto) {
		this.listaDetalleGasto = listaDetalleGasto;
	}

}
