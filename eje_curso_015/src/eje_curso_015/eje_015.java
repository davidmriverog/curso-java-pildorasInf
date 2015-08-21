package eje_curso_015;

public class eje_015 {

	public static void main(String[] args) {
		
		CocheEncapsular ford = new CocheEncapsular(
		4, 60, 40, 1600, 500
		);
		
		
		System.out.println("tiene "+ford.getRuedas()+"ruedas.");
		ford.setRuedas(6);
		System.out.println("ahora tiene "+ford.getRuedas()+"ruedas.");

	}

}
