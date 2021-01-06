package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;

        do {
            nota1 = input.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
            }
        } while (nota1 < 0 || nota1 > 10);

        do {
            nota2 = input.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
            }
        } while (nota2 < 0 || nota2 > 10);

        media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f\n", media);

        input.close();
    }

}
