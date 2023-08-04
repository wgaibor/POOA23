
public class Alumno extends Persona implements IPersona, IEstudiar{
    private String descripcion;

    

    public Alumno(String name, int age, Long i, Long j, String address, String nationatily, String descripcion) {
        super(name, age, i, j, address, nationatily);
        this.descripcion = descripcion;
        System.out.println("Esto esta mal  -->  "+App.dimeLaHora());
        
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

    @Override
    public String estudiar(String parametro1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estudiar'");
    }

    @Override
    public String dimeTuNacionalidad(String argumento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dimeTuNacionalidad'");
    }

    @Override
    public boolean pasasteLaMateria(String respuesta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pasasteLaMateria'");
    }
}
