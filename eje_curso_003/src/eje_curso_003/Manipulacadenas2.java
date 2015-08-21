package eje_curso_003;

/**
 *  Manipulacion de cadenas 2.
 * 
 * @author LellyDavid
 *
 */
public class Manipulacadenas2 {
	
	
	public static void main(String[] args) {
	 
		String frase = "Quien no nace para servir, no sirve para vivir."+
		"Baden Powell";
		String frase_resum = frase.substring(2);
		int ult = frase.length();
		
		String frase_resum_2 = frase.substring(26,ult);
		
		// Salida
		System.out.println(frase);
		System.out.println(frase_resum);
		System.out.println(frase_resum_2);
		
	}
}
