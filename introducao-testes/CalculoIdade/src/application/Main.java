package application;

import entities.Pessoa;
import util.CalculoIdade;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoaA = new Pessoa("Pedro", 1997);
        pessoaA.idade = CalculoIdade.calcularIdade(pessoaA.anoNascimento);
        System.out.println(pessoaA);
    }
}
