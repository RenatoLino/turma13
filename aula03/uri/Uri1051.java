package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, imposto=0, faixa;

        salario = entrada.nextDouble();

        if(salario <= 2000){
            System.out.println("Isento");
        }else{
            if(salario > 4500){
                faixa = salario - 4500;
                imposto = faixa * 0.28;
                salario = salario - faixa;
            }
            if(salario > 3000){
                faixa = salario - 3000;
                imposto = imposto + faixa * 0.18;
                salario = salario - faixa;
            }
            if(salario > 2000){
                faixa = salario - 2000;
                imposto = imposto + faixa * 0.08;
                salario = salario - faixa;
            }

            System.out.printf("R$ %.2f\n", imposto);
        }

        entrada.close();
    }
}
