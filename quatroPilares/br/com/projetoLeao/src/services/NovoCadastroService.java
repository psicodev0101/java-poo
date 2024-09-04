package services;

import models.Contribuinte;
import models.ContribuinteCnpj;
import models.ContribuinteCpf;

public class NovoCadastroService {

    public Contribuinte contribuinte;

    public NovoCadastroService(Contribuinte contribuinte) {
    }

    public void gerarTaxa (Contribuinte contribuinte) {
        CobrancaImpService cobrancaImpService;
        if (contribuinte instanceof ContribuinteCpf){
            cobrancaImpService = new CobrancaImpCpfService();
            contribuinte.taxa = cobrancaImpService.calcularImposto(contribuinte);
        } else if (contribuinte instanceof ContribuinteCnpj){
            cobrancaImpService = new CobrancaImpCnpjService();
            contribuinte.taxa = cobrancaImpService.calcularImposto(contribuinte);
        }
    }


}
