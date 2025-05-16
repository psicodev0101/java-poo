package MapComObjetos;

public class Pessoa {

    int idade;
    String nome;

    public Pessoa (int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
