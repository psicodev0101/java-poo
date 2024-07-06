package application;

import entities.Produto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Produto prodA = new Produto("Arroz", 5.00);

        int menuOpt = 0;
        do {
            System.out.println("=== ESTOQUE ===");
            System.out.println(
                    "[1] Estocar"
                    + "\n[2] Retirar"
                    + "\n[3] Consultar"
                    + "\n[0] Sair");
            System.out.print("\nEscolha uma opcao> ");
            menuOpt = read.nextInt();
            switch (menuOpt) {
                case 1: {
                    System.out.println("_____________________________________");
                    System.out.print("Digite a quantidade a ser adicionada: ");
                    prodA.addProdutos(read.nextInt());
                    System.out.println("Adicionado com sucesso!");
                    System.out.println("_____________________________________");
                    break;
                }
                case 2: {
                    System.out.println("_____________________________________");
                    System.out.print("Digite a quantidade a ser removida: ");
                    prodA.removerProdutos(read.nextInt());
                    System.out.println("Removido com sucesso!");
                    System.out.println("_____________________________________");
                    break;
                }
                case 3: {
                    System.out.println("_____________________________________");
                    System.out.println(prodA);
                    System.out.println("_____________________________________");
                    break;
                }
                case 0: {
                    break;
                }
            }

        } while (menuOpt != 0);

        read.close();
    }

}
