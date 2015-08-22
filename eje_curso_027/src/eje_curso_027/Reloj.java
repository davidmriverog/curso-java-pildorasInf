package eje_curso_027;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

class Reloj {
	
	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo, boolean sonido){
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	/* Methods */
	
	public void enMarcha(){
		ActionListener oyente = new dameLaHora2();
		
		Timer  temporizador = new Timer(intervalo,oyente);
		temporizador.start();
	}
	
	// clase interna
	private class dameLaHora2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Date hora = new Date();
			
			System.out.println("te pongo la hora cada 3 segundos: "+hora);
			
			if(sonido){
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}
}
