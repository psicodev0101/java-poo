package entities;


public class Triangulo {
//atributos ---------------------------------------------------
    public double ladoa;
    public double ladob;
    public double ladoc;
    public String tipo;

//construtores-------------------------------------------------
    public Triangulo (double a, double b, double c){
        ladoa = a;
        ladob = b;
        ladoc = c;
    }

//metodos ------------------------------------------------------

    @Override
    public String toString() {
        return String.format("Lados: %.2f, %.2f e %.2f", ladoa, ladob, ladoc)
                + "\ntipo: " + tipo;
    }
}
