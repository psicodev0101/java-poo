package services;

import models.Conta;

public class SaqueCaixaEletService implements SaqueService {

    private static final double TAXA_SAQUE = 7.50;

    @Override
    public boolean sacar(double valor, Conta conta) {
        double valorComTaxa = valor + TAXA_SAQUE;
            conta.setSaldoConta(valor);
        return false;
    }
}
