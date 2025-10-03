package sessao5.atividade_8;

import java.io.Serializable; // Importa a interface Serializable

/**
 * A classe Produto implementa a interface Serializable para permitir que seus 
 * objetos sejam convertidos em um stream de bytes (serialização).
 */
public class Produto implements Serializable { // Implementa a interface Serializable
    
    // Opcional, mas recomendado: Define uma versão explícita para compatibilidade.
    private static final long serialVersionUID = 1L; // Versão da classe

    private String nome; 
    private double preco;
    
    // Campo marcado como 'transient':
    // O valor deste campo NÃO será incluído no stream de bytes durante a serialização.
    private transient int codigo; 

    // Construtor
    public Produto(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    // Métodos Getters (Acessores)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }
    
    // Método toString para facilitar a impressão
    @Override
    public String toString() {
        return "Produto [Nome: " + nome + ", Preço: " + preco + ", Código: " + codigo + "]";
    }
}
