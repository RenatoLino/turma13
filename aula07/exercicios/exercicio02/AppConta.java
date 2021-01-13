package exercicios.exercicio02;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao, numeroConta;
        double limite, valor;
        GerenciaContas gerencia = new GerenciaContas();

        do {
            System.out.println("1-nova Conta Corrente");
            System.out.println("2-nova Conta Especial");
            System.out.println("3-nova Conta poupança");
            System.out.println("4-consulta saldo");
            System.out.println("5-saque");
            System.out.println("6-deposito");
            System.out.println("7-sair");
            System.out.print("==> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    gerencia.novaContaCorrente(numeroConta);
                    break;
                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite da conta");
                    limite = teclado.nextDouble();
                    gerencia.novaContaEspecial(numeroConta, limite);
                    break;
                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    gerencia.novaContaPoupanca(numeroConta);
                    break;
                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println(gerencia.consultaSaldo(numeroConta));
                    break;
                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor:");
                    valor = teclado.nextDouble();
                    if (gerencia.sacar(numeroConta, valor)) {
                        System.out.println("Saque efetuado");
                    } else {
                        System.out.println("Saque não realizado");
                    }
                    break;
                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor:");
                    valor = teclado.nextDouble();
                    if (gerencia.depositar(numeroConta, valor)) {
                        System.out.println("Deposito efetuado");
                    } else {
                        System.out.println("Depósito não realizado");
                    }
                    break;
                case 7:
                    break;
                default: // (opcional) se não nenhum dos outros valores
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 7);

        teclado.close();
    }
}
