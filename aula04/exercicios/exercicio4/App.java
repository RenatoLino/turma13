package exercicios.exercicio4;

public class App {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(16, 3, 200);

        relogio.exibir();

        relogio.setHora(170);

        System.out.println("Hora atual: " + relogio.getHora());
        System.out.println("Minuto atual: " + relogio.getMinuto());
        System.out.println("Segundo atual: " + relogio.getSegundo());
    }
}
