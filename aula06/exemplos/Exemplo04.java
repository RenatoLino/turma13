package exemplos;

import java.util.TreeSet;

public class Exemplo04 {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();

        arvore.add(10);
        arvore.add(25);
        arvore.add(2);
        arvore.add(13);
        arvore.add(32);
        arvore.add(3);
        arvore.add(24);

        System.out.println(arvore);

        for (Integer numero : arvore) {
            System.out.println(numero);
        }

        System.out.println( arvore.contains(13) );
    }
}
