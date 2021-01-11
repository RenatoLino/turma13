package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 2000);
        Gerente g = new Gerente("Gilberto", 2000, 10);

        System.out.println(f.exibir());
        System.out.println(g.exibir());

        f.aumentarSalario(0.1);
        g.aumentarSalario(0.1);

        System.out.println(f);
        System.out.println(g);

    }
}
