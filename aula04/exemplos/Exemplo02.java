package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) { // main = principal
        Scanner entrada = new Scanner(System.in);
        int calculo;
        int numero1;

        System.out.println("Informe um número inteiro:");
        numero1 = entrada.nextInt();

        calculo = soma(numero1, 5);

        System.out.println(numero1 + " + 5 = " + calculo);

        entrada.close();
    }

    // recebe 2 valores inteiros e retorna um inteiro
    public static int soma(int valo1, int valor2) {
        int resultado;

        resultado = valo1 + valor2;

        return resultado;
    }

}
