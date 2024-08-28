import java.util.InputMismatchException;
import java.util.Scanner;

public class retornaPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Olá, digite um número e direi se é positivo ou negativo.  Digite 0 para parar.");

        while (true) {

            try {
                num = sc.nextInt();

                if (num == 0) {
                    System.out.println("Zero. Parando o programa.");
                    break;
                }

                if (num > 0) {
                    System.out.println("Positivo");
                } else {
                    System.out.println("Negativo");
                }

            } catch (InputMismatchException e) {
                System.out.println("Caractere inválido");
            }

        }

        sc.close();
    }
}
