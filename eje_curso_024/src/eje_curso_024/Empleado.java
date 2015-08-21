package eje_curso_024;

public class Empleado {

	private String nombre;
	private String apellido;
	private int identificacion;
	private String direccion;
	
	
	public Empleado(String nomb,String apel,int identity,String dire) {
		this.nombre = nomb;
		this.apellido = apel;
		this.identificacion = identity;
		this.direccion = dire;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/* Methods */
	
}
