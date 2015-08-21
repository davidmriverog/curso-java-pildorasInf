package eje_curso_020;

public class Jefe extends Empleado {

	private double pago_incentivo;
	
	public Jefe(String nomb, String apl, double sueld, int ages, int month, int day) {
		super(nomb, apl, sueld, ages, month, day);		
	}

	
	/* Getter and setter */
	
	public double getPago_incentivo() {
		return pago_incentivo;
	}

	public void setPago_incentivo(double pago_incentivo) {
		this.pago_incentivo = pago_incentivo;
	}
	
	/* methods */
	
	public void estableceIncentivo(double b){
		
		this.setPago_incentivo(b);
		
		this.setSueldo_neto(this.getSueldo_base() + this.getPago_incentivo());
	}
	
	public double dameSueldo(){
		
		double sueldo_jefe = this.getSueldo_base();
		
		
		return sueldo_jefe + this.getPago_incentivo();
	}
	
	

}
