package primerospasos;

import javax.swing.JOptionPane;

public class MiniLogin {

	public static void main(String[] args) {
		
		String password = "java1234";
		String pass_user;
		
		pass_user = JOptionPane.showInputDialog("Password: ");
		
		boolean es_correcta;
		es_correcta = pass_user.equals(password);
		
		System.out.print("\n\t ¿La contraseña fué correcta? R: "+es_correcta);
		
	}

}
