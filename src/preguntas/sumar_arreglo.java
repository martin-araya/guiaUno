package preguntas;

import java.util.Scanner;

public class sumar_arreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        rellenarArreglo(arreglo);
        int suma = sumarArreglo(arreglo);
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }

    public static void rellenarArreglo(int[] arreglo) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un numero " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
    }

    public static int sumarArreglo(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }
}