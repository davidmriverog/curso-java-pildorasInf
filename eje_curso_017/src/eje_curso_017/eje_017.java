package eje_curso_017;

public class eje_017 {

	public static void main(String[] args) {
		Empleado trab1 = new Empleado("David Rivero");
		Empleado trab2 = new Empleado("Leyla de Rivero");
		Empleado trab3 = new Empleado("Yrma Guite");
		
		trab1.cambiarSeccion("Docente");
		
		System.out.println(trab1.devuelveDatos()+"\n"+
		trab2.devuelveDatos()+"\n"+trab3.devuelveDatos()
		);
		
		System.out.println(Empleado.dameIdSiguiente());
		
	}

}

class Empleado{
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int IdSiguiente = 1;
	
	public Empleado(String nomb){
		nombre = nomb;
		seccion = "Sistemas";
		id=IdSiguiente;
		IdSiguiente++;
		
	}
	
	public void cambiarSeccion(String seccion){
		this.seccion = seccion;
	}
	
	public String devuelveDatos(){
		
		return "El nombre es"+nombre+" la sección es"+seccion+" y el ID es"
				+id;
	}
	
	public static String dameIdSiguiente(){
		
		return "El IdSiguiente es:"+IdSiguiente;
	}
}
