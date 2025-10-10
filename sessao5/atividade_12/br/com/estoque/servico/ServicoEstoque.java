package br.com.estoque.servico;

import br.com.estoque.modelo.Produto;
/**
 * Classe de Serviço (Lógica): Contém regras de negócio.
 * Fica no package br.com.estoque.servico.
 */
public class ServicoEstoque {
   
    /**
     * Simula a adição de um produto ao estoque com uma regra simples.
     */
    public void adicionarProduto(Produto p, int valor) {
        if (valor > 0) {
            p.adicionarEstoque(valor);
            System.out.println("LOG: Adicionado " + valor + " unidades de " + p.getNome() + ".");
        } else {
            System.out.println("LOG: Valor de adição deve ser positivo.");
        }
    }
}
