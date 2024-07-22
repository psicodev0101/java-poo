package util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void testA() {
        double a = 2, b = 2;
        assertEquals(4, Operations.soma(a, b));
        assertEquals(0, Operations.subtracao(a, b));
        assertEquals(4, Operations.multiplicacao(a, b));
        assertEquals(1, Operations.divisao(a, b));
    }

    @Test
    void testB() {
        double a = 5, b = 5;
        assertEquals(10, Operations.soma(a, b));
        assertEquals(0, Operations.subtracao(a, b));
        assertEquals(25, Operations.multiplicacao(a, b));
        assertEquals(1, Operations.divisao(a, b));
    }

    @Test
    void testC() {
        double a = 20, b = 10;
        assertEquals(30, Operations.soma(a, b));
        assertEquals(10, Operations.subtracao(a, b));
        assertEquals(200, Operations.multiplicacao(a, b));
        assertEquals(2, Operations.divisao(a, b));
    }

}