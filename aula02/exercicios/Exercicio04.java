package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double prestacao, salario, limite;

        // leitura dos dados de entrada
        System.out.println("Informe o valor do salário");
        salario = teclado.nextDouble();
        System.out.println("Informe o valor da prestação");
        prestacao = teclado.nextDouble();

        //calculo do valor limite
        limite = salario * 0.3; // 30% do salário

        // validar o limite da prestação e exibir o resultado
        if (prestacao < limite) {
            System.out.println("O emprestimo pode ser concedido");
        } else {
            System.out.println("O emprestimo não pode ser concedido");
        }

        teclado.close();
    }
}
