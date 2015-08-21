package eje_curso_013;

import java.util.Scanner;

/**
 *  Uso de Arrays
 * 
 * @author LellyDavid
 *
 */
public class eje_013 {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] mi_array = new int[5];
		
		for(int i=0;i<mi_array.length;i++){
			System.out.println("Valor del array["+(i+1)+"]:");
			mi_array[i]=entrada.nextInt();
			
			
		}
		
		for(int j=0;j<mi_array.length;j++){
			System.out.println("el valor del array de la posicion"+j+"es:"+mi_array[j]);
		}
	}

}
