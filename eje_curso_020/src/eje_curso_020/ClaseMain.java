package eje_curso_020;

public class ClaseMain {

	public static void main(String[] args) {
		
		Jefe jefe_RRHH = new Jefe("David","Rivero", 25000, 2015, 07, 07);
		
		Empleado[] misEmpleado = new Empleado[3];
		
		misEmpleado[0] = new Empleado("Leyla", "Pastran",16000, 2015, 4, 25);
		misEmpleado[1] = new Empleado("Yrma", "Guite",18000, 2015, 4, 18);
		misEmpleado[2] = jefe_RRHH; // poliformismo en accion.
		
		// uso de casteo en objetos
		Jefe jefe_finanzas = (Jefe) misEmpleado[2];
		
		jefe_finanzas.estableceIncentivo(55000);
		
		for(Empleado e : misEmpleado){
			e.subeSueldo(5);
		}
		
		for(Empleado e : misEmpleado){
			
			System.out.println("Nombres:"+e.getNombres());
			System.out.println("Apellidos:"+e.getApellidos());
			System.out.println("Sueldo Base:"+e.getSueldo_base());
			System.out.println("Sueldo Neto:"+e.getSueldo_neto());
			
		}
	}

}
