package entities;

public class Funcionario {
//atributos -------------------------------------------------------------------------
    public String nome;
    public double salarioBruto;
    public static final double IMPOSTO = 15.5;

//construtores -------------------------------------------------------------------------
    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salarioBruto = salario;
    }

//metodos -------------------------------------------------------------------------
    @Override
    public String toString() {
        return "NOME: " + nome +
                "\nSalario Liq.: " + String.format("%.2f", (salarioBruto - (salarioBruto * IMPOSTO / 100)));
    }

    //gera aumento no atributo salarioBruto a partir de determinada porcentagem
    //aumento afeta apenas o salario bruto
    public void aumentarSalario (double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }
}
