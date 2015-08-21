package eje_curso_025;

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

	@Override
	public double estableceBonus(double gratificacion) {
		double prima = 2000;
		
		return BonusEnum.BONUS_BASE.getBonusMto()+prima+gratificacion;
	}
	
	
	
	
}
