package exercicios.exercicio02;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero); // chama o construtor da classe Conta
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() + limite >= valor) {
            super.sacar(valor);
        }
    }
}
