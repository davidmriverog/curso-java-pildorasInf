package eje_curso_021;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona {

	private double sueldo_base;
	private double sueldo_neto;
	private Date alta_contrato;
	
	/* Constructs */
	
	public Empleado(String nomb,
	   double sueld, int ages, int month, int day		
	){
		super(nomb);
		
		this.sueldo_base = sueld;	
		
		GregorianCalendar calendar = new GregorianCalendar(
		ages, month -1, day		
		);
		
		this.alta_contrato = calendar.getTime();
	}

	/* Getter and Setter */
	
	public double getSueldo_base() {
		return sueldo_base;
	}

	public void setSueldo_base(double sueldo_base) {
		this.sueldo_base = sueldo_base;
	}

	public Date getAlta_contrato() {
		return alta_contrato;
	}

	public void setAlta_contrato(Date alta_contrato) {
		this.alta_contrato = alta_contrato;
	}

	public double getSueldo_neto() {
		return sueldo_neto;
	}

	public void setSueldo_neto(double sueldo_neto) {
		this.sueldo_neto = sueldo_neto;
	}
	
	
	/* Methods */
	public void subeSueldo(double porc){
		
		double sueld_increment = this.getSueldo_base()*porc/100;
		
		this.setSueldo_neto(sueld_increment + this.getSueldo_base());
	}

	@Override
	public String dameDescripcion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dameNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
