package uri;

import java.util.Scanner;

/**
 * Uri1001
 */
public class Uri1001 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, soma;

        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();

        soma = valor1 + valor2;

        System.out.println("X = " + soma);

        teclado.close();
    }
}