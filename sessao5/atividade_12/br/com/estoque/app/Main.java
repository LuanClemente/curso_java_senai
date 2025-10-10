package br.com.estoque.app;
// Importa classes de outros packages para poder usá-las
import br.com.estoque.modelo; // Importa a classe Produto do package modelo
import br.com.estoque.servico; // Importa a classe ServicoEstoque do package servico
/**
 * Classe Principal da Aplicação (App): Ponto de entrada (método main).
 * Fica no package br.com.estoque.app.
 */
public class Main { // Início da classe Main


    public static void main(String[] args) { // Método principal - ponto de entrada da aplicação
       
        System.out.println("--- ESTRUTURA DE PACKAGES ---"); // Exibe a estrutura de packages
        System.out.println("Aplicação Principal: br.com.estoque.app"); // Indica o package da aplicação principal
        System.out.println("Modelo de Dados:     br.com.estoque.modelo"); // Indica o package do modelo de dados
        System.out.println("Lógica de Negócio:   br.com.estoque.servico"); // Indica o package da lógica de negócio
        System.out.println("-----------------------------\n"); // Linha de separação




        // 1. Cria uma instância de Produto (do package 'modelo')
        Produto livro = new Produto("Livro Java Avançado", 10); // Produto com nome e quantidade inicial
       
        // 2. Cria uma instância de ServicoEstoque (do package 'servico')
        ServicoEstoque servico = new ServicoEstoque(); // Serviço para manipular o estoque
       
        System.out.println("Produto antes da operação: " + livro); // Exibe o estado inicial do produto
       
        // 3. Usa o ServicoEstoque para operar sobre o Produto,
        // demonstrando o uso de classes de diferentes packages.
        servico.adicionarProduto(livro, 5);
       
        System.out.println("Produto após a operação:  " + livro); // Exibe o estado do produto após a operação
    }
} // Fim da classe Main