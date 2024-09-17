import model.Notificador;
import services.EmailService;
import services.SmsService;

public class Main {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        Notificador notificadorEmail = new Notificador (emailService);
            /* a classe notificador é implementada usando como parâmetro pro construtor
             "emailService", que é um objeto da classe que implementa a interface "MensagemService".
             Portanto, posso colocar aqui tanto um objeto de EmailService quanto de EmsService, pois
             ambas as classes implementam MensagemService.
             */
        System.out.println("Chamando o notificador passando um objeto de EmailService como parâmetro:");
        notificadorEmail.notificar("Pedido Enviado!", "<Cleitin>");
            /*aqui chamo o metodo notificar() da classe Notificador. Já que ele recebeu
            * emailService como parâmetro, irá repassar os parâmetros para esse objeto,
            * que, por sua vez, possui o metodo enviarMensagem, que receberá as strings
            * "mensagem" e "destinatário"
            */

        //também pode ser feito de formas mais sucintas:

        //metodo A
        Notificador notificadorEmailA = new Notificador (new EmailService());
        notificadorEmailA.notificar("Pedido Enviado! (metodo A)", "<Cleitin>");

        //metodo B
        new Notificador(new EmailService()).notificar("Pedido Enviado! (metodo B)", "<Cleitin>");

        //testando metodo B mas com SmsService em vez de EmailService:
        System.out.println("Chamando notificador com SmsService:");
        new Notificador(new SmsService()).notificar("Pedido Enviado!", "<Cleitin>");
    }

}
