package brincadeiras.biblioteca;

import java.util.Random;

public class Livro {
    String tituloLivro, nomeAutor, assunto, sinopse, codBarras;
    int paginas, anoPublicacao;
    private int idLivro = 0;

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setCodBarras() {
        this.codBarras = geraCodBarras();
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public int getIdLivro() {
        return idLivro;
    }

    private static String geraCodBarras() {
        Random rd = new Random();
        StringBuilder ean = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            ean.append(rd.nextInt(10));
        }
        int digitoVerificador = geraDigitoVerificador(ean.toString());
        ean.append(digitoVerificador);
        return ean.toString();
    }

    private static int geraDigitoVerificador(String ean) {
        int soma = 0;
        for (int i = 0; i < ean.length(); i++) {
            int digito = Character.getNumericValue(ean.charAt(i));
            if (i % 2 == 0) {
                soma += digito;
            } else {
                soma += digito * 3;
            }
        }
        int resto = soma % 10;
        return (resto == 0) ? 0 : 10 - resto;
    }
}
