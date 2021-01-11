package exemplos.exemplo05;

// uma classe abstrata serve como modelo para outras classes

public abstract class Pessoa { //classe abstrata, não instancia objetos
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " : " + telefone;
    }
}
