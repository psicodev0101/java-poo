package util;

import entities.Triangulo;

public class ClassifTriangs {

    public static String classificar(Triangulo triang) {
        String resposta;
        if (triang.ladoa == triang.ladob && triang.ladoa == triang.ladoc) {
            resposta = "equilatero";
        } else if (triang.ladoa == triang.ladob || triang.ladoa == triang.ladoc || triang.ladob == triang.ladoc){
            resposta = "isoceles";
        } else {
            resposta = "escaleno";
        }
        return resposta;
    }

}
