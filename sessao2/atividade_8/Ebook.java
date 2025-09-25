package sessao2.atividade_8;

class Ebook extends Livro {
String formato; // Formato do Ebook

    public Ebook(String titulo, String autor, String formato) { // Construtor da classe Ebook
        super(titulo, autor); // Chama o construtor da classe base (Livro)
        this.formato = formato; // Define o formato do Ebook
    }
    public String getInfo() { // Método para obter informações do Ebook
        return super.getInfo() + ", Formato: " + this.formato; // Retorna as informações do Ebook
    }
}