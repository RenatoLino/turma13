package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {
    public static void main(String[] args) {
        int comprimento = 30;
        
        linha(); //chamada de método
        System.out.println("Meu programa");
        linha();
        System.out.println("1 - criar um novo usuário");
        linha2(25);
        linha2(comprimento);
        linha3(15, '*');
        linha3(20, '_');
    }

    public static void linha() {
        System.out.println("------------");
    }

    public static void linha2(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println(); // pula para próxima linha
    }

    public static void linha3(int tamanho, char tipo) { // char = 1 caracter
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println(); 
    }

}