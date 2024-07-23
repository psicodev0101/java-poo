package util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculoIdadeTest {

    @BeforeAll
    public static void setarAnoAtual() {
        CalculoIdade.anoAtual = 2024;
    }

    @Test
    public void calcularIdadeTestA() {
        int anoNasc = 1997;
        int idade = CalculoIdade.calcularIdade(anoNasc);
        assertEquals(27, idade);
    }

    @Test
    public void calcularIdadeTestB() {
        int anoNasc = 2000;
        int idade = CalculoIdade.calcularIdade(anoNasc);
        assertEquals(24, idade);
    }

    @Test
    public void calcularIdadeTestC() {
        int anoNasc = 1985;
        int idade = CalculoIdade.calcularIdade(anoNasc);
        assertEquals(39, idade);
    }

}