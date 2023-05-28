package intronumeros;

import java.util.Scanner;

public class CalculadoraTiempo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int segundos;
		int minutos;
		
		System.out.print("\n\t Escribe los segundos: ");
		segundos = entrada.nextInt();
		entrada.nextLine();
		
		minutos=segundos/60;
		segundos=segundos%60;

		System.out.print("\n\t Son equivalentes a "+minutos+" minutos con "+segundos+" segundos.");
		System.out.printf("\n\t Son equivalentes a %d minutos con %d segundos.",minutos,segundos);
			
		entrada.close();
		
	}

}

/*
 *  segundos: 400
 * 	
 * 	360 <- forman 6 minutos.
 * 	 40 <- sobran 40 segundos.
 * 
 * */




