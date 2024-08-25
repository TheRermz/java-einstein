import java.util.InputMismatchException;
import java.util.Scanner;

public class parImparIf {
    public static void main(String[] args) throws InputMismatchException {
        int num;
        System.out.println("Insira um valor inteiro e lhe direi se é par ou ímpar");
        Scanner sc = new Scanner(System.in);

        try {
            num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("Par");
            } else if (num % 2 != 0) {
                System.out.println("Ímpar");
            }
        } catch (InputMismatchException e) {
            System.out.println("Caractere Inválido");
        }
        sc.close();

    }
}
