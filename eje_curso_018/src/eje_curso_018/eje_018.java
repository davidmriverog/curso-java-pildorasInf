package eje_curso_018;

public class eje_018 {
  
	public static void main(String[] args){
		
		Empleado leyla = new Empleado("Leyla","de Rivero",8000,2015, 8, 8);
		Empleado david = new Empleado("David Miguel","Rivero");
		
		leyla.subeSueldo(50);
		david.subeSueldo(5);
		
	}
}
