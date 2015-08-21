package eje_curso_020;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

	private String nombres;
	private String apellidos;
	private double sueldo_base;
	private double sueldo_neto;
	private Date alta_contrato;
	
	/* Constructs */
	
	public Empleado(
	  String nomb, String apl, double sueld, int ages, int month, int day		
	){
		this.nombres = nomb;
		this.apellidos = apl;
		this.sueldo_base = sueld;	
		
		GregorianCalendar calendar = new GregorianCalendar(
		ages, month -1, day		
		);
		
		this.alta_contrato = calendar.getTime();
	}

	/* Getter and Setter */
	
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

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
	
}
