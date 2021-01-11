package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        // Pessoa pessoa = new Pessoa("Adriano", "(11) 99998765");
        Estudante estudante = new Estudante("Ricardo", "(11) 987654", "Design");
        Professor professor = new Professor("Carlos", "(11) 987456123", 3000);

        // System.out.println(pessoa);
        //System.out.println(estudante);
        //System.out.println(professor);

        Pessoa p = estudante; //new Estudante("Ricardo", "(11) 987654", "Design");
        System.out.println(p);
        
        p = professor;
        System.out.println(p);

    }

}
