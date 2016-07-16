package co.com.codesoftware.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.server.nsigemco.MarcaEntity;

@FacesConverter("marcasConverter")
public class MarcasConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		try {
			if("Seleccione una marca".equalsIgnoreCase(value.toString())){
				return null; 
			}else{
				FiltrosServiceBean service = (FiltrosServiceBean) context.getExternalContext().getApplicationMap().get("filtrosService");
				Object objeto = service.buscaMarcaXId(Integer.parseInt(value));
				return objeto;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value	) {		
		if(value != null){
			try {
				String aux = value.toString();
				String valor = "";
				if(!aux.equalsIgnoreCase("-1")){
					valor = String.valueOf(((MarcaEntity) value).getId());
				}else{
					return null;
				}
				 
				return valor;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}			
		}else{
			return null;
		}
	}

}
