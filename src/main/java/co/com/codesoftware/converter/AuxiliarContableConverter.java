package co.com.codesoftware.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import co.com.codesoftware.logica.admin.ContabilidadLogic;
import co.com.codesoftware.servicio.contabilidad.AuxContableEntity;

@FacesConverter("auxiliarContableConverter")
public class AuxiliarContableConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		ContabilidadLogic objLogic = new ContabilidadLogic();
		try {
			return objLogic.obtenerAuxiliarContableXId(Integer.parseInt(value));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		if(value != null){
			String valor = "";
			valor = ""+((AuxContableEntity) value).getId();
			return valor;
		}else{
			return null;
		}
	}

}
