package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int cont, soma;

        soma = 0;
        cont = 0;

        while (cont < 10) {
            System.out.println(cont);
            soma += cont; // soma = soma + cont;
            cont++; 
        }
        System.out.println("soma = " + soma);
    }
}
