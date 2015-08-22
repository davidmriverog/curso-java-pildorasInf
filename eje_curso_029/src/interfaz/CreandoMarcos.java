package interfaz;

import javax.swing.JFrame;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		
		
		// metodo para terminar el uso del programa liberando espacio en la memo
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
