import java.util.List;

public class Docente extends Persona {

    private List<Materia> asignacionMateria;
    private List<Alumno> lstAlumno;

    public Docente(String name, int age, Long dni, Long phone, String address, String nationatily,
            List<Materia> asignacionMateria, List<Alumno> lstAlumno) {
        super(name, age, dni, phone, address, nationatily);
        this.asignacionMateria = asignacionMateria;
        this.lstAlumno = lstAlumno;
    }

    public String darClases(String nombre) {
        return "Se ha dado la clase de "+nombre;
    }

    public String enviarDeberes(String nombre){
        return "Se espera la resolución de la tarea "+nombre;
    }

    public Alumno califica(Alumno objAlumno) {
        objAlumno.setDescripcion(objAlumno.getDescripcion());
        return objAlumno;
    }

    public List<Materia> getAsignacionMateria() {
        return asignacionMateria;
    }
    public void setAsignacionMateria(List<Materia> asignacionMateria) {
        this.asignacionMateria = asignacionMateria;
    }
    public List<Alumno> getLstAlumno() {
        return lstAlumno;
    }
    public void setLstAlumno(List<Alumno> lstAlumno) {
        this.lstAlumno = lstAlumno;
    }
}
