package models;

import services.SaqueService;

public class ContaCorrente extends Conta {

    private int limiteChequeEsp;

    public ContaCorrente(int numeroConta, String titularConta, int limiteChequeEsp) {
        super(numeroConta, titularConta);
        this.limiteChequeEsp = limiteChequeEsp;
    }

    public int getLimiteChequeEsp() {
        return limiteChequeEsp;
    }

    public void setLimiteChequeEsp(int limiteChequeEsp) {
        this.limiteChequeEsp = limiteChequeEsp;
    }

    @Override
    public void depositar(double valor) {
        setSaldoConta(getSaldoConta() + valor);
    }

    @Override
    public boolean sacar(double valor, SaqueService saqueService) {
        if (saqueService.confirmarSaqueCC(valor, this)) {
            return saqueService.sacar(valor, this);
        } else {
            System.out.println("ERRO: Saldo insuficiente!");
            return false;
        }

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
