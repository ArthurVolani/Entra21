public class MensagemWhatsAppSimulado implements IMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(" WhatsApp Simulado:");
        System.out.println("---------------------------------------------");
        System.out.println("- " + mensagem);                              
        System.out.println("---------------------------------------------");
    }
}