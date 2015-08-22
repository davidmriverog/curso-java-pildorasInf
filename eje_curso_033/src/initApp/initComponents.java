package initApp;

import javax.swing.JFrame;

import app.miApplication;

public class initComponents {

	public static void main(String[] args) {
		
		miApplication apps = new miApplication();
		
		apps.setVisible(true);		
		apps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
