package flujo;

import java.util.Scanner;

public class Rangos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int edad;
		
		System.out.print("\n\t Escribe tu edad: ");
		edad = entrada.nextInt();
		entrada.nextLine();
		
		if(edad<12) { // Verdadero si tiene menos de 12
			System.out.print("\n\t Edad insuficiente para el registro.");
		}else if(edad<=65) {
			System.out.print("\n\t Edad válida para el registro.");
		}else {
			System.out.print("\n\t Edad no válida.");
		}
		
		entrada.close();
		
	}

}
