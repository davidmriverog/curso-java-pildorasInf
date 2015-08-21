package eje_curso_012;

import javax.swing.JOptionPane;

public class eje_012 {
  
	
	public static void main(String[] args) {
		
		String correo = JOptionPane.showInputDialog("Ingrese E-Mail:");
		boolean arroba = false, punto=false;
		int mas_arroba = 0,mas_punto=0;
		int posicion_encontrada = 0;
		
		for(int i=0;i<correo.length();i++){
			
			if(correo.charAt(i)=='@'){
				
				posicion_encontrada = i;
				mas_arroba++;
				arroba=true;
			}
			
			if(correo.charAt(i)=='.'){
				punto = true;
				mas_punto++;
			}
			
		}
		
		if(arroba==true){
			
			if(mas_arroba>1){
				System.out.println("E-mail No es Correcto tiene "+mas_arroba
				  +" Arrobas");
			}else{
				
				if(punto==true){
					if(mas_punto>1){
						System.out.println("E-mail No es Correcto tiene "
					    +mas_arroba+" puntos");
					}else{
						System.out.println("E-mail Correcto encontrada en la "+""
						 +"posicion "+posicion_encontrada+"de "+correo.length()+
						 "Caracteres con "+mas_arroba +" Arroba y punto");	
					}
				}else{
					System.out.println("E-mail No es Correcto no tiene punto");
				}
			  
			}			
		}else{
			if(punto==false){
				System.out.println("E-mail No es Correcto no tiene punto");
			}
			System.out.println("E-mail No es Correcto no tiene arroba");
		}
	}
}
