package exemplos;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                System.out.println(lista.get(i));
            }
        }

        // foreach - para cada 'item' (objeto da coleção)
        for (Integer item : lista) {
            if (item % 2 == 0) {
                System.out.println(item);
            }
        }
    }
}
