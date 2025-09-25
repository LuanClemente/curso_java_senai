package sessao2.atividade_8;

// Classe Biblioteca.java
import java.util.ArrayList; // Importa a classe ArrayList para armazenar livros

class biblioteca { // Classe Biblioteca
    ArrayList<Livro> livros; // Lista para armazenar os livros

    public biblioteca() { // Construtor da classe Biblioteca
        this.livros = new ArrayList<>(); // Inicializa a lista de livros
    }

    public void adicionarLivro(Livro livro) { // Método para adicionar um livro à biblioteca
        this.livros.add(livro); // Adiciona o livro à lista
    }

    public void adicionarLivro(LivroFisico livro) { // Método para adicionar um livro à biblioteca
        this.livros.add(livro); // Adiciona o livro à lista
    }

    public void adicionarLivro(Ebook livro) { // Método para adicionar um livro à biblioteca
        this.livros.add(livro); // Adiciona o livro à lista
    }
    public void listarLivros() { // Método para listar todos os livros na biblioteca
        System.out.println("Livros na biblioteca:"); // Imprime o cabeçalho no terminal
        for (Livro livro : this.livros) { // Percorre cada livro na lista
            System.out.println(livro.getInfo()); // Imprime as informações do livro no terminal
        }
    }
}