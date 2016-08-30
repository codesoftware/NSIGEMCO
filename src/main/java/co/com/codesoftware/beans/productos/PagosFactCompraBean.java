package co.com.codesoftware.beans.productos;

import javax.faces.context.FacesContext;

import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.GeneralBean;

public class PagosFactCompraBean implements GeneralBean {
	private Integer idFactura;
	private UsuarioEntity datosSesion;

	/**
	 * metodo que recupera el id de la fatura de compra
	 */
	public PagosFactCompraBean() {
		try {
			idFactura = (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("idFactCom");
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("idFactCom", null);
			this.datosSesion = traeDatosSesion();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que consulta la factura especifica
	 */
	public void consultFactCompraEspecifica() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {

	}

}
