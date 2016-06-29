package co.com.codesoftware.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.server.nsigemco.ProveedoresEntity;
import co.com.codesoftware.server.nsigemco.SubCuentaEntity;

@FacesConverter("subCuentasConverter")
public class SubCuentasConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null && value.trim().length() > 0){
			try {
				FiltrosServiceBean service = (FiltrosServiceBean) context.getExternalContext().getApplicationMap().get("filtrosService");
				Object objeto = service.buscaSubCtaXId(Integer.parseInt(value));
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
	public String getAsString(FacesContext context, UIComponent componente, Object value) {
		if(value != null){
			String valor = String.valueOf(((SubCuentaEntity) value).getId()); 
			return valor;
		}else{
			return null;
		}
	}

}
