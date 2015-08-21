package eje_curso_016;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Empleado davidRivero = new Empleado(
		  "David","Rivero",18000, 2014, 7, 17
		);
		
		System.out.println("Fecha de alta"+davidRivero.getFecha_alta());
		System.out.println("Tu sueldo actual es:"+davidRivero.getSueldo_base());
		davidRivero.subeSueldo(5);
		
		System.out.println("Tu sueldo actual aumentado es:"+davidRivero.getSueldo_base());
	}
}
