package co.com.codesoftware.utilities;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Utilitites {

	/**
	 * metodo que convierte de date a xmlGregorianCalendar
	 * 
	 * @param fecha
	 * @return
	 */
	public static XMLGregorianCalendar dateToXMLGC(Date fecha) {
		XMLGregorianCalendar dateResult = null;
		if (fecha == null) {
			dateResult = null;
		} else {
			try {
				GregorianCalendar c = new GregorianCalendar();
				c.setTime(fecha);
				dateResult = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dateResult;
	}

	/**
	 * metodo que calcula el digito de verificacion de un nit
	 * 
	 * @param nit
	 * @return
	 */
	private String invertirCadena(String cadena) {
		String cadenaInvertida = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		}
		return cadenaInvertida;
	}

	/**
	 * metodo para calcular el digito de verificacion
	 * 
	 * @param cadena
	 * @return
	 */
	public int obtenerSumaPorDigitos(String cadena) {
		cadena = this.invertirCadena(cadena);
		List<Integer> listaPrimos = new ArrayList<>();
		listaPrimos.add(3);
		listaPrimos.add(7);
		listaPrimos.add(13);
		listaPrimos.add(17);
		listaPrimos.add(19);
		listaPrimos.add(23);
		listaPrimos.add(29);
		listaPrimos.add(37);
		listaPrimos.add(41);
		listaPrimos.add(43);
		listaPrimos.add(47);
		listaPrimos.add(53);
		listaPrimos.add(59);
		listaPrimos.add(67);
		listaPrimos.add(71);
		int acumulador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			acumulador += (Integer.parseInt(cadena.substring(i, i + 1)) * listaPrimos.get(i));
		}
		int resultado = acumulador % 11;
		if (resultado > 2) {
			resultado = 11 - resultado;
		}

		return resultado;

	}

	/**
	 * Funcio con la cual transformo un numero en el mes del año
	 * 
	 * @param mes
	 */
	public static String convierteNumMes(int mes) {
		String rta = "";
		try {
			switch (mes) {
			case 1:
				rta = "ENERO";
				break;
			case 2:
				rta = "FEBRERO";
				break;
			case 3:
				rta = "MARZO";
				break;
			case 4:
				rta = "ABRIL";
				break;
			case 5:
				rta = "MAYO";
				break;
			case 6:
				rta = "JUNIO";
				break;
			case 7:
				rta = "JULIO";
				break;
			case 8:
				rta = "AGOSTO";
				break;
			case 9:
				rta = "SEPTIEMBRE";
				break;
			case 10:
				rta = "OCTUBRE";
				break;
			case 11:
				rta = "NOVIEMBRE";
				break;
			case 12:
				rta = "DICIEMBRE";
				break;
			default:
				rta = "Error";
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

}
