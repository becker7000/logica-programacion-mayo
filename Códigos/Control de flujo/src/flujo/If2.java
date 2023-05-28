package flujo;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.print("\n\t Escribe un número: ");
		numero = entrada.nextInt();
		entrada.nextLine();
		
		if(numero>0) {
			System.out.print("\n\t El número es positivo.");
		}
		
		if(numero<0) {
			System.out.print("\n\t El número es negativo.");
		}
		
		if(numero==0) {
			System.out.print("\n\t El número es cero.");
		}
		
		entrada.close();
		
	}

}
