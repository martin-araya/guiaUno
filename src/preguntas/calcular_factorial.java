package preguntas;

import java.util.Scanner;

public class calcular_factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        long resultado = factorial(numero);

        System.out.println("El resultado de la factorial es: " + resultado);
    }
    public static long factorial(int numero) {
        if (numero == 0) {
            return 1;
        }
        else {
            return numero * factorial(numero - 1);
        }
    }
}
