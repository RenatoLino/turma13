package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exemplo01
 */
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, b;

        try {
            System.out.println("Digite um número inteiro:");
            n = entrada.nextInt();
            System.out.println("Você digitou " + n);
            b = 10 / n;
            System.out.println("b = " + b);
        } catch (InputMismatchException e) {
            System.out.println("Digitação inválida.");
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            entrada.close();
        }

        System.out.println("Final do programa.");
    }

}