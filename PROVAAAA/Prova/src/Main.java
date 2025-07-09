import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IMensagem mensagem = new MensagemWhatsAppSimulado();
        ICalculadoraDeMulta calculadora = new MultaFixaPorTipo();
        Biblioteca biblioteca = new Biblioteca(mensagem, calculadora);

        List<UsuarioBiblioteca> usuarios = new ArrayList<>();
        usuarios.add(new Aluno("João", 4));
        usuarios.add(new Professor("Maria", 2));
        usuarios.add(new Visitante("Carlos", 5));

        biblioteca.processarMultas(usuarios);
    }
}