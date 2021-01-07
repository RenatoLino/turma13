package exercicios.exercicio5;

public class App {
    public static void main(String[] args) {
        
        Ebook livro = new Ebook("Programando em Java", "Deitel", 450);

        livro.mostrarCapa();

        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        System.out.println("Pagina atual: " + livro.exibirPagina());

        livro.retrocederPagina();
        System.out.println("Pagina atual: " + livro.exibirPagina());
        
        livro.irParaPagina( 50 );
        System.out.println("Pagina atual: " + livro.exibirPagina());
        
    }

}
