package model;

import services.MensagemService;

public class Notificador {

    private final MensagemService mensagemService;

    public Notificador(MensagemService mensagemService) {
        this.mensagemService = mensagemService;
    }

    public void notificar (String mensagem, String destinatario){
        mensagemService.enviarMensagem(mensagem, destinatario);
    }

}
