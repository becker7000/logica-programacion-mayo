package intronumeros;

import java.util.Scanner;

public class CalculadoraIVA {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		double monto_sin_iva;
		double monto_con_iva;
		
		System.out.print("\n\t Escribe un monto sin IVA: ");
		monto_sin_iva = entrada.nextDouble();
		entrada.nextLine(); // Buena práctica
		
		monto_con_iva = monto_sin_iva*1.16 ; // 100% + 16% = 116% monto con iva 
		
		System.out.print("\n\t Monto con IVA es: $"+monto_con_iva);
		System.out.printf("\n\t Monto con IVA es: $%.2f",monto_con_iva);
		
		entrada.close(); // Buena práctica.
		
	}
	

}
