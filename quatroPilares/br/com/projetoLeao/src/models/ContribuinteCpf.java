package models;

public class ContribuinteCpf extends Contribuinte {
    private String cpf;
    private Double gastosComSaude;

    //Construtores ------------------------------------------------------------
    public ContribuinteCpf(String nome,
                           Double rendaAnual,
                           String cpf,
                           Double gastosComSaude) {
        super(nome, rendaAnual);
        this.cpf = cpf;
        this.gastosComSaude = gastosComSaude;
    }
//metodos -----------------------------------------------------------------

    public void calcularTaxa() {

    }

}
