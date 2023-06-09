/**
Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.
 */

public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Por favor, introduzca la primera hora.");
        System.out.println("Día:");
        String dia1 = System.console().readLine();
        System.out.println("Hora:");
        String hora1 = System.console().readLine();
        System.out.println("Por favor, introduzca la segunda hora.");
        System.out.println("Día:");
        String dia2 = System.console().readLine();
        System.out.println("Hora:");
        String hora2 = System.console().readLine();

        String nombrePrimerDia = "";
        int primerDia = 0;
        String nombreSegundoDia = "";
        int segundoDia = 0;

        int calculoDeHoras = 0;
        
        switch(dia1){
            case "lunes":
                nombrePrimerDia = "Lunes";
                primerDia = 1;
                break;
            case "martes":
                nombrePrimerDia = "Martes";
                primerDia = 2;
                break;
            case "miercoles":
                nombrePrimerDia = "Miercoles";
                primerDia = 3;
                break;
            case "jueves":
                nombrePrimerDia = "Jueves";
                primerDia = 4;
                break;
            case "viernes":
                nombrePrimerDia = "Viernes";
                primerDia = 5;
                break;
            case "sabado":
                nombrePrimerDia = "Sabado";
                primerDia = 6;
                break;
            case "domingo":
                nombrePrimerDia = "Domingo";
                primerDia = 7;
                break;
            default:
                System.out.println("El día ingresado no esta contemplado");
        }

        switch(dia2){
            case "lunes":
                nombreSegundoDia = "Lunes";
                segundoDia = 1;
                break;
            case "martes":
                nombreSegundoDia = "Martes";
                segundoDia = 2;
                break;
            case "miercoles":
                nombreSegundoDia = "Miercoles";
                segundoDia = 3;
                break;
            case "jueves":
                nombreSegundoDia = "Jueves";
                segundoDia = 4;
                break;
            case "viernes":
                nombreSegundoDia = "Viernes";
                segundoDia = 5;
                break;
            case "sabado":
                nombreSegundoDia = "Sabado";
                segundoDia = 6;
                break;
            case "domingo":
                nombreSegundoDia = "Domingo";
                segundoDia = 7;
                break;
            default:
                System.out.println("El día ingresado no esta contemplado");
        }

        calculoDeHoras = ((segundoDia * 24) + Integer.valueOf(hora2)) - ((primerDia * 24)+Integer.valueOf(hora1));
        System.out.println("Desde el día "+nombrePrimerDia+" al día "+nombreSegundoDia+" han transcurrido "+calculoDeHoras+" horas.");*/
        System.out.println("Ingresa el número del mes");
        String valorMes = System.console().readLine();
        int valoresDelMes = Integer.valueOf(valorMes);
        String resultadoEsperado;
        switch(valoresDelMes){
            case 1:
                resultadoEsperado = "Enero";
                break;
            case 2:
                resultadoEsperado = "Febrero";
                break;
            case 3:
                resultadoEsperado = "Marzo";
                break;
            case 4:
                resultadoEsperado = "Abril";
                break;
            case 5:
                resultadoEsperado = "Mayo";
                break;
            case 6:
                resultadoEsperado = "Junio";
                break;
            case 7:
                resultadoEsperado = "Julio";
                break;
            case 8:
                resultadoEsperado = "Agosto";
                break;
            case 9:
                resultadoEsperado = "Septiembre";
                break;
            case 10:
                resultadoEsperado = "Octubre";
                break;
            case 11:
                resultadoEsperado = "Noviembre";
                break;
            case 12:
                resultadoEsperado = "Diciembre";
                break;
            default:
                resultadoEsperado = "La persona ingreso un mes incorrecto";
        }
        System.out.println(""+resultadoEsperado);

        if(valoresDelMes == 1){
            resultadoEsperado = "Enero";
        } else if(valoresDelMes == 2){
            resultadoEsperado = "Febrero";
        } else if(valoresDelMes == 3){
            resultadoEsperado = "Marzo";
        } else if(valoresDelMes == 4){
            resultadoEsperado = "Abril";
        } else if(valoresDelMes == 5){
            resultadoEsperado = "Mayo";
        } else if(valoresDelMes == 6){
            resultadoEsperado = "Junio";
        }
    }
}
