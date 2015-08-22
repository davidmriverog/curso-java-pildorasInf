package app;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class miApplication extends JFrame {

	private static final long serialVersionUID = -8268560520950170167L;
	
	public miApplication() {
		// pantalla
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
						
		// dimension de la pantalla
		Dimension sizeScreen = mipantalla.getScreenSize();
						
						
		int alturaPantalla = sizeScreen.height;
		int achoPantalla = sizeScreen.width;
						
		setSize(600,400);
							
		setLocation(achoPantalla/4, alturaPantalla/4);
		setResizable(false);
		
		LaminasConFiguras milamina = new LaminasConFiguras();
		add(milamina);
		
		setTitle("Prueba de dibujo en Jrame");
		
		Image miIcono = mipantalla.getImage("yop.png");
		setIconImage(miIcono);
	}
}

class LaminasConFiguras extends JPanel{
	
	
	private static final long serialVersionUID = 1224839537272183294L;

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		// Dibujamos Rectangulos
		// g.drawRect(10, 30, 200, 200);
		
		// Dibujamos la linea
		// g.drawLine(100,100 ,300, 200);
		
		// Dibujamos un arco 
		g.drawArc(30,30, 300, 250, 120, 150);
		
		
		
	}
	
}
