package eje_curso_019;

public class Renault extends Coche {

	private int capacidad_carga;
	private int plaza_extras;
	
	public Renault(int plaza_extras,int capacidad_carga){
		
		// llamamos al contructor padre
		super();
		
		this.capacidad_carga = capacidad_carga;
		this.plaza_extras = plaza_extras;
	}
		
	/* Getter and setter */
	public int getCapacidad_carga() {
		return capacidad_carga;
	}

	public void setCapacidad_carga(int capacidad_carga) {
		this.capacidad_carga = capacidad_carga;
	}

	public int getPlaza_extras() {
		return plaza_extras;
	}

	public void setPlaza_extras(int plaza_extras) {
		this.plaza_extras = plaza_extras;
	}
	
	/* Methods */
	public String dimeDatosRenault(){
		
		return "La capacidad de carga es:"+this.getCapacidad_carga()+
		  " y la plazas son:"+this.getPlaza_extras();
	}
}
