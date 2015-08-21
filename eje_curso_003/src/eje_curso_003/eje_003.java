package eje_curso_003;

/**
 *  Manipulacion de cadenas de caracteres String en java.
 * 
 * 
 * @author LellyDavid
 *
 */
public class eje_003 {

	
	public static void main(String[] args) {
		
		String nombre = "David Miguel Rivero";
		
			
		System.out.println("Mi nombre es:"+nombre);
		System.out.println("La letra de la posicion 2 es="+nombre.charAt(2));
		System.out.println("El total de caracteres en el nombre es ="+nombre.length());
		System.out.println(""+nombre.replace(" ","-"));
		
		int ultima_letra = nombre.length();
		
		System.out.println("La ultima letra del nombre es:"+nombre.charAt(ultima_letra-1));
		
	}

}
