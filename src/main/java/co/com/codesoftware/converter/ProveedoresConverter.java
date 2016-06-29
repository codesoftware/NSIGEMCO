package co.com.codesoftware.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;

@FacesConverter("proveedoresConverter")
public class ProveedoresConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		if(value != null && value.trim().length() > 0){
			try {
				FiltrosServiceBean service = (FiltrosServiceBean) context.getExternalContext().getApplicationMap().get("filtrosService");
				Object objeto = null;
				if(!"null".equalsIgnoreCase(value)){
				 objeto = service.buscaProveedorXId(Integer.parseInt(value));
				}
				return objeto;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}else{
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null){
			String valor = String.valueOf(((ProveedoresEntity) value).getId()); 
			return valor;
		}else{
			return null;
		}
	}

}
