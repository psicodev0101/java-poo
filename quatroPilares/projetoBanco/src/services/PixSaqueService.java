package services;

import models.Conta;

public class PixSaqueService implements SaqueService{
    @Override
    public boolean sacar(double valor, Conta conta) {

        return false;
    }

    @Override
    public boolean confirmarSaqueCC(double Valor, Conta conta, int limiteChequeEspecial) {
        return false;
    }

    @Override
    public boolean confirmarSaquePoupanca(double valor, Conta conta) {
        return false;
    }
}
