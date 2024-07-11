package entities;

public class Retangulo {
//atributos --------------------------------------------------------------------------
    public double largura;
    public double altura;

//construtores --------------------------------------------------------------------------
    public Retangulo(double valorAltura, double valorLargura){
        altura = valorAltura;
        largura = valorLargura;
    }

//metodos --------------------------------------------------------------------------
    public double calcularPerimetro () {
    //perimetro retangulo = soma dos lados
        return (largura * 2) + (altura * 2);
    }

    public double calcularArea () {
    //area retangulo = base x altura
        return largura * altura;
    }

    public double calcularDiagonal () {
    //diagonal do retangulo eh calculada pelo teorema de pitagoras
    //diagonal (hipotenusa) = soma dos quadrados dos catetos
        //armazena o valor da soma dos quadrados dos catetos
        double somaCatetos = (largura * largura) + (altura * altura);
        //retorna a raiz quadrada da soma anterior
        return Math.sqrt(somaCatetos);
    }
}
