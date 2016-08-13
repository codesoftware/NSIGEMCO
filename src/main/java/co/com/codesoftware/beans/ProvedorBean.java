package co.com.codesoftware.beans;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.logica.ProveedoresLogica;
import co.com.codesoftware.logica.admin.UbicacionLogica;
import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.server.nsigemco.DepartamentoEntity;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.server.nsigemco.ReteFuenteEntity;
import co.com.codesoftware.servicio.general.CiudadEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.Utilitites;

@ManagedBean
@ViewScoped
public class ProvedorBean {

	private ProveedoresEntity proveedor;
	private Integer idRete;
	private Integer idMuni;
	private Integer idCiu;
	private CategoriaEntity categoria;
	private ErrorEnum enumer;
	private List<ProveedoresEntity> listaProveedores;
	private List<ProveedoresEntity> listaProveedoresFiltro;
	private ProveedoresLogica logica;
	private Map<String, Integer> listaMapCiudades;
	private String banderaboton;

	/**
	 * Constructor en el cual se inicializaran los objetos necesarios para el
	 * buen funcionamientos
	 */
	public ProvedorBean() {
		this.proveedor = new ProveedoresEntity();
		this.logica = new ProveedoresLogica();
	}

	/**
	 * Funcion con la cual el sistema adiciona un proveedor en la base de datos
	 */
	public void adicionProveedor() {

		ReteFuenteEntity ret = new ReteFuenteEntity();
		co.com.codesoftware.server.nsigemco.CiudadEntity ciudad = new co.com.codesoftware.server.nsigemco.CiudadEntity();
		DepartamentoEntity departamento = new DepartamentoEntity();
		ciudad.setId(this.idCiu);
		departamento.setId(this.idMuni);
		ret.setId(this.idRete);
		proveedor.setRetenciones(ret);
		proveedor.setCiudad(ciudad);
		proveedor.setMunicipio(departamento);
		proveedor.setRazonSocial(proveedor.getNombre());
		RespuestaEntity res = logica.insertarProveedor(proveedor);
		if (res == null) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("Error de conexion con el WebServices");
		} else {
			if (res.getCodigoRespuesta() == 1) {
				this.setEnumer(ErrorEnum.SUCCESS);
				this.messageBean("Proveedor insertado correctamente");
				FiltrosServiceBean.setBanderaProv(false);
				this.proveedor = new ProveedoresEntity();
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error al insertar el proveedor");
			}
		}
	}

	/**
	 * metodo que inserta un proveedor
	 */
	public void insertaProveedor() {
		ReteFuenteEntity ret = new ReteFuenteEntity();
		co.com.codesoftware.server.nsigemco.CiudadEntity ciudad = new co.com.codesoftware.server.nsigemco.CiudadEntity();
		DepartamentoEntity departamento = new DepartamentoEntity();
		ciudad.setId(this.idCiu);
		departamento.setId(this.idMuni);
		ret.setId(this.idRete);
		proveedor.setRetenciones(ret);
		proveedor.setCiudad(ciudad);
		proveedor.setMunicipio(departamento);
		proveedor.setRazonSocial(proveedor.getNombre());
		if (validaDatos()) {
			RespuestaEntity res = logica.insertarProveedor(proveedor);
			if (res == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error de conexion con el WebServices");
			} else {
				if (res.getCodigoRespuesta() == 1) {
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean("Proveedor insertado correctamente");
					FiltrosServiceBean.setBanderaProv(false);
					this.proveedor = new ProveedoresEntity();
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('datosProveedor').hide();");
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Error al insertar el proveedor:" + res.getDescripcionRespuesta());
				}
			}
		}

	}

	/**
	 * metodo que actualiza los datos de un proveedor
	 */
	public void actualizaProveedor() {
		ReteFuenteEntity ret = new ReteFuenteEntity();
		co.com.codesoftware.server.nsigemco.CiudadEntity ciudad = new co.com.codesoftware.server.nsigemco.CiudadEntity();
		DepartamentoEntity departamento = new DepartamentoEntity();
		ciudad.setId(this.idCiu);
		departamento.setId(this.idMuni);
		ret.setId(this.idRete);
		proveedor.setRetenciones(ret);
		proveedor.setCiudad(ciudad);
		proveedor.setMunicipio(departamento);
		if (validaDatos()) {
			RespuestaEntity res = logica.actualizaProveedor(proveedor);
			if (res == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error de conexion con el WebServices");
			} else {
				if (res.getCodigoRespuesta() == 1) {
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean("Proveedor actualizado correctamente");
					this.proveedor = new ProveedoresEntity();
					RequestContext requestContext = RequestContext.getCurrentInstance();
					requestContext.execute("PF('datosProveedor').hide();");
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Error al actualizar el proveedor:" + res.getDescripcionRespuesta());
				}
			}
		}
	}

	/**
	 * metodo que consulta los proveedores que esten en el sistema
	 */
	public void consultaProveedores() {
		if (this.listaProveedores == null) {
			this.listaProveedores = new ArrayList<>();
		}
		this.listaProveedores = logica.buscaProveedores();
	}

	/**
	 * metodo que consulta las ciudades por su departamento
	 */
	public void consultaCiudades() {
		this.listaMapCiudades = new LinkedHashMap<>();
		if (this.idMuni != null) {
			UbicacionLogica logica = new UbicacionLogica();
			List<CiudadEntity> ciudades = logica.obtieneListaCiudadesXDpto(this.idMuni);
			if (ciudades != null) {
				for (CiudadEntity ciudad : ciudades) {
					this.listaMapCiudades.put(ciudad.getNombre(), ciudad.getId());
				}
			}
		}
	}

	/**
	 * metodo para validar obligotariedad de datos
	 * 
	 * @return
	 */
	public boolean validaDatos() {
		boolean resultado = true;
		try {
			if (this.proveedor.getNombre() == null || "".equalsIgnoreCase(this.proveedor.getNombre())) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error, el campo nombre es obligatorio");
				return false;
			}
			if (this.proveedor.getNit() == null || "".equalsIgnoreCase(this.proveedor.getNit())) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error, el campo Nit es obligatorio");
				return false;
			}
			if (this.proveedor.getDireccion() == null || "".equalsIgnoreCase(this.proveedor.getDireccion())) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error, el campo Direccion es obligatorio");
				return false;
			}
			if (this.proveedor.getCiudad().getId() == null || this.proveedor.getCiudad().getId() == -1) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error, el campo Ciudad es obligatorio");
				return false;
			}
			if (this.proveedor.getMunicipio().getId() == null || this.proveedor.getMunicipio().getId() == -1) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error, el campo Municipio es obligatorio");
				return false;
			}
			if (this.proveedor.getRetenciones().getId() == null || this.proveedor.getRetenciones().getId() == -1) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error, el campo Retenciones es obligatorio");
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

	/**
	 * metodo que limpia el panel para insertar un proveedor
	 */
	public void limpiaPanel() {
		this.banderaboton = "I";
		this.proveedor = new ProveedoresEntity();
	}

	/**
	 * metodo que se usa para consultar un proveedor
	 * 
	 * @param idProveedor
	 */
	public void consultaProveedor(ProveedoresEntity proveedorSel) {
		this.proveedor = proveedorSel;
		if (proveedorSel.getMunicipio() == null) {
			DepartamentoEntity mpioAux = proveedorSel.getMunicipio();
			mpioAux = new DepartamentoEntity();
			mpioAux.setId(-1);
			proveedorSel.setMunicipio(mpioAux);
		}
		this.idMuni = proveedorSel.getMunicipio().getId();
		consultaCiudades();
		if (proveedorSel.getCiudad() == null) {
			co.com.codesoftware.server.nsigemco.CiudadEntity ciudAux = proveedorSel.getCiudad();
			ciudAux = new co.com.codesoftware.server.nsigemco.CiudadEntity();
			ciudAux.setId(-1);
			proveedorSel.setCiudad(ciudAux);
		}
		this.idCiu = proveedorSel.getCiudad().getId();
		this.idRete = proveedorSel.getRetenciones().getId();
		this.banderaboton = "U";
	}

	/**
	 * metodo que llama al calculo del digito de verificacion
	 */
	public void muestraDigito() {
		Utilitites ut = new Utilitites();
		this.proveedor.setDverificacion("" + ut.obtenerSumaPorDigitos(this.proveedor.getNit()));
	}

	public ProveedoresEntity getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedoresEntity proveedor) {
		this.proveedor = proveedor;
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

	public Integer getIdRete() {
		return idRete;
	}

	public void setIdRete(Integer idRete) {
		this.idRete = idRete;
	}

	public List<ProveedoresEntity> getListaProveedores() {
		return listaProveedores;
	}

	public void setListaProveedores(List<ProveedoresEntity> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}

	public List<ProveedoresEntity> getListaProveedoresFiltro() {
		return listaProveedoresFiltro;
	}

	public void setListaProveedoresFiltro(List<ProveedoresEntity> listaProveedoresFiltro) {
		this.listaProveedoresFiltro = listaProveedoresFiltro;
	}

	public Map<String, Integer> getListaMapCiudades() {
		return listaMapCiudades;
	}

	public void setListaMapCiudades(Map<String, Integer> listaMapCiudades) {
		this.listaMapCiudades = listaMapCiudades;
	}

	public Integer getIdMuni() {
		return idMuni;
	}

	public void setIdMuni(Integer idMuni) {
		this.idMuni = idMuni;
	}

	public Integer getIdCiu() {
		return idCiu;
	}

	public void setIdCiu(Integer idCiu) {
		this.idCiu = idCiu;
	}

	public String getBanderaboton() {
		return banderaboton;
	}

	public void setBanderaboton(String banderaboton) {
		this.banderaboton = banderaboton;
	}

}
