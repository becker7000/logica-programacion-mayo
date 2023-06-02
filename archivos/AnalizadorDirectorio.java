import java.io.File;
import java.util.Scanner;

public class AnalizadorDirectorio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe el directorio: ");
        String direccion = entrada.nextLine();

        File fileDirectory = new File(direccion);
        File[] listaArchivos = fileDirectory.listFiles();

        // Mostramos la lista de archivos.
        for(File archivoAux : listaArchivos){
            System.out.print("\n\t "+archivoAux);
        }

        System.out.printf("\n\t En este directorio hay %d archivos o directorios.",listaArchivos.length);

        entrada.close();

    }

}
