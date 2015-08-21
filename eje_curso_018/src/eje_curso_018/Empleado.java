package eje_curso_018;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

/* Attributes */
	
	private String nombres;
	private String apellidos;
	private double sueldo_base;
	private Date fecha_alta;
	
	/* Construct */
	public Empleado(
	   String nomb,String apl, double sueldo_bas, int anio, int mes, int dia
    ){
		this.nombres = nomb;
		this.apellidos = apl;
		this.sueldo_base = sueldo_bas;
		
		GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
		this.fecha_alta = calendario.getTime();
	}
	
	public Empleado(
	  String nomb, String apl			
	){
		this(nomb,apl,5000,2015,7,7);
	}
	
	public Empleado(String nomb){
		this.nombres = nomb;
	}

		
	/* Getter and setter */
	
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

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	
	/* Methods */
	public void subeSueldo(double porcentaje){
		
		double aumento = this.getSueldo_base() * porcentaje /100;
		
		this.setSueldo_base(aumento+this.getSueldo_base());
		
	}
}
