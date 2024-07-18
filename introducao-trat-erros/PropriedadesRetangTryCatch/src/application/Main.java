package application;

import entities.Retangulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        //leitura de informacoes
        System.out.println("=== INFORMACOES DO RETANGULO");
        System.out.print("Digite o valor da largura: ");
        double entradaLargura = lerDados();
        System.out.print("Digite o valor da altura: ");
        double entradaAltura = lerDados();

        //instanciacao do retangulo
        Retangulo retanguloA = new Retangulo(entradaAltura, entradaLargura);

        //resultados
        System.out.println(retanguloA);

    }

    public static double lerDados(){
        double valor = 0;
        try{
            valor = read.nextDouble();
        }
        catch (InputMismatchException e) {
            read.nextLine();
            System.out.println("Input inválido!");
            System.out.println("Digite um número: ");
            valor = read.nextDouble();
        }
        return valor;
    }


}
