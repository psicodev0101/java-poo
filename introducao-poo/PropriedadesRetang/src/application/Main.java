package application;

import entities.Retangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //leitura de informacoes
        System.out.println("=== INFORMACOES DO RETANGULO");
        System.out.print("Digite o valor da largura: ");
        double entradaLargura = read.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double entradaAltura = read.nextDouble();

        //instanciacao do retangulo
        Retangulo retanguloA = new Retangulo(entradaAltura, entradaLargura);

        //resultados
//        System.out.println("-----------------------------------------------");
//        System.out.println("INFORMACOES: ");
//        System.out.println("Perimetro= " + retanguloA.calcularPerimetro());
//        System.out.println("Area= " + retanguloA.calcularArea());
//        System.out.println("Diagonal= " + retanguloA.calcularDiagonal());
        System.out.println(retanguloA);

        read.close();
    }
}