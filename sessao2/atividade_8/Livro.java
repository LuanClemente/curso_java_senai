package sessao2.atividade_8;

// Classe Livro.java
public class Livro {
    String titulo; // Título do livro
    String autor; // Autor do livro

    public Livro(String titulo, String autor) { // Construtor da classe Livro
        this.titulo = titulo; // ira definir o título
        this.autor = autor; // ira definir o autor
    
    }
    public String getInfo() { // Método para obter informações do livro
        return "Título: " + this.titulo + ", Autor: " + this.autor; // retorna o titulo e o autor do livro
    }
} // Fim da classe Livro
