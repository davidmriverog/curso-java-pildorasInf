package eje_curso_021;

public abstract class Persona {

	@SuppressWarnings("unused")
	private String nombre;
	
	public Persona(String nomb){
	  	this.nombre = nomb;
	}
	
	public abstract String dameDescripcion();
	public abstract String dameNombre();
	
}
