package services;

import models.Contribuinte;

public class CobrancaImpCpfService implements CobrancaImpService{

    @Override
    public double calcularImposto(Contribuinte contribuinte) {
        double imposto = 0.0;
        if (contribuinte.rendaAnual > 2000) {
            imposto = 15D / 100 * contribuinte.rendaAnual;
        }
        return imposto;
    }
}
