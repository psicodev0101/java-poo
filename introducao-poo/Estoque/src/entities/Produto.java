package entities;

public class Produto {
//    atributos ---------------------------------------------------------------------------------
    String nome;
    double preco;
    int quantidadeEmEstoque;

//    construtores ----------------------------------------------------------------------------
    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        quantidadeEmEstoque = 0;
    }

//    metodos -----------------------------------------------------------------------------------

    @Override
    public String toString() {
        System.out.println("INFORMACOES DO PRODUTO:");
        return "NOME: " + nome
                + "\nPRECO: " + String.format("%.2f", preco)
                + "\nQUANT. EM ESTOQUE: " + quantidadeEmEstoque
                + "\nVALOR TOTAL EM ESTOQUE: " + String.format("%.2f", valorTotalEmEstoque());
    }

    public double valorTotalEmEstoque () {
        return preco * quantidadeEmEstoque;
    }

    public void addProdutos (int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    public void removerProdutos (int quantidade) {
        quantidadeEmEstoque -= quantidade;
    }

}
