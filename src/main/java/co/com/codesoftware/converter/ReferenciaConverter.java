package co.com.codesoftware.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;

@FacesConverter("referenciaConverter")
public class ReferenciaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		if(value != null && value.trim().length() > 0){
			try {
				if(!"-1".equalsIgnoreCase(value) && !"SELECCIONE UNA SUBCATEGORIA".equalsIgnoreCase(value) ){
					FiltrosServiceBean service = (FiltrosServiceBean) context.getExternalContext().getApplicationMap().get("filtrosService");
					Object objeto = service.buscaReferenciaXId(Integer.parseInt(value));
					return objeto;
				}else{
					return null; 
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		try {
			if(value != null){ 
				String valor = String.valueOf(((ReferenciaEntity) value).getId());
				return valor;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
