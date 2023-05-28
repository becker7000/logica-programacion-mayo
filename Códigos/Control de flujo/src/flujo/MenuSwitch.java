package flujo;

import java.util.Scanner;

public class MenuSwitch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcion;

		System.out.print("""

				<<< MENÚ >>>
				+--------------------------------------+
				|	1.- Jugar a lanzar la moneda.  |
				|	2.- Jugar a lanzar el dado.    |
				|	3.- Jugar a adivina el número. |
				|	4.- Salir                      |
				+--------------------------------------+
				Opción: """);

		opcion = entrada.nextInt();
		entrada.nextLine();

		switch (opcion) {
		case 1:
			System.out.print("\n\t Jugando a lanzar la moneda...");
			break;
		case 2:
			System.out.print("\n\t Jugando a lanzar el dado...");
			break;
		case 3:
			System.out.print("\n\t Jugando a adivinar el número...");
			break;
		case 4:
			System.out.print("\n\t Saliendo del menú de juegos.");
			break;
		default:
			System.out.print("\n\t Opción no válida.");
			break;
		}

		entrada.close();

	}

}
