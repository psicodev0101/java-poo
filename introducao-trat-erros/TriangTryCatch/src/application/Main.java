package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Triang;

public class Main {
   static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        //captura de informacoes
        System.out.println("INSIRA AS INFORMACOES DO TRIANGULO Y:");
        System.out.print("Lado a: ");
        double ladoa = lerValor();
        System.out.print("Lado b: ");
        double ladob = lerValor();
        System.out.print("Lado c: ");
        double ladoc = lerValor();

        //instanciacao dos triangs
        Triang x = new Triang(3.00, 4.00, 5.00);
        Triang y = new Triang(ladoa, ladob, ladoc);

        System.out.println("---- RESULTADOS ----");
        System.out.println("Area do triangulo X= " + String.format("%.2f", x.getArea()) );
        System.out.println("Area do triangulo Y= " + String.format("%.2f", y.getArea()) );
        if (x.getArea() > y.getArea()){
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }
    }

    public static double lerValor () {
        //metodo com correcao de erro para ler valores das medidas
        double valor = 0;
        try{
            valor = read.nextDouble();
        }
        catch (InputMismatchException e) {
            read.nextLine();
            System.out.println("Input inválido!");
            System.out.println("Digite um numero: ");
            valor = read.nextDouble();
        }
        return valor;
    }
}