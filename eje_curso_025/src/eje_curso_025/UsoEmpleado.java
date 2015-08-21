package eje_curso_025;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		Jefatura david = new Jefatura("David","Rivero",19542562,"San Carlos");
		Empleado leyla = new Empleado("Leyla","de Rivero",20922878,"Barquisimeto");
		
		System.out.println(david.tomarDecisiones("dar mejoras salariales."));
		System.out.println("El Bonus del jefe es:"+david.estableceBonus(500));
		
		System.out.println("El Bonus del Empleado es:"+leyla.estableceBonus(2000));
	}

}
