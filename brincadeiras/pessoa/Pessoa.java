package brincadeiras.pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura, peso;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    private static double calculaImc(double altura, double peso) {
        double imcCalculado = peso / Math.pow(altura, 2);
        return imcCalculado;
    }

    private static String retornaImc(double imc) {
        if (imc <= 16.9) {
            return "Muito abaixo do peso";
        } else if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "com o Peso normal";
        } else if (imc < 30) {
            return "Acima do peso";
        } else if (imc < 35) {
            return "em Obesidade I";
        } else if (imc <= 40) {
            return "em Obesidade II";
        } else {
            return "em Obesidade III";
        }
    }

    public String retornaDados(int idade, double peso, double altura, String nome) {
        String imc = retornaImc(calculaImc(altura, peso));
        return "Olá " + nome + ". Baseado no peso e altura informados identificamos que você está " + imc + ".";
    }

}
