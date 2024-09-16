package services;

public class SmsService implements MensagemService{
    @Override
    public void enviarMensagem(String mensagem, String destinatario) {
        System.out.println(STR."SMS enviado para\{destinatario}:\{mensagem}");
    }

}
