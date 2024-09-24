package models;

import services.SaqueService;

public abstract class Conta {

    private final int numeroConta;
    private final String titularConta;
    private double saldoConta;
    private int limiteSaquePix = 10;

    public Conta (int numeroConta, String titularConta){
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
    }

    public abstract void depositar (double valor);

    public abstract boolean sacar(double valor, SaqueService saqueService);


    //getters e setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta (double valor) {
        saldoConta = valor;
    }

    public int getLimiteSaquePix() {
        return limiteSaquePix;
    }

    public void setLimiteSaquePix(int limiteSaquePix) {
        this.limiteSaquePix = limiteSaquePix;
    }
}
