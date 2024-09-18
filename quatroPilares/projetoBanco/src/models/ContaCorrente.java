package models;

import services.PixSaqueService;
import services.SaqueCaixaEletService;
import services.SaqueService;

public class ContaCorrente extends Conta {

    private int limiteSaquePix = 10;
    private int limiteChequeEsp;


    public ContaCorrente(int numeroConta, String titularConta, int limiteChequeEsp) {
        super(numeroConta, titularConta);
        this.limiteChequeEsp = limiteChequeEsp;
    }

    @Override
    public void depositar(double valor) {
        setSaldoConta(getSaldoConta() + valor);
    }

    @Override
    public void sacar(double valor, SaqueService saqueService) {
        /*LEMBRAR: agora preciso implementar os metodos dentro das classes pix saque e saque
        * caixa. os metodos devem receber um valor e uma conta (no caso, essa [this])
        * na hora de escrever o main, basta instanciar um "new PixSaqueService" ou
        * caixa eletronico dentro do parametro quando for sacar*/

        /*preciso fazer aqui dentro mesmo a verificação se o valor a sacar esta
        * dentro dos limites do saldo + cheque esp; isso nao compete ao serviço de sacar
        * pois esse serviço tambem sera usado na conta poupanca, onde as regras de
        * negocio sao diferentes.*/
    }


}
