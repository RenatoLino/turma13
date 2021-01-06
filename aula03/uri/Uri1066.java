package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, pares = 0, positivos = 0;
        final int QTDE = 5;

        for (int i = 0; i < QTDE; i++) {
            numero = entrada.nextInt();
            if (numero > 0) {
                positivos++;
            }
            if (numero % 2 == 0) {
                pares++;
            }
        }
        
        System.out.printf("%d valor(es) par(es)\n", pares);
        System.out.printf("%d valor(es) impar(es)\n", QTDE - pares);
        System.out.printf("%d valor(es) positivo(es)\n", positivos);
        System.out.printf("%d valor(es) negativo(es)\n", QTDE - positivos);
        
        entrada.close();
    }
}
