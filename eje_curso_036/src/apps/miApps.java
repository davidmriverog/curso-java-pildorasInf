package apps;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
				
		LaminasBotones milamina = new LaminasBotones();
		
		add(milamina);
		milamina.setBackground(SystemColor.window);
		
				
		setTitle("Uso de eventos 1");
		
				
		Image miIcono = mipantalla.getImage("yop.png");
		setIconImage(miIcono);
	}
}

class LaminasBotones extends JPanel implements ActionListener{
	
	
	private static final long serialVersionUID = 1224839537272183294L;

	JButton btnAzul = new JButton("Azul");
	JButton btnAmarillo = new JButton("Amarillo");
	
	public LaminasBotones(){
		
		add(btnAzul);
		add(btnAmarillo);
		
		// hacer un event dentro del panel
		btnAzul.addActionListener(this);
		
		btnAmarillo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.YELLOW);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	  setBackground(Color.BLUE);
	}
	
	
	
}
