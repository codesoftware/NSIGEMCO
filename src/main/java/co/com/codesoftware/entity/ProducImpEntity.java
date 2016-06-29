package co.com.codesoftware.entity;

import java.math.BigDecimal;

public class ProducImpEntity {

	private String codigoExterno;
	private Integer cantidad;
	private BigDecimal valor;
	private Boolean validaInsercion;
	
	

	public ProducImpEntity() {
		super();
		this.validaInsercion = false;
		// TODO Auto-generated constructor stub
	}

	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Boolean getValidaInsercion() {
		return validaInsercion;
	}

	public void setValidaInsercion(Boolean validaInsercion) {
		this.validaInsercion = validaInsercion;
	}

}
