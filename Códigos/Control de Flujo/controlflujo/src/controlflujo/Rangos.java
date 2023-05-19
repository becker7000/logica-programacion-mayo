package controlflujo;

import java.util.Scanner;

public class Rangos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\n\t Escribe un número: ");
		int numero = entrada.nextInt();
		entrada.nextLine();
		
		if(numero>=2 && numero<=5) {
			System.out.print("\n\t Dentro del rango.");
		}else {
			System.out.print("\n\t Fuera del rango.");
		}
		
		entrada.close();
		
	}

}
