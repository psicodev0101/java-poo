package model;

import services.MensagemService;

public class Notificador {

    private final MensagemService mensagemService;
        /*dependência de MensagemService, podem ser atribuidos aqui objetos da classe
        * EmailService e SmsService, visto que ambas implementam MensagemService*/

    public Notificador(MensagemService mensagemService) {
            /*Injecao de dependencia: o construtor recebe um objeto de uma classe qualquqer que
            * implemente a interface MensagemService. A classe Notificador não sabe qual
            * objeto irá receber, a dependência da classe é satisfeita com qualquer um
            * que seja injetado dentro deste construtor
            */
        this.mensagemService = mensagemService;
    }

    public void notificar (String mensagem, String destinatario){
        mensagemService.enviarMensagem(mensagem, destinatario);
            /*o método notificar recebe essas duas strings e chama o método enviarMensagem.
            * o "enviarMensagem em questão corresponderá ao método implementado especificamente
            * no objeto que foi atribuído pelo construtor na dependência de "MensagemService".
            * Ou seja, se for passado objeto de EmailService para o construtor, será chamado o
            * método "enviarMensagem()" conforme implementado na classe EmailService. O mesmo
            * vale para SmsService.
            * Os parâmetros de notificar() são repassados entao como parâmetros para o método
            * enviarMensagem do objeto atribuído na dependência.
            */
    }

}
