package component;

import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import apps.miApps;

public class initComponents {

	public static void main(String[] args) {
		
		String[] nombreFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		// listamos todas las fuentes
		for(String nomb : nombreFuentes){
			System.out.println(nomb);
		}
		
		miApps apps = new miApps();
		
		apps.setVisible(true);
		
		apps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
