package eje_curso_019;

public class eje_019 {

	public static void main(String[] args) {
		
		Renault carro = new Renault(3, 60000);
		
		System.out.println("Mostramos las ruedas a partir de la clase padre:"+carro.getRuedas());
		System.out.println("Mensaje desde la clase hija: "+carro.dimeDatosRenault());
		carro.setMotor(1800);
		System.out.println("Motor:"+carro.getMotor());
	}

}
