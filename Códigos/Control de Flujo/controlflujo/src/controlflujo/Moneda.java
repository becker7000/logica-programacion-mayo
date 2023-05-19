package controlflujo;

public class Moneda {

	public static void main(String[] args) {

		// Math.random() nos da un valor entre 0.00 y 0.99
		// Math.random()*2 el mínimo 0.00*2=0.00 y máximo 0.99*2=1.98
		// Quitando los decimales: mínimo 0 y máximo 1
		int moneda=(int)(Math.random()*2); // Integer.parseInt("20"); sirve para cadena.
		
		// System.out.print("\n\t Moneda: "+moneda);
		
		if(moneda==0) {
			System.out.println("\n\t "+MonedaTexto.SOOOOL);
		}else {
			System.out.println("\n\t "+MonedaTexto.ÁGUILAA);
		}
		
	}

}
