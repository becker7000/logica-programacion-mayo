import java.util.ArrayList;

public class ClinicaDeportivaTest {

    public static void main(String[] args) {

        Usuario u1 = new Medico("Eduardo","5512345678","Cardiología");
        Usuario u2 = new Medico("Laura","5591828382","Neurología");
        Usuario u3 = new Deportista("Pepe","5691827364","Natación");
        Usuario u4 = new Deportista("María","4401927349","Atletísmo");

        // Declaramos una lista de usuarios.
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        // Agregamos a los usuarios a la lista:
        listaUsuarios.add(u1);
        listaUsuarios.add(u2);
        listaUsuarios.add(u3);
        listaUsuarios.add(u4);

        // Foreach es un bucle especial para las listas, arreglos, sets, etc...
        for(Usuario usuario : listaUsuarios ){
            usuario.mostrar();
        }

    }

}
