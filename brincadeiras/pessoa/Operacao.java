package brincadeiras.pessoa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operacao {

    private void recebeDados(Pessoa p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu nome:");
        p.setNome(sc.nextLine());
        if (p.getNome().equals("")) {
            System.out.println("Insira um nome diferente de vazio");
            System.exit(1);
        }
        System.out.println("Insira sua idade:");
        p.setIdade(sc.nextInt());
        System.out.println("Insira sua altura (ex. 1.70):");
        p.setAltura(sc.nextDouble());
        System.out.println("Insira seu peso:");
        p.setPeso(sc.nextDouble());
        sc.close();
    }

    public void executaPrograma() {
        Pessoa p = new Pessoa();
        System.out.println("Bem vindo a calculadora IMC. Insira os dados solicitados.");
        try {
            recebeDados(p);
            System.out.println(p.retornaDados(p.getIdade(), p.getPeso(), p.getAltura(), p.getNome()));
        } catch (InputMismatchException e) {
            System.out.println("Você inseriu um valor inválido! Tente novamente!");
        }

    }
}
