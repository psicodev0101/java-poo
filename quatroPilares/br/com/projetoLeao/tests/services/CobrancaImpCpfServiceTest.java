package services;

import models.Contribuinte;
import models.ContribuinteCnpj;
import models.ContribuinteCpf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CobrancaImpCpfServiceTest {

    //contribuinte tipo cpf
    Contribuinte contribTesteA = new ContribuinteCpf("Adailson", 1500D, 250D);

    //contribuinte tipo cnpj
    Contribuinte contribTesteD = new ContribuinteCnpj("OdontoVida", 52000D, 50);

    @Test
    void calcularImpostoTest() {
        //teste de calculo para imposto de contribuinte cpf
        assertEquals(100D, new CobrancaImpCpfService().calcularImposto(contribTesteA));
        //teste de calculo para imposto de contribuinte cnpj
        assertEquals(7280D, new CobrancaImpCnpjService().calcularImposto(contribTesteD));
    }
}