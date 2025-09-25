package sessao2.atividade_6;

public class LivroFisico extends Livro {
    int numeroPaginas;

    public LivroFisico(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Número de Páginas: " + this.numeroPaginas;
    }
}
