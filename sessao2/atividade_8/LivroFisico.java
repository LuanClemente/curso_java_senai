package sessao2.atividade_8;

public class LivroFisico extends Livro {
    int numeroPaginas; // Número de páginas do livro físico

    public LivroFisico(String titulo, String autor, int numeroPaginas) { // Construtor da classe LivroFisico
        super(titulo, autor); // Chama o construtor da classe base (Livro)
        this.numeroPaginas = numeroPaginas; // Define o número de páginas
    }
    public String getInfo() { // Método para obter informações do livro físico
        return super.getInfo() + ", Número de Páginas: " + this.numeroPaginas; // Retorna as informações do livro físico
    }
}
    
