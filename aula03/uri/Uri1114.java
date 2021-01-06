package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password;
        boolean isValid = false;

        do {
            password = input.nextInt();
            if (password != 2002) {
                System.out.println("Senha Invalida");
            } else {
                isValid = true;
                System.out.println("Acesso Permitido");
            }
        } while (!isValid);

        input.close();
    }
}
