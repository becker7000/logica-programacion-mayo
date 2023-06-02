public class Medico extends Usuario {

    private String especialidad;

    public Medico(String nombre, String telefono, String especialidad) {
        super(nombre, telefono); // super hace referencia a la superclase Usuario.
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        System.out.print("\n\t +---------------------------+");
        System.out.print("\n\t | Nombre: "+getNombre());
        System.out.print("\n\t | Teléfono: "+getTelefono());
        System.out.print("\n\t | Especialidad: "+getEspecialidad());
        System.out.print("\n\t +---------------------------+");
    }
}
