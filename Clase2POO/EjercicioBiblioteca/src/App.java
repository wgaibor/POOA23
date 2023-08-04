import java.util.Date;

public class App {
    /**
     * Escribe un programa para una biblioteca que contenga libros y revistas.

Las características comunes que se almacenan tanto para las revistas como para los libros 
son el código, el título, y el año de publicación. 
Estas tres características se pasan por parámetro en el momento de crear los objetos.

Los libros tienen además un atributo prestado. Los libros, cuando se crean, no están prestados.

Las revistas tienen un número. En el momento de crear. En el momento de crear las revistas se pasa el número por parámetro.

Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() 
que devuelve el valor de todos los atributos en una cadena de caracteres.
También tienen un método que devuelve el año de publicación, y otro el código.

Para prevenir posibles cambios en el programa se tiene que implementar una 
interfaz Prestable con los métodos prestar(), devolver() y prestado. 
La clase Libro implementa esta interfaz
     */
    public static void main(String[] args) throws Exception {
        Revista vistazo = new Revista(1, "Vistazo", new Date(), 80);
        System.out.println(vistazo.toString());

        Libros cienciasNaturales = new Libros(2, "Ciencias Naturales", new Date());
        cienciasNaturales.setPrestado(true);
        System.out.println(cienciasNaturales.toString());
        System.out.println(cienciasNaturales.devolver("Eduardo Cortez")
                            +" valor de variable prestado "+cienciasNaturales.prestado());
    }
}
