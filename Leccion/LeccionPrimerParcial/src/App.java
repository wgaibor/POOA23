import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Ingresar número");
        String valor = System.console().readLine();
        boolean esPrimoElNumero = esPrimo(Integer.valueOf(valor));
        if(esPrimoElNumero){
            System.out.println("El número ingresado es primo");
        } else {
            System.out.println("El número ingresado NO es primo");
        }*/
        
        int valor1 = 6;
        int valor2 = 8;
        int valor3 = 5;
        
        int[] arrayNumero = new int[4];
        if(arrayNumero.length < 1){
            System.out.println("[[1]] esta vacio");
        }
        arrayNumero[0] = 87;
        if(arrayNumero.length < 1){
            System.out.println("[[2]] esta vacio");
        }
        arrayNumero[1] = 7;
        arrayNumero[2] = 90;
        arrayNumero[3] = 1;
        //arrayNumero[4] = 60;

        System.out.println(Arrays.toString(arrayNumero)+"");
        System.out.println(arrayNumero[1]+"");
        System.out.println(arrayNumero[3]+"");

        List<Integer> lstNumeros = new ArrayList<>();
        if(lstNumeros.isEmpty()){
            System.out.println("[1] Esta vacia");
        }
        lstNumeros.add(87);
        if(lstNumeros.isEmpty()){
            System.out.println("[2] Esta vacia");
        }
        lstNumeros.add(7);
        lstNumeros.add(90);
        lstNumeros.add(1);
        System.out.println(lstNumeros+"");
        System.out.println(lstNumeros.get(1));

        System.out.println(lstNumeros.contains(89));
        System.out.println(lstNumeros.indexOf(90));
        System.out.println(lstNumeros.get(2));
        lstNumeros.add(25);
        System.out.println(lstNumeros.size());

        //Ordenar elementos de manera asc de menor a mayor
        Collections.sort(lstNumeros);
        System.out.println(lstNumeros+"");
        //Ordenar elementos de manera desc de mayor a menor
        Collections.sort(lstNumeros, Collections.reverseOrder());
        System.out.println(lstNumeros+"");


        //Ejercicio
        List<String> lstNombres = new ArrayList<>();
        lstNombres.add("Joao");
        lstNombres.add("Jorge");
        lstNombres.add("Eduardo");
        lstNombres.add("Kevin");
        lstNombres.add("Nadia");
        lstNombres.add("Mariano");

        for (String nombre : lstNombres) {
            System.out.println(nombre+"");
        }
    }

    public static boolean esPrimo(int numero){
        if(numero <= 1){
            return false;
        }
        for(int incremento=2; incremento <= numero / 2; incremento++){
            if(numero % incremento == 0){
                return false;
            }
        }
        return true;
    }
}
