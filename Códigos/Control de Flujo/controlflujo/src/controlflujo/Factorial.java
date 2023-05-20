package controlflujo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		// 3! = 3*2*1 = 6
		// 4! = 4*3*2*1 = 24
		Scanner entrada = new Scanner(System.in);
		long x,factorial=1; // Las multiplicaciones inician en 1.
		System.out.print("\n\t Escribe un número: ");
		x=entrada.nextInt(); 
		entrada.nextLine();
		
		for(long i=x;i>=1;i--) { // Con int se puede hasta 16!
			factorial*=i; // factorial = factorial * i
		}
		
		System.out.printf("\n\t %d! = %d",x,factorial);
		
		entrada.close();
		
	}

}
