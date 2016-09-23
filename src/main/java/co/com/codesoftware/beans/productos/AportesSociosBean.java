package co.com.codesoftware.beans.productos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;

import co.com.codesoftware.logica.CargueProductoLogica;
import co.com.codesoftware.logica.productos.AportesSocioLogica;
import co.com.codesoftware.server.nsigemco.AporteSocioEntity;
import co.com.codesoftware.server.nsigemco.ProductoAporte;
import co.com.codesoftware.server.nsigemco.SocioEntity;
import co.com.codesoftware.servicio.contabilidad.AuxContableEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;
import co.com.codesoftware.utilities.Utilitites;

@ManagedBean
@ViewScoped
public class AportesSociosBean implements GeneralBean {
	private AporteSocioEntity aportes;
	private List<AporteSocioEntity> listaAportes;
	private List<AporteSocioEntity> listaAportesFiltro;
	private AportesSocioLogica logica;
	private List<SocioEntity> listaSocios;
	private String banderaboton;
	private UsuarioEntity objetoSesion;
	private Integer idSocio;
	private Integer idAporte;
	private Integer idSede;
	private List<ProductoAporte> listaAporProdSelected;
	private List<ProductoAporte> listaAporProdSelectedFiltered;
	private AuxContableEntity auxiliarContable;
	private Integer progress = 0;

	/**
	 * constructor donde se incializa las entidades que siempre se van a
	 * utilizar
	 */
	public AportesSociosBean() {
		this.aportes = new AporteSocioEntity();
		this.logica = new AportesSocioLogica();
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
	}

