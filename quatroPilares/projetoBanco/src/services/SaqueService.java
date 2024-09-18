package services;

import models.Conta;

public interface SaqueService {

    public boolean sacar (double valor, Conta conta);

}
