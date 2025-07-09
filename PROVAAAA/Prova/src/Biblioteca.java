import java.util.List;

public class Biblioteca {
    private IMensagem mensagem;
    private ICalculadoraDeMulta calculadora;

    public Biblioteca(IMensagem mensagem, ICalculadoraDeMulta calculadora) {
        this.mensagem = mensagem;
        this.calculadora = calculadora;
    }

    public void processarMultas(List<UsuarioBiblioteca> usuarios) {
        for (UsuarioBiblioteca usuario : usuarios) {
            double multa = calculadora.calcularMulta(usuario);
            String msg = usuario.getResumo() + " - Multa: R$ %.2f".formatted(multa);
            mensagem.enviarMensagem(msg);
        }
    }
}