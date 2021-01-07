package exemplos.exemplo4;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Emerson", 2000); //criação do objeto, e chamada do construtor
        Pessoa pessoa2 = new Pessoa("Carlos", 3000); 

        pessoa1.exibirDados();
        pessoa2.exibirDados();
    }
}
