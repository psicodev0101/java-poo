package services;

import models.Conta;
import models.ContaCorrente;

public class SaqueCaixaEletService implements SaqueService {

    private static final double TAXA_SAQUE = 7.50;

    @Override
    public boolean sacar(double valor, Conta conta) {
        conta.setSaldoConta(conta.getSaldoConta() - (valor + TAXA_SAQUE));
        return false;
    }

    public boolean confirmarSaqueCC(double valor, Conta conta, int limiteChequeEspecial) {
        return valor + TAXA_SAQUE <= conta.getSaldoConta() + limiteChequeEspecial;
    }

    public boolean confirmarSaquePoupanca (double valor, Conta conta) {
        return valor + TAXA_SAQUE <= conta.getSaldoConta();
    }
}
