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
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
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
	private String naturaleza;
	private GastoImpoEntity gastoSelected;
	private List<DetalleGastoEntity> listaDetalleGasto;
	private ProveedoresEntity proveedor;
	
	/**
	 * Funcion con la cual limpio el formulario 
	 */
	public void limpiaFormularioGasto(){
		try {
			this.fechaGasto = null;
			this.descripGasto = "";
			this.proveedor = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * FUncion con la cual se borra un gasto
	 */
	public void borrarGasto(Integer idGasto){
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			String valida = objLogica.borrarGasto(idGasto);
			if("Ok".equalsIgnoreCase(valida)){
				this.messageBean("Gasto eliminado correctamente", ErrorEnum.SUCCESS);
				this.listaGastos = objLogica.obtenerGastosImportacion(this.importacion.getId());
			}else{
				this.messageBean("Error " + valida + " Recuerde que para eliminar el gasto debe eliminar sus detalles primero", ErrorEnum.ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Funcion con la cual registro un gasto
	 */
	public void insertarGasto() {
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			if (this.descripGasto == null || "".equalsIgnoreCase(this.descripGasto)) {
				this.messageBean("El campo descripcion no puede ser vacio",ErrorEnum.ERROR);
			} else if (this.fechaGasto == null) {
				this.messageBean("La fecha en la cual realizo el gasto no puede ser nula",ErrorEnum.ERROR);
			} else if (this.proveedor == null) {
				messageBean("Por Favor Seleccione un Proveedor", ErrorEnum.ERROR);
			} else {
				GastoImpoEntity objEntity = new GastoImpoEntity();
				objEntity.setDescrip(descripGasto);
				XMLGregorianCalendar fecha = Utilitites.dateToXMLGC(fechaGasto);
				objEntity.setFecha(fecha);
				objEntity.setIdImpo(this.importacion.getId());
				objEntity.setIdTius(objetoSesion.getId());
				objEntity.setValorGasto(new BigDecimal(0));
				co.com.codesoftware.servicio.importacion.ProveedoresEntity auxProv = new co.com.codesoftware.servicio.importacion.ProveedoresEntity();
				auxProv.setId(this.proveedor.getId());
				objEntity.setProveedor(auxProv);
				String valida = objLogica.insertaGastoImportacion(objEntity);
				if (valida.toUpperCase().contains("OK")) {
					this.messageBean(valida,ErrorEnum.SUCCESS);
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('dialogInsGasto').hide();");
					this.listaGastos = objLogica.obtenerGastosImportacion(this.importacion.getId());
				} else {
					this.messageBean(valida,ErrorEnum.ERROR);					
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
		this.detDescripGasto = "";
		this.detValorGasto = null;
		this.detAuxContable = null;
		this.naturaleza = "D";
	}

	/**
	 * Funcion con la cual inserto un detalle al gasto
	 * 
	 * @param objEntity
	 */
	public void insertarDetalleGasto() {
		ImportacionLogica objLogica = new ImportacionLogica();
		if (this.detDescripGasto == null || "".equalsIgnoreCase(this.detDescripGasto)) {
			this.messageBean("El campo descripcion no puede ser vacio",ErrorEnum.ERROR);
		}  else if (this.detValorGasto == null || this.detValorGasto.compareTo(new BigDecimal(0)) <= 0) {
			this.messageBean("El valor del gasto debe ser mayor a cero",ErrorEnum.ERROR);
		} else if (this.detAuxContable == null) {
			this.messageBean("El campo auxiliar contable no puede ser vacio ",ErrorEnum.ERROR);
		} else {
			DetalleGastoEntity objEntity = new DetalleGastoEntity();
			objEntity.setDescr(this.detDescripGasto);
			this.detFechaGasto = new Date();
			XMLGregorianCalendar fecha = Utilitites.dateToXMLGC(detFechaGasto);
			objEntity.setFechaRegi(fecha);
			objEntity.setIdGasto(this.gastoSelected.getId());
			objEntity.setIdTius(objetoSesion.getId());
			objEntity.setValor(detValorGasto);

			co.com.codesoftware.servicio.importacion.AuxContableEntity aux = objEntity.getIdAuxconta();
			if (aux == null) {
				aux = new co.com.codesoftware.servicio.importacion.AuxContableEntity();
				aux.setId(this.detAuxContable.getId());
			}
			objEntity.setIdAuxconta(aux);
			objEntity.setNaturaleza(this.naturaleza);
			String valida = objLogica.insertaDetalleGasto(objEntity);
			if (valida.toUpperCase().contains("OK")) {
				this.messageBean(valida,ErrorEnum.SUCCESS);
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('dialogInsDetGasto').hide();");
				this.listaGastos = objLogica.obtenerGastosImportacion(this.importacion.getId());
			} else {
				this.messageBean(valida,ErrorEnum.ERROR);
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
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		try {
			this.importacion = (ImportacionEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("importacionSelected");
			ImportacionLogica objLogica = new ImportacionLogica();
			this.listaGastos = objLogica.obtenerGastosImportacion(this.importacion.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Metodo con el cual elimino un detalle de un gasto
	 */
	public void eliminaDetalleGasto(Integer idDetG){
		try {
			ImportacionLogica objLogica = new ImportacionLogica();
			String valida = objLogica.borrarDetalleGasto(idDetG);
			if("Ok".equalsIgnoreCase(valida)){
				messageBean("Detalle eliminado correctamente", ErrorEnum.SUCCESS);
			}else{
				messageBean("Error "+ valida, ErrorEnum.ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
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

	public ProveedoresEntity getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedoresEntity proveedor) {
		this.proveedor = proveedor;
	}

	public String getNaturaleza() {
		return naturaleza;
	}

	public void setNaturaleza(String naturaleza) {
		this.naturaleza = naturaleza;
	}

}
