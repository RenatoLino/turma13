package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        
        double valor = 12.9876;
        int quantidade = 7;

        System.out.println(valor);
        // System.out.printf( FORMATO, VALOR1 [, VALOR2, ...]);
        // %f - número com decimal
        // %d - número inteiro
        // %s - string
        // %.xf - x = número de casas decimais
        System.out.printf("O valor a pagar é R$ %.2f. Obrigado.\n", valor);
        System.out.printf("O valor das %d peças é R$ %.2f. Obrigado.", quantidade, valor);

    }
}
