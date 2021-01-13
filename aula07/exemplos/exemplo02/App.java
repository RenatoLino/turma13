package exemplos.exemplo02;

public class App {
    public static void main(String[] args) {
        Pessoa p;

        p = new Pessoa(); //cria um novo objeto pessoa

        // ....
        
        p = null; //atribui null para 'liberar a memória'

        //ou então, cria um novo objeto liberando o anterior
        p = new Pessoa();

        System.out.println(p.getNome().length());
    }
}
