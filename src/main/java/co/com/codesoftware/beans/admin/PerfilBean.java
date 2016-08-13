package co.com.codesoftware.beans.admin;

public class PerfilBean {

	private String valor;
	private String llave;

	public PerfilBean(String valor, String llave) {
		super();
		this.valor = valor;
		this.llave = llave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getLlave() {
		return llave;
	}

	public void setLlave(String llave) {
		this.llave = llave;
	}

}
