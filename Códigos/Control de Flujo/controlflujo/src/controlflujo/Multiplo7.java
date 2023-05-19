package controlflujo;

import java.util.Scanner;

public class Multiplo7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// -7,0,7,14,21,28,35,...
		int numero;
		System.out.print("\n\t Escribe un número: ");
		numero = Integer.parseInt(entrada.nextLine());
		
		if(numero%7==0) { // Quiere decir que es multiplo de 7.
			System.out.print("\n\t El número es múltiplo de 7.");
		}else {
			System.out.print("\n\t El número no es múltiplo de 7.");
		}
		
		entrada.close();
		
	}

}
