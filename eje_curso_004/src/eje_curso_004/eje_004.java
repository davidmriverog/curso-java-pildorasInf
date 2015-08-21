package eje_curso_004;

import java.util.Scanner;


/**
 *  clase de metodo de entrada y salida de datos
 * 
 * @author LellyDavid
 *
 */

public class eje_004 {

		
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int valor1=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el primer valor:");
		valor1 = entrada.nextInt();
		
		System.out.println("El valor es:"+valor1);
	}

	

}
