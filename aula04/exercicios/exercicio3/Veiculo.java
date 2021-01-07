package exercicios.exercicio3;

public class Veiculo {
    String modelo, marca;
    double consumo;

    public Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    public void exibir() {
        System.out.println("Veiculo-> " + modelo + " : " + marca);
    }

    public double obterConsumo() {
        return consumo;
    }

}
