package exemplos.exemplo4;

public class Pessoa {
    // atributos
    
    String nome;
    double salario;

    // métodos

    Pessoa(String nome, double salario) { // método construtor, obrigatório mesmso nome da classe
        this.nome = nome; 
        this.salario = salario; // 'this' se refere ao próprio objeto
        // 'this.nome' é o atributo
        // 'nome' é o parâmetro do construtor
    }

    void exibirDados() { //método é a definição de uma ação do objeto
        System.out.println(nome + " : " + salario);
    }

}
