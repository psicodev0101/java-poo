package models;

public class ContribuinteCnpj extends Contribuinte {

    private String cnpj;
    private int quantFuncionarios;

    //Construtores ------------------------------------------------------------
    public ContribuinteCnpj(String nome,
                           Double rendaAnual,
                           String cnpj,
                           int quantFuncionarios){
        super(nome, rendaAnual);
       this.cnpj = cnpj;
       this.quantFuncionarios = quantFuncionarios;
    }
//metodos -----------------------------------------------------------------


}
