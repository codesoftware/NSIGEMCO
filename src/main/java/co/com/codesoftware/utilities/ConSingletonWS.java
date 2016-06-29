package co.com.codesoftware.utilities;

import java.util.Map;

import co.com.codesoftware.logica.WsLogica;

public class ConSingletonWS {
	private static ConSingletonWS consultaSingleton;
	private static Map<String, String> urlWS;
	
	private ConSingletonWS(){
		
	}
	/**
	 * instancia del singleton
	 * @return
	 */
	public static ConSingletonWS getInstance(){
		if(consultaSingleton==null){
			consultaSingleton = new ConSingletonWS();
		}
		return consultaSingleton;
	}
	
	/**
	 * metodo que consulta las listas de las url
	 * @return
	 */
	public Map<String,String> consultaUrl(){
		try {
			WsLogica logica = new WsLogica();
			urlWS = logica.consultaURLWebServices();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return urlWS;
	}
}
