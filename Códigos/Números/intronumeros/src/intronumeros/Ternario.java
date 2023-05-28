package intronumeros;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("\n\t Escribe tu edad: ");
		int edad = entrada.nextInt();
		entrada.nextLine();

		System.out.printf("\n\t %s ", (edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad"));

		entrada.close();
		
	}

}
