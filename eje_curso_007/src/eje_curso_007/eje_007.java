package eje_curso_007;

import java.util.Scanner;
import javax.swing.*;

public class eje_007 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int menu = 0;
		
		System.out.println("Elige una opción: \n");
		System.out.print("1 -> Cuadrado \n");
		System.out.print("2 -> Rectángulo \n");
		System.out.print("3 -> Triaágulo \n");
		System.out.print("4 -> Círculo \n");
		menu = entrada.nextInt();
		
		switch (menu) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
			
			System.out.println("El area del cuadrado es:"+Math.pow(lado, 2));
			break;
		case 2:
			
			int base = Integer.parseInt(
			  JOptionPane.showInputDialog("Introduce la base")		
		    );
			
			int altura = Integer.parseInt(
			  JOptionPane.showInputDialog("Introduce la altura")		
		    );
			
			System.out.println("el area del rectangulo es:"+ (base * altura));
			break;
			
	    case 3:
	    	base = Integer.parseInt(
	  		  JOptionPane.showInputDialog("Introduce la base")		
	  		);
	  			
	  	    altura = Integer.parseInt(
	  		  JOptionPane.showInputDialog("Introduce la altura")		
	  		);
	  			
	  		System.out.println("el area del triangulo es:"+ (base * altura)/2);	
	  		
	    	break;
	    case 4:
	    	
	    	int radio = Integer.parseInt(
	    	  JOptionPane.showInputDialog("Introduce el radio") 	
	    	);
	    	
	    	System.out.println("el area del circulo es:");
	    	System.out.printf("%1.2f",Math.PI * (Math.pow(radio, 2)));
	    	
			break;
		default:
			System.out.println("no seleccionaste ninguna de las cuatro opciones");
			break;
		}
		
		
	}

}
