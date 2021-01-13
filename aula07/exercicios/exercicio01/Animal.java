package exercicios.exercicio01;

public class Animal {
    private String nome, cor, raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nome, String cor, String raca, int anoNascimento){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.proprietario = new Proprietario();
    }

    public Animal(String nome, String cor, String raca, int anoNascimento, Proprietario proprietario){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.proprietario = proprietario;
    }

    public Animal(String nome, String cor, String raca, int anoNascimento, String nomeProprietaio, String telefone){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.proprietario = new Proprietario(nomeProprietaio, telefone);
    }

    @Override
    public String toString() {
        return nome + ", " + cor + ", " + raca + ", "+ anoNascimento + " => " + proprietario.toString();
    }

}
