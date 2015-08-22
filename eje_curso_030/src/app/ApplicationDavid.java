package app;

import javax.swing.JFrame;

public class ApplicationDavid extends JFrame {

	private static final long serialVersionUID = 4406859412851752087L;

	public ApplicationDavid() {
	
		// dimension (x,y, ancho,alto) Mejor usarlo por esta
 		setBounds(500,250,500,300);
		
 		// impedir que se redimensione
 		setResizable(false);
 		
 		// titulo
 		setTitle("Mi interfaz con localizacion");
 		
 		// el marco se amplia a tamañao completo
 		// setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
