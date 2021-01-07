package exemplos.exemplo3;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); // pessoa1 é uma instância (objeto) da classe Pessoa
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Emerson"; // atribui o valor 'Emerson' para o atributo 'nome' da 'pessoa1'
        pessoa1.apresentar();
        
        pessoa2.nome = "Paduan";
        pessoa2.apresentar();
    }
}
