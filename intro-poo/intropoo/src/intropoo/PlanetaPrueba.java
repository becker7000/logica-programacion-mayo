package intropoo;

public class PlanetaPrueba {

	public static void main(String[] args) {
		
		// Instancias(objetos) de la clase Planeta
		Planeta planeta1 = new Planeta("Mercurio",1,"Arena");
		Planeta planeta2 = new Planeta("Venus",2,"Anaranjado");
		Planeta planeta3 = new Planeta("Tierra",3,"Azul");
		Planeta planeta4 = new Planeta("Marte",4,"Rojo");
		
		// Aplicando el método mostraPlaneta(): void
		planeta1.mostrarPlaneta();
		planeta2.mostrarPlaneta();
		planeta3.mostrarPlaneta();
		planeta4.mostrarPlaneta();
		
	}

}
