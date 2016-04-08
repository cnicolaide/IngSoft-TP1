
import java.util.Scanner;

public class Main {

    static int resultado = 0;
    static String cadena;
    
    public static void main(String[] args) {

        System.out.println("CALCULADORA POR LINEA DE COMANDOS \n");
        System.out.println("Por favor ingrese la operacion a realizar y presione ENTER para calcular \n");

        // LEO UN STRING INGRESADO POR TECLADO
        cadena = setCalculo();

        operar();

        // IMPRIMO EL RESULTADO
        imprimir();
    }
    
    public static void operar(){
        // SEPARO LA CADENA INCIAL EN TOKENS DELIMITADOS POR ESPACIOS
        String delimitadores = "[ .,;?!¡¿\\'\\\"\\\\[\\\\]]+";
        String[] palabrasSeparadas = cadena.split(delimitadores);

        // INICIALIZO RESULTADO CON EL PRIMER ELEMENTO INGRESADO
        resultado = Integer.parseInt(palabrasSeparadas[0]);

        // REALIZO LAS OPERACIONES DE SUMA Y RESTA
        resultado = calcular(palabrasSeparadas, resultado);
    }

    public static String setCalculo() {
        Scanner entradaEscaner = new Scanner(System.in);
        String cadena = entradaEscaner.nextLine();

        return cadena;
    }

    // PERMITO SETEAR EL CALCULO DIRECTAMENTE
    public static void setCalculo(String cadena) {
        Main.cadena = cadena;
    }

    public static int calcular(String[] palabrasSeparadas, int resultado) {

        for (int i = 1; i < palabrasSeparadas.length; i++) {

            if (palabrasSeparadas[i].compareTo("+") == 0) {
                resultado = resultado + Integer.parseInt(palabrasSeparadas[i + 1]);
            } else if (palabrasSeparadas[i].compareTo("-") == 0) {
                resultado = resultado - Integer.parseInt(palabrasSeparadas[i + 1]);
            } else if (palabrasSeparadas[i].compareTo("*") == 0) {
                resultado = resultado * Integer.parseInt(palabrasSeparadas[i + 1]);
            } else if (palabrasSeparadas[i].compareTo("/") == 0) {
                resultado = resultado / Integer.parseInt(palabrasSeparadas[i + 1]);
            }
        }
        return resultado;
    }

    public static void imprimir() {
        System.out.println("\n" + getResultado());
    }

    public static String getResultado() {
        return (cadena + " = " + resultado);
    }
}
