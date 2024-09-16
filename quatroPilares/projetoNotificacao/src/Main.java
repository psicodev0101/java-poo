import model.Notificador;
import services.EmailService;
import services.SmsService;

public class Main {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        Notificador notificadorEmail = new Notificador(emailService);
        notificadorEmail.notificar("Pedido Enviado!", "<Cleitin>");

        SmsService smsService = new SmsService();
        Notificador notificadorSms = new Notificador(smsService);
        notificadorSms.notificar("Pedido Enviado!", "<Cleitin>");
    }

}
