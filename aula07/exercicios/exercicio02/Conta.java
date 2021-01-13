package exercicios.exercicio02;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        // this.saldo = 0; // 0 já é o valor padrão
    }

    @Override
    public String toString() {
        return numero + " : " + saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            saldo = saldo - valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
    
}
