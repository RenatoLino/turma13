public class App {
    public static void main(String[] args) {
        Robo robo = new Robo(10, 10);

        robo.posicaoAtual();
        robo.moverNorte();
        robo.posicaoAtual();
    }
}
