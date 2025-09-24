package sessao2.atividade_6;

// Classe Biblioteca.java
import java.util.ArrayList; // Importa a classe ArrayList para armazenar livros

class Biblioteca { // Classe Biblioteca
    ArrayList<Livro> livros; // Lista para armazenar os livros

    public Biblioteca() { // Construtor da classe Biblioteca
        this.livros = new ArrayList<>(); // Inicializa a lista de livros
    }

    public void adicionarLivro(Livro livro) { // Método para adicionar um livro à biblioteca
        this.livros.add(livro); // Adiciona o livro à lista
    }

    public void listarLivros() { // Método para listar todos os livros na biblioteca
        System.out.println("Livros na biblioteca:"); // Imprime o cabeçalho no terminal
        for (Livro livro : this.livros) { // Percorre cada livro na lista
            System.out.println(livro.getInfo()); // Imprime as informações do livro no terminal
        }
    }
}