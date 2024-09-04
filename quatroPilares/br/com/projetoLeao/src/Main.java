import models.ContribuinteCnpj;
import models.ContribuinteCpf;
import services.NovoCadastroService;

public class Main {
    public static void main(String[] args) {
        ContribuinteCpf contribA = new ContribuinteCpf("Adilson", 2500D, "02206658267", 500D);
        NovoCadastroService novoCadastroService = new NovoCadastroService(contribA);
        novoCadastroService.gerarTaxa(contribA);

        ContribuinteCnpj contribB = new ContribuinteCnpj("OdontoC", 65000D, "032140000132", 25);
        novoCadastroService = new NovoCadastroService(contribB);
        novoCadastroService.gerarTaxa(contribB);

        System.out.println("nome: " + contribA.nome);
        System.out.println("taxa: " + contribA.taxa);
        System.out.println("nome: " + contribB.nome);
        System.out.println("taxa: " + contribB.taxa);
    }

}
