package util;

public class ConversorDeMoeda {
//atributos ----------------------------------------------------------------
    private static final double IOF = 6.0;

//metodos ------------------------------------------------------------------
    //classe para calculo do valor (depende do valor do IOF para funcionar)
    public static double realParaDolar (double quantidadeDolares, double cotacaoDolar) {
        double valorEmReais = quantidadeDolares * cotacaoDolar;
        return valorEmReais + calculoIOF(valorEmReais);
    }

    //calculo do IOF a partir do valor em reais
    private static double calculoIOF (double valorSemImposto){
        return valorSemImposto * IOF / 100;
    }
}
