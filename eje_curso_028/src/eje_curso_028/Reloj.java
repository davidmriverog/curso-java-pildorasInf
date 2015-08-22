package eje_curso_028;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

class Reloj {
	

	/* Methods */
	
	public void enMarcha(int intervalo,final boolean sonido){
		
		// clase interna local
		class dameLaHora2 implements ActionListener{

		   @Override
		   public void actionPerformed(ActionEvent arg0) {
					
			  Date hora = new Date();
			  System.out.println("te pongo la hora cada 2 segundos: "+hora);
			  
			  if(sonido){
							Toolkit.getDefaultToolkit().beep();
			  }
		   }
					
		}
				
		ActionListener oyente = new dameLaHora2();
		
		Timer  temporizador = new Timer(intervalo,oyente);
		temporizador.start();
	}
	
}
