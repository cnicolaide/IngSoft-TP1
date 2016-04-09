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

    public static void operar() {
        // SEPARA LA CADENA RECIBIDA EN TOKENS DELIMITADOS POR ESPACIOS
        String delimitadores = "[ .,;?!¡¿\\'\\\"\\\\[\\\\]]+";
        String[] palabrasSeparadas = cadena.split(delimitadores);

        // INICIALIZA RESULTADO CON EL PRIMER ELEMENTO INGRESADO
        resultado = Integer.parseInt(palabrasSeparadas[0]);

        // REALIZA LAS OPERACIONES
        resultado = calcular(palabrasSeparadas, resultado);
    }

    // SETEA LA OPERACION A REALIZAR A TRAVES DE INGRESO POR TECLADO
    public static String setCalculo() {
        Scanner entradaEscaner = new Scanner(System.in);
        String cadena = entradaEscaner.nextLine();

        return cadena;
    }

    // SETEA LA OPERACION A REALIZAR A TRAVES DE PASAJE POR PARAMETRO
    public static void setCalculo(String cadena) {
        Main.cadena = cadena;
    }
    
    // REALIZA LAS DIFERENTES OPERACIONES MATEMATICAS CON LOS TOKENS
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

    // IMPRIME EL RESULTADO
    public static void imprimir() {
        System.out.println("\n" + getResultado());
    }

    // RETORNA EL RESULTADO EN UN STRING
    public static String getResultado() {
        return (cadena + " = " + resultado);
    }
}
