package entities;

public class Aluno {
//atributos ------------------------------------------------------------------

    public String nome;
    public int notaA, notaB, notaC;

//construtores ------------------------------------------------------------------

    public Aluno (String nome, int notaA, int notaB, int notaC) {
    // metodo para impedir que um aluno seja instanciado sem nome e notas
        this.nome = nome;
        this.notaA = notaA;
        this.notaB = notaB;
        this.notaC = notaC;
    }

//metodos ------------------------------------------------------------------

    public int calcularMedia () {
    //calcula a media do aluno
        return notaA + notaB + notaC;
    }

    public void estaAprovado () {
    //verifica se esta aprovado
    //se nao estiver, informa quantos pontos faltam recuperar
        if (calcularMedia() > 60){
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
            System.out.println("Pontos a recuperar: " + (60 - calcularMedia()));
        }
    }

}
