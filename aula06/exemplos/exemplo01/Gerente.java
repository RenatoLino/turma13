package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int nFuncionarios;

    public Gerente(String nome, double salario, int nFuncionarios) {
        super(nome, salario); // chamada ao construtor da classe Funcionario
        this.nFuncionarios = nFuncionarios;
    }

    @Override
    public String exibir() {
        return super.exibir() + " - " + nFuncionarios;
    }

    @Override
    public void aumentarSalario(double taxa) {
        super.aumentarSalario(taxa + 0.05);
    }

}
