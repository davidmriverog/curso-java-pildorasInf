package interfaz;

import javax.swing.JFrame;

import apps.MiApplication;

public class Interfaz {

	public static void main(String[] args) {
		MiApplication app = new MiApplication();
		
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
