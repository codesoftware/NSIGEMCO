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
		 idFactura= (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("idFactCom");
		 this.datosSesion = traeDatosSesion();
	}
	 
	public void consultFactCompraEspecifica(){
		
	}

	@Override
	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		
		
	}

}
