package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double custoFabrica, imposto, custoDistribuidor, custoFinal;

        System.out.println("Informe o custo de fabrica: ");
        custoFabrica = teclado.nextDouble();

        imposto = custoFabrica * 0.45;
        custoDistribuidor = custoFabrica * 0.28;
        custoFinal = custoFabrica + custoDistribuidor + imposto;

        System.out.println("Imposto: " + imposto);
        System.out.println("Custo Final: " + custoFinal);

        teclado.close();
    }
}
