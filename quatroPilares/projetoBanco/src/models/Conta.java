package models;

public abstract class Conta {

    private final int numeroConta;
    private final String titularConta;
    private double saldoConta;

    public Conta (int numeroConta, String titularConta){
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double exibirSaldo() {
        return saldoConta;
    }

    public abstract void depositar (double valor);
    public abstract void sacar (double valor);

}
