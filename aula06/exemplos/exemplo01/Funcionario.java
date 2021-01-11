package exemplos.exemplo01;

/**
 * Funcionario
 */

public class Funcionario { // extends Object { //implicito
    private String nome;
    private double salario;

    public Funcionario() { // construtor default
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        setSalario(salario);
    }

    public Funcionario(String nome) {
        this.nome = nome;
        setSalario(0);
    }

    public String exibir() {
        return nome + ": " + salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    @Override
    public String toString() {
        return exibir();
    }

    public void aumentarSalario(double taxa) {
        salario = salario + salario * taxa;
    }
}