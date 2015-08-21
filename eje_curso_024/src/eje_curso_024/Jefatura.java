package eje_curso_024;

public class Jefatura extends Empleado implements JefesInterfaces{
	
	@SuppressWarnings("unused")
	private double incentivo;
	
	public Jefatura(String nomb, String apel, int identity, String dire) {
		super(nomb, apel, identity, dire);
		// TODO Auto-generated constructor stub
	}
	
	public void estableceIncentivo(double inc){
		
		this.incentivo = inc;
	}

	@Override
	public String tomarDecisiones(String decision) {
		
		return "Un miembro de la direccion ha tomado la decision:"+decision;
	}
	
	
	
	
}
