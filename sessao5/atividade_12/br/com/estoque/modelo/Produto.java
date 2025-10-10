package br.com.estoque.modelo;
/**
 * Classe de Modelo (Dados): Representa um item no estoque.
 * Fica no package br.com.estoque.modelo.
 */
public class Produto { // Atributos
    private String nome; // Nome do produto
    private int quantidade; // Quantidade em estoque


    public Produto(String nome, int quantidade) { // Construtor para inicializar os atributos
        this.nome = nome; // Define o nome do produto
        this.quantidade = quantidade; // Define a quantidade inicial
    }


    public String getNome() { // Retorna o nome do produto
        return nome; // Getter para nome
    }


    public int getQuantidade() { // Retorna a quantidade em estoque
        return quantidade; // Getter para quantidade
    }


    public void adicionarEstoque(int valor) { // Adiciona valor à quantidade em estoque
        this.quantidade += valor; // Incrementa a quantidade
    }


    @Override // Sobrescreve o método toString para exibir informações do produto
    public String toString() { // Formata a saída do produto
        return nome + " (Qtd: " + quantidade + ")"; // Retorna string formatada do produto
    }
} // Fim da classe Produto
