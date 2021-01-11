/**
 * Robo
 */
public class Robo {
    private int x, y;
    final private int MAX_X, MAX_Y;

    public Robo(int maxX, int maxY) {
        if (maxX > 0) {
            this.MAX_X = maxX;
        } else {
            this.MAX_X = 10;
        }

        if (maxY > 0) {
            this.MAX_Y = maxY;
        } else {
            this.MAX_Y = 10;
        }

        x = 0;
        y = 0;
    }

    public void posicaoAtual() {
        System.out.println(x + ":" + y);
    }

    public void moverNorte() {
        if (y < MAX_Y) {
            y++;
        }
    }

    public void moverSul() {
        if (y > -MAX_Y) {
            y--;
        }
    }

    public void moverLeste() {
        if (x < MAX_X) {
            x++;
        }
    }

    public void moverOeste() {
        if (x > -MAX_Y) {
            x--;
        }
    }
}