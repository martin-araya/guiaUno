// Este ejercicio solo se puede hacer a traves de sumas.
package preguntas;

import java.util.Scanner;
public class multiplicar_con_suma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        int resultado = multiplicarPorSuma(num1,num2);
        System.out.println(resultado);
    }
    public static int multiplicarPorSuma(int num1, int num2) {
        int resultado = 0;
        for (int i = 0; i<num2; i++) {
            resultado = resultado += num1;
        }
            return resultado;
    }
}
