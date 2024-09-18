package models;

import services.PixSaqueService;
import services.SaqueCaixaEletService;
import services.SaqueService;

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

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta (double valor) {
        saldoConta = valor;
    }

    public abstract void depositar (double valor);

    //public abstract void sacar (double valor);
        /*precisei inutilizar isso aqui pq quando fiz o metodo sacar usando
        * injeçao de SaqueService a IDE pediu pra eu atualizar o metodo abstrato
        * sacar aqui nessa classe, pra poder os parametros baterem*/

    public abstract boolean sacar(double valor, SaqueService saqueService);
}
