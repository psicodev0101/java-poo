package util;

public class CalculoIdade {
//atributos --------------------------------------------
    public static int anoAtual = 2024;

//métodos ----------------------------------------------
    public static int calcularIdade(int anoInicial){
        //calcula a idade atraves do atributo ano de nascimento da pessoa
        return anoAtual - anoInicial;
    }
}
