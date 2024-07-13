package application;

import entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // entrada de dados
        System.out.println("=== CALCULO DE NOTA ===");
        System.out.print("Insira o nome do aluno: ");
        String nomeAluno = read.nextLine();
        System.out.print("Insira a nota do primeiro trimestre: ");
        int notaA = read.nextInt();
        System.out.print("Insira a nota do Segundo trimestre: ");
        int notaB = read.nextInt();
        System.out.print("Insira a nota do Terceiro trimestre: ");
        int notaC = read.nextInt();

        //instanciacao de objeto com as informacoes acima
        Aluno alunoA = new Aluno(nomeAluno, notaA, notaB, notaC);

        //exibicao dos resultados
        System.out.println("Media geral do aluno: " + alunoA.calcularMedia());
        alunoA.estaAprovado();

        read.close();
    }




}
