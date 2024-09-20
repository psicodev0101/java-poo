package models;

import services.SaqueService;

public class ContaPoupanca extends Conta {

    private static final double TAXA_JUROS = 6.5D;

    public ContaPoupanca(int numeroConta, String titularConta) {
        super(numeroConta, titularConta);
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
