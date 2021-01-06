package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral;
        final int QTDE_ALUNOS = 20;
        final int QTDE_TURMAS = 5;

        mediaGeral = 0;

        for (int turma = 1; turma <= QTDE_TURMAS; turma++) {
            
            System.out.println("Dados da turma " + turma);
            mediaTurma = 0;

            for (int aluno = 1; aluno <= QTDE_ALUNOS; aluno++) {
                System.out.println("Informe a média do aluno " + aluno);
                mediaAluno = entrada.nextDouble();
                mediaTurma = mediaTurma + mediaAluno;
            }

            mediaTurma = mediaTurma / QTDE_ALUNOS;
            mediaGeral = mediaGeral + mediaTurma;
            System.out.printf("A média da turma %d é %.2f\n", turma, mediaTurma);
        }
        
        mediaGeral = mediaGeral / QTDE_TURMAS;
        System.out.printf("A média das turmas é %.2f\n", mediaGeral);

        entrada.close();
    }
}