	/**
	 * metodo donde se consultan los aportes
	 */
	public void consultaAportes() {
		try {
			if (this.listaAportes == null)
				this.listaAportes = new ArrayList<>();
			this.listaAportes = logica.consultaAportes();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que limpia el panel para insertar un aporte
	 */
	public void limpiaPanel() {
		this.banderaboton = "I";
		this.aportes = new AporteSocioEntity();
	}

	/**
	 * metodo que inserta un aporte
	 */
	public void insertaAporte() {
		try {
			if (this.idSocio == -1) {
				messageBean("Por favor seleccione un socio", ErrorEnum.ERROR);
			} else if (this.idSede == -1) {
				messageBean("Por favor seleccione una sede", ErrorEnum.ERROR);
			} else if (this.aportes.getDescripcion() == null || "".equalsIgnoreCase(this.aportes.getDescripcion().trim())) {
				messageBean("El campo descripcion no puede ser nulo", ErrorEnum.ERROR);
			} else if (this.aportes.getCodigo() == null || "".equalsIgnoreCase(this.aportes.getCodigo().trim())) {
				messageBean("El campo codigo no puede ser nulo", ErrorEnum.ERROR);
			} else {
				this.aportes.setUsuario(this.objetoSesion.getId());
				this.aportes.setEstado("C");
				this.aportes.setSocio(this.idSocio);
				this.aportes.setFecha(Utilitites.dateToXMLGC(new Date()));
				this.aportes.setIdSede(this.idSede);
				this.aportes.setValor(new BigDecimal(0));

				String mensaje = logica.insertaAporte(this.aportes);
				if (mensaje.startsWith("Error")) {
					messageBean("Error al insertar el aporte", ErrorEnum.ERROR);
				} else {
					messageBean("Inserto correctamente el aporte", ErrorEnum.SUCCESS);
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('datosAporte').hide();");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que consulta un aporte
	 * 
	 * @param id
	 */
	public void consultaAporte(Integer id) {
		try {
			if (this.aportes == null)
				this.aportes = new AporteSocioEntity();
			this.aportes = logica.consultaAporte(id);
			this.banderaboton = "U";
			this.idSede = this.aportes.getIdSede();
			this.idSocio = this.aportes.getSocio();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que actualiza un aporte
	 */
	public void actualizaAporte() {
		if (this.idSocio == -1) {
			messageBean("Por favor seleccione un socio", ErrorEnum.ERROR);
		} else if (this.idSede == -1) {
			messageBean("Por favor seleccione una sede", ErrorEnum.ERROR);
		} else if (this.aportes.getDescripcion() == null || "".equalsIgnoreCase(this.aportes.getDescripcion().trim())) {
			messageBean("El campo descripcion no puede ser nulo", ErrorEnum.ERROR);
		} else if (this.aportes.getCodigo() == null || "".equalsIgnoreCase(this.aportes.getCodigo().trim())) {
			messageBean("El campo codigo no puede ser nulo", ErrorEnum.ERROR);
		} else {
			this.aportes.setSocio(this.idSocio);
			this.aportes.setIdSede(this.idSede);
			String mensaje = logica.actualizaAporte(this.aportes);
			if (mensaje.startsWith("Error")) {
				messageBean("Error al Actualizar el aporte", ErrorEnum.ERROR);
			} else {
				messageBean("Actualizo correctamente el aporte", ErrorEnum.SUCCESS);
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('datosAporte').hide();");
			}
		}
	}

	/**
	 * Funcion con la cual consulto los productos que tiene un aporte
	 */
	public void consultaProdAportes(Integer idAporte, AporteSocioEntity aporte) {
		try {
			AportesSocioLogica objLogica = new AportesSocioLogica();
			this.listaAporProdSelected = objLogica.consultaProdAporte(idAporte);
			this.idAporte = idAporte;
			this.aportes = aporte;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que carga el id del aporte
	 * 
	 * @param id
	 */
	public void cargaIdAporte(Integer id) {
		this.idAporte = id;
	}

	/**
	 * metodo que carga los productos de un excel
	 * 
	 * @param event
	 */
	public void cargueExcelProductos(FileUploadEvent event) {
		try {
			CargueProductoLogica objLogica = new CargueProductoLogica();
			ArrayList<co.com.codesoftware.servicio.producto.ProductoAporte> productos = objLogica.cargaExcelAporte(event, this.objetoSesion.getId(), this.idAporte);
			String valida = "";
			if (productos != null) {
				AportesSocioLogica objLogicaAp = new AportesSocioLogica();
				valida = objLogicaAp.insertaRegistroAporte(this.idAporte, this.objetoSesion.getId(), productos);
			}
			RequestContext requestContext = RequestContext.getCurrentInstance();
			requestContext.execute("PF('datosProductosAporte').hide()");
			requestContext.execute("PF('statusDialog').hide()");
			if ("Ok".equalsIgnoreCase(valida)) {
				messageBean("Cargue realizado correctamente", ErrorEnum.SUCCESS);
			} else {
				messageBean("Error al cargargar el excel: " + valida, ErrorEnum.ERROR);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void onComplete() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Progress Completed"));
	}

	/**
	 * Funcion con la cual borro todos los productos de un aporte
	 */
	public void borrarProductosAporte() {
		try {
			AportesSocioLogica objLogica = new AportesSocioLogica();
			String valida = objLogica.borrarProdAporte(this.idAporte);
			if ("Ok".equalsIgnoreCase(valida)) {
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('dialogProductos').hide()");
				messageBean("Productos eliminados correctamente", ErrorEnum.SUCCESS);
			} else {
				messageBean("Error al eliminar los productos " + valida, ErrorEnum.ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual genero el proceso de aporte en la cual afectara el
	 * inventario
	 */
	public void generaProcesoAporte() {
		try {
			if (this.auxiliarContable == null) {
				messageBean("Por Favor seleccione un auxiliar contable para continuar con el proceso", ErrorEnum.ERROR);
			} else {
				AportesSocioLogica objLogica = new AportesSocioLogica();
				String valida = objLogica.generaProcesoAporte(this.idAporte, this.auxiliarContable.getId(), this.objetoSesion.getId());
				if ("Ok".equalsIgnoreCase(valida)) {
					messageBean("Proceso Generado correctamente", ErrorEnum.SUCCESS);
					this.listaAportes = null;
					consultaAportes();
				} else {
					messageBean("Error al generar el proceso de aporte: " + valida, ErrorEnum.ERROR);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public AporteSocioEntity getAportes() {
		return aportes;
	}

	public void setAportes(AporteSocioEntity aportes) {
		this.aportes = aportes;
	}

	public List<AporteSocioEntity> getListaAportes() {
		return listaAportes;
	}

	public void setListaAportes(List<AporteSocioEntity> listaAportes) {
		this.listaAportes = listaAportes;
	}

	public List<AporteSocioEntity> getListaAportesFiltro() {
		return listaAportesFiltro;
	}

	public void setListaAportesFiltro(List<AporteSocioEntity> listaAportesFiltro) {
		this.listaAportesFiltro = listaAportesFiltro;
	}

	public List<SocioEntity> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<SocioEntity> listaSocios) {
		this.listaSocios = listaSocios;
	}

	public String getBanderaboton() {
		return banderaboton;
	}

	public void setBanderaboton(String banderaboton) {
		this.banderaboton = banderaboton;
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public Integer getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(Integer idSocio) {
		this.idSocio = idSocio;
	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {

	}

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		this.banderaboton = "I";
	}

	public Integer getIdAporte() {
		return idAporte;
	}

	public void setIdAporte(Integer idAporte) {
		this.idAporte = idAporte;
	}

	public Integer getIdSede() {
		return idSede;
	}

	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public List<ProductoAporte> getListaAporProdSelected() {
		return listaAporProdSelected;
	}

	public void setListaAporProdSelected(List<ProductoAporte> listaAporProdSelected) {
		this.listaAporProdSelected = listaAporProdSelected;
	}

	public AuxContableEntity getAuxiliarContable() {
		return auxiliarContable;
	}

	public void setAuxiliarContable(AuxContableEntity auxiliarContable) {
		this.auxiliarContable = auxiliarContable;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public List<ProductoAporte> getListaAporProdSelectedFiltered() {
		return listaAporProdSelectedFiltered;
	}

	public void setListaAporProdSelectedFiltered(List<ProductoAporte> listaAporProdSelectedFiltered) {
		this.listaAporProdSelectedFiltered = listaAporProdSelectedFiltered;
	}

}
