package controlflujo;

import java.util.Scanner;

public class MenuFiltro {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int opcion;
		
		do { // Filtro para numeros del 1 al 4.
			
			System.out.print("\n\t +-----------------------+");
			System.out.print("\n\t | 1.- Moneda            |");
			System.out.print("\n\t | 2.- Dado              |");
			System.out.print("\n\t | 3.- Adivina el número |");
			System.out.print("\n\t | 4.- Salir             |");
			System.out.print("\n\t +-----------------------+");
			System.out.print("\n\t Opción: ");
			opcion=entrada.nextInt();
			entrada.nextLine();
			
		}while(opcion<1 || opcion>4);
		
		switch(opcion) {
		case 1:
			System.out.print("\n\t Juego de la moneda.");
			int moneda=(int)(Math.random()*2); // Integer.parseInt("20"); sirve para cadena.
			if(moneda==0) {
				System.out.println("\n\t "+MonedaTexto.SOOOOL);
			}else {
				System.out.println("\n\t "+MonedaTexto.ÁGUILAA);
			}
			break;
		case 2:
			System.out.print("\n\t Juego del dado.");
			break;
		case 3:
			System.out.print("\n\t Juego de adivina el número.");
			break;
		case 4:
			System.out.print("\n\t Saliendo de la sala de juegos.");
			break;
		}
		
		entrada.close();
	
	}

}
