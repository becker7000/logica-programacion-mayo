public class TestException2 {

    public static void main(String[] args) {

        int a=5, b=0;

        try {
            int resultado = a / b;
            System.out.printf("\n\t Resultado: %d", resultado);
        }catch (ArithmeticException exception){
            System.out.print("\n\t Error generado por dividir por cero.");
            System.out.print("\n\t Message: "+exception.getMessage());
        }

    }

}
