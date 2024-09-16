package services;

public class EmailService implements MensagemService{
    @Override
    public void enviarMensagem(String mensagem, String destinatario) {
        System.out.println(STR."Email enviado para\{destinatario}:\{mensagem}");
    }

}
