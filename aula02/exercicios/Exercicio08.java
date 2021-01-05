package exercicios;

import java.util.Scanner;

/*

1. ler os 3 lados

- criar um Scanner
- criar 3 variáveis
- usar o Scanner para ler os 3 valores

2. verificar se é um triângulo

- se cada lado é menor que a soma dos outros 2

3. classificar o triângulo

- todos os lados são iguais
- pelo menos 2 lados são iguais
- todos os lados são diferentes

*/
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado1, lado2, lado3;
        boolean ehTriangulo; 

        System.out.println("Informe os valores dos lados:");
        lado1 = entrada.nextInt();
        lado2 = entrada.nextInt();
        lado3 = entrada.nextInt();

        ehTriangulo = (lado1 <= (lado2 + lado3)) && 
                        (lado2 <= (lado1 + lado3)) && 
                        (lado3 <= (lado2 + lado1));

        if (ehTriangulo) { // ehTriangulo == true
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero.");
            } else {
                if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("Triângulo isosceles.");
                } else {
                    System.out.println("Triângulo escaleno.");
                }
            }
        } else {
            System.out.println("Não é um triangulo.");
        }

        entrada.close();
    }
}
