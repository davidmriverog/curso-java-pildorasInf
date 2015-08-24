package apps;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class miApps extends JFrame {

	private static final long serialVersionUID = 8175930450562110373L;

	public miApps() {
	
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
		milamina.setBackground(SystemColor.window);
		
				
		setTitle("Uso de colores en figuras geometricas");
		
				
		Image miIcono = mipantalla.getImage("yop.png");
		setIconImage(miIcono);
	}
}

class LaminasConFiguras extends JPanel{
	
	
	private static final long serialVersionUID = 1224839537272183294L;

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		// dibujamos el rectangulo 
		Rectangle2D rect = new Rectangle2D.Double(150,100, 200, 150);
		g2.setPaint(Color.RED);
		g2.fill(rect);
		
		
		// dibujamos la elipse 
		Ellipse2D elipse = new Ellipse2D.Double();
				
		elipse.setFrame(rect);
		
		Color micolor = new Color(104,189, 55);
		micolor.darker();
		
		g2.setPaint(micolor);
		g2.fill(elipse);
		
	}
	
}
