public class App {
    public static int  edadMinima  = 18; //Variable global
    public static Long edadMinimaL = 18L;
    //public static Double valorUnitario, valorSinDescuento, valorTotal;
    public static Double valorUnitario      = 2.812;
    public static Double valorSinDescuento  = 1.517;
    public static Double valorTotal         = 3.156;
    public static Float  x                  = 2.812F;
    public static Float  y                  = 1.517F;
    public static Float  z                  = 3.156F;

    public static String nombre;
    public static void main(String[] args) throws Exception {
        /*System.out.println(edadMinima);
        int edadMaxima; //Variable interna
        System.out.println("18:30 - 20:30 .::. Miercoles .::. Sistema Operativo .::. canción");
        System.out.println("18:30 - 21:30 .::. Jueves .::. POO");
        edadMinima = edadMinima +1;
        edadMinima = dimeElNumero();
        edadMinima++;
        String queNumeroEs = ComoTeLLamas();
        System.out.println("La cosa que estas buscando es "+queNumeroEs);
        System.out.println(7+16);
        System.out.println("7"+16);
        System.out.println(edadMinima);*/

        /*int numero; // Declara la variable numero como entera
        numero = 5; // Asigna el valor 5 a la variable numero
        // Muestra el valor de numero
        System.out.println("El valor actual de mi variable es " + numero);
        numero = 7; // Asigna el valor 7 a la variable numero
        // Muestra de nuevo el valor de numero
        System.out.println("y ahora es " + numero);
        System.out.println(edadMinima+edadMinimaL);
        System.out.println(valorUnitario+x);*/

        int x;
        x = 100;
        System.out.println(x + " -- " + (x + 5) + " -- " + (x - 5));
        x++;
        System.out.println((x * 5) + " " + (x / 5) + " " + (x % 5));
    }

    public static int dimeElNumero(){
        return edadMinima+5;
    }

    public static String ComoTeLLamas(){
        return "8esocho";
    }

    public static void DimeLaHora(){
        System.out.println("Son las 8pm");
    }

}
