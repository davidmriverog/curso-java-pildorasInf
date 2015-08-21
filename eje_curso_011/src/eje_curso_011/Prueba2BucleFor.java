package eje_curso_011;

import javax.swing.JOptionPane;

public class Prueba2BucleFor {

	public static void main(String[] args) {
	
		String correo = JOptionPane.showInputDialog("Ingrese E-Mail:");
		boolean arroba = false;
		int posicion_encontrada = 0;
		
		for(int i=0;i<correo.length();i++){
			
			if(correo.charAt(i)=='@'){
				
				posicion_encontrada = i;
				arroba=true;
			}
			
		}
		
		if(arroba==true){
			System.out.println("E-mail Correcto encontrada en la posicion "
		    +posicion_encontrada+"de "+correo.length()+"Caracteres");
		}else{
			System.out.println("E-mail No es Correcto");
		}
	}

}
