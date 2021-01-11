package exemplos;

import java.util.Stack;

public class Exemplo03 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("segunda");
        pilha.push("terça");
        pilha.push("quarta");
        pilha.push("quinta");

        System.out.println(pilha);
        System.out.println("tamanho da pilha: " + pilha.size());

        while( ! pilha.isEmpty()){
            System.out.println( pilha.pop() );
        }
        // System.out.println( pilha.pop() );
        // System.out.println( pilha.pop() );
        // System.out.println( pilha.pop() );
        System.out.println(pilha);
        System.out.println("tamanho da pilha: " + pilha.size());
    }
}
