public class MultaFixaPorTipo implements ICalculadoraDeMulta {
    @Override
    public double calcularMulta(UsuarioBiblioteca usuario) {
        return usuario.calcularMulta();
    }
}