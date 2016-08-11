package co.com.codesoftware.beans.admin;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.logica.UsuarioLogic;
import co.com.codesoftware.servicio.usuario.PerfilEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class PerfilesBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private List<PerfilEntity> listaPerifiles;
	// Perfil seleccionado
	private PerfilEntity perfilSelec;
	private String[] permisosAdm;
	private List<PerfilBean> listPermAdm;
	private List<PerfilBean> listPermInv;

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		try {
			UsuarioLogic objLogic = new UsuarioLogic();
			listaPerifiles = objLogic.obtenerPerfiles();
			this.perfilSelec = (PerfilEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("perfilSelected");
			if (this.perfilSelec != null) {
				this.setPermisosAplicacion();
				permisosAdm = this.perfilSelec.getPermisos().split("\\.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual asigno los permisos de la aplicacion
	 */
	public void setPermisosAplicacion() {
		if (listPermAdm == null) {
			listPermAdm = new ArrayList<>();
		}
		// Permisos de Administracion
		listPermAdm.add(new PerfilBean("RESOLUCION DE FACTURACION", "Adm1"));
		listPermAdm.add(new PerfilBean("SEDES", "Adm2"));
		listPermAdm.add(new PerfilBean("CONTEO", "Adm3"));
		listPermAdm.add(new PerfilBean("PARAMETROS", "Adm4"));
		listPermAdm.add(new PerfilBean("USUARIOS", "Adm5"));
		listPermAdm.add(new PerfilBean("PROVEEDORES", "Adm6"));
		listPermAdm.add(new PerfilBean("CLIENTES", "Adm7"));
		listPermAdm.add(new PerfilBean("PERFILES", "Adm8"));
	}

	/**
	 * Funcion con la cual obtengo los permisos y los envia a la base de datos
	 */
	public void enviarPermisos() {
		String perAdm = "";
		if (this.permisosAdm == null || this.permisosAdm.length == 0) {
			this.messageBean("Por Favor seleccione un permiso al menos", ErrorEnum.ERROR);
		} else {
			for (String item : this.permisosAdm) {
				perAdm += "." + item + ".";
			}
			UsuarioLogic objLogic = new UsuarioLogic();
			this.perfilSelec.setPermisos(perAdm);
			String valida = objLogic.actualizaPerfiles(this.perfilSelec);
			if ("Ok".equalsIgnoreCase(valida)) {
				this.messageBean("Perfil actualizado correctamente", ErrorEnum.SUCCESS);
			} else {
				this.messageBean(valida, ErrorEnum.ERROR);
			}
		}
	}

	/**
	 * Funcion con la cual redirecciono a la pagina con la cual edito los
	 * perfiles
	 * 
	 * @param objEntity
	 * @return
	 */
	public String actualizaPerfil(PerfilEntity objEntity) {
		String ruta = "";
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("perfilSelected", objEntity);
		ruta = "/ACTION/ADMIN/actualizarPerifl.jsf";
		return ruta;
	}

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

	public List<PerfilEntity> getListaPerifiles() {
		return listaPerifiles;
	}

	public void setListaPerifiles(List<PerfilEntity> listaPerifiles) {
		this.listaPerifiles = listaPerifiles;
	}

	public PerfilEntity getPerfilSelec() {
		return perfilSelec;
	}

	public void setPerfilSelec(PerfilEntity perfilSelec) {
		this.perfilSelec = perfilSelec;
	}

	public String[] getPermisosAdm() {
		return permisosAdm;
	}

	public void setPermisosAdm(String[] permisosAdm) {
		this.permisosAdm = permisosAdm;
	}

	public List<PerfilBean> getListPermAdm() {
		return listPermAdm;
	}

	public void setListPermAdm(List<PerfilBean> listPermAdm) {
		this.listPermAdm = listPermAdm;
	}

	public List<PerfilBean> getListPermInv() {
		return listPermInv;
	}

	public void setListPermInv(List<PerfilBean> listPermInv) {
		this.listPermInv = listPermInv;
	}

}