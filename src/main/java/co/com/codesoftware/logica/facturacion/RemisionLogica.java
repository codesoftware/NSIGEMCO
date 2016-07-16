package co.com.codesoftware.logica.facturacion;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.xml.datatype.XMLGregorianCalendar;

import co.com.codesoftware.logica.CodificaBase64;
import co.com.codesoftware.servicio.general.DetProdRemision;
import co.com.codesoftware.servicio.general.MapaEntity;
import co.com.codesoftware.servicio.general.RelFacRemiGenEntity;
import co.com.codesoftware.servicio.general.RemisionEntity;
import co.com.codesoftware.utilities.Utilitites;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class RemisionLogica implements WSGeneralInterface {

	private String rutaImagen;

	/**
	 * Funcion con la cual obtengo las remisiones generadas hacia un cliente
	 * basandome en un rango de fechas
	 * 
	 * @param idcliente
	 * @param fechaIni
	 * @param fechaFin
	 * @return
	 */
	public List<RemisionEntity> obtenerRemisionesXFiltros(Integer idcliente, Date fechaIni, Date fechaFin) {
		List<RemisionEntity> rta = null;
		try {
			XMLGregorianCalendar fechaI = Utilitites.dateToXMLGC(fechaIni);
			XMLGregorianCalendar fechaF = Utilitites.dateToXMLGC(fechaFin);
			rta = conexionWSGeneral().getPortGeneral().obtenerRemisionesXCliente(idcliente, fechaI, fechaF);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual obtengo las remisiones generadas hacia un cliente
	 * basandome en un rango de fechas
	 * 
	 * @param IdRemision
	 * @return
	 */
	public List<DetProdRemision> obtenerDetalle(Integer idRemision) {
		List<DetProdRemision> rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().obtenerDetalleRemision(idRemision);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual llamo al proceso para realizar la facturacion de una
	 * remision
	 * 
	 * @param idRemision
	 * @param idTius
	 * @return
	 */
	public String llamaProcesoFacturar(Integer idRemision, Integer idTius, Integer idRsfa, Integer diasPlazo, String retefuente) {
		String rta = "";
		try {
			rta = conexionWSGeneral().getPortGeneral().realizarFacturaXRemision(idRemision, idTius, idRsfa, diasPlazo,retefuente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual genero el pdf de la remision
	 * 
	 * @param idRemi
	 * @return
	 */
	public String generaPdfRemision(Integer idRemi) {
		String rta = "";
		try {
			List<MapaEntity> datos = new ArrayList<MapaEntity>();
			MapaEntity entity = new MapaEntity();
			entity.setClave("remi_remi");
			entity.setValor("" + idRemi);
			datos.add(entity);
			entity = new MapaEntity();
			entity.setClave("rutaImagen");
			datos.add(entity);
			entity = new MapaEntity();

			List<MapaEntity> parametros = new ArrayList<MapaEntity>();
			entity = new MapaEntity();
			entity.setClave("tipoReporte");
			entity.setValor("pdf");
			parametros.add(entity);
			entity = new MapaEntity();
			entity.setClave("nombreReporte");
			entity.setValor("RemisionConPrecio");
			parametros.add(entity);
			parametros.add(entity);
			rta = conexionWSGeneral().getPortGeneral().generaReportes(datos, parametros);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual genero el pdf de la remision
	 * 
	 * @param idRemi
	 * @return
	 */
	public String generaPdfFacturaEspecial(Integer idFactura) {
		String rta = "";
		try {
			List<MapaEntity> datos = new ArrayList<MapaEntity>();
			MapaEntity entity = new MapaEntity();
			entity.setClave("fact_fact");
			entity.setValor("" + idFactura);
			datos.add(entity);
			entity = new MapaEntity();
			entity.setClave("rutaImagen");
			datos.add(entity);
			entity = new MapaEntity();

			List<MapaEntity> parametros = new ArrayList<MapaEntity>();
			entity = new MapaEntity();
			entity.setClave("tipoReporte");
			entity.setValor("pdf");
			parametros.add(entity);
			entity = new MapaEntity();
			entity.setClave("nombreReporte");
			entity.setValor("FacturacionEspecial");
			parametros.add(entity);
			parametros.add(entity);
			rta = conexionWSGeneral().getPortGeneral().generaReportes(datos, parametros);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual genero el pdf de la remision
	 * 
	 * @param idRemi
	 * @return
	 */
	public String generaPdfFacturaGenerica(Integer idFact) {
		String rta = "";
		try {
			rta = conexionWSFacturacion().getPortFact().obtenerImagenXIdFactura("" + idFact);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual
	 */
	public String materializaImagen(String documento, String idRemision) {
		String rta = null;
		try {
			ExternalContext tmpEC;
			tmpEC = FacesContext.getCurrentInstance().getExternalContext();
			String realPath = tmpEC.getRealPath("/resources/images/remisiones/");
			CodificaBase64 codifica64 = new CodificaBase64();
			codifica64.setDocumento(documento);
			boolean valida = codifica64.decodificaBase64(realPath, "Remision_" + idRemision + ".pdf");
			if (valida) {
				this.setRutaImagen("/resources/images/remisiones/Remision_" + idRemision + ".pdf");
				rta = "Ok";
			}

		} catch (Exception e) {
			e.printStackTrace();
			rta = null;
		}
		return rta;
	}

	/**
	 * Funcion con la cual busco la relacion entre remisiones y facturas
	 * 
	 * @param tipoDoc
	 * @param idDocumento
	 * @return
	 */
	public RelFacRemiGenEntity buscaIdentificadoresXId(String tipoDoc, Integer idDocumento) {
		RelFacRemiGenEntity rta = null;
		try {
			rta = conexionWSGeneral().getPortGeneral().buscaDocumentosPagosRemi(tipoDoc, idDocumento);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * Funcion con la cual realizo el llamado al WebService para realizar el
	 * abono a una remision
	 * 
	 * @return
	 */
	public String realizaAbonoRemision(Integer idTius,
            Integer idFact,
            BigDecimal valorPago,
            String tipoPago,
            String pagoTotal) {
		String rta = "";
		try {
			rta = conexionWSGeneral().getPortGeneral().ejecutaPagoRemision(idTius, idFact, valorPago, tipoPago, pagoTotal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}
	/**
	 * Funcion con la cual evaluo si la remision o la factura a realizar se le debe hacer retencion en la fuente
	 */
	public String evaluaRetefuente(){
		String rta = "S";
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rta;
	}

}
