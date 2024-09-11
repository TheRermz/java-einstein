package atividade.banco.src;

import java.util.*;

public class Conta {
    static private int cod_conta = 0;
    static private String num_conta;
    public String nomeConta;
    private double saldoConta = 0;

    public String getNome() {
        return nomeConta;
    }

    public double getSaldo() {
        return saldoConta;
    }

    public void setSaldo(double saldo) {
        this.saldoConta = saldo;
    }

    public void setNome(String nome) {
        this.nomeConta = nome;
    }

    public static int getCod_conta() {
        return cod_conta;
    }

    public static String getNum_conta() {
        return num_conta;
    }

    public static int geraCodigo() {
        cod_conta++;
        return cod_conta;
    }

    public void alteraNome(String novoNome) {

        setNome(novoNome);
        System.out.println(String.format("Nome alterado para: %s", novoNome));

    }

    public static String geraNumConta() {
        int digitos = 8;
        StringBuilder str = new StringBuilder();
        Random rd = new Random();
        for (int i = 0; i < digitos; i++) {
            str.append(rd.nextInt(10));
        }
        num_conta = str.toString();
        return num_conta;
    }

    public void geraConta() {
        cod_conta = geraCodigo();
        num_conta = geraNumConta();
        retornaDados(false);
    }

    public void retornaDados(boolean operacao) {
        if (operacao == true) {
            System.out
                    .println(String.format("Número da conta: %s-1\nNome: %s\nSaldo atual: R$%.2f", num_conta, nomeConta,
                            saldoConta));
        } else {
            System.out.println("=============Sua Conta=============");
            System.out
                    .println(String.format("Número da conta: %s-1\nNome: %s\nSaldo atual: R$%.2f", num_conta, nomeConta,
                            saldoConta));
            System.out.println("===================================");
        }

    }

    public double deposito(double valor) {
        saldoConta += valor;
        System.out.println("=========Deposito Efetuado!=========");
        retornaDados(true);
        System.out.println("====================================");
        return saldoConta;
    }

    public double saque(double valor) {

        double saldoFinal;

        saldoFinal = (saldoConta - valor) - 3;

        if (saldoFinal < 0) {
            System.out.println("========Saldo insuficiente!========");
            retornaDados(true);
            System.out.println("===================================");
            return saldoConta;
        } else {

            System.out.println("==========Saque Efetuado!==========");
            saldoConta = saldoFinal;
            retornaDados(true);
            System.out.println("===================================");
            return saldoConta;
        }

    }

}
