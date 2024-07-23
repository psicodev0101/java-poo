package util;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class OperacoesTest {
    int[] numeros = new int[10];
    @Test
    public void preencherTest() {
        Operacoes.preencher(numeros);
        int[] numeroscompar = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("expected: " + Arrays.toString(numeroscompar));
        System.out.println("result: " + Arrays.toString(numeros));
        assertArrayEquals(numeroscompar, numeros);
    }
}