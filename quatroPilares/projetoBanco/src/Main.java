import models.Banco;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;
import services.PixSaqueService;
import services.SaqueCaixaEletService;

public class Main {
    public static void main(String[] args) {

        Banco bmg = new Banco();

        System.out.println("testando com conta corrente");

        bmg.abrirContaCorrente(123, "pedro", 120);

        Conta contaATest = bmg.acessarConta(123);
        contaATest.depositar(200D);
        System.out.println(contaATest.getSaldoConta());
        System.out.println("Sacando de conta corrente via caixa eletronico:");
        contaATest.sacar(320D, new SaqueCaixaEletService());
        System.out.println(contaATest.getSaldoConta());
        System.out.println("Sacando de conta corrente via pix:");
        contaATest.sacar(320D, new PixSaqueService());
        System.out.println(contaATest.getSaldoConta());

        System.out.println("testando com conta poupanca");

        Conta contaB = new ContaPoupanca(456, "zezinho");
        contaB.depositar(400D);
        System.out.println(contaB.getSaldoConta());
        System.out.println("Sacando de conta poupanca via caixa eletronico:");
        contaB.sacar(320D, new SaqueCaixaEletService());
        System.out.println(contaB.getSaldoConta());
        System.out.println("Sacando de conta poupanca via pix:");
        contaB.sacar(15D, new PixSaqueService());
        System.out.println(contaB.getSaldoConta());


    }




}
