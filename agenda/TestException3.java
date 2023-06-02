import java.util.Scanner;

public class TestException3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion=0;

        do{ // Filtro de números del 1 al 5.
            System.out.print("\n\t +------------------------------+");
            System.out.print("\n\t | Selecciona una opción:       |");
            System.out.print("\n\t | 1. Agregar contacto          |");
            System.out.print("\n\t | 2. Ver contactos             |");
            System.out.print("\n\t | 3. Modificar contacto        |");
            System.out.print("\n\t | 4. Eliminar contacto         |");
            System.out.print("\n\t | 5. Salir                     |");
            System.out.print("\n\t +------------------------------+");
            System.out.print("\n\t Opción: ");

            try{
                opcion = Integer.parseInt(entrada.nextLine());
            }catch (NumberFormatException exception){
                System.out.print("\n\t El valor deber ser numérico.");
                opcion=0;
            }

        }while(opcion<1 || opcion>5);


        entrada.close();

    }

}
