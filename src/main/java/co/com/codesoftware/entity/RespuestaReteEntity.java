package co.com.codesoftware.entity;

import java.math.BigDecimal;

public class RespuestaReteEntity {
	private String mensaje;
	private BigDecimal respuesta;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public BigDecimal getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(BigDecimal respuesta) {
		this.respuesta = respuesta;
	}

}
