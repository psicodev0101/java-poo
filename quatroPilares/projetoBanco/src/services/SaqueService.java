package services;

import models.Conta;

public interface SaqueService {

    public boolean sacar (double valor, Conta conta);
    public boolean confirmarSaqueCC (double Valor, Conta conta, int limiteChequeEspecial);
    public boolean confirmarSaquePoupanca (double valor, Conta conta);

}
