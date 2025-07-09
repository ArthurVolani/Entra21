public class MensagemConsole implements IMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Console: " + mensagem);
    }
}