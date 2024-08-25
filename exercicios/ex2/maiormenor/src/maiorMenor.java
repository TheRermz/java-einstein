/*
 *
 *  Crie um programa que recebe valores até que 0 seja inserido, ao finalizar exiba o
 *  menor e o maior valor.
 *
 */

import java.util.Scanner;

public class maiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;

        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }

            if (num < menorValor) {
                menorValor = num;
            } else {
                maiorValor = num;
            }
        }

        System.out.printf("Maior valor: %d\n", maiorValor);
        System.out.printf("Menor valor: %d\n", menorValor);

        sc.close();
    }
}
