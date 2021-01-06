package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limite, cont;

        System.out.print("Informe o limite: ");
        limite = in.nextInt();

        // *** Solução 1 - sem as virgulas ***

        System.out.print("\nSolução 1: ");

        cont = 1;

        while (cont <= limite) {
            System.out.print(cont + " ");
            cont *= 2; // isso é o mesmo que: cont = cont * 2;
        }

        // *** Solução 2 usando as vírgulas, testando (if) a cada valor ***

        System.out.print("\nSolução 2: "); 

        cont = 1;
        while (cont <= limite) {
            if (cont <= limite / 2) {
                System.out.print(cont + ", ");
            } else {
                System.out.println(cont);
            }
            cont *= 2;
        }

        /* Solução 3 - sem else */

        System.out.print("Solução 3: ");

        cont = 1;
        while (cont <= limite) {
            System.out.print(cont);
            cont *= 2;
            if (cont <= limite) {
                System.out.print(", ");
            }

        }

        /* Solução 4 - sem if , mas assume pelo menos 1 valor */

        System.out.print("\nSolução 4: ");

        cont = 1;
        while (cont <= limite / 2) {  // limite /2 é o penultimo número
            System.out.print(cont + ", ");
            cont *= 2;
        }
        System.out.println(cont);

        // *** Solução 5 - sem realizar teste (if), mas assume pelo menos 1 valor ***
        
        System.out.print("Solução 5: ");

        cont = 2;
        System.out.print(1);
        while (cont <= limite) {
            System.out.print(", " + cont);
            cont *= 2;
        }

        in.close();
    }
}