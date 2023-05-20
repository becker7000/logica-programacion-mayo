package controlflujo;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float promedio=0;
		float nota=-1;
		float contador=0;
		
		System.out.print("\n\t Escribe tus notas. (Cero para calcular)\n");
		while(true) {
			System.out.print("\n\t Nota:");
			nota=Float.parseFloat(entrada.nextLine());
			if(nota==0) break; // Terminar el ciclo while.
			promedio+=nota;
			contador++;
		}
		
		promedio/=contador;
		System.out.printf("\n\t Tu promedio es: %.2f",promedio);
		
		entrada.close();
		
	}

}
/*
 *  8.0 + 9.0 + 8.5 + 7.0 + 9.5 = 8.4 (aprox)
 * 
 * */


