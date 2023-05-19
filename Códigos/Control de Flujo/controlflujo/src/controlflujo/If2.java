package controlflujo;

import javax.swing.JOptionPane;

public class If2 {

	public static void main(String[] args) {
		
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un entero: "));
		
		if(numero>0) { 
			System.out.print("\n\t El número es positivo.");
		}
		
		if(numero<0) {
			System.out.print("\n\t El número es negativo.");
		}
		
		if(numero==0) {
			System.out.print("\n\t El número es cero.");
		}
		
	}

}
