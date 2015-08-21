package eje_curso_009;

import java.util.*;

/**
 *  Adivina numeros
 * 
 * @author LellyDavid
 *
 */
public class eje_009 {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int aleatoria = (int)(Math.random() * 10);
		
		int numero = 0;
		int intentos = 0;
		
		while(numero!=aleatoria){
			
			System.out.println("Introduce un numero:");
			numero = entrada.nextInt();
			
			if(aleatoria < numero){
				System.out.println("el numero es mas bajo!");
			}else{
				System.out.println("el numero es mas alto!");
			}
			intentos++;
		}
		System.out.println("Felicidades conseguiste el numero");
		System.out.println("Lo realizaste con "+intentos+", Intentos!");
		
		
	}
}
