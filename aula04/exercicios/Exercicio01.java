package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        ehPar(11);

        System.out.println(ehPar2(10));

        System.out.println(ehPar3(11));

        System.out.println("Digite um valor inteiro:");
        valor = entrada.nextInt();

        if (ehPar3(valor)) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }

        entrada.close();
    }

    
    // métodos


    public static void ehPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
    }

    public static String ehPar2(int numero) {
        if (numero % 2 == 0) {
            return "É par";
        } else {
            return "É impar";
        }
    }

    public static boolean ehPar3(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
