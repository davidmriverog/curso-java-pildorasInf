package eje_curso_005;

import javax.swing.*;


public class eje_005 {

	public static void main(String[] args) {
		
		
		
		String  nombre_usuario = JOptionPane.showInputDialog("Ingresa el nombre");
		String edad_usuario = JOptionPane.showInputDialog("Ingresa tu edad");
		
		int edad = Integer.parseInt(edad_usuario);
		
		System.out.println("Hola, "+nombre_usuario+" tu edad es:"+edad);
		
	}
}
