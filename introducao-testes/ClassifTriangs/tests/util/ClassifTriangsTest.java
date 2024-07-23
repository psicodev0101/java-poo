package util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import entities.Triangulo;

class ClassifTriangsTest {

    Triangulo trianguloA = new Triangulo(10.5,11.6,12.8);
    Triangulo trianguloB = new Triangulo(13,13,8);
    Triangulo trianguloC = new Triangulo(5,5,5);
    @Test
    public void classificarTestA(){
        System.out.println("TESTANDO TRIANGULO A: ESCALENO");
        String resposta = ClassifTriangs.classificar(trianguloA);
        System.out.println(ClassifTriangs.classificar(trianguloA));
        assertEquals("escaleno", resposta);
    }

    @Test
    public void classificarTestB(){
        System.out.println("TESTANDO TRIANGULO B: ISOCELES");
        String resposta = ClassifTriangs.classificar(trianguloB);
        System.out.println(ClassifTriangs.classificar(trianguloB));
        assertEquals("isoceles", resposta);
    }

    @Test
    public void classificarTestC(){
        System.out.println("TESTANDO TRIANGULO C: ISOCELES");
        String resposta = ClassifTriangs.classificar(trianguloC);
        System.out.println(ClassifTriangs.classificar(trianguloC));
        assertEquals("equilatero", resposta);
    }

}