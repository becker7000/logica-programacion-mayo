package primerospasos;

import java.util.Scanner;

public class Strings2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		String apellido;
		
		System.out.print("\n\t Escribe tu nombre: ");
		nombre = entrada.nextLine();
		
		System.out.print("\n\t Escribe tu apellido: ");
		apellido = entrada.nextLine();
		
		System.out.print("\n\t La inicial de tu nombre es: "+nombre.charAt(0));
		
		System.out.print("\n\t El nombre es cadena vacía? Respuesta: "+nombre.isEmpty());
		
		// print format, %d es un código de formato para presentar enteros.
		System.out.printf("\n\t Tu nombre tiene %d letras",nombre.length());
		
		System.out.print("\n\t Nombre completo: "+nombre.concat(" "+apellido));
		
		System.out.print("\n\t Iniciales de tu nombre completo: "+nombre.charAt(0)+apellido.charAt(0));
		
		entrada.close();
		
	}

}

/*
 * 	Presentar las iniciales del Usuario en una nueva línea.
 * 
 * */








