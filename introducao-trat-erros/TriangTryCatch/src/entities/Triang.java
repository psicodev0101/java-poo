package entities;

public class Triang {
    /*------------------------- ATRIBUTOS --------------------------------*/
    public double ladoA;
    public double ladoB;
    public double ladoC;

    /*------------------------ CONSTRUTORES -------------------------------*/
    public Triang (double a, double b, double c){
        ladoA = a;
        ladoB = b;
        ladoC = c;
    }

    /*--------------------------- METODOS ---------------------------------*/
    public double getArea (){
    //calcula o valor da area do triangulo
        double p = (ladoA + ladoB + ladoC)/2;
        return Math.sqrt(p * (p-ladoA) * (p- ladoB) * (p- ladoC));
    }

}







