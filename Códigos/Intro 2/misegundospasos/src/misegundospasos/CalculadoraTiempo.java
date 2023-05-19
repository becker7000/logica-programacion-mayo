package misegundospasos;

import java.util.Scanner;

public class CalculadoraTiempo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int segundos;
		int minutos;
		
		System.out.print("\n\t Escribe los segundos: ");
		segundos = Integer.parseInt(entrada.nextLine());
		
		System.out.printf("\n\t %d segundos son equivalentes a ",segundos);
		// Cálculos:
		// 400 = 360 (6 minutos) + 40 (segundos)
		minutos = segundos/60;
		segundos = segundos%60;
		
		// %d es un código de formato especifico para números enteros (int)
		System.out.printf("%d minutos con %d segundos.",minutos,segundos);
		// System.out.print(minutos+" minutos con "+segundos+" segundos.");
		
		entrada.close();
		
	}

}

/*
 *  Códigos de formato:
 *  %f, %lf (float 3.141592 o double 3.1415926535)
 *  %d, %i (enteros)
 *  %B, %b (Booleanos, true o false)
 *  %c (Caracteres)
 *  %p (Dirección de memoria)
 *  %s (Cadenas o Strings)
 *  %x (Número en hexadecimal)
 *  %o (Número en octal)
 *  %e (Imprime un número en notación cientifica o flotantes)
 *   
 *   
 *  Secuencias de escape:
 *  \n salto de línea
 *  \t tabulación
 *  \a alarma
 * 
 * */


