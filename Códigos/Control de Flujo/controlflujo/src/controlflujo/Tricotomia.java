package controlflujo;

import javax.swing.JOptionPane;

public class Tricotomia {

	public static void main(String[] args) {
		
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));
		
		if(numero>0) { // Es positivo? 
			// Los showMessageDialog pueden ser de un tipo: informativo, advertencia, error,...
			JOptionPane.showMessageDialog(null,"El número es positivo.","Positivo",JOptionPane.INFORMATION_MESSAGE);
		}else if(numero<0) { // Es Negativo?
			JOptionPane.showMessageDialog(null,"El número es negativo.");
		}else { // No es ni negativo ni positivo?
			JOptionPane.showMessageDialog(null,"El número es cero.");
		}
		
	}

}
