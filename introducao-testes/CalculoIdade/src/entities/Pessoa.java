package entities;

import util.CalculoIdade;

public class Pessoa {
//atributos ---------------------------------------------
     public String nome;
     public int anoNascimento;
     public int idade;

//construtores ------------------------------------------
     public Pessoa (String nome, int anoNascimento){
          this.nome = nome;
          this.anoNascimento = anoNascimento;
     }

//métodos -----------------------------------------------


     @Override
     public String toString() {
          return STR."Nome: \{nome}\nAno de nascimento: \{anoNascimento}\nIdade: \{idade}";

     }
}
