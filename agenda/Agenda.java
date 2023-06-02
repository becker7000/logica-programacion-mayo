
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();

        int opcion=0;
        int idGlobal=1; // 1,2,3,4,5,...

        while(opcion!=5){ // No sabemos cuando terminará (indeterminado).

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

            // Variables auxiliares:
            String nombre="";
            String telefono="";
            int idContacto=0;
            boolean banderilla=false; // Verdadero en caso de que un contacto haya sido encontrado.

            switch(opcion){
                case 1 -> { // Agregar contacto.
                    System.out.print("\n\t Agregando contacto.");
                    System.out.print("\n\t Nombre: ");
                    nombre=entrada.nextLine();
                    System.out.print("\n\t Teléfono: ");
                    telefono=entrada.nextLine();
                    Contacto contacto = new Contacto(idGlobal,nombre,telefono);
                    idGlobal++;
                    contactos.add(contacto);
                    System.out.print("\n\t Contacto guardado.");
                    contacto.mostrar();
                }
                case 2 -> { // Ver lista de contactos
                    System.out.print("\n\t Contacto de la agenda.");
                    if(contactos.isEmpty()){
                        System.out.print("\n\t Agenda vacía.");
                    }else{
                        for(Contacto contactoAux : contactos){
                            contactoAux.mostrar();
                        }
                    }
                }
                case 3 -> { // Modificar contacto.

                    System.out.print("\n\t Modificando contacto.");
                    System.out.print("\n\t Dame el id: ");
                    idContacto = Integer.parseInt(entrada.nextLine());
                    System.out.println();

                    // Algoritmo de busqueda secuencial:
                    for(Contacto contactoAux : contactos ){

                        if(idContacto == contactoAux.getId()){
                            System.out.print("\n\t Contacto encontrado.");
                            contactoAux.mostrar(); // Mostramos el contacto.

                            System.out.print("\n\t Nombre: ");
                            nombre=entrada.nextLine();
                            System.out.print("\n\t Teléfono: ");
                            telefono=entrada.nextLine();

                            // Modificamos nombre y telefono
                            contactoAux.setNombre(nombre);
                            contactoAux.setTelefono(telefono);

                            System.out.print("\n\t Contacto modificado.");
                            contactoAux.mostrar();

                            // Validación que indica que el contacto fué encontrado.
                            banderilla=true;
                            break; // Como ya encontramos el contacto, entonces dejamos de recorrer la lista.
                        }
                    }

                    if(!banderilla) // !banderilla -> !false -> true
                        System.out.print("\n\t No existe ningún contacto con id: "+idContacto);
                }
                case 4 -> {
                    System.out.print("\n\t Eliminando contacto.");
                    System.out.print("\n\t Dame el id: ");
                    idContacto = Integer.parseInt(entrada.nextLine());
                    System.out.println();

                    for(Contacto contactoAux : contactos){
                        if(idContacto==contactoAux.getId()){
                            System.out.print("\n\t Contacto encontrado");
                            contactoAux.mostrar();
                            contactos.remove(contactoAux);
                            System.out.print("\n\t Contacto eliminado.");
                            banderilla=true;
                            break;
                        }
                    }

                    if(!banderilla)
                        System.out.print("\n\t No existe ningún contacto con el id: "+idContacto);
                }
                case 5 -> {
                    System.out.print("\n\t Nos vemos pronto, gracias por usar la agenda.");
                }
            }

            System.out.println("\n\t Pulsa la tecla [ENTER] para continuar...");
            entrada.nextLine(); // Recibe cualquier pulsación de tecla.

        }

        System.out.print("\n\t Fin del programa...");

        entrada.close();

    }

}
