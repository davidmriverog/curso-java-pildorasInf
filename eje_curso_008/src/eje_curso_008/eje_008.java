package eje_curso_008;

import javax.swing.JOptionPane;

public class eje_008 {

	public static void main(String[] args) {
		
		
		String pass1 = "david";
		String pass2 = "";
		
		while(pass1.equals(pass2)==false){
			
			pass2 = JOptionPane.showInputDialog("ingresa la clave");
		    
			if(pass1.equals(pass2)==false){
				System.out.println("no es igual");
		    }
		}
		
		
		System.out.println("es igual");
	}
}
