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
    public Produto(String nome, double preco, int codigo) { // Inicializa os atributos
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    // Métodos Getters (Acessores)
    public String getNome() {
        return nome; // Retorna o nome do produto
    }

    public double getPreco() {
        return preco; // Retorna o preço do produto
    }

    public int getCodigo() {
        return codigo; // Retorna o código do produto
    }
    
    // Método toString para facilitar a impressão
    @Override // Sobrescreve o método toString da classe Object
    public String toString() { // Retorna uma representação em string do objeto
        return "Produto [Nome: " + nome + ", Preço: " + preco + ", Código: " + codigo + "]"; // Formata a string de saída
    }
} // Fim da classe Produto
