package exemplos.exemplo02;

public class App {
    public static void main(String[] args) {
        Pessoa p;

        p = new Pessoa();

        // ....
        
        p = null;


        System.out.println(p.getNome().length());
    }
}
