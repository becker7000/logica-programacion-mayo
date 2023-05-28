package flujo;

import java.util.Scanner;

public class Rangos2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.print("\n\t Escribe un número: ");
		numero = entrada.nextInt();
		entrada.nextLine();
		
		// Se acepta: 2, 3, 4, 5
		if(numero>=2 && numero<=5) {
			System.out.print("\n\t El número está en el rango.");
		}else {
			System.out.print("\n\t El número está fuera de rango.");
		}
				
		entrada.close();
		
	}

}
