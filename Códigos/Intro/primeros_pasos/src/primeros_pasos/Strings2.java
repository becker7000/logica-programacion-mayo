package primeros_pasos;

import java.util.Scanner;

public class Strings2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre, apellido;
		
		System.out.print("\n\t Escribe tu nombre: ");
		nombre = entrada.nextLine();
		
		System.out.print("\n\t Escribe tu apellido: ");
		apellido = entrada.nextLine();
		
		System.out.print("\n\t La inicial de tu nombre es: "+nombre.charAt(0));
		
		System.out.print("\n\t Tu nombre completo es: "+nombre.concat(apellido));
		
		entrada.close();
		
	}

}
