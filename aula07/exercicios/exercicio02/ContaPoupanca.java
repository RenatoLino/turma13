package exercicios.exercicio02;

public class ContaPoupanca extends Conta {
    private static double taxaSaque = 0.1; // atributo de classe

    public ContaPoupanca(int numero) {
        super(numero);
    }

    // método da classe (static) que altera o atributo de classe
    public static void setTaxaSaque(double taxa) {
        if( taxa > 0) {
            taxaSaque = taxa;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor + taxaSaque) {
            return super.sacar(valor + taxaSaque);
        }
        return false;
    }

}
