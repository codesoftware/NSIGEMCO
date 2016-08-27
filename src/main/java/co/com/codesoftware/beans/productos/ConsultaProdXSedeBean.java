package co.com.codesoftware.beans.productos;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.logica.productos.ConsultaProductosLogica;
import co.com.codesoftware.servicio.producto.ExistenciaXSedeEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;
import co.com.codesoftware.utilities.GeneralBean;

@ManagedBean
@ViewScoped
public class ConsultaProdXSedeBean implements GeneralBean {

	private Integer sedeId;
	private List<ExistenciaXSedeEntity> listaProd;
	private List<ExistenciaXSedeEntity> listaProdFiltro;

	/**
	 * metodo que consulta los productos por sede
	 */
	public void consultaProductoXsede() {
		if (validaDatos()) {
			ConsultaProductosLogica logica = new ConsultaProductosLogica();
			this.listaProd = logica.consultaProdXSede(this.sedeId);
			RequestContext requestContext = RequestContext.getCurrentInstance();  
			requestContext.execute("PF('statusDialog').hide()");
		}

	}

	/**
	 * metodo que valida si selecciono una sede
	 * 
	 * @return
	 */
	public boolean validaDatos() {
		if (sedeId == null || sedeId == -1) {
			messageBean("Debe seleccionar la sede", ErrorEnum.ERROR);
			return false;
		}
		return true;
	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	public Integer getSedeId() {
		return sedeId;
	}

	public void setSedeId(Integer sedeId) {
		this.sedeId = sedeId;
	}

	public List<ExistenciaXSedeEntity> getListaProd() {
		return listaProd;
	}

	public void setListaProd(List<ExistenciaXSedeEntity> listaProd) {
		this.listaProd = listaProd;
	}

	public List<ExistenciaXSedeEntity> getListaProdFiltro() {
		return listaProdFiltro;
	}

	public void setListaProdFiltro(List<ExistenciaXSedeEntity> listaProdFiltro) {
		this.listaProdFiltro = listaProdFiltro;
	}

}
