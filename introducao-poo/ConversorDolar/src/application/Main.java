package application;

import entities.Dollar;
import util.ConversorDeMoeda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //insercao do valor do dolar
        System.out.println("=== CONVERSOR DOLAR ===");
        System.out.print("Digite a cotacao atual do Dolar: ");
        double cotacaoDolar = read.nextDouble();

        //instanciacao do dolar com valor definido
        Dollar dolarAtual = new Dollar(cotacaoDolar);

        //definir quantidade de dolares a ser comprada
        System.out.print("Digite a quantidade desejada em Dolar: ");
        double quantidadeDolar = read.nextDouble();

        //chamada do calculo e exibicao dos resultados
        double valorAPagar = ConversorDeMoeda.realParaDolar(quantidadeDolar, dolarAtual.cotacao);
        System.out.println("Valor total em Reais = " + String.format("%.2f", valorAPagar));

        read.close();
    }
}