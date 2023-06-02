public class AutomovilTest {

    public static void main(String[] args) {

        Automovil auto1 = new Automovil("BMW","i8",3000000);
        Automovil auto2 = new Automovil("Ford","Bronco",1000000);
        Automovil auto3 = new Automovil("Subaru","BRZ",750000);
        Automovil auto4 = new Automovil("Chevrolete","Corvette",2800000);

        // auto1.modelo="M4"; // Esto ya no sería posible con una clase Encapsulada.

        auto1.mostrarAuto();
        auto2.mostrarAuto();
        auto3.mostrarAuto();
        auto4.mostrarAuto();

        // Accediendo a la marca de un Auto.
        // Accediendo al valor de una variable de un objeto.
        System.out.print("\n\t Marca de algún auto: "+auto2.getMarca());

        auto3.setModelo("WRX");
        auto3.mostrarAuto();



    }

}
