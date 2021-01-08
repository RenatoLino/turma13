/**
 * Robo
 */
public class Robo {
    private int x, y;
    private int maxX, maxY;

    public Robo(int maxX, int maxY) {
        if (maxX > 0) {
            this.maxX = maxX;
        } else {
            this.maxX = 10;
        }

        if (maxY > 0) {
            this.maxY = maxY;
        } else {
            this.maxY = 10;
        }

        x = 0;
        y = 0;
    }

    public void posicaoAtual() {
        System.out.println(x + ":" + y);
    }

    public void moverNorte() {
        if (y < maxY) {
            y++;
        }
    }

}