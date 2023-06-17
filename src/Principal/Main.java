package Principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = 17;
		boolean enPareja = true;
		
		if(edad >= 18) {
			System.out.println("Usted es mayor de edad");
		}else {
			System.out.println("Usted es menor de edad");
		}
		
		
		//Algoritmo de contratacion
		//Criterios son 
		//Estas soltero y tener más de 23 años
		
		if(edad >=23 && enPareja == false) {
			System.out.println("Usted puede postular al trabajo.");
		}else {
			System.out.println("Usted no puede postular al trabajo.");
		}
		
		//Algoritmo para ir al gimnacio
		//Si estoy de humor o esta bueno el clima
		
		boolean estoyDeHumor = true;
		boolean estaBuenoElClima = true;
		
		if(estoyDeHumor == false || estaBuenoElClima == false) {
			System.out.println("Voy al gimnacio");
		}else {
			System.out.println("No voy al gimnacio");
		}
		
		
		boolean esPersona;
		int cantidad = 2;
		
		if(cantidad>=1) {
			esPersona = true;
		}else {
			esPersona = false;
		}
		
		

	}

}
