package controlflujo;

import javax.swing.JOptionPane;

public class Tabla7 {

	public static void main(String[] args) {
	
		String mensaje="¿Qué tabla de multiplica quieres?";
		int numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		
		for(int i=1;i<=10;i++) {
			System.out.printf("\n\t %d * %d = %d",numero,i,i*numero);
		}
		
	}

}
