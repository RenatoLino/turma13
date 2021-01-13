package exercicios.exercicio02;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        // this.saldo = 0; // 0 já é o valor padrão
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " : " + saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

}
