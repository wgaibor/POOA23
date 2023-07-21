import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       /* Persona eduardo;
        eduardo = new Persona();
        eduardo.nombre = "Eduardo Cortez";
        String mensaje = eduardo.trabajar("NESTLE");
        System.out.println(mensaje);
        //-----------------
        //-----------------
        Persona walther = new Persona();
        walther.nombre = "Walther Joao";
        String mensaje2 = walther.trabajar("TELCONET");
        System.out.println(mensaje2);
        //-----------------
        //-----------------
        Persona objetoGenerico = new Persona();
        objetoGenerico.nombre = "Karla";
        String mensaje3 = objetoGenerico.trabajar("SIN EMPLEO");
        System.out.println(mensaje3);
        //-----------------
        //-----------------
        Persona objetoAllison = new Persona("Allison",28,1201831461L, Long.valueOf(994756152L) ,"Tulcan y Velez", "Peruana");
        
        String mensaje4 = objetoAllison.trabajar("TECLEMAS");
        objetoAllison.nombre = "Sandra";
        objetoAllison.setDireccion("Bolivia y los Ríos");
        System.out.println("La edad de "+objetoAllison.nombre+" es  "+objetoAllison.edad+ " direccion "+objetoAllison.getDireccion());
        System.out.println(mensaje4);*/

        List<Materia> lstMaterias = new ArrayList<>();
        Materia sistemasOperativos = new Materia();
        sistemasOperativos.nombre = "Sistemas Operativos";
        sistemasOperativos.horas = 2;
        lstMaterias.add(sistemasOperativos);
        Materia english = new Materia();
        english.nombre = "Ingles";
        english.horas = 3;
        lstMaterias.add(english);
        Materia poo = new Materia();
        poo.nombre = "Programación Orientada a Objeto";
        poo.horas = 3;
        lstMaterias.add(poo);
        Materia mds = new Materia();
        mds.nombre = "Metodología Desarrollo de Software";
        mds.horas = 2;
        lstMaterias.add(mds);
        System.out.println(lstMaterias.get(2).nombre);


        Alumno alumno1 = new Alumno("Jorge",20,1201831461L, 994756152L ,"Tulcan y Velez", "Ecuatoriano", "Alumno del tecnologico");
    }
}
