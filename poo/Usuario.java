public abstract class Usuario {

    protected String nombre;
    protected String telefono;

    // Atajo: alt + insert (constructor)
    public Usuario(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Atajo: alt + insert (getter and setter)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método especial, método abstracto.
    public abstract void mostrar();
    // Son métodos que no llevan bloque de código.
    // ya que serán sobreescritos en las clases hijas.

}
