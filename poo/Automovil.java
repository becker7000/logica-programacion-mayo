public class Automovil {

    // Atributos:
    private String marca;
    private String modelo;
    private double precio;

    // Constructor:
    Automovil(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Getters: sirven para obtener el valor de una variable de un objeto. (Una vez encapsulada)
    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public double getPrecio(){
        return this.precio;
    }

    // Setters: sirven para poder modificar o inicializar el valor de una variable de un objeto.
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    void mostrarAuto(){
        System.out.print("\n\t +----------------------+");
        System.out.print("\n\t | Marca: "+this.marca);
        System.out.print("\n\t | Modelo: "+this.modelo);
        System.out.print("\n\t | Precio: $"+this.precio);
        System.out.print("\n\t +----------------------+");
    }

}

// POJO: plain old java object.
