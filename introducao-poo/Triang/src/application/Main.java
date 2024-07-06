package application;

import java.util.Scanner;
import entities.Triangulo;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Triangulo x = new Triangulo(3.00, 4.00, 5.00);
        Triangulo y = new Triangulo(7.50, 4.50,4.02);

        System.out.println("---- RESULTADOS ----");
        System.out.println("Area do triangulo A= " + String.format("%.2f", x.getArea()) );
        System.out.println("Area do triangulo B= " + String.format("%.2f", y.getArea()) );
        if (x.getArea() > y.getArea()){
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }

        read.close();
    }
}
