package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, media = 0;
        int positivos = 0;

        for (int i = 0; i < 7; i++) {
            numero = entrada.nextDouble();
            if (numero > 0) {
                media += numero;
                positivos++;
            }
        }
        media /= positivos;
        System.out.printf("%d valores positivos\n", positivos);
        System.out.printf("%.1f\n", media);

        entrada.close();
    }
}
