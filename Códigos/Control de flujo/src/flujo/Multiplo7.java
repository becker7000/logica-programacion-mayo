package flujo;

import java.util.Scanner;

public class Multiplo7 { // -7, 0, 7, 14, 21, 28, 35, 42, 49, 56, 

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.print("\n\t Escribe un número: ");
		numero = entrada.nextInt();
		entrada.nextLine();
		
		if( numero%7 == 0 ) {
			System.out.print("\n\t El número es múltiplo de 7.");
		}else {
			System.out.print("\n\t El número no es múltiplo de 7.");
		}
		
		entrada.close();
		
	}

}
