package controlflujo;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("\n\t Escribe un letra: ");
		char letra = entrada.nextLine().charAt(0);

		if (letra == 'a' || letra == 'A') {
			System.out.print("\n\t Primera vocal.");
		} else if (letra == 'e' || letra == 'E') {
			System.out.print("\n\t Segunda vocal.");
		} else if (letra == 'i' || letra == 'I') {
			System.out.print("\n\t Tercera vocal.");
		} else if (letra == 'o' || letra == 'O') {
			System.out.print("\n\t Cuarta vocal.");
		} else if (letra == 'u' || letra == 'U') {
			System.out.print("\n\t Quinta vocal.");
		} else {
			System.out.print("\n\t Ninguna vocal...");
		}

		entrada.close();

	}

}
