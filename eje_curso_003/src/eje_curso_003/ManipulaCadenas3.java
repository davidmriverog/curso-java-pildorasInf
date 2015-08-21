package eje_curso_003;

public class ManipulaCadenas3 {
   
   public static void main(String[] args) {
	  String alumno1,alumno2;
	  
	  alumno1 = "David";
	  alumno2 = "david";
	  
	  System.out.println(alumno1.equals(alumno2));
	  System.out.println(alumno1.equalsIgnoreCase(alumno2));
	  
	  
	  if(alumno1.equalsIgnoreCase(alumno2)){
		  System.out.println("Es identico");
	  }else{
		  System.out.println("No es identico");
	  }
	  
   }
}
