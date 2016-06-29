package co.com.codesoftware.entity;

import java.util.ArrayList;

public class PrimerNivelMenuEntity {

	private String nombre;
	private String link;
	private String icono;
	private ArrayList<SegundoNivelMenuEntity> segundoNivel;

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

	public ArrayList<SegundoNivelMenuEntity> getSegundoNivel() {
		return segundoNivel;
	}

	public void setSegundoNivel(ArrayList<SegundoNivelMenuEntity> segundoNivel) {
		this.segundoNivel = segundoNivel;
	}
	
	public void addSubItems(SegundoNivelMenuEntity item){
		if(segundoNivel == null){
			segundoNivel = new ArrayList<SegundoNivelMenuEntity>();
		}
		segundoNivel.add(item);
		
	}

}
