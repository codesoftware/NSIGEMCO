package co.com.codesoftware.converter;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

@FacesConverter("datetoXmlDateConverter")
public class DatetoXmlDateConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		GregorianCalendar calendar = new GregorianCalendar();
		String []fecha = value.split("/");
		calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(fecha[0]));
		calendar.set(Calendar.MONTH, Integer.parseInt(fecha[1])-1);
		calendar.set(Calendar.YEAR, Integer.parseInt(fecha[2]));
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		System.out.println("Pasa por el converter dos");
		return null;
	}

}
