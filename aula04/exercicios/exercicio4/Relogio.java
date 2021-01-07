package exercicios.exercicio4;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void exibir() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }

    public int getHora() { // obter o valor do atributo hora
        return hora;
    }

    public void setHora(int hora) { // alterar o valor do atrubuto hora
        if (hora > -1 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > -1 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if( segundo > -1 && segundo < 60) {
            this.segundo = segundo;
        }
    }
    
}
