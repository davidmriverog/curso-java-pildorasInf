package eje_curso_026;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		// dame la hora
		DameHora oyente = new DameHora();
		
		// se ejectura una accion en cada secuencia de cinco seg.
		Timer  temporizador = new Timer(5000,oyente);
		
		temporizador.start();
		JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener...");
		System.exit(0);
		
	}

}
