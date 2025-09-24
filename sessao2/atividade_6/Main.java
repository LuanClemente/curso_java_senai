package sessao2.atividade_6;
// Classe Main.java
public class Main { // Classe Main
    public static void main(String[] args) { // Método principal
        Biblioteca minhaBiblioteca = new Biblioteca(); // Cria uma nova biblioteca
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"); // Cria um novo livro
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling"); // Cria outro livro

        minhaBiblioteca.adicionarLivro(livro1); // Adiciona o primeiro livro à biblioteca
        minhaBiblioteca.adicionarLivro(livro2); // Adiciona o segundo livro à biblioteca
        minhaBiblioteca.listarLivros(); // Lista todos os livros na biblioteca
    }
}
