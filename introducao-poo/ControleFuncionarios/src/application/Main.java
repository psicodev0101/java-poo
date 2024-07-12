package application;

import entities.Funcionario;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //painel de insercao
        System.out.println("=== CONTROLE DE FUNCIONARIOS ===");
        System.out.println("Insira os dados do funcionario:");
        System.out.print("Nome > ");
        String nomeFuncionario = read.nextLine();
        System.out.print("Salario bruto > ");
        double salarioBrutoFuncionario = read.nextDouble();

        //instancia de funcionario
        Funcionario funcA = new Funcionario(nomeFuncionario, salarioBrutoFuncionario);

        //imprimindo informações #1
        System.out.println("_____________________________________________");
        System.out.println("INFORMACOES DO FUNCIONARIO");
        System.out.println(funcA);

        //gerando aumento
        System.out.println("_____________________________________________");
        System.out.print("digite a porcentagem de aumento concedida: ");
        double porcAumento = read.nextDouble();
        funcA.aumentarSalario(porcAumento);

        //imprimindo informacoes com aumento
        System.out.println("_____________________________________________");
        System.out.println("INFORMACOES DO FUNCIONARIO");
        System.out.println(funcA);


        read.close();
    }



}
