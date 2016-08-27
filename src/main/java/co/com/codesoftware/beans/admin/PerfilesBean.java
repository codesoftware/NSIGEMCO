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
	private String[] permisosInv;
	private String[] permisosPara;
	private List<PerfilBean> listPermAdm;
	private List<PerfilBean> listPermInv;
	private List<PerfilBean> listPermPara;

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("dataSession");
		try {
			UsuarioLogic objLogic = new UsuarioLogic();
			listaPerifiles = objLogic.obtenerPerfiles();
			this.perfilSelec = (PerfilEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("perfilSelected");
			if (this.perfilSelec != null) {
				this.setPermisosAplicacion();
				permisosAdm = this.perfilSelec.getPermisos().split("\\.");
				permisosInv = this.perfilSelec.getPermisos().split("\\.");
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
		listPermAdm.add(new PerfilBean("RESOLUCION. DE FACT.", "Adm1"));
		listPermAdm.add(new PerfilBean("SEDES", "Adm2"));
		listPermAdm.add(new PerfilBean("CONTEO", "Adm3"));
		listPermAdm.add(new PerfilBean("PARAMETROS", "Adm4"));
		listPermAdm.add(new PerfilBean("USUARIOS", "Adm5"));
		listPermAdm.add(new PerfilBean("PROVEEDORES", "Adm6"));
		listPermAdm.add(new PerfilBean("CLIENTES", "Adm7"));
		listPermAdm.add(new PerfilBean("PERFILES", "Adm8"));
		listPermAdm.add(new PerfilBean("SOCIOS", "Adm9"));
		listPermAdm.add(new PerfilBean("PARAM PRODUCTOS", "Adm10"));
		// Permisos de Inventario
		if (listPermInv == null) {
			this.listPermInv = new ArrayList<>();
		}
		listPermInv.add(new PerfilBean("FACTURA DE COMPRA", "Inv1"));
		listPermInv.add(new PerfilBean("CONS. FACTURA COMPRA", "Inv2"));
		listPermInv.add(new PerfilBean("CONS. TEMP. FACTURA COMPRA", "Inv3"));
		listPermInv.add(new PerfilBean("INSERTAR PRODUCTOS", "Inv4"));
		listPermInv.add(new PerfilBean("PARAM. PRECIO", "Inv5"));
		listPermInv.add(new PerfilBean("CONSULTA GENERAL", "Inv6"));
		listPermInv.add(new PerfilBean("SOLICITUDES PROD", "Inv7"));
		listPermInv.add(new PerfilBean("CARGUE PRODUCTOS TODO", "Inv8"));
		listPermInv.add(new PerfilBean("CARGUE PRODUCTOS", "Inv9"));
		listPermInv.add(new PerfilBean("APORTES SOCIOS", "Inv10"));
		listPermInv.add(new PerfilBean("CONS PROD X SEDE", "Inv11"));
		// Permisos de parametros
		if (listPermPara == null) {
			this.listPermPara = new ArrayList<>();
		}
		listPermPara.add(new PerfilBean("ASOCIACION CATEGORIAS", "Per1"));
		listPermPara.add(new PerfilBean("ADM. PRECIOS MASIVOS", "Per2"));
		listPermPara.add(new PerfilBean("REPORTE BASICO", "Per3"));
		listPermPara.add(new PerfilBean("COMPRAS Y VENTAS", "Per4"));

	}

	/**
	 * Funcion con la cual obtengo los permisos y los envia a la base de datos
	 */
	public void enviarPermisos() {
		String perAdm = "";
		if ((this.permisosAdm == null || this.permisosAdm.length == 0)
				&& (this.permisosInv == null || this.permisosInv.length == 0) && (this.permisosPara == null || this.permisosPara.length == 0)) {
			this.messageBean("Por Favor seleccione un permiso al menos", ErrorEnum.ERROR);
		} else {
			if (this.permisosAdm != null) {
				for (String item : this.permisosAdm) {
					perAdm += "." + item + ".";
				}
			}
			if (this.permisosInv != null) {
				for (String item : this.permisosInv) {
					perAdm += "." + item + ".";
				}
			}
			if (this.permisosPara != null) {
				for (String item : this.permisosPara) {
					perAdm += "." + item + ".";
				}
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

	public String[] getPermisosInv() {
		return permisosInv;
	}

	public void setPermisosInv(String[] permisosInv) {
		this.permisosInv = permisosInv;
	}

	public String[] getPermisosPara() {
		return permisosPara;
	}

	public void setPermisosPara(String[] permisosPara) {
		this.permisosPara = permisosPara;
	}

	public List<PerfilBean> getListPermPara() {
		return listPermPara;
	}

	public void setListPermPara(List<PerfilBean> listPermPara) {
		this.listPermPara = listPermPara;
	}

}