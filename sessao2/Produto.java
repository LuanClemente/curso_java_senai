package sessao2;

//Criando a classe produto
public class Produto {
    //Criando os atributos
    private String nome;
    private int quantidadeEmEstoque;
    private double preco;

//Criando construtores com parametros
    public Produto(String nome, int quantidadeEmEstoque, double preco) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    //Criando Setters
    public Produto() {
        this.nome = "";
        this.quantidadeEmEstoque = 0;
        this.preco = 0.0;
    }

        public void setNome(String nome) {
        this.nome = nome;
    }

    public void setquantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }
    //Criando os Getters (Acessa os atributos)

    public String getNome() {
        return nome;
    }

    public int getquantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public double getpreco() {
        return preco;
    }
}
