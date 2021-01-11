package exemplos.exemplo05;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String telefone, String curso){
        super(nome, telefone); // Pessoa
        this.curso = curso;
    }

    @Override 
    public String toString(){
        return super.toString() + " curso: " + curso;
    }

}