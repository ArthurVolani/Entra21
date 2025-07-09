public class MultaProgressiva implements ICalculadoraDeMulta {
    @Override
    public double calcularMulta(UsuarioBiblioteca usuario) {
        int dias = usuario.getDiasAtraso();
        double multa = 0.5;
        for (int i = 3; i < dias; i += 3) {
            multa *= 1.10;
        }
        return multa * dias;
    }
}