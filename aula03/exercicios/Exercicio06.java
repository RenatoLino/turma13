package exercicios;

import java.util.Scanner;

//NaN = Not a number

public class Exercicio06 {
    public static void main(String[] args) {
        final int QTDE_NUMEROS = 10; // constante
        Scanner teclado = new Scanner(System.in);
        int numero, qtdePares, qtdeImpares;
        double mediaPares;

        mediaPares = 0;
        qtdePares = 0;
        qtdeImpares = 0;

        for (int i = 1; i <= QTDE_NUMEROS; i++) {
            
            System.out.printf("Digite o %dº número: ", i);
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                mediaPares = mediaPares + numero;
                qtdePares++;
            } else {
                qtdeImpares++;
            }
        }
        
        if (qtdePares > 0) {
            mediaPares = mediaPares / qtdePares;
            System.out.println("Média dos pares = " + mediaPares);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

        System.out.printf("Números ímpares = %.2f %%\n", ((double) qtdeImpares / QTDE_NUMEROS) * 100);

        teclado.close();
    }
}
