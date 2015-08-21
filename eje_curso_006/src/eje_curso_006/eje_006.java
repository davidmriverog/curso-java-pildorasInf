package eje_curso_006;
import java.util.*;

public class eje_006 {
  
  /**
 * @param args
 */
@SuppressWarnings("resource")	
  public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  
	  System.out.println("Introduce tu edad;");
	  int edad = entrada.nextInt();
	  
	  // if(edad >=18){
	  // 	  System.out.println("ERES MAYOR DE EDAD");
	  // }else{
	  // 	  System.out.println("ERES MENOR DE EDAD");
	  // }
	  
	  if(edad >0 && edad <4){
		  System.out.println("eres un bebé");
	  }else if(edad >=4 && edad <12){
		  System.out.println("eres un niño(a)");
	  }else if(edad >=12 && edad <18){
		  System.out.println("eres un adolescente");
	  }else if(edad >=18 && edad <40){
		  System.out.println("eres un joven");
	  }else if(edad>=40 && edad<65){
		  System.out.println("eres maduro(a)");		  
	  }else{
		  System.out.println("cuidate");
	  }
	  
	  
  }
}
