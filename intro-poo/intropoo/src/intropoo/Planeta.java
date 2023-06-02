package intropoo;

public class Planeta {

	String nombre;
	int posicion;
	String color;
	
	Planeta(String nombre, int posicion, String color) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.color = color;
	}
	
	void mostrarPlaneta() {
		System.out.print("\n\t +------------------------+");
		System.out.print("\n\t | Nombre: "+this.nombre);
		System.out.print("\n\t | Posición: "+this.posicion);
		System.out.print("\n\t | Color: "+this.color);
		System.out.print("\n\t +------------------------+");
	}
	
}

// IntelliJ IDEA 
