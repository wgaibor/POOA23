public class Materia implements IEstudiar{
    public String nombre;
    public int horas;

    @Override
    public boolean pasasteLaMateria(String respuesta) {
        if(respuesta.equalsIgnoreCase("SI")){
            return true;
        }
        return false;
    }

    
}
