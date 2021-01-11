package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 3000);
        Gerente g = new Gerente("Gilberto", 4000, 10);

        System.out.println(f.exibir());
        System.out.println(g.exibir());

        g.setSalario(5000);
        System.out.println("Salario do gerente: " + g.getSalario());

    }
}
