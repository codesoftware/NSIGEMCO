package co.com.codesoftware.logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.com.codesoftware.servicio.general.MapaEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ReporteLogica implements WSGeneralInterface{

	/**
	 * metodo que consulta la ruta de un reporte
	 * 
	 * @param tipoReporte
	 * @param fechaInicial
	 * @param fechaFinal
	 * @param idSede
	 * @param formato
	 * @return
	 */
	public String consultaRutaReporte(Integer tipoReporte, Date fechaInicial, Date fechaFinal, Integer idSede,
			Integer formato) {
		String extension = "xls";
		String ruta = "";
		String reporte = "";
		try {
			String fechaI = fechaInicial.getDate()+"/"+(fechaInicial.getMonth()+1)+"/"+(fechaInicial.getYear()+1900);
			String fechaF = fechaFinal.getDate()+"/"+(fechaFinal.getMonth()+1)+"/"+(fechaFinal.getYear()+1900);
			List<MapaEntity> datos = new ArrayList<MapaEntity>();
			MapaEntity entity = new MapaEntity();
			entity.setClave("fechaInicial");
			entity.setValor(fechaI);
			datos.add(entity);
			entity = new MapaEntity();
			entity.setClave("fechaFinal");
			entity.setValor(fechaF);
			datos.add(entity);
			entity = new MapaEntity();
			entity.setClave("idSede");
			entity.setValor(idSede);
			datos.add(entity);
			if(formato==1){
				extension = "pdf";
			}
			if(tipoReporte==1){
				reporte = "FACTURAS_SEDE";
			}
			List<MapaEntity> parametros = new  ArrayList<MapaEntity>();
			entity = new MapaEntity();
			entity.setClave("tipoReporte");
			entity.setValor(extension);
			parametros.add(entity);
			entity = new MapaEntity();
			entity.setClave("nombreReporte");
			entity.setValor(reporte);
			parametros.add(entity);
			entity = new MapaEntity();
			ruta = conexionWSGeneral().getPortGeneral().generaReportes(datos, parametros);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruta;
	}
	
	/**
	 * metodo que consulta la nota crédito de la factura
	 * @param idFactura
	 * @param nombreReporte
	 * @param formato
	 * @return
	 */
	public String consultaReporteNotaCredito(Integer idFactura,String nombreReporte,String formato){
		String ruta  = "";
		List<MapaEntity> datos = new ArrayList<MapaEntity>();
		MapaEntity entity = new MapaEntity();
		try {
			entity.setClave("ID_NOTA");
			entity.setValor(""+idFactura);
			datos.add(entity);
			//-----parametros
			List<MapaEntity> parametros = new  ArrayList<MapaEntity>();
			entity = new MapaEntity();
			entity.setClave("tipoReporte");
			entity.setValor(formato);
			parametros.add(entity);
			entity = new MapaEntity();
			entity.setClave("nombreReporte");
			entity.setValor(nombreReporte);
			parametros.add(entity);
			entity = new MapaEntity();
			ruta = conexionWSGeneral().getPortGeneral().generaReportes(datos, parametros);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  ruta;
	}

}