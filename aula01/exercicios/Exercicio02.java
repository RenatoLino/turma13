package exercicios;

import java.util.Scanner;

// ler 2 notas de um aluno e calcular sua média 

public class Exercicio02 {
    public static void main(String[] args) {
        // entrada: ler 2 notas
        // declarar um scanner e duas variáveis
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        // usar o scanner para ler as duas notas
        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextDouble();

        // processamento: calcula a média
        media = (nota1 + nota2) / 2;

        // saída: exibir a média
        System.out.println("Sua média é " + media);

        entrada.close();
    }
}
