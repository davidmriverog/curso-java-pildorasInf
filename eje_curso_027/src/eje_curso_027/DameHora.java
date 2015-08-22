package eje_curso_027;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameHora implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
			
		System.out.println("Te pongo la hora cada cinco segundo:"+ahora);
		
		// Sonido
		// Toolkit.getDefaultToolkit().beep();
		
	}

	
}
