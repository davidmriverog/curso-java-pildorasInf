package poo;

import paquetePruebas.Clase3;;

public class Clase2 {

	public static void main(String[] args) {
		
		
		Clase1 miObj = new Clase1();
		Clase3 miObj2 = new Clase3();
		
		miObj.miMetodo();
		
		int var = miObj2.miVariable;
		
		System.out.println(var);

	}

}
