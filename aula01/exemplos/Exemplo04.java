package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade:");
        idade = entrada.nextInt(); // Lê do teclado um valor inteiro
        System.out.println("Você digitou " + idade);

        entrada.close();
    }
}
