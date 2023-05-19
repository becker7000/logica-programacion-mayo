package misegundospasos;

import java.util.Scanner;

public class CalculadoraIVA {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double monto_sin_iva;
		double monto_con_iva;
		
		System.out.print("\n\t Escribe el monto sin IVA: $");
		monto_sin_iva = entrada.nextInt();
		entrada.nextLine(); // Cerramos la línea.
		
		// Cálculos: 
		// Ejemplo: $200 -> monto con iva es: $232
		// 200*0.16 + 200*1 = 200*( 0.16 + 1 ) = 200*1.16
		monto_con_iva = monto_sin_iva*1.16;
		
		// Códigos de formato: %d (enteros) y %f (double o float)
		System.out.printf("\n\t El monto con IVA es: $%.2f ",monto_con_iva);
		
		entrada.close();
		
	}

}
