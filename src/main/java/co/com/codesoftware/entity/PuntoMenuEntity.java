package co.com.codesoftware.entity;

import java.util.ArrayList;

public class PuntoMenuEntity {

	private String nombre;
	private String link;
	private String icono;
	private ArrayList<PrimerNivelMenuEntity> primerNivel;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public ArrayList<PrimerNivelMenuEntity> getPrimerNivel() {
		return primerNivel;
	}

	public void setPrimerNivel(ArrayList<PrimerNivelMenuEntity> primerNivel) {
		this.primerNivel = primerNivel;
	}
	/**
	 * Funcion con la cual se adiciona un submenu a un punto de menu
	 * @param obj
	 */
	public void addSubMenu(PrimerNivelMenuEntity obj){
		if(primerNivel == null){
			primerNivel = new ArrayList<PrimerNivelMenuEntity>();
		}
		primerNivel.add(obj);
	}

}
