package exercicios.exercicio5;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas) {
        setTitulo(titulo);
        setAutor(autor);
        setTotalPaginas(totalPaginas);
        this.paginaAtual = 0;
    }

    public void mostrarCapa() {
        paginaAtual = 0;
        System.out.println(titulo + ": " + autor + "(" + totalPaginas + ")");
    }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    public void retrocederPagina() {
        if (paginaAtual > 0) {
            paginaAtual--;
        }
    }

    public int exibirPagina() {
        return paginaAtual;
    }

    public void irParaPagina(int pagina) {
        if (pagina >= 0 && pagina <= totalPaginas) {
            paginaAtual = pagina;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    //verificar se o título existe e tem pelo menos 5 caracteres
    public void setTitulo(String novoTitulo) {
        if (novoTitulo.length() > 5) {
            this.titulo = novoTitulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    //verificar se o nome do autor existe e tem pelo menos 5 caracteres
    public void setAutor(String novoAutor) {
        if (novoAutor.length() > 5) {
            this.autor = novoAutor;
        }
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        if (totalPaginas > 0) {
            this.totalPaginas = totalPaginas;
        }
    }
    
}
