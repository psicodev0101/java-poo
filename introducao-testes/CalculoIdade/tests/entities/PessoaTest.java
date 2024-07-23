package entities;

import org.junit.jupiter.api.Test;
import util.CalculoIdade;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void InstanciarPessoaTeste (){
        Pessoa pessoaA = new Pessoa("Pedro", 1997);
        assertEquals("Pedro", pessoaA.nome);
        assertEquals(1997, pessoaA.anoNascimento);
//        pessoaA.idade = CalculoIdade.calcularIdade(pessoaA.anoNascimento);
        assertEquals(27, pessoaA.idade);
    }


}