package misegundospasos;

import javax.swing.JOptionPane;

public class Ternario {

	public static void main(String[] args) {
		
		int edad;
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número entero: "));
		
		// %s es el código de formato para las cadena 
		System.out.printf("\n\t %s",(edad>=18)? "Eres mayor de edad":"Eres menor de edad");
		
	}

}
