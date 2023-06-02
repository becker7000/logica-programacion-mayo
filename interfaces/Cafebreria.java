import java.util.ArrayList;

public class Cafebreria {

    public static void main(String[] args) {

        Libro libro1 = new Libro("El llano en llamas","Juan Rulfo",350);
        Libro libro2 = new Libro("Alimenta la mente","Lewis Carroll",150);
        Libro libro3 = new Libro("Padre rico, padre pobre","Robert Kiyosaky",280);

        Producto producto1 = new Producto("cc001","Café capuchino",60);
        Producto producto2 = new Producto("c002","Cool brew",55);

        // Generando una lista de precios.
        ArrayList<IPrecio> precios = new ArrayList<>();

        IPrecio iPrecio1 = libro1;
        IPrecio iPrecio2 = libro2;
        IPrecio iPrecio3 = libro3;
        IPrecio iPrecio4 = producto1;
        IPrecio iPrecio5 = producto2;

        precios.add(iPrecio1);
        precios.add(iPrecio2);
        precios.add(iPrecio3);
        precios.add(iPrecio4);
        precios.add(iPrecio5);

        double total=0.0;

        System.out.print("\n\t Lista de precios: ");
        for( IPrecio precioAux : precios){
            System.out.printf("\n\t  precio: $%.2f",precioAux.getPrecio());
            total+=precioAux.getPrecio();
        }
        System.out.printf("\n\t Total:  $%.2f",total);

    }

}
