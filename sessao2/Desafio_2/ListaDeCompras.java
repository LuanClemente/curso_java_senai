package sessao2.Desafio_2;

import java.util.Arrays;    // Importa a classe Arrays para facilitar a impressão do array

public class ListaDeCompras { // Classe para gerenciar uma lista de compras
    public String[] itens = new String[5]; // Array para armazenar os itens da lista de compras com tamanho fixo de 5
    public void adicionarItem(String item, int indice) { // Método para adicionar um item na lista em um índice específico
        if (indice < 0 || indice >= itens.length) { // Verifica se o índice é válido
            throw new IndexOutOfBoundsException("Índice inválido! O índice deve estar entre 0 e " + (itens.length - 1)); // Lança uma exceção se o índice for inválido
        }
        itens[indice] = item; // Adiciona o item no índice especificado
    }
    public String obterItem(int indice) {
        if (indice < 0 || indice >= itens.length) {
            throw new IndexOutOfBoundsException("Índice inválido! O índice deve estar entre 0 e " + (itens.length - 1));
        }
        return itens[indice];
    }
    public void imprimirLista() {
        System.out.println("Lista de Compras: " + Arrays.toString(itens));
    }
}