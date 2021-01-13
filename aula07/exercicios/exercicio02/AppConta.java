package exercicios.exercicio02;

public class AppConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111);
        ContaEspecial ce = new ContaEspecial(222, 200);

        cc.depositar(500);
        cc.sacar(800);
        System.out.println(cc);

        ce.depositar(300);
        ce.sacar(400);
        System.out.println(ce);
    }
}
