package co.com.codesoftware.beans.productos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.productos.AportesSocioLogica;
import co.com.codesoftware.server.nsigemco.AporteSocioEntity;
import co.com.codesoftware.server.nsigemco.SocioEntity;
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

	/**
	 * constructor donde se incializa las entidades que siempre se van a
	 * utilizar
	 */
	public AportesSociosBean() {
		this.aportes = new AporteSocioEntity();
		this.logica = new AportesSocioLogica();
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("dataSession");
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
			this.aportes.setUsuario(this.objetoSesion.getId());
			this.aportes.setEstado("C");
			this.aportes.setSocio(1);
			this.aportes.setFecha(Utilitites.dateToXMLGC(new Date()));
			String mensaje = logica.insertaAporte(this.aportes);
			if (mensaje.startsWith("Error")) {
				messageBean("Error al insertar el aporte", ErrorEnum.ERROR);
			} else {
				messageBean("Inserto correctamente el aporte", ErrorEnum.SUCCESS);
				RequestContext requestContext = RequestContext.getCurrentInstance();
				requestContext.execute("PF('datosAporte').hide();");
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
		if (this.aportes == null)
			this.aportes = new AporteSocioEntity();
		this.aportes = logica.consultaAporte(id);
		this.banderaboton = "U";
	}

	/**
	 * metodo que actualiza un aporte
	 */
	public void actualizaAporte() {
		String mensaje = logica.actualizaAporte(this.aportes);
		if (mensaje.startsWith("Error")) {
			messageBean("Error al Actualizar el aporte", ErrorEnum.ERROR);
		} else {
			messageBean("Actualizo correctamente el aporte", ErrorEnum.SUCCESS);
			RequestContext requestContext = RequestContext.getCurrentInstance();
			requestContext.execute("PF('datosAporte').hide();");
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

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

}
