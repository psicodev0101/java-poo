package services;

import models.Contribuinte;

public class CobrancaImpCnpjService implements CobrancaImpService{
    @Override
    public double calcularImposto(Contribuinte contribuinte) {
        double imposto = 0.0;
        if (contribuinte.rendaAnual > 50000) {
            imposto = 20D / 100 * contribuinte.rendaAnual;
        }
        return imposto;
    }
}
