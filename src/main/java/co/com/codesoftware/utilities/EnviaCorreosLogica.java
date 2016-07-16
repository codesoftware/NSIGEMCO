package co.com.codesoftware.utilities;

import java.util.List;

import co.com.codesoftware.servicio.facturacion.FacturaCompraEntity;
import co.com.codesoftware.servicio.general.CorreoWrapperRequest;
import co.com.codesoftware.servicio.general.UsuarioEntity;

public class EnviaCorreosLogica implements WSGeneralInterface {

	/**
	 * metodo que envia los correos de las facturas vencidas
	 * 
	 * @return
	 */
	public String enviaCorreosFacturaCompra() {
		String rta = "";
		try {
			String asunto = "FACTURAS DE COMPRA VENCIDAS O A PUNTO DE VENCER";
			CorreoWrapperRequest mensajeCorreo = new CorreoWrapperRequest();
			List<UsuarioEntity> usuarios = conexionWSGeneral().getPortGeneral().obtenerUsuariosXPermiso(".notGen1.");
			List<FacturaCompraEntity> facturas = conexionWSFacturacion().getPortFact().consultaFacturasVencidas();
			for (UsuarioEntity item : usuarios) {
				String mensaje = "LAS SIGUIENTES FACTURAS ESTAN A PUNTO DE VENCER\n\n\n";
				for (FacturaCompraEntity itemf : facturas) {
					mensaje += "Factura No:" + itemf.getNumeroFactura() + "---Proveedor Nit:"
							+ itemf.getProveedor().getNit() + "--" + itemf.getProveedor().getNombre();
				}
				mensajeCorreo.setAsunto(asunto);
				mensajeCorreo.setMensaje(mensaje);
				System.out.println("correo"+item.getPersona().getCorreo());
				mensajeCorreo.setCorreo(item.getPersona().getCorreo());
				rta = conexionWSGeneral().getPortGeneral().enviaCorreo(mensajeCorreo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	
	 public static void main(String arg[]) {
		EnviaCorreosLogica logica = new EnviaCorreosLogica();
		logica.enviaCorreosFacturaCompra();
	}
}
