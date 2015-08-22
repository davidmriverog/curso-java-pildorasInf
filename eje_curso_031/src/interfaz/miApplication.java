package interfaz;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;



public class miApplication extends JFrame{
	
	/**
	 *  SerialUID
	 */
	private static final long serialVersionUID = -5703368979064621413L;

	public miApplication() {
		
		// pantalla
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		// dimension de la pantalla
		Dimension sizeScreen = mipantalla.getScreenSize();
		
		
		int alturaPantalla = sizeScreen.height;
		int achoPantalla = sizeScreen.width;
		
		setSize(achoPantalla/2, alturaPantalla/2);
		
		
		setLocation(achoPantalla/4, alturaPantalla/4);
		
		
		setTitle("Clase de auto centar las ventana - marco centrado");
		Image miIcono = mipantalla.getImage("yop.png");
		
		setIconImage(miIcono);
		
		
	}
}
