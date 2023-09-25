package br.com.asilva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("*** Calculadora de médias com 4 números ***");
            System.out.print("Digite o valor do primeiro número: ");
            double primeiroNumero = scanner.nextDouble();
            System.out.print("Digite o valor do segundo número: ");
            double segundoNumero = scanner.nextDouble();
            System.out.print("Digite o valor do terceiro número: ");
            double terceiroNumero = scanner.nextDouble();
            System.out.print("Digite o valor do quarto número: ");
            double quartoNumero = scanner.nextDouble();

            CalculoMedia calculo = new CalculoMedia(primeiroNumero, segundoNumero, terceiroNumero, quartoNumero);

            double media = calculo.calcularMedia();
            System.out.println("=========================================");
            System.out.println("O resultado da média dos valores é " + media);

            String mensagemResultado = calculo.obterMensagemResultado();
            System.out.println(mensagemResultado);
            System.out.println("=========================================");
            System.out.print("Deseja fazer outro cálculo? (S/N): ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("S");
        }

        System.out.println("Programa encerrado.");
    }
}
