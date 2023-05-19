package controlflujo;

import java.util.Scanner;

public class VocalesSwitch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("\n\t Escribe un letra: ");
		char letra = entrada.nextLine().charAt(0);

		// Switch soporta int y char.
		switch(letra) { // Variable de control.
		case 'a': case 'A':
			System.out.print("\n\t Primera vocal");
			break;
		case 'e': case 'E':
			System.out.print("\n\t Segunda vocal");
			break;
		case 'i': case 'I':
			System.out.print("\n\t Tercera vocal");
			break;
		case 'o': case 'O':
			System.out.print("\n\t Cuarta vocal");
			break;
		case 'u': case 'U':
			System.out.print("\n\t Quinta vocal");
			break;	
		default:
			System.out.print("\n\t Ninguna vocal...");
		}
		
		entrada.close();
		
		
	}

}
