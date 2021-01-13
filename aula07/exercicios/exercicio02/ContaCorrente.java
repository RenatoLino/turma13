package exercicios.exercicio02;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.1;
    
    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean sacar(double valor) {
        if(getSaldo() >= valor) {
            return super.sacar(valor);
        }
        return false; // não tem saldo suficiente
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor - TAXA_DEPOSITO);
    }
}
