package models;

import services.SaqueService;

public class ContaPoupanca extends Conta {

    private static final double TAXA_JUROS = 6.5D;
    private int limiteSaquePix = 10;

    public ContaPoupanca(int numeroConta, String titularConta) {
        super(numeroConta, titularConta);
    }

    public int getLimiteSaquePix() {
        return limiteSaquePix;
    }

    public void setLimiteSaquePix(int limiteSaquePix) {
        this.limiteSaquePix = limiteSaquePix;
    }

    @Override
    public void depositar(double valor) {
        setSaldoConta(getSaldoConta() + valor);
    }

    @Override
    public boolean sacar(double valor, SaqueService saqueService) {
        if (saqueService.confirmarSaquePoupanca(valor, this)) {
            return saqueService.sacar(valor, this);
        } else {
            System.out.println("ERRO: Saldo insuficiente!");
            return false;
        }
    }


    //nao pode negativar
    //limite pix saque
    //SaqueService saqueService (verificar possibilidade de atribuir isso aqui direto
    // dentro do metodo)

}
