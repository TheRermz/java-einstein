import java.util.InputMismatchException;
import java.util.Scanner;

public class maiorMenorExtendido {

    /*
     * Faça um programa que receba números positivos até que o número zero seja
     * digitado. Calcule e mostre ao final: a soma de todos os números digitados, a
     * quantidade de números digitados, a média dos números digitados, o maior
     * número digitado; o menor número digitado, a média dos números pares
     * digitados, a porcentagem de números ímpares digitados. Obs: para pegar o
     * resto de uma divisão utilize % (modulo) no lugar da /.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0, pares = 0, impares = 0, index = 0;
        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        float media = 0, percImpares = 0;

        try {
            while (true) {
                num = sc.nextInt();
                if (num == 0) {
                    break;
                }
                index++;

                if (num % 2 == 0) {
                    pares += num / index;
                } else {
                    impares++;
                }

                if (num < menorValor) {
                    menorValor = num;
                } else {
                    maiorValor = num;
                }

                percImpares = (float) impares / index * 100;
                soma += num;
                media += num / index;

            }

        } catch (InputMismatchException e) {
            System.out.println("Caractere Inválido");
        }

        System.out.println("O total de números digitado foi: " + index);
        System.out.println("A soma de todos os valores é: " + soma);
        System.out.println("A média dos valores é: " + media);
        System.out.println("A média de números pares é: " + pares);
        System.out.println("A porcentagem de ímpares: " + percImpares);
        System.out.println("O maior valor: " + maiorValor);
        System.out.println("O menor valor: " + menorValor);

        sc.close();
    }
}
