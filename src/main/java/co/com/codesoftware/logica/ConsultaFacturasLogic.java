package co.com.codesoftware.logica;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.servicio.facturacion.CancelaFacturaWrapRequest;
import co.com.codesoftware.servicio.facturacion.FacturaEntity;
import co.com.codesoftware.servicio.facturacion.HistorialFacturaEntity;
import co.com.codesoftware.servicio.facturacion.ImagenFacturaEntity;
import co.com.codesoftware.servicio.facturacion.MoviContableEntity;
import co.com.codesoftware.utilities.Utilitites;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ConsultaFacturasLogic implements WSGeneralInterface {

	/**
	 * metodo que consulta las facturas por un rango de fecha y por sede
	 * 
	 * @param sedeId
	 * @param fechaInicial
	 * @param fechaFinal
	 * @return
	 */
	public List<FacturaEntity> consultaFacturasFechaSede(Integer sedeId, Date fechaInicial, Date fechaFinal, String estado) {
		List<FacturaEntity> rta = null;
		try {
			rta = new ArrayList<FacturaEntity>();
			rta = conexionWSFacturacion().getPortFact().obtenerFacturasSede(Utilitites.dateToXMLGC(fechaInicial),
					Utilitites.dateToXMLGC(fechaFinal), sedeId, estado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo que guarda la imagen de la nota credito
	 * 
	 * @param event
	 * @param tipoImagen
	 * @param idFactura
	 * @return
	 */
	public RespuestaEntity guardaImagen(FileUploadEvent event, String tipoImagen, Integer idFactura,
			Integer idUsuario) {
		RespuestaEntity respuesta = new RespuestaEntity();
		try {
			UsuarioLogic logica = new UsuarioLogic();
			String ruta = logica.obtieneParametroContext() + "notasCredito/";
			UploadedFile file = event.getFile();
			FileOutputStream fos = new FileOutputStream(new File(ruta + tipoImagen + "_" + idFactura + ".pdf"));
			InputStream is = file.getInputstream();
			int BUFFER_SIZE = 8192;
			byte[] buffer = new byte[BUFFER_SIZE];
			int a;
			while (true) {
				a = is.read(buffer);
				if (a < 0)
					break;
				fos.write(buffer, 0, a);
				fos.flush();
			}
			String rta = insertaRegistroImagen(ruta + tipoImagen + "_" + idFactura + ".pdf", "NC", idFactura,
					idUsuario);
			fos.close();
			is.close();
			if ("OK".equalsIgnoreCase(rta)) {
				respuesta.setCodigoRespuesta(1);
				respuesta.setDescripcionRespuesta("PROCESO DE CANCELACIÓN REALIZADO CORRECTAMENTE");
			} else {
				respuesta.setCodigoRespuesta(0);
				respuesta.setDescripcionRespuesta("ERROR " + rta);
			}
		} catch (Exception e) {
			e.printStackTrace();
			respuesta.setCodigoRespuesta(0);
			respuesta.setDescripcionRespuesta("ERROR AL CARGAR IMAGEN " + e.getLocalizedMessage());
		}
		return respuesta;
	}

	/**
	 * funcion que inserta un registro de la imagen asociada a la factura
	 * 
	 * @param ruta
	 * @param tipo
	 * @return
	 */
	public String insertaRegistroImagen(String ruta, String tipo, Integer idFactura, Integer idUsuario) {
		String rta = "";
		try {
			ImagenFacturaEntity entidadImagen = new ImagenFacturaEntity();
			entidadImagen.setId(0);
			entidadImagen.setEstado("A");
			entidadImagen.setIdFactura(idFactura);
			entidadImagen.setRutaImagen(ruta);
			entidadImagen.setTipoFactura(tipo);

			CancelaFacturaWrapRequest request = new CancelaFacturaWrapRequest();
			request.setComentario("CANCELADO");
			request.setEstado("C");
			request.setIdFactura(idFactura);
			request.setIdUsuario(idUsuario);

			rta = conexionWSFacturacion().getPortFact().insertaImagenCancelacion(request, entidadImagen);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo que consulta ua factura en especifico
	 * 
	 * @param idFactura
	 * @return
	 */
	public FacturaEntity consultaFacturaEspecifica(Integer idFactura) {
		FacturaEntity rta = null;
		try {
			rta = conexionWSFacturacion().getPortFact().obtenerFacturaXId(idFactura);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * funcion que consulta e historial de la factura
	 * 
	 * @param idFactura
	 * @return
	 */
	public List<HistorialFacturaEntity> consultaHistorialFactura(Integer idFactura) {
		List<HistorialFacturaEntity> rta = null;
		try {
			rta = conexionWSFacturacion().getPortFact().obtenerHistorialFacXID(idFactura);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo que genera la factura X iD
	 * 
	 * @param id
	 * @return
	 */
	public String generarPdfXIdFact(Integer id) {
		String rta = "";
		try {
			// String imagen =
			// conexionWSPrinSaf().getPortSafPrinc().findBillForId("" + id);
			String imagen = conexionWSFacturacion().getPortFact().obtenerImagenXIdFactura("" + id);
			ExternalContext tmpEC;
			tmpEC = FacesContext.getCurrentInstance().getExternalContext();
			String realPath = tmpEC.getRealPath("/resources/images/facturas/");
			CodificaBase64 codifica64 = new CodificaBase64();
			codifica64.setDocumento(imagen);
			boolean valida = codifica64.decodificaBase64(realPath, "factura_" + id + ".pdf");
			if (valida) {
				rta = "Ok";
			}
		} catch (Exception e) {
			e.printStackTrace();
			rta = "Error";
		}
		return rta;
	}

	/**
	 * funcion que realiza el llamado al webservice que actualiza el estado de
	 * la factura y realiza insercion del historial
	 * 
	 * @param estado
	 * @param idFactura
	 * @param idUsuario
	 * @param comentario
	 * @return
	 */
	public String procesoCancelaFactura(String estado, Integer idFactura, Integer idUsuario, String comentario) {
		String rta = "";
		try {
			CancelaFacturaWrapRequest request = new CancelaFacturaWrapRequest();
			request.setComentario(comentario);
			request.setEstado(estado);
			request.setIdFactura(idFactura);
			request.setIdUsuario(idUsuario);
			rta = conexionWSFacturacion().getPortFact().cancelaFactura(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo que consulta los movimientos contables por estado y id de factura
	 * 
	 * @param idFactura
	 * @param estado
	 * @return
	 */
	public List<MoviContableEntity> consultaMovContable(Integer idFactura, String estado) {
		List<MoviContableEntity> rta = null;
		try {
			rta = conexionWSFacturacion().getPortFact().obtenerMovimientoContableXFac(idFactura, estado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}

	/**
	 * metodo que consulta las imagenes por Id
	 * 
	 * @param id
	 * @return
	 */
	public List<ImagenFacturaEntity> consultaImagenesId(Integer id) {
		List<ImagenFacturaEntity> rta = null;
		try {
			rta = conexionWSFacturacion().getPortFact().consutaImagenFacturas(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
}