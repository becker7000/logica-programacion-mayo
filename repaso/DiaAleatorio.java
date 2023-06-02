import java.util.Random;

public class DiaAleatorio {

    public static void main(String[] args) {

        int dia_aleatorio = new Random().nextInt(1,8);

        // Atajo: sout + Enter
        // System.out.print("\n\t Valor del número: "+dia_aleatorio);

        switch (dia_aleatorio) {
            case 1 -> System.out.println("\n\t " + DiasTexto.LUNES);
            case 2 -> System.out.println("\n\t " + DiasTexto.MARTES);
            case 3 -> System.out.println("\n\t " + DiasTexto.MIÉRCOLES);
            case 4 -> System.out.println("\n\t " + DiasTexto.JUEVES);
            case 5 -> System.out.println("\n\t " + DiasTexto.VIERNES);
            case 6 -> System.out.println("\n\t " + DiasTexto.SÁBADO);
            case 7 -> System.out.println("\n\t " + DiasTexto.DOMINGO);
        }

    }

}
