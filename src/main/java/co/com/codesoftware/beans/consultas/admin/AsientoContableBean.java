package co.com.codesoftware.beans.consultas.admin;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.codesoftware.servicio.facturacion.MoviContableEntity;

@ManagedBean
@ViewScoped
public class AsientoContableBean {
	private List<MoviContableEntity> listaMovimientos	;
	
}
