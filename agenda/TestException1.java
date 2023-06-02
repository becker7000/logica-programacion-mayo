public class TestException1 {

    public static void main(String[] args) {

        String sueldoCadena = "2000xrt";

        try {
            double sueldoNumero = Double.parseDouble(sueldoCadena);
            System.out.printf("\n\t El sueldo es: %.2f", sueldoNumero);
        }catch (NumberFormatException exception){
            System.out.print("\n\t La cadena contiene letras.");
            System.out.print("\n\t Message: "+exception.getMessage());
        }

        System.out.print("\n\t Continuando con el programa...");

    }

}
