package co.com.codesoftware.converter;

import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.xml.datatype.XMLGregorianCalendar;

@FacesConverter("xmlDatetoDateConverterHour")
public class XmlDatetoDateHourConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		System.out.println("Paso por aqui 1");
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		String fechaString = "";
		try {
			XMLGregorianCalendar fechaXml = (XMLGregorianCalendar) value;
			Date fecha = fechaXml.toGregorianCalendar().getTime();
			fechaString = fechaXml.getDay() + "/"+ fechaXml.getMonth() + "/" + (fechaXml.getYear()) +" " + (fechaXml.getHour()) + ":" +(fechaXml.getMinute());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fechaString;
	}
	

}
