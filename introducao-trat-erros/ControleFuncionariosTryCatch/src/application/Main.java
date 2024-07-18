package application;

import entities.Funcionario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        //painel de insercao
        System.out.println("=== CONTROLE DE FUNCIONARIOS ===");
        System.out.println("Insira os dados do funcionario:");
        System.out.print("Nome > ");
        String nomeFuncionario = read.nextLine();
        System.out.print("Salario bruto > ");
        double salarioBrutoFuncionario = lerValor();

        //instancia de funcionario
        Funcionario funcA = new Funcionario(nomeFuncionario, salarioBrutoFuncionario);

        //imprimindo informações #1
        System.out.println("_____________________________________________");
        System.out.println("INFORMACOES DO FUNCIONARIO");
        System.out.println(funcA);

        //gerando aumento
        System.out.println("_____________________________________________");
        System.out.print("digite a porcentagem de aumento concedida: ");
        double porcAumento = lerValor();
        funcA.aumentarSalario(porcAumento);

        //imprimindo informacoes com aumento
        System.out.println("_____________________________________________");
        System.out.println("INFORMACOES DO FUNCIONARIO");
        System.out.println(funcA);
        read.close();
    }

    public static double lerValor (){
        //lê um valor double com tratamento de erro de input
        double valor = 0;
        try {
            valor = read.nextDouble();
        }
        catch (InputMismatchException e){
            read.nextLine();
            System.out.println("Input inválido!");
            System.out.println("Digite um numero: ");
            valor = read.nextDouble();
        }
        return valor;
    }
}
