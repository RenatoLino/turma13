package exemplos.exemplo05;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();
        
        Pessoa p;
        p = new Estudante("Marcos", "11111", "Computação");
        lista.add( p );

        lista.add( new Professor("Diogo", "22222", 5000));

        for (Pessoa pessoa : lista) {
            System.out.println(pessoa);
        }
        
    }
}
