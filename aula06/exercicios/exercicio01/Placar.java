package exercicios.exercicio01;

public class Placar {
    private String nomeTime1, nomeTime2;
    private int golsTime1, golsTime2;

    public Placar() {
        //this("Time da casa", "Visitante", 0, 0);
        this.nomeTime1 = "Time da casa";
        this.nomeTime2 = "Visitantes";
    }

    public Placar(String nomeTime1, String nomeTime2) {
        this(nomeTime1, nomeTime2, 0, 0); // chamada ao construtor da própria classe
    }

    public Placar(String nomeTime1, String nomeTime2, int golsTime1, int golsTime2) {
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    @Override
    public String toString() {
        return nomeTime1 + " " + golsTime1 + " X " + golsTime2 + " " + nomeTime2;
    }
}
