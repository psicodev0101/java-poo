package application;

import util.Operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("=== CALCULADORA BASICA ===");
        System.out.print("Digite o numero a > ");
        double numA = read.nextDouble();
        System.out.print("Digite o numero a > ");
        double numB = read.nextDouble();

        System.out.println("____________________");
        System.out.println("SELECIONE UMA OPERACAO:");
        System.out.println("[1] Adicao" +
                            "\n[2] Subtracao" +
                            "\n[3] Multiplicacao" +
                            "\n[4] Divisao");
        int opt = read.nextInt();
        double result = switch (opt) {
            case 1 -> Operations.soma(numA, numB);
            case 2 -> Operations.subtracao(numA, numB);
            case 3 -> Operations.multiplicacao(numA, numB);
            case 4 -> Operations.divisao(numA, numB);
            default -> throw new IllegalStateException("Unexpected value: " + opt);
        };

        System.out.println("RESULTADO: " + result);

    read.close();
    }
}
