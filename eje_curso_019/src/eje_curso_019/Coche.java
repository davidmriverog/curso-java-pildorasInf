package eje_curso_019;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	/* Construct */
	public Coche(){
		this.ruedas = 4;
		this.ancho = 400;
		this.largo = 600;
		this.motor = 1600;
		this.peso = 80000;
	}
	
	/* getter and setter */
	
	/**
	 * @return the ruedas
	 */
	public int getRuedas() {
		return ruedas;
	}
	/**
	 * @param ruedas the ruedas to set
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	/**
	 * @return the largo
	 */
	public int getLargo() {
		return largo;
	}
	/**
	 * @param largo the largo to set
	 */
	public void setLargo(int largo) {
		this.largo = largo;
	}
	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}
	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	/**
	 * @return the motor
	 */
	public int getMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(int motor) {
		this.motor = motor;
	}
	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
