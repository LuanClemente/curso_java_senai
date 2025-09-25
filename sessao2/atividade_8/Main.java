package sessao2.atividade_8;

import sessao2.atividade_8.LivroFisico;

// Classe Main.java
public class Main { // Classe Main
    public static void main(String[] args) { // Método principal
        biblioteca minhaBiblioteca = new biblioteca(); // Cria uma nova biblioteca
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"); // Cria um novo livro
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling"); // Cria outro livro
        LivroFisico livro3 = new LivroFisico("Campos dos sonhos", "Juan", 340);
        Ebook livro4 = new Ebook("Aprendendo Java", "Irineu", "PDF");

        minhaBiblioteca.adicionarLivro(livro1); // Adiciona o primeiro livro à biblioteca
        minhaBiblioteca.adicionarLivro(livro2); // Adiciona o segundo livro à biblioteca
        minhaBiblioteca.adicionarLivro(livro3); // Adiciona o terceiro livro à biblioteca
        minhaBiblioteca.adicionarLivro(livro4); // Adiciona o quarto livro à biblioteca
        minhaBiblioteca.listarLivros(); // Lista todos os livros na biblioteca
    }
}
