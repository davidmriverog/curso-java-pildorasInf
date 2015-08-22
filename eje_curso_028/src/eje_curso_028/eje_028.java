package eje_curso_028;

import javax.swing.JOptionPane;

import eje_curso_028.Reloj;

public class eje_028 {

	
	public static void main(String[] args) {
		Reloj mireloj = new Reloj();
		mireloj.enMarcha(2000,true);
		
	    JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener...");
	    System.exit(0);
	}
}
