package main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int resultado = 0;

        System.out.println("CALCULADORA POR LINEA DE COMANDOS \n");
        System.out.println("Por favor ingrese la operacion a realizar y presione ENTER para calcular \n");

        // LEO UN STRING INGRESADO POR TECLADO
        Scanner entradaEscaner = new Scanner(System.in);
        String cadena = entradaEscaner.nextLine();

        // SEPARO EL STRING INCIAL POR ESPACIOS
        String delimitadores = "[ .,;?!¡¿\\'\\\"\\\\[\\\\]]+";
        String[] palabrasSeparadas = cadena.split(delimitadores);

        // INICIALIZO RESULTADO CON EL PRIMER ELEMENTO INGRESADO
        resultado = Integer.parseInt(palabrasSeparadas[0]);

        // REALIZO LAS OPERACIONES DE SUMA Y RESTA
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

        // IMPRIMO EL RESULTADO
        System.out.println("\n" + cadena + " = " + resultado);
    }
}
