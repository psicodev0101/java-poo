package entities;

public class Triangulo {
    /*------------------------- ATRIBUTOS --------------------------------*/
    public double ladoA;
    public double ladoB;
    public double ladoC;

    /*------------------------ CONSTRUTORES -------------------------------*/
    public Triangulo (double a, double b, double c){
        ladoA = a;
        ladoB = b;
        ladoC = c;
    }

    /*--------------------------- METODOS ---------------------------------*/
    public double getArea (){
        double p = (ladoA+ ladoB + ladoC)/2;
        return Math.sqrt(p * (p-ladoA) * (p- ladoB) * (p- ladoC));
    }

}
