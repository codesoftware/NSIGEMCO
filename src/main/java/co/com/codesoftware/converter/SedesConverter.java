package co.com.codesoftware.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.servicio.general.SedeEntity;

@FacesConverter("sedesConverter")
public class SedesConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		try {
			if (value != null && value.trim().length() > 0) {
				if (value.equalsIgnoreCase("-1")) {
					return null;
				} else {
					FiltrosServiceBean service = (FiltrosServiceBean) context.getExternalContext().getApplicationMap()
							.get("filtrosService");
					Object objeto = service.buscaSedeXId(Integer.parseInt(value));
					return objeto;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		try {
			if(value != null){
				String valor = String.valueOf(((SedeEntity) value).getId()); 
				return valor;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
