package controlflujo;

import javax.swing.JOptionPane;

public class MiniLogin {

	public static void main(String[] args) {
		 	
		String pass="Java123";
		String pass_user;
		
		pass_user = JOptionPane.showInputDialog("Escribe la contraseña: ");
		
		if(pass.equals(pass_user)) {
			System.out.print("\n\t Bienvenid@ al sistema.");
		}else {
			System.out.print("\n\t Acceso denegado...");
		}
		
	}

}
