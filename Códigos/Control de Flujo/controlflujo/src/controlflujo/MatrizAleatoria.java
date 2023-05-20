package controlflujo;

import java.util.Scanner;

public class MatrizAleatoria {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.print("\n\t Escribe el valor de n: ");
		n=Integer.parseInt(entrada.nextLine());
		
		for(int i=0;i<n;i++) {
			System.out.println("\n"); //Hace un salto de línea.
			for(int j=0;j<n;j++) {
				System.out.printf("\t %d",((int)(Math.random()*40)+10)); // 10 y 50
			}
		}
		
		entrada.close();
		
	}

}


/*
 * 	1  3  7
 *  2  4  2
 *  4  1  5
 *  
 *  Matriz de 3x3, n=3
 *  
 *
 */