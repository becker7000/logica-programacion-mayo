public class Deportista extends Usuario {

    private String disciplina;

    public Deportista(String nombre, String telefono, String disciplina) {
        super(nombre, telefono);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void mostrar(){
        System.out.print("\n\t +---------------------------+");
        System.out.print("\n\t | Nombre: "+getNombre());
        System.out.print("\n\t | Teléfono: "+getTelefono());
        System.out.print("\n\t | Deporte: "+getDisciplina());
        System.out.print("\n\t +---------------------------+");
    }

}
