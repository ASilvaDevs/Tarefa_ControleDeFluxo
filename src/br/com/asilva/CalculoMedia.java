package br.com.asilva;

public class CalculoMedia {
    private double primeiroNumero;
    private double segundoNumero;
    private double terceiroNumero;
    private double quartoNumero;

    public CalculoMedia(double primeiroNumero, double segundoNumero, double terceiroNumero, double quartoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
        this.terceiroNumero = terceiroNumero;
        this.quartoNumero = quartoNumero;
    }

    public double calcularMedia() {
        return (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero) / 4;
    }

    public String obterMensagemResultado() {
        double media = calcularMedia();
        if (media >= 7) {
            return "O aluno está aprovado!";
        } else if (media >= 5) {
            return "O aluno está em recuperação.";
        } else {
            return "O aluno está reprovado.";
        }
    }
}
