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
        System.out.println(mensaje3);*/
        //-----------------
        //-----------------
        Persona objetoAllison = new Persona("Allison",28,1201831461L, Long.valueOf(994756152L) ,"Tulcan y Velez", "Peruana");
        
        String mensaje4 = objetoAllison.trabajar("TECLEMAS");
        objetoAllison.nombre = "Sandra";
        objetoAllison.setDireccion("Bolivia y los Ríos");
        System.out.println("La edad de "+objetoAllison.nombre+" es  "+objetoAllison.edad+ " direccion "+objetoAllison.getDireccion());
        System.out.println(mensaje4);
    }
}
