
public class Alumno extends Persona{
    private String descripcion;

    

    public Alumno(String name, int age, Long i, Long j, String address, String nationatily, String descripcion) {
        super(name, age, i, j, address, nationatily);
        this.descripcion = descripcion;
    }

    public String hacerDeberes(String nombreMateria) {
        return "Estoy haciendo el deber de la materia  "+nombreMateria;
    }
    
    public String evaluaciones(String nombreMateria) {
        return "Estoy listo para rendir la prueba de "+nombreMateria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
