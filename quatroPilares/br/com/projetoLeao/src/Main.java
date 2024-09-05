import models.Contribuinte;
import models.ContribuinteCnpj;
import models.ContribuinteCpf;
import models.DatabaseLeao;
import services.NovoCadastroService;

public class Main {
    public static void main(String[] args) {

        DatabaseLeao databaseLeao = new DatabaseLeao();
        NovoCadastroService novoCadastroService = new NovoCadastroService(databaseLeao);

        //criando objetos ContribuinteCpf
        novoCadastroService.cadastrar(new ContribuinteCpf("Adailson", 1500D, 250D));
        novoCadastroService.cadastrar(new ContribuinteCpf("Adalberto", 2500D, 500D));
        novoCadastroService.cadastrar(new ContribuinteCpf("Adalvano", 4500D, 340D));
        novoCadastroService.cadastrar(new ContribuinteCpf("Adalnildo", 1200D, 0D));
        novoCadastroService.cadastrar(new ContribuinteCpf("Adalgilson", 3450D, 750D));

        //criando objetos ContribuinteCnpj
        Contribuinte contF = new ContribuinteCnpj("OdontoVida", 52000D, 50);

        Contribuinte contG = new ContribuinteCnpj("OdontoBem", 14000D, 10);

        Contribuinte contH = new ContribuinteCnpj("OdontoLife", 10250D, 8);

        Contribuinte contI = new ContribuinteCnpj("OdontoClean", 100000D, 60);

        Contribuinte contJ = new ContribuinteCnpj("OdontoFix", 40000D, 2);
    }

}
