package eje_curso_030;

import javax.swing.JFrame;

import app.ApplicationDavid;

public class Interfaz{


	public static void main(String[] args) {
		
		ApplicationDavid davidApp = new ApplicationDavid();
		
		// init app
		davidApp.setVisible(true);
		// close
		davidApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
