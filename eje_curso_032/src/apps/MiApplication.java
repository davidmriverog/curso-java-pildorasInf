package apps;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiApplication extends JFrame {

	private static final long serialVersionUID = 6017232591070640565L;

	public MiApplication() {
		
		// pantalla
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
				
	    // dimension de la pantalla
		Dimension sizeScreen = mipantalla.getScreenSize();
				
				
		int alturaPantalla = sizeScreen.height;
		int achoPantalla = sizeScreen.width;
				
		setSize(600,400);
					
		setLocation(achoPantalla/4, alturaPantalla/4);
		setResizable(false);
		
		setTitle("Uso de marco con paneles JPanel");
		Image miIcono = mipantalla.getImage("yop.png");
		setIconImage(miIcono);
		
		// Body
		
		miLamina panel = new miLamina();
		add(panel);
		
		
	}
}

class miLamina extends JPanel{

	private static final long serialVersionUID = 8271418929092305257L;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo SWING",100,100);
	}
	
}
