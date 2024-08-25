import java.util.InputMismatchException;
import java.util.Scanner;

public class parImparSwitch {
    public static void main(String[] args) throws Exception {
        int num;
        System.out.println("Insira um valor inteiro e lhe direi se é par ou ímpar");
        Scanner sc = new Scanner(System.in);

        try {
            num = sc.nextInt();

            switch (num % 2) {
                case 0:
                    System.out.println("Par");
                    break;

                default:

                    System.out.println("Ímpar");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Caractere Inválido");
        }
        sc.close();
    }
}
