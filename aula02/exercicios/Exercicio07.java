package exercicios;

import java.util.Scanner;

// 1.ler o salário

// 1.1 criar o scanner
// 1.2 criar a variável salario
// 1.3 usar o scanner para ler o salário

// 2. exibir o desconto
// 2.1 comparar o salario de acordo com a tabela
// 2.1.1 usar if's onde a condição é o valor do salário
// 2.1.2 de acordo com as comparações, exibir os descontos

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Digite o valor do salário: ");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento");
        } else {
            if (salario <= 1200) {
                System.out.println("Desconto de 20%");
            } else {
                if (salario <= 2000) {
                    System.out.println("Desconto de 25%");
                } else {
                    System.out.println("Desconto de 30%");
                }
            }
        }
        entrada.close();
    }

}
