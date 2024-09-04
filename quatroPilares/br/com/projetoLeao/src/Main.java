import models.ContribuinteCpf;
import services.NovoCadastroService;

public class Main {
    public static void main(String[] args) {
        ContribuinteCpf contribA = new ContribuinteCpf("Adilson", 2500D, "02206658267", 500D);
        NovoCadastroService novoCadastroService = new NovoCadastroService(contribA);
        novoCadastroService.gerarTaxa(contribA);


        System.out.println("nome: " + contribA.nome);
        System.out.println("taxa: " + contribA.taxa);
    }

}
