package eje_curso_027;

import javax.swing.JOptionPane;

public class eje_027 {

	public static void main(String[] args) {
		
		// dame la hora		
		Reloj mireloj = new Reloj(3000,true);
		mireloj.enMarcha();
		
	    JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener...");
	    System.exit(0);
	}

}
