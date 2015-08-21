package eje_curso_013;

public class UsodeForeach {

	public static void main(String[] args) {
		String[] paises = {"Venezuela","Colombia","Perú","Chile"};
	
		
		for(int i=0;i<paises.length;i++){
			
			System.out.println("Pais "+(i+1)+" es:"+paises[i]);
		}
		
		for(String pais: paises){
			
			System.out.println("Pais: "+pais+" desde un foreach");
		}
	}

}
