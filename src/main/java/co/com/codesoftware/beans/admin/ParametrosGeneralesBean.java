package co.com.codesoftware.beans.admin;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.codesoftware.entity.ParametrosGeneralesEntity;
import co.com.codesoftware.logica.admin.ParametrosLogica;
import co.com.codesoftware.servicio.general.ParametrosEmpresaEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ParametrosGeneralesBean implements GeneralBean {

	private UsuarioEntity objetoSesion;
	private ErrorEnum enumer;
	private ParametrosGeneralesEntity parametros;



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

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("dataSession");
		try {
			if (this.parametros == null) {
				this.parametros = new ParametrosGeneralesEntity();
			}
			ParametrosLogica objLogica = new ParametrosLogica();
			List<ParametrosEmpresaEntity> auxParametros = objLogica.obtieneParametrosEmpresa();
			for (ParametrosEmpresaEntity item : auxParametros) {
				if ("NOMBREEMPRESA".equalsIgnoreCase(item.getClave())) {
					this.parametros.setNombre(item.getValor());
				}
				if("DIRECCION".equalsIgnoreCase(item.getClave())){
					this.parametros.setDireccion(item.getValor());
				}
				if("NIT".equalsIgnoreCase(item.getClave())){
					this.parametros.setNit(item.getValor());
				}
				if("TELEFONOS".equalsIgnoreCase(item.getClave())){
					this.parametros.setTelefono(item.getValor());
				}
				if("DEPEMPRESA".equalsIgnoreCase(item.getClave())){
					this.parametros.setDepartamento(item.getValor());
				}
				if("CIUDAD".equalsIgnoreCase(item.getClave())){
					this.parametros.setCiudad(item.getValor());
				} 
				if("ACTECONO".equalsIgnoreCase(item.getClave())){
					this.parametros.setActividadEconomica(item.getValor());
				}
				if("CORREOFACT".equalsIgnoreCase(item.getClave())){
					this.parametros.setCorreoElectronico(item.getValor());
				}
				if("TIPOREGIMEN".equalsIgnoreCase(item.getClave())){
					this.parametros.setTipoRegimen(item.getValor());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Funcion con la cual modifico los parametros de la empresa
	 */
	public void modificaParametrosEmpresa(){
		try {
			ParametrosLogica objLogica = new ParametrosLogica();
			objLogica.actualizaParametroEmpresarial("NOMBREEMPRESA", this.parametros.getNombre());
			objLogica.actualizaParametroEmpresarial("DIRECCION", this.parametros.getDireccion());
			objLogica.actualizaParametroEmpresarial("NIT", this.parametros.getNit());
			objLogica.actualizaParametroEmpresarial("TELEFONOS", this.parametros.getTelefono());
			objLogica.actualizaParametroEmpresarial("DEPEMPRESA", this.parametros.getDepartamento());
			objLogica.actualizaParametroEmpresarial("CIUDAD", this.parametros.getCiudad());
			objLogica.actualizaParametroEmpresarial("ACTECONO", this.parametros.getActividadEconomica());
			objLogica.actualizaParametroEmpresarial("CORREOFACT", this.parametros.getCorreoElectronico());
			objLogica.actualizaParametroEmpresarial("TIPOREGIMEN", this.parametros.getTipoRegimen());
			this.messageBean("Parametros actualizados correctamente",ErrorEnum.SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public ParametrosGeneralesEntity getParametros() {
		return parametros;
	}

	public void setParametros(ParametrosGeneralesEntity parametros) {
		this.parametros = parametros;
	}

}
