package atividade.banco.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {

    public static void menu() {
        System.out.println("1 - Ver extrato");
        System.out.println("2 - Alterar nome");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sacar");
        System.out.println("5 - Menu");
        System.out.println("6 - Sair");
    }

    public static void operacoes() {
        String nome;
        double saldo;
        boolean loop = true, entrada = true;
        int op;
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Bem vindo ao Sistema bancário!");
        while (entrada) {
            try {
                System.out.println("Digite seu nome:");
                nome = sc.nextLine();
                if (nome.equals("")) {
                    System.out.println("O nome não pode ser vazio! Tente novamente");
                    continue;
                } else {

                    System.out.println("Digite seu saldo inicial (Por padrão R$0.00):");
                    saldo = sc.nextDouble();
                    conta.setNome(nome);
                    conta.setSaldo(saldo);
                    conta.geraConta();
                    System.out.println("Muito bem! Agora diga a operação que você deseja:");
                    entrada = false;
                }

                menu();

                while (loop) {
                    op = sc.nextInt();
                    sc.nextLine();

                    switch (op) {
                        case 1:
                            conta.retornaDados(false);
                            break;

                        case 2:
                            String novoNome;

                            novoNome = sc.nextLine();
                            if (novoNome == "") {
                                System.out.println("O nome não pode ser vazio! Tente novamente");
                                break;
                            } else {
                                conta.alteraNome(novoNome);
                                break;
                            }

                        case 3:
                            double deposito;
                            System.out.println("Digite quanto deseja depositar:");
                            deposito = sc.nextDouble();
                            conta.deposito(deposito);

                            break;
                        case 4:
                            double saque;
                            System.out.println("Digite quanto deseja sacar (taxa de R$3.00):");
                            saque = sc.nextDouble();
                            conta.saque(saque);

                            break;

                        case 5:

                            menu();
                            break;

                        case 6:
                            System.out.println("Fechando o sistema!");
                            loop = false;
                            sc.close();
                            break;

                        default:
                            System.out.println("Escolha um valor válido");
                            menu();
                            break;

                    }
                }
            } catch (InputMismatchException err) {
                System.out.println("Ocorreu um erro! Tente novamente!");

            }

        }

    }

    public static void main(String[] args) throws Exception {
        operacoes();
    }

}
