package exercicios.exercicio02;

import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> contas;

    public GerenciaContas() {
        contas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        contas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public String consultaSaldo(int numeroConta) {
        Conta c = contas.get(numeroConta);

        if (c != null) {
            return c.toString();
        }

        return "Conta não encontrada";
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta c = contas.get(numeroConta);

        if (c != null) {
            return c.sacar(valor);
        }
        return false; // não encontrou a conta
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta c = contas.get(numeroConta);

        if (c != null) {
            return c.depositar(valor);
        }
        return false;
    }
}
