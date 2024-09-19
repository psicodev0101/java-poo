import models.Conta;
import models.ContaCorrente;
import services.SaqueCaixaEletService;

public class Main {
    public static void main(String[] args) {
        Conta contaA = new ContaCorrente(123, "Pedro", 120);
        contaA.depositar(200D);
        System.out.println(contaA.getSaldoConta());
        contaA.sacar(320D, new SaqueCaixaEletService());
        System.out.println(contaA.getSaldoConta());
    }

    //preciso adicionar o campo de limite saque pix direto na classe abstrata Conta



}
