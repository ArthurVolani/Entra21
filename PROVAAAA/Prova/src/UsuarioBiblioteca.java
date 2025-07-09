public abstract class UsuarioBiblioteca {
    protected String nome;
    protected int diasAtraso;

    public UsuarioBiblioteca(String nome, int diasAtraso) {
        this.nome = nome;
        this.diasAtraso = diasAtraso;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public abstract double calcularMulta();

    public String getResumo() {
        return nome + " - Dias de atraso: " + diasAtraso;
    }
}